package com.example.ra3.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.repositorio.JugadorRepositorio;

@Service
public class JugadorServicio {

	@Autowired
	private JugadorRepositorio jugadorRepositorio;

	public List<Jugador> listarTodos() {
		return jugadorRepositorio.findAll();
	}
	
}
