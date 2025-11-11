package com.tuprofeya.backend_tuprofeya.dto;

import com.tuprofeya.backend_tuprofeya.models.Clase;
import com.tuprofeya.backend_tuprofeya.models.Duracion;
import com.tuprofeya.backend_tuprofeya.models.Materia;
import com.tuprofeya.backend_tuprofeya.models.Nivel;
import io.swagger.v3.oas.annotations.media.Schema;

import java.util.List;

@Schema
public class ClaseRequestDTO {
    private String nombre;
    private String descripcion;
    private Long profesor_id;
    private String provincia;
    private Float precio;
    private String duracion;
    private String modalidad;
    private String nivel;
    private List<String> materias;


    public Clase toEntity(){
        Clase clase = new Clase();
        clase.setNombre(this.nombre);
        clase.setDescripcion(this.descripcion);
        clase.setPrecio(this.precio);
        clase.setDuracion(Duracion.fromDescripcion(this.duracion));
    }
}
