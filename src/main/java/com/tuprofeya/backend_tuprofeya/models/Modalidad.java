package com.tuprofeya.backend_tuprofeya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Modalidad {
    VIRTUAL("Virtual"),
    VIRTUAL_PRESENCIAL("Presencial y Virtual"),
    PRESENCIAL("Presencial");

    private final String descripcion;

    public String getDescripcion() {
        return descripcion;
    }

    public static Modalidad fromDescripcion(String descripcion) {
        for (Modalidad d : Modalidad.values()) {
            if (d.getDescripcion().equalsIgnoreCase(descripcion)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Modalidad inválida: " + descripcion);
    }
}
