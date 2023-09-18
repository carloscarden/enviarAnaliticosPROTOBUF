package com.example;

import java.util.ArrayList;
import java.util.List;

import data_analytics.CourseworkCertificate.aprobacion;
import data_analytics.CourseworkCertificate.contenido_analitico;

public class ConstantAnalitico {

    private static final contenido_analitico nuevoContenido() {
        List<aprobacion> aprobaciones = new ArrayList<>();

        contenido_analitico c = contenido_analitico.newBuilder()
                .setDocumento("35399944")
                .setApellidos("apellidoMock")
                .setNombres("nombreMock")
                .setCuil("20353999444")
                .addAllAprobaciones(aprobaciones)
                .setPromedio(4)
                .build();
        return c;
    }

    public static final contenido_analitico[] devolverContenido() {

        contenido_analitico[] contenidoAnalitico = new contenido_analitico[100];
        for (int i = 0; i < contenidoAnalitico.length; i++) {
            contenido_analitico c = ConstantAnalitico.nuevoContenido();
            contenidoAnalitico[i] = c;

        }
        return contenidoAnalitico;
    };

}
