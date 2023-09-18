package com.example;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import io.grpc.Status;
import data_analytics.serviciosGrpc;
import data_analytics.CourseworkCertificate.analitico_respuesta;
import data_analytics.CourseworkCertificate.contenido_analitico;
import data_analytics.serviciosGrpc.serviciosStub;
import io.grpc.ManagedChannel;
import io.grpc.ManagedChannelBuilder;
import java.util.logging.Logger;

import io.grpc.stub.StreamObserver;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = Logger.getLogger(App.class.getName());

    private static Integer cantRespuestas = 0;

    private static final void sumarCantidad() {
        App.cantRespuestas++;
    }

    public static void main(String[] args) throws InterruptedException {
        // Dirección y puerto del servidor gRPC
        System.out.println(Constants.HOST);

        // Configurar el canal de comunicación
        ManagedChannel channel = ManagedChannelBuilder.forTarget(Constants.HOST)
                .useTransportSecurity() // Utilizar SSL/TLS
                .build();

        BearerToken token = new BearerToken(Constants.JWT_SIGNING_KEY);

        /**
         * 
         * A bidirectional streaming RPC
         * where both sides send a sequence of messages using a read-write stream
         */

        serviciosStub asyncStub = serviciosGrpc.newStub(channel).withCallCredentials(token);

        final CountDownLatch finishLatch = new CountDownLatch(1);

        String s ="";
        StreamObserver<contenido_analitico> requestObserver = asyncStub
                .enviarAnaliticoSinFirmaStream(new StreamObserver<analitico_respuesta>() {

                    @Override
                    public void onNext(analitico_respuesta value) {

                        System.out.println(s);
                        App.sumarCantidad();
                        // System.out.println("S obtuvo respuesta");
                        // System.out.println(value.getDocumento() + value.getIdEstado());
                    }

                    @Override
                    public void onError(Throwable t) {

                        Status status = Status.fromThrowable(t);
                        logger.log(Level.WARNING, "RouteChat Failed: {0}", status);
                        finishLatch.countDown();
                    }

                    @Override
                    public void onCompleted() {
                        System.out.println("COMPLETADO");
                        System.out.println(App.cantRespuestas);
                        finishLatch.countDown();
                    }
                });

        try {

            contenido_analitico[] requests = ConstantAnalitico.devolverContenido();

            for (contenido_analitico request : requests) {
                System.out.println(request);
                requestObserver.onNext(request);
            }

        } catch (RuntimeException e) {
            // Cancel RPC
            System.out.println("error");
            requestObserver.onError(e);
            throw e;
        }
        // Mark the end of requests
        requestObserver.onCompleted();

        // servicios_de_hello_titulos.newBlockingStub(channel);
        finishLatch.await(1, TimeUnit.MINUTES);

    }
}
