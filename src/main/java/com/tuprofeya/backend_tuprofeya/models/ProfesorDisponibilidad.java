package com.tuprofeya.backend_tuprofeya.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
@Getter
@Entity
public class ProfesorDisponibilidad {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String horaDesde;
    private String horaHasta;

    @Enumerated(EnumType.STRING)
    private Dia dia;
}
