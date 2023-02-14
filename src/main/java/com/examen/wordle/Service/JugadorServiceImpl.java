package com.examen.wordle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examen.wordle.Model.Jugador;
import com.examen.wordle.Repository.JugadorRepository;

@Service
public class JugadorServiceImpl implements JugadorService {

    @Autowired
    @Qualifier("jugador")
    public JugadorRepository jugadorRepository;

    @Override
    public Jugador getJugador(String nombre) {
        return jugadorRepository.getJugador(nombre);
    }

    @Override
    public void save(Jugador jugador) {
        jugadorRepository.save(jugador);
    }

}
