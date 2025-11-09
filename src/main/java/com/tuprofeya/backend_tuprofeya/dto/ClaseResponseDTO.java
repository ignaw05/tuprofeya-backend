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
        Provincia provincia,
        Float precio,
        Duracion duracion,
        Modalidad modalidad,
        Nivel nivel,
        List<Materia> materias
) {
    public static ClaseResponseDTO fromEntity(Clase clase, Profesor profe){
        return new ClaseResponseDTO(
                clase.getId(),
                clase.getNombre(),
                clase.getDescripcion(),
                ProfesorResponseDTO.fromEntity(profe),
                clase.getProvincia(),
                clase.getPrecio(),
                clase.getDuracion(),
                clase.getModalidad(),
                clase.getNivel(),
                clase.getMaterias()
        );
    }
}
