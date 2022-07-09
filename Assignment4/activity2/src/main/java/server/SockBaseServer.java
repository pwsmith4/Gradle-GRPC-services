package server;

import buffers.RequestProtos.Logs;
import buffers.RequestProtos.Message;
import buffers.RequestProtos.Request;
import buffers.ResponseProtos.Response;
import org.json.JSONObject;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;
import java.util.Random;

class SockBaseServer {
    static String logFilename = "logs.txt";
    static String logString;
    ServerSocket serv = null;
    InputStream in = null;
    OutputStream out = null;
    Socket clientSocket = null;
    int port = 9099; // default port
    Game game;
    static JSONObject json = new JSONObject();

    public SockBaseServer(Socket sock, Game game) {
        this.clientSocket = sock;
        this.game = game;

        try {
            in = clientSocket.getInputStream();
            out = clientSocket.getOutputStream();
        } catch (Exception e) {
            System.out.println("Error in constructor: " + e);
        }
    }
    public String getTask(){
        Random rand = new Random();
        int random = rand.nextInt(3);
        if(random == 0){
            return "Type e";
        }else if(random == 1){
            return "Type p";
        }else if(random == 2){
            return "Type r";
        }
        return "Type e";
    }

    // Handles the communication right now it just accepts one input and then is done you should make sure the server stays open
    // can handle multiple requests and does not crash when the server crashes
    // you can use this server as based or start a new one if you prefer. 
    public void start() throws IOException {
        game.newGame();
        String name = "";
        Response response;


        System.out.println("Ready...");
        try {
            // read the proto object and put into new objct
            Request op = Request.parseDelimitedFrom(in);
            name = op.getName();
            String result = null;

            
            // if the operation is NAME (so the beginning then say there is a commention and greet the client)
            if (op.getOperationType() == Request.OperationType.NAME) {
                // get name from proto object

            // writing a connect message to the log with name and CONNECT
            writeToLog(name, Message.CONNECT);
                game.newGame();
                System.out.println("Got a connection and a name: " + name);

                response = Response.newBuilder()
                        .setResponseType(Response.ResponseType.GREETING)
                        .setMessage("Hello " + name + " and welcome.")
                        .setImage(logString)
                        .setTask(getTask())
                        .build();
              //  System.out.println("JSON: " + json.toString());

                response.writeDelimitedTo(out);
            }
            if (op.getOperationType() == Request.OperationType.NEW) {
                writeToLog(name, Message.START);
                System.out.println("Got a NEW");
                game.newGame();
                response = Response.newBuilder()
                        .setResponseType(Response.ResponseType.TASK)
                        .setMessage("Image: "+game.getImage())
                        .setImage(game.getImage())
                        .setTask(getTask())
                        .build();
                response.writeDelimitedTo(out);

         //       writeToLog(json.toString(), Message.START);
            }
            if (op.getOperationType() == Request.OperationType.LEADER) {
                response = Response.newBuilder()
                        .setMessage(logString)
                        .setImage(logString)
                        .setResponseType(Response.ResponseType.LEADER)
                        .build();
                response.writeDelimitedTo(out);
            }
            if (op.getOperationType() == Request.OperationType.ANSWER) {
                if(game.getIdx() == game.getIdxMax()){
                    game.setWon();
                    writeToLog(name, Message.WIN);
                    response = Response.newBuilder()
                            .setResponseType(Response.ResponseType.WON)
                            .setMessage("Image: "+game.getImage())
                            .setTask("You WON!")
                            .setImage(game.getImage())
                            .build();
                    response.writeDelimitedTo(out);
                }else {
                    System.out.println("Got an ANSWER");
                    replace(20);
                    response = Response.newBuilder()
                            .setResponseType(Response.ResponseType.TASK)
                            .setMessage("Image: " + game.getImage())
                            .setTask(getTask())
                            .setImage(game.getImage())
                            .build();
                    response.writeDelimitedTo(out);
                }
            }
            if (op.getOperationType() == Request.OperationType.QUIT) {
                clientSocket.close();
            }
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            if (out != null)  out.close();
            if (in != null)   in.close();
            if (clientSocket != null) clientSocket.close();
        }
    }

    /**
     * Replaces num characters in the image. I used it to turn more than one x when the task is fulfilled
     * @param num -- number of x to be turned
     * @return String of the new hidden image
     */
    public String replace(int num){
        for (int i = 0; i < num; i++){
            if (game.getIdx()< game.getIdxMax()) {
                game.replaceOneCharacter();
            }
        }
        return game.getImage();
    }


    /**
     * Writing a new entry to our log
     * @param name - Name of the person logging in
     * @param message - type Message from Protobuf which is the message to be written in the log (e.g. Connect) 
     * @return String of the new hidden image
     */
    public static void writeToLog(String name, Message message){
        try {
            System.out.println("WriteToLog Message: " + message);
            // read old log file 
            Logs.Builder logs = readLogFile();
            // get current time and data
            Date date = java.util.Calendar.getInstance().getTime();
            // we are writing a new log entry to our log
            // add a new log entry to the log list of the Protobuf object
            logs.addLog(date.toString() + ": " +  name + " - " + message);
            // open log file
            FileOutputStream output = new FileOutputStream(logFilename);
            Logs logsObj = logs.build();

            // This is only to show how you can iterate through a Logs object which is a protobuf object
            // which has a repeated field "log"
            logString = "";
            for (String log: logsObj.getLogList()){
                logString = logString + log + "\n";
                System.out.println(log);
            }

            // write to log file
            logsObj.writeTo(output);
        }catch(Exception e){
            System.out.println("Issue while trying to save");
        }
    }

    /**
     * Reading the current log file
     * @return Logs.Builder a builder of a logs entry from protobuf
     */
    public static Logs.Builder readLogFile() throws Exception{
        Logs.Builder logs = Logs.newBuilder();
        try {
            // just read the file and put what is in it into the logs object
            return logs.mergeFrom(new FileInputStream(logFilename));
        } catch (FileNotFoundException e) {
            System.out.println(logFilename + ": File not found.  Creating a new file.");
            return logs;
        }
    }


    public static void main (String args[]) throws Exception {
        Game game = new Game();
        if(new File("logs.txt").length()== 0) {
            FileOutputStream output = new FileOutputStream(logFilename);
        }
        if (args.length != 2) {
            System.out.println("Expected arguments: <port(int)> <delay(int)>");
            System.exit(1);
        }
        int port = 9099; // default port
        int sleepDelay = 10000; // default delay
        Socket clientSocket = null;
        ServerSocket serv = null;

        try {
            port = Integer.parseInt(args[0]);
            sleepDelay = Integer.parseInt(args[1]);
        } catch (NumberFormatException nfe) {
            System.out.println("[Port|sleepDelay] must be an integer");
            System.exit(2);
        }
        try {
            serv = new ServerSocket(port);
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(2);
        }
        InputStream in = null;
        OutputStream out = null;
        while (serv.isBound() && !serv.isClosed()) {
            System.out.println("Ready...");
            try {
                clientSocket = serv.accept();
                in = clientSocket.getInputStream();
                out = clientSocket.getOutputStream();
                SockBaseServer server = new SockBaseServer(clientSocket, game);
                server.start();
            } catch (Exception ex) {
                ex.printStackTrace();
            } finally {
                if (clientSocket != null) clientSocket.close();
            }
        }

    }
}

