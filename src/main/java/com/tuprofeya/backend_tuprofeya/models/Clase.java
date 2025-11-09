package com.tuprofeya.backend_tuprofeya.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.RequiredArgsConstructor;
import lombok.Setter;
import org.springframework.context.annotation.Primary;

import java.util.List;

@RequiredArgsConstructor
@Getter
@Setter
@Entity
public class Clase {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String descripcion;

    @Enumerated(EnumType.STRING)
    private Provincia provincia;

    private Float precio;

    @Enumerated(EnumType.STRING)
    private Duracion duracion;

    @Enumerated(EnumType.STRING)
    private Modalidad modalidad;

    @Enumerated(EnumType.STRING)
    private Nivel nivel;

    @ManyToOne
    private Profesor profesor;

    @ElementCollection(targetClass = Materia.class)
    @Enumerated(EnumType.STRING)
    @CollectionTable(name = "clase_materias", joinColumns = @JoinColumn(name = "clase_id"))
    @Column(name = "materia")
    private List<Materia> materias;

}
