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
        List<Clase> clases = repository.findAll();
        List<ClaseResponseDTO> clasesDTO = new ArrayList<>();
        clases.stream().forEach(clase -> {
            clasesDTO.add(ClaseResponseDTO.fromEntity(clase,clase.getProfesor()));
        });
        return clasesDTO;
    }

    public ClaseResponseDTO getClaseById(Long id){
        Clase clase = repository.findById(id).orElseThrow();
        return ClaseResponseDTO.fromEntity(clase,clase.getProfesor());
    }

    public List<ClaseResponseDTO> getClasesByProfesorId(Long id){
        List<Clase> clases = repository.findAll();
        List<ClaseResponseDTO> clasesDTO = new ArrayList<>();
        clases.stream().forEach(clase -> {
            clasesDTO.add(ClaseResponseDTO.fromEntity(clase,clase.getProfesor()));
        });
        return clasesDTO;
    }
}

