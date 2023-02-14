package com.examen.wordle.Model;

public class Letra {

    private String letra;
    private String color;

    public Letra() {
    }

    public Letra(String letra, String color) {
        this.letra = letra;
        this.color = color;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Letra [color=" + color + ", letra=" + letra + "]";
    }
}
