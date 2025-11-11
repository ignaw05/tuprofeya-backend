package com.tuprofeya.backend_tuprofeya.models;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Materia {
    // --- Materias generales ---
    MATEMATICA("Matemática"),
    FISICA("Física"),
    QUIMICA("Química"),
    BIOLOGIA("Biología"),
    LENGUA("Lengua y Literatura"),
    HISTORIA("Historia"),
    GEOGRAFIA("Geografía"),
    CIENCIAS_SOCIALES("Ciencias Sociales"),
    CIENCIAS_NATURALES("Ciencias Naturales"),
    EDUCACION_FISICA("Educación Física"),
    COMPUTACION("Computación"),
    PROGRAMACION("Programación"),
    ECONOMIA("Economía"),
    FILOSOFIA("Filosofía"),
    ARTE("Arte"),
    MUSICA("Música"),

    // --- Idiomas ---
    INGLES("Inglés"),
    FRANCES("Francés"),
    ALEMAN("Alemán"),
    ITALIANO("Italiano"),
    PORTUGUES("Portugués"),
    CHINO("Chino Mandarín"),
    JAPONES("Japonés"),
    RUSO("Ruso"),
    ARABE("Árabe"),
    ESPAÑOL("Español");

    private String nombre;

    public String getNombre() {
        return nombre;
    }

    public static Materia fromNombre(String nombre) {
        for (Materia d : Materia.values()) {
            if (d.getNombre().equalsIgnoreCase(nombre)) {
                return d;
            }
        }
        throw new IllegalArgumentException("Materia inválida: " + nombre);
    }

}
