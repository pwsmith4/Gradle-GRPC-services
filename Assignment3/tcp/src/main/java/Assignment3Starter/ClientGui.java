package Assignment3Starter;

import org.json.JSONObject;

import java.awt.Dimension;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.Socket;
import java.util.Base64;

import javax.imageio.ImageIO;
import javax.swing.*;

/**
 * The ClientGui class is a GUI frontend that displays an image grid, an input text box,
 * a button, and a text area for status. 
 * 
 * Methods of Interest
 * ----------------------
 * show(boolean modal) - Shows the GUI frame with the current state
 *     -> modal means that it opens the GUI and suspends background processes. Processing 
 *        still happens in the GUI. If it is desired to continue processing in the 
 *        background, set modal to false.
 * newGame(int dimension) - Start a new game with a grid of dimension x dimension size
 * insertImage(String filename, int row, int col) - Inserts an image into the grid
 * appendOutput(String message) - Appends text to the output panel
 * submitClicked() - Button handler for the submit button in the output panel
 * 
 * Notes
 * -----------
 * > Does not show when created. show() must be called to show he GUI.
 * 
 */
public class ClientGui implements Assignment3Starter.OutputPanel.EventHandlers {
  JDialog frame;
  static ClientGui main;
  static PicturePanel picturePanel;
  static OutputPanel outputPanel;
  static Socket sock;
  static OutputStream out;
  static InputStream in;
  static JLabel label = new JLabel();;
  static JSONObject response;
  boolean nameYet = false;
  static String person;

  /**
   * Construct dialog
   */
  public ClientGui() {
    frame = new JDialog();
    frame.setLayout(new GridBagLayout());
    frame.setMinimumSize(new Dimension(500, 500));
    frame.setDefaultCloseOperation(WindowConstants.DISPOSE_ON_CLOSE);

    // setup the top picture frame
    picturePanel = new PicturePanel();
    GridBagConstraints c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 0;
    c.weighty = 0.25;
    frame.add(picturePanel, c);

    // setup the input, button, and output area
    c = new GridBagConstraints();
    c.gridx = 0;
    c.gridy = 1;
    c.weighty = 0.75;
    c.weightx = 1;
    c.fill = GridBagConstraints.BOTH;
    outputPanel = new OutputPanel();
    outputPanel.addEventHandlers(this);
    frame.add(outputPanel, c);
  }

  /**
   * Shows the current state in the GUI
   * @param makeModal - true to make a modal window, false disables modal behavior
   */
  public void show(boolean makeModal) {
    frame.pack();
    frame.setModal(makeModal);
    frame.setVisible(true);
  }

  /**
   * Creates a new game and set the size of the grid 
   * @param dimension - the size of the grid will be dimension x dimension
   */
  public void newGame(int dimension) {
    picturePanel.newGame(dimension);
  //  outputPanel.appendOutput("Started new game with a " + dimension + "x" + dimension + " board.");
  }

  /**
   * Insert an image into the grid at position (col, row)
   * 
   * @param filename - filename relative to the root directory
   * @param row - the row to insert into
   * @param col - the column to insert into
   * @return true if successful, false if an invalid coordinate was provided
   * @throws IOException An error occured with your image file
   */
  public static boolean insertImage(ByteArrayInputStream filename, int row, int col) throws IOException {
    String error = "";
    try {
      // insert the image
      picturePanel.insertImage(filename, row, col);
      // put status in output
        outputPanel.appendOutput("Inserting " + filename + " in position (" + row + ", " + col + ")");
        return true;

   //   error = "File(\"" + filename + "\") not found.";
    } catch(PicturePanel.InvalidCoordinateException e) {
      // put error in output
      error = e.toString();
    }
    outputPanel.appendOutput(error);
    return false;
  }

