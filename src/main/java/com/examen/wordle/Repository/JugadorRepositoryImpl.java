package com.examen.wordle.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.wordle.Model.Jugador;

@Repository("jugador")
public class JugadorRepositoryImpl implements JugadorRepository {

    List<Jugador> listJugador = new ArrayList<>();

    @Override
    public Jugador getJugador(String nombre) {
        Jugador jugador = new Jugador();
        jugador.setPalabraIntroducida(nombre);
        jugador.setPalabraIntroducida("palabraIntroducida");
        return jugador;
    }

    @Override
    public void save(Jugador jugador) {
        listJugador.add(jugador);
    }
}
