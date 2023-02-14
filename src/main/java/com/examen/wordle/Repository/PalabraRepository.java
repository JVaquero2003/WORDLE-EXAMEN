package com.examen.wordle.Repository;

public interface PalabraRepository {

    public String comprobar(String palabra);

    public int getIntentosUsados();

    public int getIntentosRestantes();
}
