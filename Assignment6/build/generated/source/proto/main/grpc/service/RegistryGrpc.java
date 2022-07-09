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
    comments = "Source: services/registry.proto")
public final class RegistryGrpc {

  private RegistryGrpc() {}

  public static final String SERVICE_NAME = "services.Registry";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.RegisterReq,
      service.ServicesListRes> getRegisterMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "register",
      requestType = service.RegisterReq.class,
      responseType = service.ServicesListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.RegisterReq,
      service.ServicesListRes> getRegisterMethod() {
    io.grpc.MethodDescriptor<service.RegisterReq, service.ServicesListRes> getRegisterMethod;
    if ((getRegisterMethod = RegistryGrpc.getRegisterMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getRegisterMethod = RegistryGrpc.getRegisterMethod) == null) {
          RegistryGrpc.getRegisterMethod = getRegisterMethod =
              io.grpc.MethodDescriptor.<service.RegisterReq, service.ServicesListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "register"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.RegisterReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ServicesListRes.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("register"))
              .build();
        }
      }
    }
    return getRegisterMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.GetServicesReq,
      service.ServicesListRes> getGetServicesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "getServices",
      requestType = service.GetServicesReq.class,
      responseType = service.ServicesListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.GetServicesReq,
      service.ServicesListRes> getGetServicesMethod() {
    io.grpc.MethodDescriptor<service.GetServicesReq, service.ServicesListRes> getGetServicesMethod;
    if ((getGetServicesMethod = RegistryGrpc.getGetServicesMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getGetServicesMethod = RegistryGrpc.getGetServicesMethod) == null) {
          RegistryGrpc.getGetServicesMethod = getGetServicesMethod =
              io.grpc.MethodDescriptor.<service.GetServicesReq, service.ServicesListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "getServices"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.GetServicesReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ServicesListRes.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("getServices"))
              .build();
        }
      }
    }
    return getGetServicesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.FindServerReq,
      service.SingleServerRes> getFindServerMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findServer",
      requestType = service.FindServerReq.class,
      responseType = service.SingleServerRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.FindServerReq,
      service.SingleServerRes> getFindServerMethod() {
    io.grpc.MethodDescriptor<service.FindServerReq, service.SingleServerRes> getFindServerMethod;
    if ((getFindServerMethod = RegistryGrpc.getFindServerMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getFindServerMethod = RegistryGrpc.getFindServerMethod) == null) {
          RegistryGrpc.getFindServerMethod = getFindServerMethod =
              io.grpc.MethodDescriptor.<service.FindServerReq, service.SingleServerRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findServer"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.FindServerReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.SingleServerRes.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("findServer"))
              .build();
        }
      }
    }
    return getFindServerMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.FindServersReq,
      service.ServerListRes> getFindServersMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "findServers",
      requestType = service.FindServersReq.class,
      responseType = service.ServerListRes.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.FindServersReq,
      service.ServerListRes> getFindServersMethod() {
    io.grpc.MethodDescriptor<service.FindServersReq, service.ServerListRes> getFindServersMethod;
    if ((getFindServersMethod = RegistryGrpc.getFindServersMethod) == null) {
      synchronized (RegistryGrpc.class) {
        if ((getFindServersMethod = RegistryGrpc.getFindServersMethod) == null) {
          RegistryGrpc.getFindServersMethod = getFindServersMethod =
              io.grpc.MethodDescriptor.<service.FindServersReq, service.ServerListRes>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "findServers"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.FindServersReq.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.ServerListRes.getDefaultInstance()))
              .setSchemaDescriptor(new RegistryMethodDescriptorSupplier("findServers"))
              .build();
        }
      }
    }
    return getFindServersMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static RegistryStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryStub>() {
        @java.lang.Override
        public RegistryStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryStub(channel, callOptions);
        }
      };
    return RegistryStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static RegistryBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryBlockingStub>() {
        @java.lang.Override
        public RegistryBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryBlockingStub(channel, callOptions);
        }
      };
    return RegistryBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static RegistryFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<RegistryFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<RegistryFutureStub>() {
        @java.lang.Override
        public RegistryFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new RegistryFutureStub(channel, callOptions);
        }
      };
    return RegistryFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class RegistryImplBase implements io.grpc.BindableService {

    /**
     */
    public void register(service.RegisterReq request,
        io.grpc.stub.StreamObserver<service.ServicesListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getRegisterMethod(), responseObserver);
    }

    /**
     */
    public void getServices(service.GetServicesReq request,
        io.grpc.stub.StreamObserver<service.ServicesListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getGetServicesMethod(), responseObserver);
    }

    /**
     */
    public void findServer(service.FindServerReq request,
        io.grpc.stub.StreamObserver<service.SingleServerRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindServerMethod(), responseObserver);
    }

    /**
     */
    public void findServers(service.FindServersReq request,
        io.grpc.stub.StreamObserver<service.ServerListRes> responseObserver) {
      asyncUnimplementedUnaryCall(getFindServersMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getRegisterMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.RegisterReq,
                service.ServicesListRes>(
                  this, METHODID_REGISTER)))
          .addMethod(
            getGetServicesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.GetServicesReq,
                service.ServicesListRes>(
                  this, METHODID_GET_SERVICES)))
          .addMethod(
            getFindServerMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.FindServerReq,
                service.SingleServerRes>(
                  this, METHODID_FIND_SERVER)))
          .addMethod(
            getFindServersMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.FindServersReq,
                service.ServerListRes>(
                  this, METHODID_FIND_SERVERS)))
          .build();
    }
  }

  /**
   */
  public static final class RegistryStub extends io.grpc.stub.AbstractAsyncStub<RegistryStub> {
    private RegistryStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryStub(channel, callOptions);
    }

    /**
     */
    public void register(service.RegisterReq request,
        io.grpc.stub.StreamObserver<service.ServicesListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void getServices(service.GetServicesReq request,
        io.grpc.stub.StreamObserver<service.ServicesListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getGetServicesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findServer(service.FindServerReq request,
        io.grpc.stub.StreamObserver<service.SingleServerRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindServerMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void findServers(service.FindServersReq request,
        io.grpc.stub.StreamObserver<service.ServerListRes> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getFindServersMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class RegistryBlockingStub extends io.grpc.stub.AbstractBlockingStub<RegistryBlockingStub> {
    private RegistryBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.ServicesListRes register(service.RegisterReq request) {
      return blockingUnaryCall(
          getChannel(), getRegisterMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.ServicesListRes getServices(service.GetServicesReq request) {
      return blockingUnaryCall(
          getChannel(), getGetServicesMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.SingleServerRes findServer(service.FindServerReq request) {
      return blockingUnaryCall(
          getChannel(), getFindServerMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.ServerListRes findServers(service.FindServersReq request) {
      return blockingUnaryCall(
          getChannel(), getFindServersMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class RegistryFutureStub extends io.grpc.stub.AbstractFutureStub<RegistryFutureStub> {
    private RegistryFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected RegistryFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new RegistryFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.ServicesListRes> register(
        service.RegisterReq request) {
      return futureUnaryCall(
          getChannel().newCall(getRegisterMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.ServicesListRes> getServices(
        service.GetServicesReq request) {
      return futureUnaryCall(
          getChannel().newCall(getGetServicesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.SingleServerRes> findServer(
        service.FindServerReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindServerMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.ServerListRes> findServers(
        service.FindServersReq request) {
      return futureUnaryCall(
          getChannel().newCall(getFindServersMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_REGISTER = 0;
  private static final int METHODID_GET_SERVICES = 1;
  private static final int METHODID_FIND_SERVER = 2;
  private static final int METHODID_FIND_SERVERS = 3;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final RegistryImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(RegistryImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_REGISTER:
          serviceImpl.register((service.RegisterReq) request,
              (io.grpc.stub.StreamObserver<service.ServicesListRes>) responseObserver);
          break;
        case METHODID_GET_SERVICES:
          serviceImpl.getServices((service.GetServicesReq) request,
              (io.grpc.stub.StreamObserver<service.ServicesListRes>) responseObserver);
          break;
        case METHODID_FIND_SERVER:
          serviceImpl.findServer((service.FindServerReq) request,
              (io.grpc.stub.StreamObserver<service.SingleServerRes>) responseObserver);
          break;
        case METHODID_FIND_SERVERS:
          serviceImpl.findServers((service.FindServersReq) request,
              (io.grpc.stub.StreamObserver<service.ServerListRes>) responseObserver);
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

  private static abstract class RegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    RegistryBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.RegistryProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Registry");
    }
  }

  private static final class RegistryFileDescriptorSupplier
      extends RegistryBaseDescriptorSupplier {
    RegistryFileDescriptorSupplier() {}
  }

  private static final class RegistryMethodDescriptorSupplier
      extends RegistryBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    RegistryMethodDescriptorSupplier(String methodName) {
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
      synchronized (RegistryGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new RegistryFileDescriptorSupplier())
              .addMethod(getRegisterMethod())
              .addMethod(getGetServicesMethod())
              .addMethod(getFindServerMethod())
              .addMethod(getFindServersMethod())
              .build();
        }
      }
    }
    return result;
  }
}
