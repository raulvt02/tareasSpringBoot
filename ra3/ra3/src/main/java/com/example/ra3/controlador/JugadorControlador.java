package com.example.ra3.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.servicio.JugadorServicio;

@Controller
@RequestMapping("/jugadores")
public class JugadorControlador {
	
	@Autowired
	 private JugadorServicio jugadorServicio;
	
	@GetMapping
	  public String listarEmpleados(Model model) {
	        model.addAttribute("jugadores", jugadorServicio.listarTodos());
	        return "jugadores/lista";
	    }
}
