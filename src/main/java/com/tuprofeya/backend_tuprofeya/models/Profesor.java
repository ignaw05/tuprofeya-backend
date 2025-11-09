package com.tuprofeya.backend_tuprofeya.models;

import jakarta.persistence.*;
import lombok.*;

import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Getter
@Setter
@AllArgsConstructor
@Builder
@RequiredArgsConstructor
@Entity
public class Profesor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nombre;
    private String mail;
    private String telefono;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "profesor_titulo",
            joinColumns = @JoinColumn(name = "profesor_id"),
            inverseJoinColumns = @JoinColumn(name = "titulo_id")
    )
    private List<Titulo> titulos;

    @OneToMany(mappedBy = "profesor", cascade = CascadeType.ALL, orphanRemoval = true)
    private List<ProfesorDisponibilidad> disponibilidad;

    public List<String> getDisponibilidad() {
        return disponibilidad.stream()
                .sorted(Comparator.comparing(disp -> disp.getDia().ordinal()))
                .map(disp -> disp.getDia().getNombre() + ": " +
                        disp.getHoraDesde() + " - " +
                        disp.getHoraHasta())
                .toList();
    }
}

