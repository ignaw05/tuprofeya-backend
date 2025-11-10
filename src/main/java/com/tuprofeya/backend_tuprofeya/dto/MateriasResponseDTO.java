package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.Materia;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public record MateriasResponseDTO (
        String nombre
) {
    public static MateriasResponseDTO fromEntity(Materia materia){
        return new MateriasResponseDTO(materia.getNombre());
    }
}
