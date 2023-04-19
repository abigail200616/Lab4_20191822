package com.example.lab4_20191822.controller;

import com.example.lab4_20191822.entity.User;
import com.example.lab4_20191822.entity.Vuelo;
import com.example.lab4_20191822.repository.UsuarioRepository;
import com.example.lab4_20191822.repository.VueloRepository;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;


@Controller
public class UserController {

     VueloRepository vueloRepository;

     final UsuarioRepository usuarioRepository;

    public UserController(VueloRepository vueloRepository, UsuarioRepository usuarioRepository) {
        this.vueloRepository = vueloRepository;
        this.usuarioRepository = usuarioRepository;
    }


    @GetMapping(value = "/inicio")
    public String index(){
        return "/inicio";
    }

    @GetMapping(value = "/iniciovalidacion")
    public String Validacion(Model model, @RequestParam(name= "correo") String email, @RequestParam(name ="contrasena") String password){

        User u = usuarioRepository.findByEmailAndPassword(email, password);
        if(u.getEmail().equals(email) && u.getPassword().equals(password)){
            return "/homePage";
        }
        model.addAttribute("usuario", u);

        return "/inicio";
    }

}
