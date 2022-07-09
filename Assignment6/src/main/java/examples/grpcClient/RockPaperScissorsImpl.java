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
import java.util.Stack;

import java.util.Random;

class RockPaperScissorsImpl extends RockPaperScissorsGrpc.RockPaperScissorsImplBase {

    ArrayList<LeaderboardEntry> leaders = new ArrayList<LeaderboardEntry>();

    public RockPaperScissorsImpl(){
        super();
    }

    @Override
    public void play(PlayReq req, StreamObserver<PlayRes> responseObserver){
        System.out.println("Received from client: " + req.getName() + ", with play: " + req.getTemp());
        PlayRes.Builder response = PlayRes.newBuilder();
        LeaderboardRes.Builder leaderResponse = LeaderboardRes.newBuilder();
        LeaderboardEntry.Builder leader = LeaderboardEntry.newBuilder().setName(req.getName());
        response.setIsSuccess(false);

        Random rand = new Random();
        Boolean isThere = false;
        int compPlay = rand.nextInt(3) + 1; // Computer's choice: 0 = ROCK, 1 = PAPER, 2 = SCISSORS
        String compChoice = "";
        String userChoice = "";
        if(compPlay == 1){
            compChoice = "ROCK";
        }else if(compPlay == 2){
            compChoice = "PAPER";
        }else if(compPlay == 3){
            compChoice = "SCISSORS";
        }
        if(req.getTemp() == 1){
            userChoice = "ROCK";
        }else if(req.getTemp() == 2){
            userChoice = "PAPER";
        }else if(req.getTemp() == 3){
            userChoice = "SCISSORS";
        }
        //System.out.println("Does " + compPlay + " == " + req.getTemp());
        if(compPlay == req.getTemp()){
            response.setMessage("Computer played " + compChoice + ". You played " + userChoice + ". You tied!");
            response.setWin(false);
            response.setIsSuccess(true);
        } else if ((compPlay == 1 && req.getTemp() == 2) || (compPlay == 2 && req.getTemp() == 3) || (compPlay == 3 && req.getTemp() == 1)){
            response.setMessage("Computer played " + compChoice + ". You played " + userChoice + ". You Won!");
            response.setWin(true);
            response.setIsSuccess(true);


            for(int i = 0;i< leaders.size();i++){
                if(leaders.get(i).getName().equals(leader.getName())){
                    System.out.println("getWins Before: " + leaders.get(i).getWins());
                    leader.setWins(leaders.get(i).getWins() + 1);
                    leader.setLost(leaders.get(i).getLost());
                    leaderResponse.addLeaderboard(leader);
                    leaders.set(i,leaderResponse.getLeaderboard(0));
                    System.out.println("User: " + leader.getName() + " has " + leader.getWins() + " wins.");
                    isThere = true;
                }
            }
            if(isThere == false){
                leader.setWins(1);
              //  leader.setLost(0);
                leader.build();
                leaderResponse.addLeaderboard(leader);
                System.out.println("User: " + leader.getName() + " has " + leader.getWins() + " wins.");
                leaders.add(leaderResponse.getLeaderboard(0));
            }



        }else if ((compPlay == 1 && req.getTemp() == 3) || (compPlay == 2 && req.getTemp() == 1) || (compPlay == 3 && req.getTemp() == 2)){
            response.setMessage("Computer played " + compChoice + ". You played " + userChoice + ". You Lost!");
            response.setWin(false);
            response.setIsSuccess(true);

            for(int i = 0;i< leaders.size();i++){
                if(leaders.get(i).getName().equals(leader.getName())){
                    System.out.println("getLosses Before: " + leaders.get(i).getLost());
                    leader.setLost(leaders.get(i).getLost() + 1);
                    leader.setWins(leaders.get(i).getWins());
                    leaderResponse.addLeaderboard(leader);
                    leaders.set(i,leaderResponse.getLeaderboard(0));
                    System.out.println("User: " + leader.getName() + " has " + leader.getLost() + " losses.");
                    isThere = true;
                }
            }
            if(isThere == false){
              //  leader.setWins(0);
                leader.setLost(1);
                leaderResponse.addLeaderboard(leader);
                System.out.println("User: " + leader.getName() + " has " + leader.getLost() + " wins.");
                leaders.add(leaderResponse.getLeaderboard(0));
            }


        }
        PlayRes resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
    public void leaderboard(com.google.protobuf.Empty empty, StreamObserver<LeaderboardRes> responseObserver){
        LeaderboardRes.Builder response = LeaderboardRes.newBuilder();

        for (int i=0; i < leaders.size(); i++) {
            System.out.println("\n" + leaders.get(i).getName() + " with: " + leaders.get(i).getWins() + " wins and " + leaders.get(i).getLost() + " losses.");
            response.addLeaderboard(leaders.get(i));
        }

        LeaderboardRes resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }
}
