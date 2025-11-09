package com.tuprofeya.backend_tuprofeya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Nivel {
    PRIMARIA("Primaria"),
    SECUNDARIA("Secundaria"),
    PREUNIVERSITARIO("Preuniversitario"),
    UNIVERSITARIO("Universitario"),
    IDIOMA("Idioma"),
    DEPORTE("Deporte"),
    EXTRA_CURRICULAR("Extracurricular");

    private String descripcion;

}
