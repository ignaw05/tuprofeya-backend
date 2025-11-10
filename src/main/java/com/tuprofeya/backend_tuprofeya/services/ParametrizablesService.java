package com.tuprofeya.backend_tuprofeya.services;

import com.tuprofeya.backend_tuprofeya.dto.NivelResponseDTO;
import com.tuprofeya.backend_tuprofeya.models.Materia;
import com.tuprofeya.backend_tuprofeya.dto.MateriasResponseDTO;
import com.tuprofeya.backend_tuprofeya.models.Nivel;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.List;

@Service
public class ParametrizablesService {

    public List<MateriasResponseDTO> getAllMaterias(){
        List<MateriasResponseDTO> materias = Arrays.stream(Materia.values())
                    .map(MateriasResponseDTO::fromEntity)
                    .toList();
        return materias;
    }


    public List<NivelResponseDTO> getAllNivel(){
        List<NivelResponseDTO> niveles = Arrays.stream(Nivel.values())
                .map(NivelResponseDTO::fromEntity)
                .toList();
        return niveles;
    }
}

