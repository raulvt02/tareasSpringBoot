package com.example.ra3.servicio;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.repositorio.JugadorRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class JugadorServicio {

    @Autowired
    private JugadorRepositorio jugadorRepository;

    public List<Jugador> findAll() {
        return jugadorRepository.findAll();
    }

    public Jugador findById(Integer id) {
        return jugadorRepository.findById(id).orElse(null);
    }

    public Jugador save(Jugador jugador) {
        return jugadorRepository.save(jugador);
    }

    public void deleteById(Integer id) {
        jugadorRepository.deleteById(id);
    }
}