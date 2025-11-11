package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.*;
import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.validation.Valid;
import jakarta.validation.constraints.*;
import lombok.Getter;

import java.util.List;

@Getter
@Schema
public class ClaseRequestDTO {

    @NotBlank(message = "El nombre no puede estar vacío")
    @Size(min = 3, max = 25, message = "El nombre debe tener entre 3 y 25 caracteres")
    private String nombre;

    @NotBlank(message = "La descripción no puede estar vacía")
    @Size(min = 3, max = 100, message = "La descripción debe tener entre 3 y 100 caracteres")
    private String descripcion;

    @NotNull(message = "El profesor no puede ser nulo")
    private Long profesor_id;

    @NotBlank(message = "La provincia no puede estar vacía")
    private String provincia;

    @NotNull(message = "El precio no puede ser nulo")
    @DecimalMin(value = "0.01", message = "El precio debe ser mayor que 0")
    private Float precio;

    @NotBlank(message = "La duración no puede estar vacía")
    private String duracion;

    @NotBlank(message = "La modalidad no puede estar vacía")
    private String modalidad;

    @NotBlank(message = "El nivel no puede estar vacío")
    private String nivel;

    @NotEmpty(message = "Debe incluir al menos una materia")
    private List<@NotBlank(message = "El nombre de la materia no puede estar vacío") String> materias;

    public List<Materia> materiasToList() {
        return materias == null ? List.of()
                : materias.stream()
                .map(Materia::fromNombre)
                .toList();
    }

    public Clase toEntity(Profesor profesor) {
        Clase clase = new Clase();
        clase.setNombre(this.nombre);
        clase.setDescripcion(this.descripcion);
        clase.setPrecio(this.precio);
        clase.setDuracion(Duracion.fromDescripcion(this.duracion));
        clase.setModalidad(Modalidad.fromDescripcion(this.modalidad));
        clase.setNivel(Nivel.fromDescripcion(this.nivel));
        clase.setMaterias(this.materiasToList());
        clase.setProvincia(Provincia.fromDescripcion(this.provincia));
        clase.setProfesor(profesor);
        return clase;
    }
}
