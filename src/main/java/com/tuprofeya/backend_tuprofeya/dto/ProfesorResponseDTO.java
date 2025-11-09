package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.Profesor;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public record ProfesorResponseDTO (
        String nombre
) {
    public static ProfesorResponseDTO fromEntity(Profesor profesor){
        return new ProfesorResponseDTO(
                profesor.getNombre()
        );
    }
}


