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

class TimerImpl extends TimerGrpc.TimerImplBase {
    public double elapsedTime = 0;
    public double startTime = 0;

    ArrayList<Time> timers = new ArrayList<Time>();

    public TimerImpl(){
        super();
    }

    @Override
    public void start(TimerRequest timer, StreamObserver<TimerResponse> responseObserver){
      //  System.out.println("Received from client: " + req.getName() + ", with play: " + req.getTemp());
        TimerResponse.Builder response = TimerResponse.newBuilder();
        Time.Builder time = Time.newBuilder().setName(timer.getName());
        time.setSecondsPassed(System.currentTimeMillis());
        response.setTimer(time);
        TimerList.Builder timerList = TimerList.newBuilder();
       // String timerName = timer.getName();
        startTime = System.currentTimeMillis();
       // response.getTimer().setSecondsPassed(startTime);
        timers.add(response.getTimer());
        System.out.println("Timer name: " + response.getTimer().getName());
        elapsedTime = 0;


        TimerResponse resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void check(TimerRequest timer, StreamObserver<TimerResponse> responseObserver){
        TimerResponse.Builder response = TimerResponse.newBuilder();
        String timerName = timer.getName();
        Time.Builder time = Time.newBuilder();
        Date date = new Date();
        double checkTime = 0;
        for(int i = 0;i< timers.size();i++){
            if(timers.get(i).getName().equals(timer.getName())){
                checkTime = timers.get(i).getSecondsPassed();
                elapsedTime = (System.currentTimeMillis() - checkTime)/1000;
                time.setSecondsPassed(elapsedTime);
            }
        }

        System.out.println("Time elapsed: " + elapsedTime);
        TimerResponse resp = response.setTimer(time).build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void close(TimerRequest timer, StreamObserver<TimerResponse> responseObserver){
        System.out.println("Closing...");
        TimerResponse.Builder response = TimerResponse.newBuilder();
      //  TimerList.Builder timerList = TimerList.newBuilder();
    //    String timerName = timer.getName();
     //   Time.Builder time = Time.newBuilder();
        for(int i = 0;i< timers.size();i++){
            if(timers.get(i).getName().equals(timer.getName())){
                timers.remove(i);
                System.out.println("Timer: " + timer.getName() + " removed.");
            }
        }

        TimerResponse resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

    public void list(com.google.protobuf.Empty empty, StreamObserver<TimerList> responseObserver){
        System.out.println("Listing...");
        TimerList.Builder response = TimerList.newBuilder();
        /*        for(Timer timerNamed: response.getTimerList()){
                System.out.println(timerNamed.getName() + "\n");
                //response.add(response.getTimerList());

        }*/
        for(int i = 0;i< timers.size();i++){
                System.out.println("\n" + timers.get(i).getName());
                response.addTimers(timers.get(i));

        }
        TimerList resp = response.build();
        responseObserver.onNext(resp);
        responseObserver.onCompleted();
    }

}
