package com.examen.wordle.Model;

import java.util.List;

public class Palabra {

    private String palabra;

    public Palabra() {
    }

    public Palabra(String palabra, List<Letra> letra) {
        this.palabra = palabra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    @Override
    public String toString() {
        return "Palabra [palabra=" + palabra + "]";
    }
}
