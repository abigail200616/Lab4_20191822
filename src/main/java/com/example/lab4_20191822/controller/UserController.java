package com.example.lab4_20191822.controller;

import ch.qos.logback.core.model.Model;
import org.springframework.web.bind.annotation.GetMapping;

public class UserController {

    @GetMapping
    public String User(Model model){
        return "/inicio";
    }

}
