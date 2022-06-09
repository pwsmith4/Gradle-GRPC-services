package Assignment3Starter;

import org.json.JSONArray;
import org.json.JSONObject;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Base64;
import java.util.Random;
import java.util.Timer;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;

import static java.util.concurrent.TimeUnit.SECONDS;

public class ServerGui {
    static Random rand = new Random();
    static int random = -1;
    static JSONArray array;
    static int currPoints = 0;
    static int correctGuesses;
    static boolean isTime = true;

    public static void time() {
        final ScheduledExecutorService scheduler = Executors.newScheduledThreadPool(1);

        final Runnable runnable = new Runnable() {
            int countdownStarter = 60;

            public void run() {

                System.out.println(countdownStarter);
                countdownStarter--;

                if (countdownStarter < 0) {
                    System.out.println("Timer Over!");
                    isTime = false;
                    scheduler.shutdown();
                }
            }
        };
        scheduler.scheduleAtFixedRate(runnable, 0, 1, SECONDS);
    }


    public static JSONObject startImage() throws IOException {
        correctGuesses = 0;
        System.out.println("Start Image");
        JSONObject json = new JSONObject();
        json.put("datatype", 2);
        json.put("type", "image");
        json.put("isMore", 0);
        json.put("points", 0);
        File file = new File("img/hi.png");
        if (!file.exists()) {
            System.err.println("Cannot find file: " + file.getAbsolutePath());
            System.exit(-1);
        }
        BufferedImage img = ImageIO.read(file);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(img, "png", out);
            bytes = out.toByteArray();
        }
        if (bytes != null){
            Base64.Encoder encoder = Base64.getEncoder();
            json.put("data", encoder.encodeToString(bytes));
            return json;
        }
        return error("Unable to save image to byte array");
    }

    public static JSONObject newImage() throws IOException {
        System.out.println("New Image");
        File file = null;
        JSONObject json = new JSONObject();
        json.put("datatype", 2);
        json.put("type", "image");
        json.put("points", currPoints);

        random = rand.nextInt(7);

        if(random == 0){
            file = new File("img/Captain_America/quote1.png");
            json.put("char", 1);
        }
        if(random == 1){
            file = new File("img/Darth_Vader/quote1.png");
            json.put("char", 2);
        }
        if(random == 2){
            file = new File("img/Homer_Simpson/quote1.png");
            json.put("char", 3);
        }
        if(random == 3){
            file = new File("img/Jack_Sparrow/quote1.png");
            json.put("char", 4);
        }
        if(random == 4){
            file = new File("img/Joker/quote1.png");
            json.put("char", 5);
        }
        if(random == 5) {
            file = new File("img/Tony_Stark/quote1.png");
            json.put("char", 6);
        }
        if(random == 6) {
            file = new File("img/Wolverine/quote1.png");
            json.put("char", 7);
        }
        json.put("more", 1);
        json.put("isMore", 0);
        if (!file.exists()) {
            System.err.println("Cannot find file: " + file.getAbsolutePath());
            System.exit(-1);
        }
        BufferedImage img = ImageIO.read(file);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(img, "png", out);
            bytes = out.toByteArray();
        }
        if (bytes != null){
            Base64.Encoder encoder = Base64.getEncoder();
            json.put("data", encoder.encodeToString(bytes));
            return json;
        }
        return error("Unable to save image to byte array");
    }
    public static JSONObject more(JSONObject json) throws IOException {
     //   json.append("isMore", 0);
        System.out.println("MORE: "+json.getInt("more"));
        File file = null;
        JSONObject newJson = new JSONObject();
        newJson.put("datatype", 2);
        newJson.put("type", "image");
        newJson.put("points", currPoints);

        if(json.getInt("char") == 1){
            file = new File("img/Captain_America/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 2){
            file = new File("img/Darth_Vader/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 3){
            file = new File("img/Homer_Simpson/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 4){
            file = new File("img/Jack_Sparrow/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 5){
            file = new File("img/Joker/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 6){
            file = new File("img/Tony_Stark/quote" + json.getInt("more") + ".png");
        }
        if(json.getInt("char") == 7){
            file = new File("img/Wolverine/quote" + json.getInt("more") + ".png");
        }
        newJson.put("isMore", 0);
        newJson.put("char", json.getInt("char"));
        newJson.put("more", json.getInt("more"));
        if (!file.exists()) {
            System.err.println("Cannot find file: " + file.getAbsolutePath());
            System.exit(-1);
        }
        BufferedImage img = ImageIO.read(file);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(img, "png", out);
            bytes = out.toByteArray();
        }
        if (bytes != null){
            Base64.Encoder encoder = Base64.getEncoder();
            newJson.put("data", encoder.encodeToString(bytes));
            return newJson;
        }
        return error("Unable to save image to byte array");
    }
    public static JSONObject error(String err){
        JSONObject json = new JSONObject();
        json.put("error", err);
        return json;
    }
    public static JSONObject name(JSONObject name) {
        JSONObject json = new JSONObject();
        String temp = "Hello " + name.get("name").toString() + ", would you like to display the leaderboard (type leader) or start game (type start).";
        json.put("name", temp);
        json.put("datatype", 1);
        return json;
    }
    public static JSONObject updatePoints(JSONObject json, int type){
        JSONObject obj = new JSONObject();
        System.out.println("Updating Points to: " + json.getInt("points")+5);
        if(type == 1 && json.getInt("more") == 1){
            int temp = json.getInt("points") + 5;
            currPoints = currPoints + 5;
            json.put("points", temp);
        }
        if(type == 1 && json.getInt("more") == 2){
            int temp = json.getInt("points") + 4;
            currPoints = currPoints + 4;
            json.put("points", temp);
        }
        if(type == 1 && json.getInt("more") == 3){
            int temp = json.getInt("points") + 3;
            currPoints = currPoints + 3;
            json.put("points", temp);
        }
        if(type == 1 && json.getInt("more") == 4){
            int temp = json.getInt("points") + 1;
            currPoints = currPoints + 1;
            json.put("points", temp);
        }

    //    String name = json.getString("name");
       // obj.put(json.get("name").toString(), json.getInt("points"));
        //array.put(obj);
        return json;
    }
    public static JSONObject winner() throws IOException {
        JSONObject json = new JSONObject();
        json.put("datatype", 2);
        json.put("type", "image");
        json.put("points", currPoints);
        File file = new File("img/win.jpg");
        if (!file.exists()) {
            System.err.println("Cannot find file: " + file.getAbsolutePath());
            System.exit(-1);
        }
        BufferedImage img = ImageIO.read(file);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(img, "jpg", out);
            bytes = out.toByteArray();
        }
        if (bytes != null){
            Base64.Encoder encoder = Base64.getEncoder();
            json.put("data", encoder.encodeToString(bytes));
            return json;
        }
        return error("Unable to save image to byte array");
    }
    public static JSONObject loser() throws IOException {
        JSONObject json = new JSONObject();
        json.put("datatype", 2);
        json.put("type", "image");
        json.put("points", currPoints);
        File file = new File("img/lose.jpg");
        if (!file.exists()) {
            System.err.println("Cannot find file: " + file.getAbsolutePath());
            System.exit(-1);
        }
        BufferedImage img = ImageIO.read(file);
        byte[] bytes = null;
        try (ByteArrayOutputStream out = new ByteArrayOutputStream()){
            ImageIO.write(img, "jpg", out);
            bytes = out.toByteArray();
        }
        if (bytes != null){
            Base64.Encoder encoder = Base64.getEncoder();
            json.put("data", encoder.encodeToString(bytes));
            return json;
        }
        return error("Unable to save image to byte array");
    }
    public static void main(String[] args) throws IOException {
        ServerSocket serv = null;
        File file = null;
        try{
            serv = new ServerSocket(8080);
            while (true){
                Socket sock = null;
                try{
                    sock = serv.accept();
                    OutputStream out = sock.getOutputStream();
                    InputStream in = sock.getInputStream();
                    System.out.println("Client connected");

                    while (true){
                        byte[] messageBytes = NetworkUtils.Receive(in);
                        JSONObject message = JsonUtils.fromByteArray(messageBytes);
                        JSONObject returnMessage = null;
                        JSONObject welcome;
                        //JSONObject players;
                        System.out.println("Message: " + message);
                        if(message.has("start")){
                            isTime = true;
                            System.out.println("return start image");
                            currPoints = 0;
                            returnMessage = startImage();
                        } else if(message.has("name")) {
                            System.out.println("return name");
                            time();
                            returnMessage = name(message);
                            currPoints = 0;
                            returnMessage.append("points", 0);
                        } else if (message.has("new")){
                            if (message.get("new") instanceof Integer){
                                returnMessage = newImage();
                            } else{
                                returnMessage = error("Selection must be an integer");
                            }
                        }else if(message.getInt("isMore") == 1){
                            returnMessage = more(message);
                        }else if(message.has("next")){
                            System.out.println("next!");
                            message.put("char", message.getInt("next"));
                            message.put("more", 1);
                            returnMessage = more(message);
                        }else if(message.has("guess")){
                            if(!isTime){
                                System.out.println("Ran out of time!");
                                returnMessage = loser();
                            }else{
                            if(message.getInt("guess") == message.getInt("char")){
                                System.out.println("Correct Guess!");
                                correctGuesses++;
                                message = updatePoints(message, 1);
                                returnMessage = newImage();
                                if(correctGuesses == 3) {
                                    returnMessage = winner();
                                }
                            }
                        }}else {
                            returnMessage = error("Invalid message received");
                        }
                        byte[] output = JsonUtils.toByteArray(returnMessage);
                        NetworkUtils.Send(out, output);
                    }
                } catch (Exception e) {
                    System.out.println("Client disconnect");
                } finally {
                    if (sock != null){
                        sock.close();
                    }
                }
            }
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            if (serv != null){
                serv.close();
            }
        }
    }
}
