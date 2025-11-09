package com.tuprofeya.backend_tuprofeya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Duracion {
    TREINTA(30, "30 minutos"),
    CUARENTA_Y_CINCO(45, "45 minutos"),
    SESENTA(60, "1 hora"),
    SETENTA_Y_CINCO(75, "1 hora 15 minutos"),
    NOVENTA(90, "1 hora 30 minutos"),
    CIENTO_VEINTE(120, "2 horas"),
    CIENTO_TREINTA_Y_CINCO(135, "2 horas 15 minutos"),
    CIENTO_CINCUENTA(150, "2 horas 30 minutos"),
    CIENTO_SESENTA_Y_CINCO(165, "2 horas 45 minutos"),
    CIENTO_OCHENTA(180, "3 horas");

    private Integer minutos;
    private String descripcion;

    public Integer getMinutos() {
        return minutos;
    }

    public String getDescripcion() {
        return descripcion;
    }
}
