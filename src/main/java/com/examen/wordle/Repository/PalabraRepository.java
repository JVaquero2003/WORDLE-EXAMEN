package com.examen.wordle.Repository;

import java.util.List;

import com.examen.wordle.Model.Letra;

public interface PalabraRepository {

    public List<Letra> comprobar(String palabra);

    public int getIntentosUsados();

    public int getIntentosRestantes();

    public List<String> getListPalabra();

    public String getPalabraPorIntento(int intento);

    public String getPalabraCorrecta();

    public void clearListLetra();
}
