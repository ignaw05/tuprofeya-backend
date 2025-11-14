package com.tuprofeya.backend_tuprofeya.controllers;


import com.tuprofeya.backend_tuprofeya.dto.ClaseRequestDTO;
import com.tuprofeya.backend_tuprofeya.dto.ClaseResponseDTO;
import com.tuprofeya.backend_tuprofeya.services.ProfesorService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/profe")
public class ProfesorController {

    private final ProfesorService service;

    @Autowired
    public ProfesorController(ProfesorService service) {
        this.service = service;
    }

    @Operation(summary = "Obtener todas las clases de un profesor")
    @ApiResponse(responseCode = "200", description = "Clases obtenidad correctamente")
    @GetMapping("/clases/{id}")
    public ResponseEntity<List<ClaseResponseDTO>> getClaseByProfesorId(@PathVariable Long id){
        List<ClaseResponseDTO> clases = service.getClasesByProfesorId(id);
        return ResponseEntity.ok(clases);
    }

    @Operation(summary = "Agregar clase")
    @ApiResponses(value = {
            @ApiResponse(responseCode = "201", description = "Clase creada correctamente"),
            @ApiResponse(responseCode = "400", description = "Datos de entrada inválidos o error de validación")
    })
    @PostMapping("/{id}/nuevaclase")
    public ResponseEntity<ClaseResponseDTO> addClase(
            @PathVariable Long id,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Datos de clase", required = true)
            @Valid
            @RequestBody ClaseRequestDTO claseRequestDTO){
        ClaseResponseDTO clase = service.addClase(claseRequestDTO);
        return ResponseEntity.status(HttpStatus.CREATED).body(clase);
    }

    @PutMapping("/{idprofe}/clases/{claseid}")
    public ResponseEntity<ClaseResponseDTO> updateClase(
            @PathVariable Long idprofe,
            @PathVariable Long claseid,
            @io.swagger.v3.oas.annotations.parameters.RequestBody(description = "Datos a actualizar de la clase", required = true)
            @Valid
            @RequestBody ClaseRequestDTO claseRequestDTO) {
        ClaseResponseDTO clase = service.updateClase(idprofe,claseid,claseRequestDTO);
        return ResponseEntity.ok(clase);
    }


}

