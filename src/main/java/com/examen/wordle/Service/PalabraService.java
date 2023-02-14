package com.examen.wordle.Service;

import java.util.List;

public interface PalabraService {

    public String comprobar(String palabra);

    public int getIntentos();

    public int getIntentosRestantes();

    public List<String> getListPalabra();

    public String getPalabraPorIntento(int intento);
}
