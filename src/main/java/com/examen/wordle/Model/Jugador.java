package com.examen.wordle.Model;

public class Jugador {

    private String palabraIntroducida;

    public Jugador() {
    }

    public Jugador(String palabraIntroducida, int puntaje) {
        this.palabraIntroducida = palabraIntroducida;
    }

    public String getPalabraIntroducida() {
        return palabraIntroducida;
    }

    public void setPalabraIntroducida(String palabraIntroducida) {
        this.palabraIntroducida = palabraIntroducida;
    }

    @Override
    public String toString() {
        return "Jugador [palabraIntroducida=" + palabraIntroducida + "]";
    }
}
