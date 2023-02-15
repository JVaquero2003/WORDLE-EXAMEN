package com.examen.wordle.Service;

import java.util.List;

import com.examen.wordle.Model.Letra;

public interface PalabraService {

    public List<Letra> comprobar(String palabra);

    public int getIntentos();

    public int getIntentosRestantes();

    public List<String> getListPalabra();

    public String getPalabraPorIntento(int intento);

    public String getPalabraCorrecta();

    public void clearListLetra();

    public void setPalabraCorrecta();
}
