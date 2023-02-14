package com.examen.wordle.Model;

public class Letra {

    private char letra;
    private String color;

    public Letra() {
    }

    public Letra(char letra, String color) {
        this.letra = letra;
        this.color = color;
    }

    public char getLetra() {
        return letra;
    }

    public void setLetra(char letra) {
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
