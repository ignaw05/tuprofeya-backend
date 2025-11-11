package com.tuprofeya.backend_tuprofeya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
public enum Provincia {
    BUENOS_AIRES("Buenos Aires"),
    CATAMARCA("Catamarca"),
    CHACO("Chaco"),
    CHUBUT("Chubut"),
    CORDOBA("Córdoba"),
    CORRIENTES("Corrientes"),
    ENTRE_RIOS("Entre Ríos"),
    FORMOSA("Formosa"),
    JUJUY("Jujuy"),
    LA_PAMPA("La Pampa"),
    LA_RIOJA("La Rioja"),
    MENDOZA("Mendoza"),
    MISIONES("Misiones"),
    NEUQUEN("Neuquén"),
    RIO_NEGRO("Río Negro"),
    SALTA("Salta"),
    SAN_JUAN("San Juan"),
    SAN_LUIS("San Luis"),
    SANTA_CRUZ("Santa Cruz"),
    SANTA_FE("Santa Fe"),
    SANTIAGO_DEL_ESTERO("Santiago del Estero"),
    TIERRA_DEL_FUEGO("Tierra del Fuego"),
    TUCUMAN("Tucumán"),
    CABA("CABA");

    private final String descripcion;

    public String getDescripcion() {
        return descripcion;
    }


    public static Provincia fromDescripcion(String descripcion) {
        for (Provincia d : Provincia.values()) {
            if (d.getDescripcion().equalsIgnoreCase(descripcion)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Provincia inválida: " + descripcion);
    }
}
