package com.tuprofeya.backend_tuprofeya.services;

import com.tuprofeya.backend_tuprofeya.dto.ClaseResponseDTO;
import com.tuprofeya.backend_tuprofeya.models.Clase;
import com.tuprofeya.backend_tuprofeya.models.Profesor;
import com.tuprofeya.backend_tuprofeya.repositories.ClasesRepository;
import com.tuprofeya.backend_tuprofeya.repositories.ProfesorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfesorService {

    private final ProfesorRepository repository;
    private final ClasesRepository clasesRepository;

    @Autowired
    public ProfesorService(ProfesorRepository repository, ClasesRepository clasesRepository) {
        this.repository = repository;
        this.clasesRepository = clasesRepository;
    }

    public List<ClaseResponseDTO> getClasesByProfesorId(Long id){
        Profesor profesor = repository.findById(id).orElseThrow();
        List<Clase> clases = clasesRepository.findClaseByProfesor(profesor);
        List<ClaseResponseDTO> clasesDTO = new ArrayList<>();
        clases.stream().forEach(clase -> {
            clasesDTO.add(ClaseResponseDTO.fromEntity(clase,clase.getProfesor()));
        });
        return clasesDTO;
    }

    public ClaseResponseDTO addClase(ClaseRequestDTO claseRequestDTO){

    }
}
