package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.*;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema
public record ClaseResponseDTO (
        Long id,
        String nombre,
        String descripcion,
        ProfesorResponseDTO profesor,
        String provincia,
        Float precio,
        String duracion,
        String modalidad,
        Nivel nivel,
        List<Materia> materias
) {
    public static ClaseResponseDTO fromEntity(Clase clase, Profesor profe){
        return new ClaseResponseDTO(
                clase.getId(),
                clase.getNombre(),
                clase.getDescripcion(),
                ProfesorResponseDTO.fromEntity(profe),
                clase.getProvincia().getDescripcion(),
                clase.getPrecio(),
                clase.getDuracion().getDescripcion(),
                clase.getModalidad().getDescripcion(),
                clase.getNivel(),
                clase.getMaterias()
        );
    }
}
