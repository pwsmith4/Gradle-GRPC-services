package service;

import static io.grpc.MethodDescriptor.generateFullMethodName;
import static io.grpc.stub.ClientCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ClientCalls.asyncClientStreamingCall;
import static io.grpc.stub.ClientCalls.asyncServerStreamingCall;
import static io.grpc.stub.ClientCalls.asyncUnaryCall;
import static io.grpc.stub.ClientCalls.blockingServerStreamingCall;
import static io.grpc.stub.ClientCalls.blockingUnaryCall;
import static io.grpc.stub.ClientCalls.futureUnaryCall;
import static io.grpc.stub.ServerCalls.asyncBidiStreamingCall;
import static io.grpc.stub.ServerCalls.asyncClientStreamingCall;
import static io.grpc.stub.ServerCalls.asyncServerStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnaryCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall;
import static io.grpc.stub.ServerCalls.asyncUnimplementedUnaryCall;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.33.1)",
    comments = "Source: services/rockpaperscissors.proto")
public final class RockPaperScissorsGrpc {

  private RockPaperScissorsGrpc() {}

  public static final String SERVICE_NAME = "service.RockPaperScissors";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.PlayReq,
      service.PlayRes> getPlayMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "play",
      requestType = service.PlayReq.class,
      responseType = service.PlayRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.PlayReq,
      service.PlayRes> getPlayMethod() {
    io.grpc.MethodDescriptor<service.PlayReq, service.PlayRes> getPlayMethod;
    if ((getPlayMethod = RockPaperScissorsGrpc.getPlayMethod) == null) {
      synchronized (RockPaperScissorsGrpc.class) {
        if ((getPlayMethod = RockPaperScissorsGrpc.getPlayMethod) == null) {
          RockPaperScissorsGrpc.getPlayMethod = getPlayMethod =
              io.grpc.MethodDescriptor.<service.PlayReq, service.PlayRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "play"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.PlayReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.PlayRes.getDefaultInstance()))
              .setSchemaDescriptor(new RockPaperScissorsMethodDescriptorSupplier("play"))
              .build();
        }
      }
    }
    return getPlayMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.LeaderboardRes> getLeaderboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "leaderboard",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.LeaderboardRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.LeaderboardRes> getLeaderboardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.LeaderboardRes> getLeaderboardMethod;
    if ((getLeaderboardMethod = RockPaperScissorsGrpc.getLeaderboardMethod) == null) {
      synchronized (RockPaperScissorsGrpc.class) {
        if ((getLeaderboardMethod = RockPaperScissorsGrpc.getLeaderboardMethod) == null) {
          RockPaperScissorsGrpc.getLeaderboardMethod = getLeaderboardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.LeaderboardRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "leaderboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.LeaderboardRes.getDefaultInstance()))
              .setSchemaDescriptor(new RockPaperScissorsMethodDescriptorSupplier("leaderboard"))
              .build();
        }
      }
    }
    return getLeaderboardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RockPaperScissorsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsStub>() {
        @java.lang.Override
        public RockPaperScissorsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RockPaperScissorsStub(channel, callOptions);
        }
      };
    return RockPaperScissorsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RockPaperScissorsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsBlockingStub>() {
        @java.lang.Override
        public RockPaperScissorsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RockPaperScissorsBlockingStub(channel, callOptions);
        }
      };
    return RockPaperScissorsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RockPaperScissorsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RockPaperScissorsFutureStub>() {
        @java.lang.Override
        public RockPaperScissorsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RockPaperScissorsFutureStub(channel, callOptions);
        }
      };
    return RockPaperScissorsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RockPaperScissorsImplBase implements io.grpc.BindableService {

    /**
     */
    public void play(service.PlayReq request,
        io.grpc.stub.StreamObserver<service.PlayRes> responseObserver) {
      asyncUnimplementedUnaryCall(getPlayMethod(), responseObserver);
    }

    /**
     */
    public void leaderboard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.LeaderboardRes> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaderboardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getPlayMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.PlayReq,
                service.PlayRes>(
                  this, METHODID_PLAY)))
          .addMethod(
            getLeaderboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.LeaderboardRes>(
                  this, METHODID_LEADERBOARD)))
          .build();
    }
  }

  /**
   */
  public static final class RockPaperScissorsStub extends io.grpc.stub.AbstractAsyncStub<RockPaperScissorsStub> {
    private RockPaperScissorsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RockPaperScissorsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RockPaperScissorsStub(channel, callOptions);
    }

    /**
     */
    public void play(service.PlayReq request,
        io.grpc.stub.StreamObserver<service.PlayRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leaderboard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.LeaderboardRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaderboardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RockPaperScissorsBlockingStub extends io.grpc.stub.AbstractBlockingStub<RockPaperScissorsBlockingStub> {
    private RockPaperScissorsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RockPaperScissorsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RockPaperScissorsBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.PlayRes play(service.PlayReq request) {
      return blockingUnaryCall(
          getChannel(), getPlayMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.LeaderboardRes leaderboard(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLeaderboardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RockPaperScissorsFutureStub extends io.grpc.stub.AbstractFutureStub<RockPaperScissorsFutureStub> {
    private RockPaperScissorsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RockPaperScissorsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RockPaperScissorsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.PlayRes> play(
        service.PlayReq request) {
      return futureUnaryCall(
          getChannel().newCall(getPlayMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.LeaderboardRes> leaderboard(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaderboardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_PLAY = 0;
  private static final int METHODID_LEADERBOARD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RockPaperScissorsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RockPaperScissorsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_PLAY:
          serviceImpl.play((service.PlayReq) request,
              (io.grpc.stub.StreamObserver<service.PlayRes>) responseObserver);
          break;
        case METHODID_LEADERBOARD:
          serviceImpl.leaderboard((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.LeaderboardRes>) responseObserver);
          break;
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }
  }

  private static abstract class RockPaperScissorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RockPaperScissorsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.RockPaperScissorsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("RockPaperScissors");
    }
  }

  private static final class RockPaperScissorsFileDescriptorSupplier
      extends RockPaperScissorsBaseDescriptorSupplier {
    RockPaperScissorsFileDescriptorSupplier() {}
  }

  private static final class RockPaperScissorsMethodDescriptorSupplier
      extends RockPaperScissorsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RockPaperScissorsMethodDescriptorSupplier(String methodName) {
      this.methodName = methodName;
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.MethodDescriptor getMethodDescriptor() {
      return getServiceDescriptor().findMethodByName(methodName);
    }
  }

  private static volatile io.grpc.ServiceDescriptor serviceDescriptor;

  public static io.grpc.ServiceDescriptor getServiceDescriptor() {
    io.grpc.ServiceDescriptor result = serviceDescriptor;
    if (result == null) {
      synchronized (RockPaperScissorsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RockPaperScissorsFileDescriptorSupplier())
              .addMethod(getPlayMethod())
              .addMethod(getLeaderboardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
