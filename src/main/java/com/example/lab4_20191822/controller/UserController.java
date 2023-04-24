package com.example.lab4_20191822.controller;

import com.example.lab4_20191822.entity.User;
import com.example.lab4_20191822.entity.Vuelo;
import com.example.lab4_20191822.repository.UsuarioRepository;
import com.example.lab4_20191822.repository.VueloRepository;
import org.springframework.jdbc.support.CustomSQLErrorCodesTranslation;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;
import java.util.Optional;


@Controller
@RequestMapping("inicio")
public class UserController {

     VueloRepository vueloRepository;

     final UsuarioRepository usuarioRepository;

    public UserController(VueloRepository vueloRepository, UsuarioRepository usuarioRepository) {
        this.vueloRepository = vueloRepository;
        this.usuarioRepository = usuarioRepository;
    }

    @GetMapping("/login")
    public String inicio(){
        return "/inicio";
    }

    @PostMapping(value = "/validacion")
    public String validacion(Model model,
                             @RequestParam(name= "correo") String email,
                             @RequestParam(name ="contrasena") String password){

        Optional <User> optUser = Optional.ofNullable(usuarioRepository.findByEmailAndPassword(email, password));
        if(optUser.isPresent()){
            User user = optUser.get();
            return "redirect:/vuelo/info/" + user.getIduser();
        }
        return "redirect:/inicio/login";
    }

}
