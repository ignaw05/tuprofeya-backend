package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.Nivel;
import io.swagger.v3.oas.annotations.media.Schema;

@Schema
public record NivelResponseDTO (
        String nombre
) {
    public static NivelResponseDTO fromEntity(Nivel nivel){
        return new NivelResponseDTO(nivel.getDescripcion());
    }
}
