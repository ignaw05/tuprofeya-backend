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
}
