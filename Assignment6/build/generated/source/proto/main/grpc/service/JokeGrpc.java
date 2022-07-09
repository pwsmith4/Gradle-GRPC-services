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
    comments = "Source: services/joke.proto")
public final class JokeGrpc {

  private JokeGrpc() {}

  public static final String SERVICE_NAME = "service.Joke";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.JokeReq,
      service.JokeRes> getGetJokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getJoke",
      requestType = service.JokeReq.class,
      responseType = service.JokeRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.JokeReq,
      service.JokeRes> getGetJokeMethod() {
    io.grpc.MethodDescriptor<service.JokeReq, service.JokeRes> getGetJokeMethod;
    if ((getGetJokeMethod = JokeGrpc.getGetJokeMethod) == null) {
      synchronized (JokeGrpc.class) {
        if ((getGetJokeMethod = JokeGrpc.getGetJokeMethod) == null) {
          JokeGrpc.getGetJokeMethod = getGetJokeMethod =
              io.grpc.MethodDescriptor.<service.JokeReq, service.JokeRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getJoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.JokeReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.JokeRes.getDefaultInstance()))
              .setSchemaDescriptor(new JokeMethodDescriptorSupplier("getJoke"))
              .build();
        }
      }
    }
    return getGetJokeMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.JokeSetReq,
      service.JokeSetRes> getSetJokeMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "setJoke",
      requestType = service.JokeSetReq.class,
      responseType = service.JokeSetRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.JokeSetReq,
      service.JokeSetRes> getSetJokeMethod() {
    io.grpc.MethodDescriptor<service.JokeSetReq, service.JokeSetRes> getSetJokeMethod;
    if ((getSetJokeMethod = JokeGrpc.getSetJokeMethod) == null) {
      synchronized (JokeGrpc.class) {
        if ((getSetJokeMethod = JokeGrpc.getSetJokeMethod) == null) {
          JokeGrpc.getSetJokeMethod = getSetJokeMethod =
              io.grpc.MethodDescriptor.<service.JokeSetReq, service.JokeSetRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "setJoke"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.JokeSetReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.JokeSetRes.getDefaultInstance()))
              .setSchemaDescriptor(new JokeMethodDescriptorSupplier("setJoke"))
              .build();
        }
      }
    }
    return getSetJokeMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static JokeStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JokeStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JokeStub>() {
        @java.lang.Override
        public JokeStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JokeStub(channel, callOptions);
        }
      };
    return JokeStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static JokeBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JokeBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JokeBlockingStub>() {
        @java.lang.Override
        public JokeBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JokeBlockingStub(channel, callOptions);
        }
      };
    return JokeBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static JokeFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<JokeFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<JokeFutureStub>() {
        @java.lang.Override
        public JokeFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new JokeFutureStub(channel, callOptions);
        }
      };
    return JokeFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class JokeImplBase implements io.grpc.BindableService {

    /**
     */
    public void getJoke(service.JokeReq request,
        io.grpc.stub.StreamObserver<service.JokeRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetJokeMethod(), responseObserver);
    }

    /**
     */
    public void setJoke(service.JokeSetReq request,
        io.grpc.stub.StreamObserver<service.JokeSetRes> responseObserver) {
      asyncUnimplementedUnaryCall(getSetJokeMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getGetJokeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.JokeReq,
                service.JokeRes>(
                  this, METHODID_GET_JOKE)))
          .addMethod(
            getSetJokeMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.JokeSetReq,
                service.JokeSetRes>(
                  this, METHODID_SET_JOKE)))
          .build();
    }
  }

  /**
   */
  public static final class JokeStub extends io.grpc.stub.AbstractAsyncStub<JokeStub> {
    private JokeStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JokeStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JokeStub(channel, callOptions);
    }

    /**
     */
    public void getJoke(service.JokeReq request,
        io.grpc.stub.StreamObserver<service.JokeRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetJokeMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void setJoke(service.JokeSetReq request,
        io.grpc.stub.StreamObserver<service.JokeSetRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSetJokeMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class JokeBlockingStub extends io.grpc.stub.AbstractBlockingStub<JokeBlockingStub> {
    private JokeBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JokeBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JokeBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.JokeRes getJoke(service.JokeReq request) {
      return blockingUnaryCall(
          getChannel(), getGetJokeMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.JokeSetRes setJoke(service.JokeSetReq request) {
      return blockingUnaryCall(
          getChannel(), getSetJokeMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class JokeFutureStub extends io.grpc.stub.AbstractFutureStub<JokeFutureStub> {
    private JokeFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected JokeFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new JokeFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.JokeRes> getJoke(
        service.JokeReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetJokeMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.JokeSetRes> setJoke(
        service.JokeSetReq request) {
      return futureUnaryCall(
          getChannel().newCall(getSetJokeMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_GET_JOKE = 0;
  private static final int METHODID_SET_JOKE = 1;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final JokeImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(JokeImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_GET_JOKE:
          serviceImpl.getJoke((service.JokeReq) request,
              (io.grpc.stub.StreamObserver<service.JokeRes>) responseObserver);
          break;
        case METHODID_SET_JOKE:
          serviceImpl.setJoke((service.JokeSetReq) request,
              (io.grpc.stub.StreamObserver<service.JokeSetRes>) responseObserver);
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

  private static abstract class JokeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    JokeBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.JokeProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Joke");
    }
  }

  private static final class JokeFileDescriptorSupplier
      extends JokeBaseDescriptorSupplier {
    JokeFileDescriptorSupplier() {}
  }

  private static final class JokeMethodDescriptorSupplier
      extends JokeBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    JokeMethodDescriptorSupplier(String methodName) {
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
      synchronized (JokeGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new JokeFileDescriptorSupplier())
              .addMethod(getGetJokeMethod())
              .addMethod(getSetJokeMethod())
              .build();
        }
      }
    }
    return result;
  }
}
