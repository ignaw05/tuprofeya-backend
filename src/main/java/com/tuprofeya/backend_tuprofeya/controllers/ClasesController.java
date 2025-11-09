package com.tuprofeya.backend_tuprofeya.controllers;

import com.tuprofeya.backend_tuprofeya.dto.ClaseResponseDTO;
import com.tuprofeya.backend_tuprofeya.services.ClasesService;
import feign.Param;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/clases")
public class ClasesController {
    private final ClasesService service;
    @Autowired
    public ClasesController(ClasesService service){
        this.service = service;
    }

    @Operation(summary = "Obtener todas las clases")
    @ApiResponse(responseCode = "200", description = "Lista de clases obtenida correctamente")
    @GetMapping
    public ResponseEntity<List<ClaseResponseDTO>> getAllClases(){
        List<ClaseResponseDTO> clases = service.getAllClases();
        return ResponseEntity.ok(clases);
    }

    @Operation(summary = "Obtener una clase especifica")
    @ApiResponse(responseCode = "200", description = "Obtiene una clase por ID")
    @GetMapping("/{id}")
    public ResponseEntity<ClaseResponseDTO> getClaseById(Long id){
        ClaseResponseDTO clase = service.getClaseById(id);
        return ResponseEntity.ok(clase);
    }
}
