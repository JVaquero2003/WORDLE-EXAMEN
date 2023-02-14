package com.examen.wordle.Model;

import java.util.List;

public class Palabra {
    private String palabra;
    private List<Letra> letra;

    public Palabra() {
    }

    public Palabra(String palabra, List<Letra> letra) {
        this.palabra = palabra;
        this.letra = letra;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public List<Letra> getLetra() {
        return letra;
    }

    public void setLetra(List<Letra> letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        return "Palabra [letra=" + letra + ", palabra=" + palabra + "]";
    }
}
