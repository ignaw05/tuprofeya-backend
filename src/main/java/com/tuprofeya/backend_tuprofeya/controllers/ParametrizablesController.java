package com.tuprofeya.backend_tuprofeya.controllers;

import com.tuprofeya.backend_tuprofeya.dto.MateriasResponseDTO;
import com.tuprofeya.backend_tuprofeya.dto.NivelResponseDTO;
import com.tuprofeya.backend_tuprofeya.services.ParametrizablesService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ParametrizablesController {
    private final ParametrizablesService service;

    @Autowired
    public ParametrizablesController(ParametrizablesService service) {
        this.service = service;
    }

    @Operation(summary = "Obtener las materias")
    @ApiResponse(responseCode = "200",description = "Obtiene todas las materias")
    @GetMapping("/materias")
    public List<MateriasResponseDTO> getAllMaterias(){
        return service.getAllMaterias();
    }

    @Operation(summary = "Obtener los niveles")
    @ApiResponse(responseCode = "200",description = "Obtiene todos los niveles de clase")
    @GetMapping("/nivel")
    public List<NivelResponseDTO> getAllNiveles(){
        return service.getAllNivel();
    }
}
