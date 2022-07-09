package example.grpcclient;
import io.grpc.Server;
import io.grpc.ServerBuilder;
import io.grpc.ServerMethodDefinition;
import io.grpc.stub.StreamObserver;
import service.*;
import buffers.RequestProtos.Request;
import buffers.RequestProtos.Request.RequestType;
import buffers.ResponseProtos.Response;

import java.util.ArrayList;
import java.util.Date;
import java.util.Stack;

import java.util.Random;

public class HigherOrLowerImpl extends HigherOrLowerGrpc.HigherOrLowerImplBase {

    ArrayList<Winner> winnerList = new ArrayList<Winner>();

    public void guess(HigherRequest higherRequest, StreamObserver<HigherResponse> responseObserver){
        HigherResponse.Builder response = HigherResponse.newBuilder();
        Winner.Builder winner = Winner.newBuilder().setName(higherRequest.getName());
        System.out.println("Higher: " + higherRequest.getIsUp());
        Random rand = new Random();
        int random = rand.nextInt(100)+1;
        if(higherRequest.getGuessNum() < 1 || higherRequest.getGuessNum() > 100){
            System.out.println("User entered Out of Bounds");
        }
        Boolean isThere = false;
        if(higherRequest.getIsUp() == true){
            if(higherRequest.getGuessNum() < random){
             //   response.setWinner(winner);
                response.setMessage("You guessed higher than " + higherRequest.getGuessNum() + ". It was " + random + ". You won!");

                for(int i = 0;i< winnerList.size();i++) {
                    if (winnerList.get(i).getName().equals(winner.getName())) {
                        winner.setNumWins(winnerList.get(i).getNumWins() + 1);
                        response.setWinner(winner);
                        winnerList.set(i, response.getWinner());
                        System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                        isThere = true;
                    }
                }
                if(isThere == false){
                    winner.setNumWins(1);
                    response.setWinner(winner);
                    System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                    winnerList.add(response.getWinner());
                }
                    if(winnerList.size() == 0){
                        winner.setNumWins(1);
                        response.setWinner(winner);
                        winnerList.add(response.getWinner());
                        System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                        winnerList.add(response.getWinner());
                    }


            }else if(higherRequest.getGuessNum() >= random){
                response.setMessage("You guessed higher than " + higherRequest.getGuessNum() + ". It was " + random + ". You lost!");
            }
        }else if (higherRequest.getIsUp() == false){
            if(higherRequest.getGuessNum() <= random){
                response.setMessage("You guessed lower than " + higherRequest.getGuessNum() + ". It was " + random + ". You lost!");
            }else if(higherRequest.getGuessNum() > random){
                response.setMessage("You guessed lower than " + higherRequest.getGuessNum() + ". It was " + random + ". You won!");

                for(int i = 0;i< winnerList.size();i++){
                    if(winnerList.get(i).getName().equals(winner.getName())){
                        System.out.println("getNums Before: " + winnerList.get(i).getNumWins());
                        winner.setNumWins(winnerList.get(i).getNumWins() + 1);
                        response.setWinner(winner);
                        winnerList.set(i, response.getWinner());
                        System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                        isThere = true;
                    }
                }
                if(isThere == false){
                    winner.setNumWins(1);
                    response.setWinner(winner);
                    System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                    winnerList.add(response.getWinner());
                }

                if(winnerList.size() == 0){
                    winner.setNumWins(1);
                    response.setWinner(winner);
                    System.out.println("User: " + winner.getName() + " has " + winner.getNumWins() + " wins.");
                    winnerList.add(response.getWinner());
                    System.out.println("Added: " + winnerList.get(0).getName());
                }

            }
        }

        HigherResponse resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
    public void leaderboard(com.google.protobuf.Empty empty, StreamObserver<WinnerList> responseObserver){
        System.out.println("Listing...");
        WinnerList.Builder response = WinnerList.newBuilder();
        for(int i = 0;i< winnerList.size();i++){
            System.out.println("\n" + winnerList.get(i).getName() + " with: " + winnerList.get(i).getNumWins() + " wins.");
            response.addWinners(winnerList.get(i));

        }
        WinnerList resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
