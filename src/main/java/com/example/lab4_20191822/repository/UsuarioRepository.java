package com.example.lab4_20191822.repository;

import com.example.lab4_20191822.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface UsuarioRepository extends JpaRepository<User,Integer> {

    @Query(value = "select * from user where  (email = ?1 and password =?2)", nativeQuery = true)
    User findByEmailAndPassword(String email, String password);
}
