package com.examen.wordle.Repository;

import com.examen.wordle.Model.Jugador;

public interface JugadorRepository {

    public Jugador getJugador(String nombre);

    public void save(Jugador jugador);
}
