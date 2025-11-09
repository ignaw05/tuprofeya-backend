package com.tuprofeya.backend_tuprofeya.services;

import com.tuprofeya.backend_tuprofeya.dto.ClaseResponseDTO;
import com.tuprofeya.backend_tuprofeya.models.Clase;
import com.tuprofeya.backend_tuprofeya.models.Profesor;
import com.tuprofeya.backend_tuprofeya.repositories.ClasesRepository;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ClasesService {
    private final ClasesRepository repository;

    public ClasesService(ClasesRepository repository){
        this.repository = repository;
    }

    public List<ClaseResponseDTO> getAllClases(){
        List<Clase> clases = repository.getAllClases();
        List<ClaseResponseDTO> clasesDTO = new ArrayList<>();
        clases.stream().forEach(clase -> {
            Profesor prof = clase.getProfesor();
            clasesDTO.add(ClaseResponseDTO.fromEntity(clase,prof));
        });
        return clasesDTO;
    }
}
