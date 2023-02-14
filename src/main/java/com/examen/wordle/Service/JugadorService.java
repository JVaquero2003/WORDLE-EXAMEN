package com.examen.wordle.Service;

import com.examen.wordle.Model.Jugador;

public interface JugadorService {

    public Jugador getJugador(String nombre);

    public void save(Jugador jugador);

}
