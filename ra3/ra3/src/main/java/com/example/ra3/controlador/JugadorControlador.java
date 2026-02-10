package com.example.ra3.controlador;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.servicio.JugadorServicio;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.*;

@Controller
public class JugadorControlador {

    @Autowired
    private JugadorServicio jugadorServicio;

    @GetMapping("/jugadores")
    public String listar(Model model) {
        model.addAttribute("jugadores", jugadorServicio.findAll());
        return "jugadores/lista";
    }

    @GetMapping("/jugadores/nuevo")
    public String nuevo(Model model) {
        model.addAttribute("jugador", new Jugador());
        return "jugadores/formulario";
    }

    @GetMapping("/jugadores/editar/{id}")
    public String editar(@PathVariable Integer id, Model model) {
        Jugador jugador = jugadorServicio.findById(id);
        model.addAttribute("jugador", jugador);
        return "jugadores/formulario";
    }

    @PostMapping("/jugadores")
    public String guardar(@Valid Jugador jugador, BindingResult result) {
        if (result.hasErrors()) {
            return "jugadores/formulario";
        }
        jugadorServicio.save(jugador);
        return "redirect:/jugadores";
    }

    @GetMapping("/jugadores/eliminar/{id}")
    public String eliminar(@PathVariable Integer id) {
        jugadorServicio.deleteById(id);
        return "redirect:/jugadores";
    }
}