package example.grpcclient;

import io.grpc.Channel;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;

import java.util.Random;
import java.util.concurrent.TimeUnit;
import service.*;
import test.TestProtobuf;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import com.google.protobuf.Empty; // needed to use Empty

// just to show how to use the empty in the protobuf protocol
    // Empty empt = Empty.newBuilder().build();

/**
 * Client that requests `parrot` method from the `EchoServer`.
 */
public class EchoClient {
  private final EchoGrpc.EchoBlockingStub blockingStub;
  private final JokeGrpc.JokeBlockingStub blockingStub2;
  private final RegistryGrpc.RegistryBlockingStub blockingStub3;
  private final RockPaperScissorsGrpc.RockPaperScissorsBlockingStub blockingStub4;
  private final TimerGrpc.TimerBlockingStub blockingStub5;
  private final HigherOrLowerGrpc.HigherOrLowerBlockingStub blockingStub6;

  /** Construct client for accessing server using the existing channel. */
  public EchoClient(Channel channel, Channel regChannel) {
    // 'channel' here is a Channel, not a ManagedChannel, so it is not this code's
    // responsibility to
    // shut it down.

    // Passing Channels to code makes code easier to test and makes it easier to
    // reuse Channels.
    blockingStub = EchoGrpc.newBlockingStub(channel);
    blockingStub2 = JokeGrpc.newBlockingStub(channel);
    blockingStub4 = RockPaperScissorsGrpc.newBlockingStub(channel);
    blockingStub5 = TimerGrpc.newBlockingStub(channel);
    blockingStub6 = HigherOrLowerGrpc.newBlockingStub(channel);
    blockingStub3 = RegistryGrpc.newBlockingStub(regChannel);

  }

  public void askServerToParrot(String message) {
    ClientRequest request = ClientRequest.newBuilder().setMessage(message).build();
    ServerResponse response;
    try {
      response = blockingStub.parrot(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e.getMessage());
      return;
    }
    System.out.println("Received from server: " + response.getMessage());
  }

