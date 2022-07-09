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
    comments = "Source: services/weather.proto")
public final class WeatherGrpc {

  private WeatherGrpc() {}

  public static final String SERVICE_NAME = "services.Weather";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<service.WeatherCoordinateRequest,
      service.WeatherResponse> getAtCoordinatesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "atCoordinates",
      requestType = service.WeatherCoordinateRequest.class,
      responseType = service.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.WeatherCoordinateRequest,
      service.WeatherResponse> getAtCoordinatesMethod() {
    io.grpc.MethodDescriptor<service.WeatherCoordinateRequest, service.WeatherResponse> getAtCoordinatesMethod;
    if ((getAtCoordinatesMethod = WeatherGrpc.getAtCoordinatesMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getAtCoordinatesMethod = WeatherGrpc.getAtCoordinatesMethod) == null) {
          WeatherGrpc.getAtCoordinatesMethod = getAtCoordinatesMethod =
              io.grpc.MethodDescriptor.<service.WeatherCoordinateRequest, service.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "atCoordinates"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.WeatherCoordinateRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("atCoordinates"))
              .build();
        }
      }
    }
    return getAtCoordinatesMethod;
  }

  private static volatile io.grpc.MethodDescriptor<service.WeatherCityRequest,
      service.WeatherResponse> getInCityMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "inCity",
      requestType = service.WeatherCityRequest.class,
      responseType = service.WeatherResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<service.WeatherCityRequest,
      service.WeatherResponse> getInCityMethod() {
    io.grpc.MethodDescriptor<service.WeatherCityRequest, service.WeatherResponse> getInCityMethod;
    if ((getInCityMethod = WeatherGrpc.getInCityMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getInCityMethod = WeatherGrpc.getInCityMethod) == null) {
          WeatherGrpc.getInCityMethod = getInCityMethod =
              io.grpc.MethodDescriptor.<service.WeatherCityRequest, service.WeatherResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "inCity"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.WeatherCityRequest.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.WeatherResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("inCity"))
              .build();
        }
      }
    }
    return getInCityMethod;
  }

  private static volatile io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.CitiesResponse> getListCitiesMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "listCities",
      requestType = com.google.protobuf.Empty.class,
      responseType = service.CitiesResponse.class,
      methodType = io.grpc.MethodDescriptor.MethodType.UNARY)
  public static io.grpc.MethodDescriptor<com.google.protobuf.Empty,
      service.CitiesResponse> getListCitiesMethod() {
    io.grpc.MethodDescriptor<com.google.protobuf.Empty, service.CitiesResponse> getListCitiesMethod;
    if ((getListCitiesMethod = WeatherGrpc.getListCitiesMethod) == null) {
      synchronized (WeatherGrpc.class) {
        if ((getListCitiesMethod = WeatherGrpc.getListCitiesMethod) == null) {
          WeatherGrpc.getListCitiesMethod = getListCitiesMethod =
              io.grpc.MethodDescriptor.<com.google.protobuf.Empty, service.CitiesResponse>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.UNARY)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "listCities"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  com.google.protobuf.Empty.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  service.CitiesResponse.getDefaultInstance()))
              .setSchemaDescriptor(new WeatherMethodDescriptorSupplier("listCities"))
              .build();
        }
      }
    }
    return getListCitiesMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static WeatherStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherStub>() {
        @java.lang.Override
        public WeatherStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherStub(channel, callOptions);
        }
      };
    return WeatherStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static WeatherBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherBlockingStub>() {
        @java.lang.Override
        public WeatherBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherBlockingStub(channel, callOptions);
        }
      };
    return WeatherBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static WeatherFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<WeatherFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<WeatherFutureStub>() {
        @java.lang.Override
        public WeatherFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new WeatherFutureStub(channel, callOptions);
        }
      };
    return WeatherFutureStub.newStub(factory, channel);
  }

  /**
   */
  public static abstract class WeatherImplBase implements io.grpc.BindableService {

    /**
     */
    public void atCoordinates(service.WeatherCoordinateRequest request,
        io.grpc.stub.StreamObserver<service.WeatherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getAtCoordinatesMethod(), responseObserver);
    }

    /**
     */
    public void inCity(service.WeatherCityRequest request,
        io.grpc.stub.StreamObserver<service.WeatherResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getInCityMethod(), responseObserver);
    }

    /**
     */
    public void listCities(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.CitiesResponse> responseObserver) {
      asyncUnimplementedUnaryCall(getListCitiesMethod(), responseObserver);
    }

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
          .addMethod(
            getAtCoordinatesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.WeatherCoordinateRequest,
                service.WeatherResponse>(
                  this, METHODID_AT_COORDINATES)))
          .addMethod(
            getInCityMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                service.WeatherCityRequest,
                service.WeatherResponse>(
                  this, METHODID_IN_CITY)))
          .addMethod(
            getListCitiesMethod(),
            asyncUnaryCall(
              new MethodHandlers<
                com.google.protobuf.Empty,
                service.CitiesResponse>(
                  this, METHODID_LIST_CITIES)))
          .build();
    }
  }

  /**
   */
  public static final class WeatherStub extends io.grpc.stub.AbstractAsyncStub<WeatherStub> {
    private WeatherStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherStub(channel, callOptions);
    }

    /**
     */
    public void atCoordinates(service.WeatherCoordinateRequest request,
        io.grpc.stub.StreamObserver<service.WeatherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getAtCoordinatesMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void inCity(service.WeatherCityRequest request,
        io.grpc.stub.StreamObserver<service.WeatherResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getInCityMethod(), getCallOptions()), request, responseObserver);
    }

    /**
     */
    public void listCities(com.google.protobuf.Empty request,
        io.grpc.stub.StreamObserver<service.CitiesResponse> responseObserver) {
      asyncUnaryCall(
          getChannel().newCall(getListCitiesMethod(), getCallOptions()), request, responseObserver);
    }
  }

  /**
   */
  public static final class WeatherBlockingStub extends io.grpc.stub.AbstractBlockingStub<WeatherBlockingStub> {
    private WeatherBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherBlockingStub(channel, callOptions);
    }

    /**
     */
    public service.WeatherResponse atCoordinates(service.WeatherCoordinateRequest request) {
      return blockingUnaryCall(
          getChannel(), getAtCoordinatesMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.WeatherResponse inCity(service.WeatherCityRequest request) {
      return blockingUnaryCall(
          getChannel(), getInCityMethod(), getCallOptions(), request);
    }

    /**
     */
    public service.CitiesResponse listCities(com.google.protobuf.Empty request) {
      return blockingUnaryCall(
          getChannel(), getListCitiesMethod(), getCallOptions(), request);
    }
  }

  /**
   */
  public static final class WeatherFutureStub extends io.grpc.stub.AbstractFutureStub<WeatherFutureStub> {
    private WeatherFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected WeatherFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new WeatherFutureStub(channel, callOptions);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.WeatherResponse> atCoordinates(
        service.WeatherCoordinateRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getAtCoordinatesMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.WeatherResponse> inCity(
        service.WeatherCityRequest request) {
      return futureUnaryCall(
          getChannel().newCall(getInCityMethod(), getCallOptions()), request);
    }

    /**
     */
    public com.google.common.util.concurrent.ListenableFuture<service.CitiesResponse> listCities(
        com.google.protobuf.Empty request) {
      return futureUnaryCall(
          getChannel().newCall(getListCitiesMethod(), getCallOptions()), request);
    }
  }

  private static final int METHODID_AT_COORDINATES = 0;
  private static final int METHODID_IN_CITY = 1;
  private static final int METHODID_LIST_CITIES = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final WeatherImplBase serviceImpl;
    private final int methodId;

    MethodHandlers(WeatherImplBase serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_AT_COORDINATES:
          serviceImpl.atCoordinates((service.WeatherCoordinateRequest) request,
              (io.grpc.stub.StreamObserver<service.WeatherResponse>) responseObserver);
          break;
        case METHODID_IN_CITY:
          serviceImpl.inCity((service.WeatherCityRequest) request,
              (io.grpc.stub.StreamObserver<service.WeatherResponse>) responseObserver);
          break;
        case METHODID_LIST_CITIES:
          serviceImpl.listCities((com.google.protobuf.Empty) request,
              (io.grpc.stub.StreamObserver<service.CitiesResponse>) responseObserver);
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

  private static abstract class WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    WeatherBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return service.WeatherProto.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("Weather");
    }
  }

  private static final class WeatherFileDescriptorSupplier
      extends WeatherBaseDescriptorSupplier {
    WeatherFileDescriptorSupplier() {}
  }

  private static final class WeatherMethodDescriptorSupplier
      extends WeatherBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    WeatherMethodDescriptorSupplier(String methodName) {
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
      synchronized (WeatherGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new WeatherFileDescriptorSupplier())
              .addMethod(getAtCoordinatesMethod())
              .addMethod(getInCityMethod())
              .addMethod(getListCitiesMethod())
              .build();
        }
      }
    }
    return result;
  }
}
