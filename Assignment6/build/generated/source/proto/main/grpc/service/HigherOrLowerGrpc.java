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
    comments = "Source: services/higherorlower.proto")
public final class HigherOrLowerGrpc {

  private HigherOrLowerGrpc() {}

  public static final String SERVICE_NAME = "service.HigherOrLower";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.HigherRequest,
      service.HigherResponse> getGuessMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "guess",
      requestType = service.HigherRequest.class,
      responseType = service.HigherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.HigherRequest,
      service.HigherResponse> getGuessMethod() {
    io.grpc.MethodDescriptor<service.HigherRequest, service.HigherResponse> getGuessMethod;
    if ((getGuessMethod = HigherOrLowerGrpc.getGuessMethod) == null) {
      synchronized (HigherOrLowerGrpc.class) {
        if ((getGuessMethod = HigherOrLowerGrpc.getGuessMethod) == null) {
          HigherOrLowerGrpc.getGuessMethod = getGuessMethod =
              io.grpc.MethodDescriptor.<service.HigherRequest, service.HigherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "guess"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HigherRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HigherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HigherOrLowerMethodDescriptorSupplier("guess"))
              .build();
        }
      }
    }
    return getGuessMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.WinnerList> getLeaderboardMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "leaderboard",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.WinnerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.WinnerList> getLeaderboardMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.WinnerList> getLeaderboardMethod;
    if ((getLeaderboardMethod = HigherOrLowerGrpc.getLeaderboardMethod) == null) {
      synchronized (HigherOrLowerGrpc.class) {
        if ((getLeaderboardMethod = HigherOrLowerGrpc.getLeaderboardMethod) == null) {
          HigherOrLowerGrpc.getLeaderboardMethod = getLeaderboardMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.WinnerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "leaderboard"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.WinnerList.getDefaultInstance()))
              .setSchemaDescriptor(new HigherOrLowerMethodDescriptorSupplier("leaderboard"))
              .build();
        }
      }
    }
    return getLeaderboardMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HigherOrLowerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerStub>() {
        @java.lang.Override
        public HigherOrLowerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HigherOrLowerStub(channel, callOptions);
        }
      };
    return HigherOrLowerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HigherOrLowerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerBlockingStub>() {
        @java.lang.Override
        public HigherOrLowerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HigherOrLowerBlockingStub(channel, callOptions);
        }
      };
    return HigherOrLowerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HigherOrLowerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HigherOrLowerFutureStub>() {
        @java.lang.Override
        public HigherOrLowerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HigherOrLowerFutureStub(channel, callOptions);
        }
      };
    return HigherOrLowerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HigherOrLowerImplBase implements io.grpc.BindableService {

    /**
     */
    public void guess(service.HigherRequest request,
        io.grpc.stub.StreamObserver<service.HigherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getGuessMethod(), responseObserver);
    }

    /**
     */
    public void leaderboard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.WinnerList> responseObserver) {
      asyncUnimplementedUnaryCall(getLeaderboardMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGuessMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.HigherRequest,
                service.HigherResponse>(
                  this, METHODID_GUESS)))
          .addMethod(
            getLeaderboardMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.WinnerList>(
                  this, METHODID_LEADERBOARD)))
          .build();
    }
  }

  /**
   */
  public static final class HigherOrLowerStub extends io.grpc.stub.AbstractAsyncStub<HigherOrLowerStub> {
    private HigherOrLowerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HigherOrLowerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HigherOrLowerStub(channel, callOptions);
    }

    /**
     */
    public void guess(service.HigherRequest request,
        io.grpc.stub.StreamObserver<service.HigherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void leaderboard(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.WinnerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getLeaderboardMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HigherOrLowerBlockingStub extends io.grpc.stub.AbstractBlockingStub<HigherOrLowerBlockingStub> {
    private HigherOrLowerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HigherOrLowerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HigherOrLowerBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.HigherResponse guess(service.HigherRequest request) {
      return blockingUnaryCall(
          getChannel(), getGuessMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.WinnerList leaderboard(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getLeaderboardMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HigherOrLowerFutureStub extends io.grpc.stub.AbstractFutureStub<HigherOrLowerFutureStub> {
    private HigherOrLowerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HigherOrLowerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HigherOrLowerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.HigherResponse> guess(
        service.HigherRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getGuessMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.WinnerList> leaderboard(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getLeaderboardMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GUESS = 0;
  private static final int METHODID_LEADERBOARD = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HigherOrLowerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HigherOrLowerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GUESS:
          serviceImpl.guess((service.HigherRequest) request,
              (io.grpc.stub.StreamObserver<service.HigherResponse>) responseObserver);
          break;
        case METHODID_LEADERBOARD:
          serviceImpl.leaderboard((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.WinnerList>) responseObserver);
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

  private static abstract class HigherOrLowerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HigherOrLowerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.HigherOrLowerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("HigherOrLower");
    }
  }

  private static final class HigherOrLowerFileDescriptorSupplier
      extends HigherOrLowerBaseDescriptorSupplier {
    HigherOrLowerFileDescriptorSupplier() {}
  }

  private static final class HigherOrLowerMethodDescriptorSupplier
      extends HigherOrLowerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HigherOrLowerMethodDescriptorSupplier(String methodName) {
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
      synchronized (HigherOrLowerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HigherOrLowerFileDescriptorSupplier())
              .addMethod(getGuessMethod())
              .addMethod(getLeaderboardMethod())
              .build();
        }
      }
    }
    return result;
  }
}