  public void askForJokes(int num) {
    JokeReq request = JokeReq.newBuilder().setNumber(num).build();
    JokeRes response;


    try {
      response = blockingStub2.getJoke(request);
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
    System.out.println("Your jokes: ");
    for (String joke : response.getJokeList()) {
      System.out.println("--- " + joke);
    }
  }

  public void setJoke(String joke) {
    JokeSetReq request = JokeSetReq.newBuilder().setJoke(joke).build();
    JokeSetRes response;

    try {
      response = blockingStub2.setJoke(request);
      System.out.println(response.getOk());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void askForPlay(String name){
    int choice = 0;
    PlayRes response;

      BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      System.out.println("Enter your choice: (1 for Rock, 2 for Paper, 3 for Scissors)");

      try {
        choice = Integer.parseInt(reader.readLine());
        PlayReq request = PlayReq.newBuilder().setName(name).setTemp(choice).build();

        response = blockingStub4.play(request);
        System.out.println(response.getMessage());
      } catch (Exception e) {
        System.err.println("RPC failed: " + e);
        return;
      }
    System.out.println("Is a success: " + response.getIsSuccess());
  }
  public void autoAskForPlay(String name){
    int choice = 0;
    PlayRes response;

   // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println(name + " is entering random choice: (Rock, Paper, or Scissors)");
    Random rand = new Random();
    choice = rand.nextInt(3) + 1;
    try {
      PlayReq request = PlayReq.newBuilder().setName(name).setTemp(choice).build();

      response = blockingStub4.play(request);
      System.out.println(response.getMessage());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  //  System.out.println("Is a success: " + response.getIsSuccess());
  }

  public void playLeaderboard(){
    LeaderboardRes response;
    try{
      PlayReq request = PlayReq.newBuilder().build();
      Empty empty = Empty.newBuilder().build();
      response = blockingStub4.leaderboard(empty);
      System.out.println("All players: ");
      int i = 0;
      for(LeaderboardEntry leader : response.getLeaderboardList()){
        System.out.println("--- " + leader.getName() + ": " + leader.getWins() + " wins and " + leader.getLost() + " losses.");
        i++;
      }

      System.out.println();
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void startTimer(){
    String name = "";
    TimerResponse response;

    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    System.out.println("Enter the name for the Timer: ");

    try {
      name = reader.readLine();
      TimerRequest request = TimerRequest.newBuilder().setName(name).build();

      response = blockingStub5.start(request);
      System.out.println("Timer started.\n");
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }
  public void autoStartTimer(String name){
    TimerResponse response;
    try {
      TimerRequest request = TimerRequest.newBuilder().setName(name).build();

      response = blockingStub5.start(request);
      System.out.println("Timer: " + name + " started.\n");
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void checkTimer(String name){
    TimerResponse response;
    try{
      TimerRequest request = TimerRequest.newBuilder().setName(name).build();
      response = blockingStub5.check(request);
      double seconds = response.getTimer().getSecondsPassed();
      if(seconds == 0.0){
        System.out.println("The Timer: " + name + " doesn't exist. Please Try Again.");
      }else {
        System.out.println("Time Elapsed for " + name + ": " + seconds + " seconds\n");
      }
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void closeTimer(String name){
    TimerResponse response;
    try{
      TimerRequest request = TimerRequest.newBuilder().setName(name).build();
      response = blockingStub5.close(request);
      response.getTimer().getSecondsPassed();
      System.out.println("Timer: " + name + " closed.\n");
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void listTimer(){
    TimerList response;
    try{
      TimerRequest request = TimerRequest.newBuilder().build();
      Empty empty = Empty.newBuilder().build();
      response = blockingStub5.list(empty);
      System.out.println("All Timers: ");
      for (Time timer : response.getTimersList()) {
        System.out.println("--- " + timer.getName());
      }
      System.out.println();
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void autoHigherOrLower(String higherName){
    HigherResponse response;
    boolean guessUp = false;
    Random rand = new Random();
    int guess = rand.nextInt(2)+1;
    int spot = rand.nextInt(100)+1;
   // BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //System.out.println("Enter your name: ");

    try {
      //higherName = reader.readLine();
      System.out.println("Is the number higher or lower than " + spot + "? (From numbers 1-100)");
      if(guess == 1){
        guessUp = true;
      }else if(guess == 2){
        guessUp = false;
      }
      HigherRequest request = HigherRequest.newBuilder().setName(higherName).setIsUp(guessUp).setGuessNum(spot).build();

      response = blockingStub6.guess(request);
      System.out.println(response.getMessage());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void HigherOrLower(String higherName){
    HigherResponse response;
    int guess = 0;
    boolean guessUp = false;
    Random rand = new Random();
    int spot = rand.nextInt(100)+1;
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    //System.out.println("Enter your name: ");

    try {
      //higherName = reader.readLine();
      System.out.println("Is the number higher (type: '1') or lower (type: '2') than " + spot + "? (From numbers 1-100)");
      guess = Integer.parseInt(reader.readLine());
      if(guess == 1){
        guessUp = true;
      }else if(guess == 2){
        guessUp = false;
      }
      HigherRequest request = HigherRequest.newBuilder().setName(higherName).setIsUp(guessUp).setGuessNum(spot).build();

      response = blockingStub6.guess(request);
      System.out.println(response.getMessage());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }
  public void HigherOrLowerLeaderboard(){
    WinnerList response;
    try{
      HigherRequest request = HigherRequest.newBuilder().build();
      Empty empty = Empty.newBuilder().build();
      response = blockingStub6.leaderboard(empty);
      System.out.println("All Winners: ");
      for (Winner winner : response.getWinnersList()) {
        System.out.println("--- " + winner.getName() + ": " + winner.getNumWins() + " wins.");
      }
      System.out.println();
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void getServices() {
    GetServicesReq request = GetServicesReq.newBuilder().build();
    ServicesListRes response;
    try {
      response = blockingStub3.getServices(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServer(String name) {
    FindServerReq request = FindServerReq.newBuilder().setServiceName(name).build();
    SingleServerRes response;
    try {
      response = blockingStub3.findServer(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public void findServers(String name) {
    FindServersReq request = FindServersReq.newBuilder().setServiceName(name).build();
    ServerListRes response;
    try {
      response = blockingStub3.findServers(request);
      System.out.println(response.toString());
    } catch (Exception e) {
      System.err.println("RPC failed: " + e);
      return;
    }
  }

  public static void main(String[] args) throws Exception {
    if (args.length != 7) {
      System.out
          .println("Expected arguments: <host(String)> <port(int)> <regHost(string)> <regPort(int)> <message(String)> <regOn(bool)>");
      System.exit(1);
    }
    int port = 9099;
    int regPort = 9003;
    String host = args[0];
    String regHost = args[2];
    String message = args[4];
    try {
      port = Integer.parseInt(args[1]);
      regPort = Integer.parseInt(args[3]);
    } catch (NumberFormatException nfe) {
      System.out.println("[Port] must be an integer");
      System.exit(2);
    }

    // Create a communication channel to the server, known as a Channel. Channels
    // are thread-safe
    // and reusable. It is common to create channels at the beginning of your
    // application and reuse
    // them until the application shuts down.
    String target = host + ":" + port;
    ManagedChannel channel = ManagedChannelBuilder.forTarget(target)
        // Channels are secure by default (via SSL/TLS). For the example we disable TLS
        // to avoid
        // needing certificates.
        .usePlaintext().build();

    String regTarget = regHost + ":" + regPort;
    ManagedChannel regChannel = ManagedChannelBuilder.forTarget(regTarget).usePlaintext().build();
    try {

      // ##############################################################################
      // ## Assume we know the port here from the service node it is basically set through Gradle
      // here.
      // In your version you should first contact the registry to check which services
      // are available and what the port
      // etc is.

      /**
       * Your client should start off with 
       * 1. contacting the Registry to check for the available services
       * 2. List the services in the terminal and the client can
       *    choose one (preferably through numbering) 
       * 3. Based on what the client chooses
       *    the terminal should ask for input, eg. a new sentence, a sorting array or
       *    whatever the request needs 
       * 4. The request should be sent to one of the
       *    available services (client should call the registry again and ask for a
       *    Server providing the chosen service) should send the request to this service and
       *    return the response in a good way to the client
       * 
       * You should make sure your client does not crash in case the service node
       * crashes or went offline.
       */
      if(Integer.parseInt(args[6]) == 1){
        EchoClient client = new EchoClient(channel, regChannel);
        client.askServerToParrot(message);
        for (int k = 0; k < 4; k++) {
          client.autoAskForPlay("Parker");
        }
          for (int o = 0; o < 4; o++) {
          client.autoAskForPlay("Steve");
        }
            client.playLeaderboard();

        client.autoStartTimer("First Timer");
        client.autoStartTimer("Second Timer");
        client.checkTimer("First Timer");
        client.listTimer();
        client.closeTimer("First Timer");
        client.checkTimer("First Timer");
        client.checkTimer("Second Timer");
        client.listTimer();

        for (int i = 0; i < 5; i++) {
          client.autoHigherOrLower("Dave");
        }
        for (int j = 0; j < 5; j++){
          client.autoHigherOrLower("Steven");
        }
        client.HigherOrLowerLeaderboard();
      }else {

        // ask the user for input how many jokes the user wants
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
      /*Register register = new Register(regHost, regPort, host, port, message);
      register.run();*/
        System.out.println("1. Joke\n2. Rock Paper Scissors\n3. Timer\n4. Higher or Lower");
        int choice = Integer.parseInt(reader.readLine());


        // Just doing some hard coded calls to the service node without using the
        // registry
        // create client
        EchoClient client = new EchoClient(channel, regChannel);
        //client.getServices();


        // call the parrot service on the server
        client.askServerToParrot(message);
        Boolean timerContinue = true;

        if (choice == 1) {
          // Reading data using readLine
          System.out.println("How many jokes would you like?"); // NO ERROR handling of wrong input here.
          String num = reader.readLine();

          // calling the joked service from the server with num from user input
          client.askForJokes(Integer.valueOf(num));

          // adding a joke to the server
          client.setJoke("I made a pencil with two erasers. It was pointless.");

          // showing 6 joked
          client.askForJokes(Integer.valueOf(6));
        } else if (choice == 2) {
          System.out.println("Enter your name: ");
          String name = reader.readLine();
          Boolean isContinue = true;
          client.askForPlay(name);
          while (isContinue) {
            System.out.println("Continue? Yes (Type: '1'), Leaderboard (Type: '2'), Quit (Type: '3')\n");
            int continued = Integer.parseInt(reader.readLine());
            if (continued == 1) {
              client.askForPlay(name);
            }
            if (continued == 2) {
              client.playLeaderboard();
            }
            if (continued == 3) {
              isContinue = false;
            }
          }


        } else if (choice == 3) {
          while (timerContinue) {
            System.out.println("1. Start new Timer\n2. Check Timer Status\n3. Close Timer\n4. Look at Timer List");
            choice = Integer.parseInt(reader.readLine());
            if (choice == 1) {
              client.startTimer();
            } else if (choice == 2) {
              System.out.println("Enter the name of the Timer to check: ");
              String name = reader.readLine();
              client.checkTimer(name);
            } else if (choice == 3) {
              System.out.println("Enter the name of the Timer to close: ");
              String name = reader.readLine();
              client.closeTimer(name);
            } else if (choice == 4) {
              client.listTimer();
            } else {
              timerContinue = false;
            }
          }
        } else if (choice == 4) {
          Boolean isContinue = true;
          //BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
          System.out.println("Enter your name: ");
          String name = reader.readLine();

          client.HigherOrLower(name);
          while (isContinue) {
            System.out.println("Continue? Yes (Type: '1'), Leaderboard (Type: '2'), Quit (Type: '3')\n");
            int continued = Integer.parseInt(reader.readLine());
            if (continued == 1) {
              client.HigherOrLower(name);
            }
            if (continued == 2) {
              client.HigherOrLowerLeaderboard();
            }
            if (continued == 3) {
              isContinue = false;
            }
          }
        }

        // ############### Contacting the registry just so you see how it can be done
     /* if (args[5].equals("true")) {
        // Comment these last Service calls while in Activity 1 Task 1, they are not needed and wil throw issues without the Registry running
        // get thread's services
        client.getServices(); // get all registered services 

        // get parrot
        client.findServer("services.Echo/parrot"); // get ONE server that provides the parrot service
        
        // get all setJoke
        client.findServers("services.Joke/setJoke"); // get ALL servers that provide the setJoke service

        // get getJoke
        client.findServer("services.Joke/getJoke"); // get ALL servers that provide the getJoke service

        // does not exist
        client.findServer("random"); // shows the output if the server does not find a given service
      }*/
      }
    } finally {
      // ManagedChannels use resources like threads and TCP connections. To prevent
      // leaking these
      // resources the channel should be shut down when it will no longer be used. If
      // it may be used
      // again leave it running.
      channel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
      regChannel.shutdownNow().awaitTermination(5, TimeUnit.SECONDS);
    }
  }
}
