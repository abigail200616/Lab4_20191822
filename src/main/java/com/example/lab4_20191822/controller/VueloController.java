package com.example.lab4_20191822.controller;


import com.example.lab4_20191822.entity.Vuelo;
import com.example.lab4_20191822.repository.VueloRepository;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping()
public class VueloController {


    final VueloRepository vueloRepository;

    public VueloController(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    @GetMapping
    public String listarVuelo(Model model){
        List<Vuelo> lista = vueloRepository.findAll();
        model.addAttribute("vueloList", lista);
        return "/homePage";
    }
}
