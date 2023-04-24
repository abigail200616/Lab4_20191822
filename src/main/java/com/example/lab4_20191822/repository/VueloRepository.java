package com.example.lab4_20191822.repository;
import com.example.lab4_20191822.entity.Reserva;
import com.example.lab4_20191822.entity.Vuelo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.transaction.annotation.Transactional;

public interface VueloRepository extends JpaRepository<Vuelo, Integer> {


}