  /**
   * Submit button handling
   * 
   * Change this to whatever you need
   */
  @Override
  public void submitClicked() {

    // An example how to update the points in the UI
    //outputPanel.setPoints(10);
    JSONObject send = new JSONObject();
    // Pulls the input box text
    String input = outputPanel.getInputText();
    // if has input
    if (input.length() > 0) {
      if (nameYet == false) {
        person = input;
        send.put("name", input);
        try {
          fromServer(send);
        }catch(IOException e){
        }
        nameYet = true;
      }else if(outputPanel.getInputText().equals("leader")) {
        outputPanel.appendOutput("leader!!!");
      }else if(outputPanel.getInputText().equals("start")){
        send.put("new", 1);
        try{
          fromServer(send);
        }catch(IOException e){

        }
      }else if(outputPanel.getInputText().equals("more")) {
        if(response.getInt("more") == 4){
          response.put("isMore", 1);
          outputPanel.appendOutput("There are no more Quotes!");
        }else {
          int temp = response.getInt("more") + 1;
          response.put("more", temp);
          response.put("isMore", 1);
          //System.out.println("RESPONSE SEDING: "+response);
        }
        try{
        fromServer(response);
        //response.put("isMore", 0);
        }catch(IOException e){
          }
      }else if(outputPanel.getInputText().equals("next")){
        int temp = response.getInt("char")+1;
        if(temp == 8){
          temp = 1;
        }
        response.put("next", temp);
        try{
          fromServer(response);
          //response.put("isMore", 0);
        }catch(IOException e){
        }
      }else {
        String guess = outputPanel.getInputText();
        int guessNum = -1;
        if(guess.equals("Captain America")){
          guessNum = 1;
        }
        if(guess.equals("Darth Vader")){
          guessNum = 2;
        }
        if(guess.equals("Homer Simpson")){
          guessNum = 3;
        }
        if(guess.equals("Jack Sparrow")){
          guessNum = 4;
        }
        if(guess.equals("Joker")){
          guessNum = 5;
        }
        if(guess.equals("Tony Stark")){
          guessNum = 6;
        }
        if(guess.equals("Wolverine")){
          guessNum = 7;
        }
        if(guessNum != -1) {
          try {
            response.put("guess", guessNum);
            System.out.println("RESPONSE: " + response);
            fromServer(response);
          } catch (IOException e) {
          }
        } else {
          System.out.println("Try AGAIN! You guessed " + guess);
          System.out.println("GuessNum: "+guessNum);
        }

      }
      // clear input text box
      outputPanel.setInputText("");
    }
  }
  
  /**
   * Key listener for the input text box
   * 
   * Change the behavior to whatever you need
   */
  @Override
  public void inputUpdated(String input) {
    if (input.equals("surprise")) {
      outputPanel.appendOutput("You found me!");
    }
  }

  public static JSONObject name(String person) {
    JSONObject request = new JSONObject();
    request.put("name", person);
    return request;
  }

  public static void fromServer(JSONObject request) throws IOException {
    NetworkUtils.Send(out, JsonUtils.toByteArray(request));
    byte[] responseBytes = NetworkUtils.Receive(in);
    response = JsonUtils.fromByteArray(responseBytes);
  //  response.put("name", person);
    if(response.has("error")){
      System.out.println(response.getString("error"));
    } else{
      switch (response.getInt("datatype")){
        case (1):
        //  response.put("name", person);
          outputPanel.appendOutput(response.getString("name"));
          break;
        case (2): {
        //  System.out.println("RESPONSE: " + response.get("char"));
          Base64.Decoder decoder = Base64.getDecoder();
          byte[] bytes = decoder.decode(response.getString("data"));
          ImageIcon icon = null;
          try (ByteArrayInputStream bais = new ByteArrayInputStream(bytes)){
         //   ClientGui gu = new ClientGui();
            BufferedImage image = ImageIO.read(bais);
            icon = new ImageIcon(image);
          //  int width = icon.getIconWidth();
           // int height = icon.getIconHeight();
           // System.out.println("width: "+width);
           // System.out.println("height: "+height);
          //  PicturePanel pc = new PicturePanel();
            //insertImage(bais, icon.getIconWidth(),icon.getIconHeight());
            if(icon!= null){
              label.removeAll();
              label.setIcon(icon);
              outputPanel.add(label);
              outputPanel.setPoints(response.getInt("points"));
            }
            outputPanel.appendOutput("");

         //   insertImage(bais,10,0);
          }
          break;
        }
      }
    }
  }

  public static void main(String[] args) throws IOException {
    // create the frame
    main = new ClientGui();
    //while(true) {
      try {
        sock = new Socket("localhost", 8080);
        out = sock.getOutputStream();
        in = sock.getInputStream();
        main.newGame(10);
        JSONObject send = new JSONObject();
        send.put("start", 1);
        try {
          fromServer(send);
        }catch(IOException e){
        }
        outputPanel.appendOutput("Please enter your name: ");
          main.show(true);
      } catch (IOException e) {
        e.printStackTrace();
      }
    
    // setup the UI to display on image
    //main.newGame(1);

    
    // add images to the grid
//    main.insertImage("img/Jack_Sparrow/quote4.png", 0, 0);
 }
}
