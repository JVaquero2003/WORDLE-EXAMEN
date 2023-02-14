package com.examen.wordle.Repository;

import java.util.List;

public interface PalabraRepository {

    public String comprobar(String palabra);

    public int getIntentosUsados();

    public int getIntentosRestantes();

    public List<String> getListPalabra();

    public String getPalabraPorIntento(int intento);
}
