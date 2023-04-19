package com.example.lab4_20191822.repository;

import com.example.lab4_20191822.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UsuarioRepository extends JpaRepository<User,Integer> {

    User findByEmailAndPassword(String email, String password);
}
