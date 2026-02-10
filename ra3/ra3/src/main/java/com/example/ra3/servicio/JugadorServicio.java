package com.example.ra3.servicio;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.repositorio.JugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServicio {

    @Autowired
    private JugadorRepositorio repositorio;

    public List<Jugador> obtenerJugadores() {
        return repositorio.findAll();
    }

    public Jugador obtenerJugadorPorId(Integer id) {
        return repositorio.findById(id).orElse(null);
    }

    public Jugador agregarJugador(Jugador jugador) {
        return repositorio.save(jugador);
    }

    public void eliminarJugador(Integer id) {
        repositorio.deleteById(id);
    }
}