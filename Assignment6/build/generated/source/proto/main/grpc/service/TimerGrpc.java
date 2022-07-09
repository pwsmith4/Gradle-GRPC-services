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
    comments = "Source: services/timer.proto")
public final class TimerGrpc {

  private TimerGrpc() {}

  public static final String SERVICE_NAME = "services.Timer";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getStartMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "start",
      requestType = service.TimerRequest.class,
      responseType = service.TimerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getStartMethod() {
    io.grpc.MethodDescriptor<service.TimerRequest, service.TimerResponse> getStartMethod;
    if ((getStartMethod = TimerGrpc.getStartMethod) == null) {
      synchronized (TimerGrpc.class) {
        if ((getStartMethod = TimerGrpc.getStartMethod) == null) {
          TimerGrpc.getStartMethod = getStartMethod =
              io.grpc.MethodDescriptor.<service.TimerRequest, service.TimerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "start"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TimerMethodDescriptorSupplier("start"))
              .build();
        }
      }
    }
    return getStartMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getCheckMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "check",
      requestType = service.TimerRequest.class,
      responseType = service.TimerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getCheckMethod() {
    io.grpc.MethodDescriptor<service.TimerRequest, service.TimerResponse> getCheckMethod;
    if ((getCheckMethod = TimerGrpc.getCheckMethod) == null) {
      synchronized (TimerGrpc.class) {
        if ((getCheckMethod = TimerGrpc.getCheckMethod) == null) {
          TimerGrpc.getCheckMethod = getCheckMethod =
              io.grpc.MethodDescriptor.<service.TimerRequest, service.TimerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "check"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TimerMethodDescriptorSupplier("check"))
              .build();
        }
      }
    }
    return getCheckMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getCloseMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "close",
      requestType = service.TimerRequest.class,
      responseType = service.TimerResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.TimerRequest,
      service.TimerResponse> getCloseMethod() {
    io.grpc.MethodDescriptor<service.TimerRequest, service.TimerResponse> getCloseMethod;
    if ((getCloseMethod = TimerGrpc.getCloseMethod) == null) {
      synchronized (TimerGrpc.class) {
        if ((getCloseMethod = TimerGrpc.getCloseMethod) == null) {
          TimerGrpc.getCloseMethod = getCloseMethod =
              io.grpc.MethodDescriptor.<service.TimerRequest, service.TimerResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "close"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerResponse.getDefaultInstance()))
              .setSchemaDescriptor(new TimerMethodDescriptorSupplier("close"))
              .build();
        }
      }
    }
    return getCloseMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.TimerList> getListMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "list",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.TimerList.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.TimerList> getListMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.TimerList> getListMethod;
    if ((getListMethod = TimerGrpc.getListMethod) == null) {
      synchronized (TimerGrpc.class) {
        if ((getListMethod = TimerGrpc.getListMethod) == null) {
          TimerGrpc.getListMethod = getListMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.TimerList>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "list"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.TimerList.getDefaultInstance()))
              .setSchemaDescriptor(new TimerMethodDescriptorSupplier("list"))
              .build();
        }
      }
    }
    return getListMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static TimerStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimerStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimerStub>() {
        @java.lang.Override
        public TimerStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimerStub(channel, callOptions);
        }
      };
    return TimerStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static TimerBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimerBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimerBlockingStub>() {
        @java.lang.Override
        public TimerBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimerBlockingStub(channel, callOptions);
        }
      };
    return TimerBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static TimerFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<TimerFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<TimerFutureStub>() {
        @java.lang.Override
        public TimerFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new TimerFutureStub(channel, callOptions);
        }
      };
    return TimerFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class TimerImplBase implements io.grpc.BindableService {

    /**
     */
    public void start(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getStartMethod(), responseObserver);
    }

    /**
     */
    public void check(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCheckMethod(), responseObserver);
    }

    /**
     */
    public void close(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getCloseMethod(), responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.TimerList> responseObserver) {
      asyncUnimplementedUnaryCall(getListMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getStartMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.TimerRequest,
                service.TimerResponse>(
                  this, METHODID_START)))
          .addMethod(
            getCheckMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.TimerRequest,
                service.TimerResponse>(
                  this, METHODID_CHECK)))
          .addMethod(
            getCloseMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.TimerRequest,
                service.TimerResponse>(
                  this, METHODID_CLOSE)))
          .addMethod(
            getListMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.TimerList>(
                  this, METHODID_LIST)))
          .build();
    }
  }

  /**
   */
  public static final class TimerStub extends io.grpc.stub.AbstractAsyncStub<TimerStub> {
    private TimerStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimerStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimerStub(channel, callOptions);
    }

    /**
     */
    public void start(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void check(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void close(service.TimerRequest request,
        io.grpc.stub.StreamObserver<service.TimerResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void list(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.TimerList> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class TimerBlockingStub extends io.grpc.stub.AbstractBlockingStub<TimerBlockingStub> {
    private TimerBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimerBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimerBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.TimerResponse start(service.TimerRequest request) {
      return blockingUnaryCall(
          getChannel(), getStartMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.TimerResponse check(service.TimerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCheckMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.TimerResponse close(service.TimerRequest request) {
      return blockingUnaryCall(
          getChannel(), getCloseMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.TimerList list(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class TimerFutureStub extends io.grpc.stub.AbstractFutureStub<TimerFutureStub> {
    private TimerFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected TimerFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new TimerFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.TimerResponse> start(
        service.TimerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getStartMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.TimerResponse> check(
        service.TimerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCheckMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.TimerResponse> close(
        service.TimerRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getCloseMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.TimerList> list(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_START = 0;
  private static final int METHODID_CHECK = 1;
  private static final int METHODID_CLOSE = 2;
  private static final int METHODID_LIST = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final TimerImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(TimerImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_START:
          serviceImpl.start((service.TimerRequest) request,
              (io.grpc.stub.StreamObserver<service.TimerResponse>) responseObserver);
          break;
        case METHODID_CHECK:
          serviceImpl.check((service.TimerRequest) request,
              (io.grpc.stub.StreamObserver<service.TimerResponse>) responseObserver);
          break;
        case METHODID_CLOSE:
          serviceImpl.close((service.TimerRequest) request,
              (io.grpc.stub.StreamObserver<service.TimerResponse>) responseObserver);
          break;
        case METHODID_LIST:
          serviceImpl.list((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.TimerList>) responseObserver);
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

  private static abstract class TimerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    TimerBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.TimerProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Timer");
    }
  }

  private static final class TimerFileDescriptorSupplier
      extends TimerBaseDescriptorSupplier {
    TimerFileDescriptorSupplier() {}
  }

  private static final class TimerMethodDescriptorSupplier
      extends TimerBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    TimerMethodDescriptorSupplier(String methodName) {
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
      synchronized (TimerGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new TimerFileDescriptorSupplier())
              .addMethod(getStartMethod())
              .addMethod(getCheckMethod())
              .addMethod(getCloseMethod())
              .addMethod(getListMethod())
              .build();
        }
      }
    }
    return result;
  }
}
