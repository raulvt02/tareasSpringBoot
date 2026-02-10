package com.example.ra3.repositorio;

import com.example.ra3.entidad.Jugador;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository
public interface JugadorRepositorio extends JpaRepository<Jugador, Integer> {

    boolean existsByEmail(String email);

    Optional<Jugador> findByEmail(String email);

    List<Jugador> findByNicknameContainingIgnoreCase(String nickname);
}