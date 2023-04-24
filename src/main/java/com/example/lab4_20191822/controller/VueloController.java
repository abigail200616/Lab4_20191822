package com.example.lab4_20191822.controller;


import com.example.lab4_20191822.entity.Reserva;
import com.example.lab4_20191822.entity.User;
import com.example.lab4_20191822.entity.Vuelo;
import com.example.lab4_20191822.repository.ReservaRepository;
import com.example.lab4_20191822.repository.UsuarioRepository;
import com.example.lab4_20191822.repository.VueloRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.sql.Timestamp;
import java.util.List;
import java.time.*;
import java.time.format.*;
import java.util.Optional;

@Controller
@RequestMapping("/vuelo")
public class VueloController {
    @Autowired
    final VueloRepository vueloRepository;
    @Autowired
    UsuarioRepository usuarioRepository;
    @Autowired
    ReservaRepository reservaRepository;

    public VueloController(VueloRepository vueloRepository) {
        this.vueloRepository = vueloRepository;
    }

    @GetMapping("/info/{id}")
    public String listarVuelo(Model model,@PathVariable("id") String id){
        List<Vuelo> lista = vueloRepository.findAll();
        model.addAttribute("vueloList", lista);
        model.addAttribute("userid", id);
        return "/homePage";
    }

    @PostMapping("/comprar")
    public String comprarVuelo(Model model, @RequestParam("userId") String idU,
                               @RequestParam("vueloId") String idV ){
        Reserva nuevaReserva = new Reserva();
        nuevaReserva.setEstadoPago("procesado");
        LocalDate hoy = LocalDate.now();
        LocalTime ahora = LocalTime.now();
        LocalDateTime fecha = LocalDateTime.of(hoy, ahora);
        nuevaReserva.setFechaReserva(Timestamp.valueOf(fecha));
        Optional<User> optUser = usuarioRepository.findById(Integer.valueOf(idU));
        Optional<Vuelo> optVuelo = vueloRepository.findById(Integer.valueOf(idV));
        nuevaReserva.setUserId(optUser.get());
        nuevaReserva.setVueloId(optVuelo.get());
        nuevaReserva.setPrecioTotal(optVuelo.get().getPrecio());
        reservaRepository.save(nuevaReserva);
        return "redirect:/vuelo/info/" + idU;
    }
}
