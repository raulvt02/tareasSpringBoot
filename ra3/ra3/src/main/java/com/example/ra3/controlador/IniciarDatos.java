package com.example.ra3.controlador;

import com.example.ra3.entidad.Jugador;
import com.example.ra3.servicio.JugadorServicio;
import com.github.javafaker.Faker;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class IniciarDatos {

    private final int TOTAL_JUGADORES = 50;

    @Autowired
    private JugadorServicio servicio;

    @PostConstruct
    void init() {
        Faker faker = fake();
        for (int i = 0; i < TOTAL_JUGADORES; i++) {
            Jugador jugador = new Jugador();
            
            jugador.setNickname(faker.name().username());
            jugador.setEdad(faker.number().numberBetween(13, 65));
            jugador.setEmail(faker.internet().emailAddress());

            servicio.agregarJugador(jugador);
        }
    }

    @Bean
    public Faker fake() {
        return new Faker();
    }
}