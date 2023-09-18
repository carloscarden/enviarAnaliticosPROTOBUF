package data_analytics;

import static io.grpc.MethodDescriptor.generateFullMethodName;

/**
 */
@javax.annotation.Generated(
    value = "by gRPC proto compiler (version 1.56.0)",
    comments = "Source: coursework-certificate.proto")
@io.grpc.stub.annotations.GrpcGenerated
public final class serviciosGrpc {

  private serviciosGrpc() {}

  public static final String SERVICE_NAME = "data_analytics.servicios";

  // Static method descriptors that strictly reflect the proto.
  private static volatile io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.consulta,
      data_analytics.CourseworkCertificate.consulta_respuesta> getConsultaAnaliticoStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "consulta_analitico_stream",
      requestType = data_analytics.CourseworkCertificate.consulta.class,
      responseType = data_analytics.CourseworkCertificate.consulta_respuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.consulta,
      data_analytics.CourseworkCertificate.consulta_respuesta> getConsultaAnaliticoStreamMethod() {
    io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.consulta, data_analytics.CourseworkCertificate.consulta_respuesta> getConsultaAnaliticoStreamMethod;
    if ((getConsultaAnaliticoStreamMethod = serviciosGrpc.getConsultaAnaliticoStreamMethod) == null) {
      synchronized (serviciosGrpc.class) {
        if ((getConsultaAnaliticoStreamMethod = serviciosGrpc.getConsultaAnaliticoStreamMethod) == null) {
          serviciosGrpc.getConsultaAnaliticoStreamMethod = getConsultaAnaliticoStreamMethod =
              io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.consulta, data_analytics.CourseworkCertificate.consulta_respuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "consulta_analitico_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.consulta.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.consulta_respuesta.getDefaultInstance()))
              .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("consulta_analitico_stream"))
              .build();
        }
      }
    }
    return getConsultaAnaliticoStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.analitico_con_firma,
      data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoConFirmaStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enviar_analitico_con_firma_stream",
      requestType = data_analytics.CourseworkCertificate.analitico_con_firma.class,
      responseType = data_analytics.CourseworkCertificate.analitico_respuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.analitico_con_firma,
      data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoConFirmaStreamMethod() {
    io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.analitico_con_firma, data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoConFirmaStreamMethod;
    if ((getEnviarAnaliticoConFirmaStreamMethod = serviciosGrpc.getEnviarAnaliticoConFirmaStreamMethod) == null) {
      synchronized (serviciosGrpc.class) {
        if ((getEnviarAnaliticoConFirmaStreamMethod = serviciosGrpc.getEnviarAnaliticoConFirmaStreamMethod) == null) {
          serviciosGrpc.getEnviarAnaliticoConFirmaStreamMethod = getEnviarAnaliticoConFirmaStreamMethod =
              io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.analitico_con_firma, data_analytics.CourseworkCertificate.analitico_respuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enviar_analitico_con_firma_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.analitico_con_firma.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.analitico_respuesta.getDefaultInstance()))
              .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("enviar_analitico_con_firma_stream"))
              .build();
        }
      }
    }
    return getEnviarAnaliticoConFirmaStreamMethod;
  }

  private static volatile io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.contenido_analitico,
      data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoSinFirmaStreamMethod;

  @io.grpc.stub.annotations.RpcMethod(
      fullMethodName = SERVICE_NAME + '/' + "enviar_analitico_sin_firma_stream",
      requestType = data_analytics.CourseworkCertificate.contenido_analitico.class,
      responseType = data_analytics.CourseworkCertificate.analitico_respuesta.class,
      methodType = io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
  public static io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.contenido_analitico,
      data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoSinFirmaStreamMethod() {
    io.grpc.MethodDescriptor<data_analytics.CourseworkCertificate.contenido_analitico, data_analytics.CourseworkCertificate.analitico_respuesta> getEnviarAnaliticoSinFirmaStreamMethod;
    if ((getEnviarAnaliticoSinFirmaStreamMethod = serviciosGrpc.getEnviarAnaliticoSinFirmaStreamMethod) == null) {
      synchronized (serviciosGrpc.class) {
        if ((getEnviarAnaliticoSinFirmaStreamMethod = serviciosGrpc.getEnviarAnaliticoSinFirmaStreamMethod) == null) {
          serviciosGrpc.getEnviarAnaliticoSinFirmaStreamMethod = getEnviarAnaliticoSinFirmaStreamMethod =
              io.grpc.MethodDescriptor.<data_analytics.CourseworkCertificate.contenido_analitico, data_analytics.CourseworkCertificate.analitico_respuesta>newBuilder()
              .setType(io.grpc.MethodDescriptor.MethodType.BIDI_STREAMING)
              .setFullMethodName(generateFullMethodName(SERVICE_NAME, "enviar_analitico_sin_firma_stream"))
              .setSampledToLocalTracing(true)
              .setRequestMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.contenido_analitico.getDefaultInstance()))
              .setResponseMarshaller(io.grpc.protobuf.ProtoUtils.marshaller(
                  data_analytics.CourseworkCertificate.analitico_respuesta.getDefaultInstance()))
              .setSchemaDescriptor(new serviciosMethodDescriptorSupplier("enviar_analitico_sin_firma_stream"))
              .build();
        }
      }
    }
    return getEnviarAnaliticoSinFirmaStreamMethod;
  }

  /**
   * Creates a new async stub that supports all call types for the service
   */
  public static serviciosStub newStub(io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serviciosStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serviciosStub>() {
        @java.lang.Override
        public serviciosStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serviciosStub(channel, callOptions);
        }
      };
    return serviciosStub.newStub(factory, channel);
  }

  /**
   * Creates a new blocking-style stub that supports unary and streaming output calls on the service
   */
  public static serviciosBlockingStub newBlockingStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serviciosBlockingStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serviciosBlockingStub>() {
        @java.lang.Override
        public serviciosBlockingStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serviciosBlockingStub(channel, callOptions);
        }
      };
    return serviciosBlockingStub.newStub(factory, channel);
  }

  /**
   * Creates a new ListenableFuture-style stub that supports unary calls on the service
   */
  public static serviciosFutureStub newFutureStub(
      io.grpc.Channel channel) {
    io.grpc.stub.AbstractStub.StubFactory<serviciosFutureStub> factory =
      new io.grpc.stub.AbstractStub.StubFactory<serviciosFutureStub>() {
        @java.lang.Override
        public serviciosFutureStub newStub(io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
          return new serviciosFutureStub(channel, callOptions);
        }
      };
    return serviciosFutureStub.newStub(factory, channel);
  }

  /**
   */
  public interface AsyncService {

    /**
     */
    default io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta> consultaAnaliticoStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getConsultaAnaliticoStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_con_firma> enviarAnaliticoConFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEnviarAnaliticoConFirmaStreamMethod(), responseObserver);
    }

    /**
     */
    default io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.contenido_analitico> enviarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return io.grpc.stub.ServerCalls.asyncUnimplementedStreamingCall(getEnviarAnaliticoSinFirmaStreamMethod(), responseObserver);
    }
  }

  /**
   * Base class for the server implementation of the service servicios.
   */
  public static abstract class serviciosImplBase
      implements io.grpc.BindableService, AsyncService {

    @java.lang.Override public final io.grpc.ServerServiceDefinition bindService() {
      return serviciosGrpc.bindService(this);
    }
  }

  /**
   * A stub to allow clients to do asynchronous rpc calls to service servicios.
   */
  public static final class serviciosStub
      extends io.grpc.stub.AbstractAsyncStub<serviciosStub> {
    private serviciosStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serviciosStub(channel, callOptions);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta> consultaAnaliticoStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getConsultaAnaliticoStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_con_firma> enviarAnaliticoConFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEnviarAnaliticoConFirmaStreamMethod(), getCallOptions()), responseObserver);
    }

    /**
     */
    public io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.contenido_analitico> enviarAnaliticoSinFirmaStream(
        io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta> responseObserver) {
      return io.grpc.stub.ClientCalls.asyncBidiStreamingCall(
          getChannel().newCall(getEnviarAnaliticoSinFirmaStreamMethod(), getCallOptions()), responseObserver);
    }
  }

  /**
   * A stub to allow clients to do synchronous rpc calls to service servicios.
   */
  public static final class serviciosBlockingStub
      extends io.grpc.stub.AbstractBlockingStub<serviciosBlockingStub> {
    private serviciosBlockingStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosBlockingStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serviciosBlockingStub(channel, callOptions);
    }
  }

  /**
   * A stub to allow clients to do ListenableFuture-style rpc calls to service servicios.
   */
  public static final class serviciosFutureStub
      extends io.grpc.stub.AbstractFutureStub<serviciosFutureStub> {
    private serviciosFutureStub(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      super(channel, callOptions);
    }

    @java.lang.Override
    protected serviciosFutureStub build(
        io.grpc.Channel channel, io.grpc.CallOptions callOptions) {
      return new serviciosFutureStub(channel, callOptions);
    }
  }

  private static final int METHODID_CONSULTA_ANALITICO_STREAM = 0;
  private static final int METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM = 1;
  private static final int METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM = 2;

  private static final class MethodHandlers<Req, Resp> implements
      io.grpc.stub.ServerCalls.UnaryMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ServerStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.ClientStreamingMethod<Req, Resp>,
      io.grpc.stub.ServerCalls.BidiStreamingMethod<Req, Resp> {
    private final AsyncService serviceImpl;
    private final int methodId;

    MethodHandlers(AsyncService serviceImpl, int methodId) {
      this.serviceImpl = serviceImpl;
      this.methodId = methodId;
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public void invoke(Req request, io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        default:
          throw new AssertionError();
      }
    }

    @java.lang.Override
    @java.lang.SuppressWarnings("unchecked")
    public io.grpc.stub.StreamObserver<Req> invoke(
        io.grpc.stub.StreamObserver<Resp> responseObserver) {
      switch (methodId) {
        case METHODID_CONSULTA_ANALITICO_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.consultaAnaliticoStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.consulta_respuesta>) responseObserver);
        case METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarAnaliticoConFirmaStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta>) responseObserver);
        case METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM:
          return (io.grpc.stub.StreamObserver<Req>) serviceImpl.enviarAnaliticoSinFirmaStream(
              (io.grpc.stub.StreamObserver<data_analytics.CourseworkCertificate.analitico_respuesta>) responseObserver);
        default:
          throw new AssertionError();
      }
    }
  }

  public static final io.grpc.ServerServiceDefinition bindService(AsyncService service) {
    return io.grpc.ServerServiceDefinition.builder(getServiceDescriptor())
        .addMethod(
          getConsultaAnaliticoStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              data_analytics.CourseworkCertificate.consulta,
              data_analytics.CourseworkCertificate.consulta_respuesta>(
                service, METHODID_CONSULTA_ANALITICO_STREAM)))
        .addMethod(
          getEnviarAnaliticoConFirmaStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              data_analytics.CourseworkCertificate.analitico_con_firma,
              data_analytics.CourseworkCertificate.analitico_respuesta>(
                service, METHODID_ENVIAR_ANALITICO_CON_FIRMA_STREAM)))
        .addMethod(
          getEnviarAnaliticoSinFirmaStreamMethod(),
          io.grpc.stub.ServerCalls.asyncBidiStreamingCall(
            new MethodHandlers<
              data_analytics.CourseworkCertificate.contenido_analitico,
              data_analytics.CourseworkCertificate.analitico_respuesta>(
                service, METHODID_ENVIAR_ANALITICO_SIN_FIRMA_STREAM)))
        .build();
  }

  private static abstract class serviciosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoFileDescriptorSupplier, io.grpc.protobuf.ProtoServiceDescriptorSupplier {
    serviciosBaseDescriptorSupplier() {}

    @java.lang.Override
    public com.google.protobuf.Descriptors.FileDescriptor getFileDescriptor() {
      return data_analytics.CourseworkCertificate.getDescriptor();
    }

    @java.lang.Override
    public com.google.protobuf.Descriptors.ServiceDescriptor getServiceDescriptor() {
      return getFileDescriptor().findServiceByName("servicios");
    }
  }

  private static final class serviciosFileDescriptorSupplier
      extends serviciosBaseDescriptorSupplier {
    serviciosFileDescriptorSupplier() {}
  }

  private static final class serviciosMethodDescriptorSupplier
      extends serviciosBaseDescriptorSupplier
      implements io.grpc.protobuf.ProtoMethodDescriptorSupplier {
    private final String methodName;

    serviciosMethodDescriptorSupplier(String methodName) {
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
      synchronized (serviciosGrpc.class) {
        result = serviceDescriptor;
        if (result == null) {
          serviceDescriptor = result = io.grpc.ServiceDescriptor.newBuilder(SERVICE_NAME)
              .setSchemaDescriptor(new serviciosFileDescriptorSupplier())
              .addMethod(getConsultaAnaliticoStreamMethod())
              .addMethod(getEnviarAnaliticoConFirmaStreamMethod())
              .addMethod(getEnviarAnaliticoSinFirmaStreamMethod())
              .build();
        }
      }
    }
    return result;
  }
}
