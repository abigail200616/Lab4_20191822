package com.example.lab4_20191822.repository;

import com.example.lab4_20191822.entity.Aerolinea;
import com.example.lab4_20191822.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AerolineaRepository extends JpaRepository<Aerolinea, Integer> {

}
