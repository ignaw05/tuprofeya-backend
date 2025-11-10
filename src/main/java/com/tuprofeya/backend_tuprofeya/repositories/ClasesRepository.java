package com.tuprofeya.backend_tuprofeya.repositories;

import com.tuprofeya.backend_tuprofeya.models.*;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;


public interface ClasesRepository extends JpaRepository<Clase,Long> {

}
