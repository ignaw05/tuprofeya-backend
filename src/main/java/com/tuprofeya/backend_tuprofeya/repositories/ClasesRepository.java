package com.tuprofeya.backend_tuprofeya.repositories;

import com.tuprofeya.backend_tuprofeya.models.Clase;
import com.tuprofeya.backend_tuprofeya.models.Duracion;
import com.tuprofeya.backend_tuprofeya.models.Modalidad;
import com.tuprofeya.backend_tuprofeya.models.Profesor;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ClasesRepository {

    public List<Clase> getAllClases(){
        Clase clase1 = Clase.builder().
                nombre("PRE UTN")
                .descripcion("Clases particulares")
                .duracion(Duracion.NOVENTA)
                .modalidad(Modalidad.PRESENCIAL)
                .profesor(Profesor.builder()
                        .nombre("Juan").build())
                .build();
        List<Clase> clases = new ArrayList<>();
        clases.add(clase1);
        return clases;
    }
}
