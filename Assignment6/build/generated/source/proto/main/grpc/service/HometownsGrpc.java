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
    comments = "Source: services/hometowns.proto")
public final class HometownsGrpc {

  private HometownsGrpc() {}

  public static final String SERVICE_NAME = "services.Hometowns";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.HometownsReadResponse> getReadMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "read",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.HometownsReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.HometownsReadResponse> getReadMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.HometownsReadResponse> getReadMethod;
    if ((getReadMethod = HometownsGrpc.getReadMethod) == null) {
      synchronized (HometownsGrpc.class) {
        if ((getReadMethod = HometownsGrpc.getReadMethod) == null) {
          HometownsGrpc.getReadMethod = getReadMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.HometownsReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "read"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HometownsReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HometownsMethodDescriptorSupplier("read"))
              .build();
        }
      }
    }
    return getReadMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.HometownsSearchRequest,
      service.HometownsReadResponse> getSearchMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "search",
      requestType = service.HometownsSearchRequest.class,
      responseType = service.HometownsReadResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.HometownsSearchRequest,
      service.HometownsReadResponse> getSearchMethod() {
    io.grpc.MethodDescriptor<service.HometownsSearchRequest, service.HometownsReadResponse> getSearchMethod;
    if ((getSearchMethod = HometownsGrpc.getSearchMethod) == null) {
      synchronized (HometownsGrpc.class) {
        if ((getSearchMethod = HometownsGrpc.getSearchMethod) == null) {
          HometownsGrpc.getSearchMethod = getSearchMethod =
              io.grpc.MethodDescriptor.<service.HometownsSearchRequest, service.HometownsReadResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "search"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HometownsSearchRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HometownsReadResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HometownsMethodDescriptorSupplier("search"))
              .build();
        }
      }
    }
    return getSearchMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.HometownsWriteRequest,
      service.HometownsWriteResponse> getWriteMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "write",
      requestType = service.HometownsWriteRequest.class,
      responseType = service.HometownsWriteResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.HometownsWriteRequest,
      service.HometownsWriteResponse> getWriteMethod() {
    io.grpc.MethodDescriptor<service.HometownsWriteRequest, service.HometownsWriteResponse> getWriteMethod;
    if ((getWriteMethod = HometownsGrpc.getWriteMethod) == null) {
      synchronized (HometownsGrpc.class) {
        if ((getWriteMethod = HometownsGrpc.getWriteMethod) == null) {
          HometownsGrpc.getWriteMethod = getWriteMethod =
              io.grpc.MethodDescriptor.<service.HometownsWriteRequest, service.HometownsWriteResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "write"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HometownsWriteRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.HometownsWriteResponse.getDefaultInstance()))
              .setSchemaDescriptor(new HometownsMethodDescriptorSupplier("write"))
              .build();
        }
      }
    }
    return getWriteMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static HometownsStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HometownsStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HometownsStub>() {
        @java.lang.Override
        public HometownsStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HometownsStub(channel, callOptions);
        }
      };
    return HometownsStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static HometownsBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HometownsBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HometownsBlockingStub>() {
        @java.lang.Override
        public HometownsBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HometownsBlockingStub(channel, callOptions);
        }
      };
    return HometownsBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static HometownsFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<HometownsFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<HometownsFutureStub>() {
        @java.lang.Override
        public HometownsFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new HometownsFutureStub(channel, callOptions);
        }
      };
    return HometownsFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class HometownsImplBase implements io.grpc.BindableService {

    /**
     */
    public void read(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.HometownsReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getReadMethod(), responseObserver);
    }

    /**
     */
    public void search(service.HometownsSearchRequest request,
        io.grpc.stub.StreamObserver<service.HometownsReadResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getSearchMethod(), responseObserver);
    }

    /**
     */
    public void write(service.HometownsWriteRequest request,
        io.grpc.stub.StreamObserver<service.HometownsWriteResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getWriteMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getReadMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.HometownsReadResponse>(
                  this, METHODID_READ)))
          .addMethod(
            getSearchMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.HometownsSearchRequest,
                service.HometownsReadResponse>(
                  this, METHODID_SEARCH)))
          .addMethod(
            getWriteMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.HometownsWriteRequest,
                service.HometownsWriteResponse>(
                  this, METHODID_WRITE)))
          .build();
    }
  }

  /**
   */
  public static final class HometownsStub extends io.grpc.stub.AbstractAsyncStub<HometownsStub> {
    private HometownsStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HometownsStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HometownsStub(channel, callOptions);
    }

    /**
     */
    public void read(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.HometownsReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void search(service.HometownsSearchRequest request,
        io.grpc.stub.StreamObserver<service.HometownsReadResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void write(service.HometownsWriteRequest request,
        io.grpc.stub.StreamObserver<service.HometownsWriteResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class HometownsBlockingStub extends io.grpc.stub.AbstractBlockingStub<HometownsBlockingStub> {
    private HometownsBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HometownsBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HometownsBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.HometownsReadResponse read(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getReadMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.HometownsReadResponse search(service.HometownsSearchRequest request) {
      return blockingUnaryCall(
          getChannel(), getSearchMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.HometownsWriteResponse write(service.HometownsWriteRequest request) {
      return blockingUnaryCall(
          getChannel(), getWriteMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class HometownsFutureStub extends io.grpc.stub.AbstractFutureStub<HometownsFutureStub> {
    private HometownsFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected HometownsFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new HometownsFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.HometownsReadResponse> read(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getReadMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.HometownsReadResponse> search(
        service.HometownsSearchRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getSearchMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.HometownsWriteResponse> write(
        service.HometownsWriteRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getWriteMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_READ = 0;
  private static final int METHODID_SEARCH = 1;
  private static final int METHODID_WRITE = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final HometownsImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(HometownsImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_READ:
          serviceImpl.read((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.HometownsReadResponse>) responseObserver);
          break;
        case METHODID_SEARCH:
          serviceImpl.search((service.HometownsSearchRequest) request,
              (io.grpc.stub.StreamObserver<service.HometownsReadResponse>) responseObserver);
          break;
        case METHODID_WRITE:
          serviceImpl.write((service.HometownsWriteRequest) request,
              (io.grpc.stub.StreamObserver<service.HometownsWriteResponse>) responseObserver);
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

  private static abstract class HometownsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    HometownsBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.HometownsProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Hometowns");
    }
  }

  private static final class HometownsFileDescriptorSupplier
      extends HometownsBaseDescriptorSupplier {
    HometownsFileDescriptorSupplier() {}
  }

  private static final class HometownsMethodDescriptorSupplier
      extends HometownsBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    HometownsMethodDescriptorSupplier(String methodName) {
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
      synchronized (HometownsGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new HometownsFileDescriptorSupplier())
              .addMethod(getReadMethod())
              .addMethod(getSearchMethod())
              .addMethod(getWriteMethod())
              .build();
        }
      }
    }
    return result;
  }
}
