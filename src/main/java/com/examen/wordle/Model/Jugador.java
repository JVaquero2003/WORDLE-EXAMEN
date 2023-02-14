package com.examen.wordle.Model;

public class Jugador {
    private String palabraIntroducida;
    private int puntaje;

    public Jugador() {
    }

    public Jugador(String palabraIntroducida, int puntaje) {
        this.palabraIntroducida = palabraIntroducida;
        this.puntaje = puntaje;
    }

    public String getPalabraIntroducida() {
        return palabraIntroducida;
    }

    public void setPalabraIntroducida(String palabraIntroducida) {
        this.palabraIntroducida = palabraIntroducida;
    }

    public int getPuntaje() {
        return puntaje;
    }

    public void setPuntaje(int puntaje) {
        this.puntaje = puntaje;
    }

    @Override
    public String toString() {
        return "Jugador [palabraIntroducida=" + palabraIntroducida + ", puntaje=" + puntaje + "]";
    }
}
