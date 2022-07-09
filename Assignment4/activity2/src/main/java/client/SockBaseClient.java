package client;

import java.net.*;
import java.io.*;

import org.json.*;

import buffers.RequestProtos.Request;
import buffers.ResponseProtos.Response;
import buffers.ResponseProtos.Entry;

import java.util.*;
import java.util.stream.Collectors;

class SockBaseClient {
    static BufferedReader stdin;
    static String strToSend;
    static Scanner userInput;


    public static void initMenu() throws IOException {
        // Ask user for username
        System.out.println("What would you like to do?\n1 - to see the leader board\n2 - to enter a game\n3 - Quit");

    }

    public static void main (String args[]) throws Exception {

        Socket serverSock = null;
        OutputStream out = null;
        InputStream in = null;
        int i1=0, i2=0;
        int port = 9099; // default port

        // Make sure two arguments are given
        if (args.length != 2) {
            System.out.println("Expected arguments: <host(String)> <port(int)>");
            System.exit(1);
        }
        String host = args[0];
        try {
            port = Integer.parseInt(args[1]);
        } catch (NumberFormatException nfe) {
            System.out.println("[Port] must be integer");
            System.exit(2);
        }
        System.out.println("Please provide your name for the server. ");
       // stdin = new BufferedReader(new InputStreamReader(System.in));
     //   strToSend = stdin.readLine();
        userInput = new Scanner(System.in);
        strToSend = userInput.next();
        initMenu();
        // Build the first request object just including the name
            try {
                Request op = Request.newBuilder()
                        .setOperationType(Request.OperationType.NAME)
                        .setName(strToSend).build();
                    // read from the server
                    // print the server response.
                String serverTask = "";

                while(true) {
                    // connect to the server
                    serverSock = new Socket(host, port);

                    // write to the server
                    out = serverSock.getOutputStream();
                    in = serverSock.getInputStream();

                    op.writeDelimitedTo(out);
                    Response response = Response.parseDelimitedFrom(in);
                    if(response.getResponseType() == Response.ResponseType.GREETING){
                        op = Request.newBuilder()
                                .setOperationType(Request.OperationType.NAME)
                                .setName(strToSend).build();
                    }

                    if(op.getOperationType() == Request.OperationType.NAME) {
                        int choice = userInput.nextInt();
                            if (choice == 1) {
                                op = Request.newBuilder()
                                        .setOperationType(Request.OperationType.LEADER)
                                        .setName(strToSend).build();
                                System.out.println("Leaderboard: \n" + response.getImage());
                                initMenu();
                            }
                            if (choice == 2) {
                                op = Request.newBuilder()
                                        .setOperationType(Request.OperationType.NEW)
                                        .setName(strToSend).build();
                            }
                            if (choice == 3) {
                                op = Request.newBuilder()
                                        .setOperationType(Request.OperationType.QUIT)
                                        .setName(strToSend).build();
                            }
                    }
                    if(op.getOperationType() == Request.OperationType.LEADER) {

                        op = Request.newBuilder()
                                .setOperationType(Request.OperationType.NAME)
                                .setName(strToSend).build();
                    }
                    if(response.getResponseType() == Response.ResponseType.WON){
                        System.out.println(response.getTask());
                        op = Request.newBuilder()
                                .setOperationType(Request.OperationType.NAME)
                                .setName(strToSend).build();
                        initMenu();
                    }else{
                        if(response.getResponseType() == (Response.ResponseType.TASK)){
                    System.out.println("#### Current Image ####\n" + response.getImage());
                    System.out.println("#### Your Task ####\n" + response.getTask());
                    String userTask = "";
                    if(response.getTask().equals("Type e")){
                        serverTask = "e";
                    }
                    if(response.getTask().equals("Type p")){
                        serverTask = "p";
                    }
                    if(response.getTask().equals("Type r")){
                        serverTask = "r";
                    }
                        userTask = userInput.next();
                    if(userTask.equals("quit")){
                        op = Request.newBuilder()
                                .setOperationType(Request.OperationType.QUIT)
                                .setName(strToSend).build();
                    }
                        if(userTask.equals(serverTask)) {
                            op = Request.newBuilder()
                                    .setOperationType(Request.OperationType.ANSWER)
                                    .setName(strToSend).build();
                        }else{
                            System.out.println("You failed the task");
                        }
                    }}
                }
            } catch (Exception e) {
                e.printStackTrace();
            } finally {
                if (in != null) in.close();
                if (out != null) out.close();
                if (serverSock != null) serverSock.close();
            }

    }
}


