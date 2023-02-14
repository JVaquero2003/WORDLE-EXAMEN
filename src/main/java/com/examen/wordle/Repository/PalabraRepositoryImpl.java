package com.examen.wordle.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.wordle.Model.Palabra;

@Repository("palabra")
public class PalabraRepositoryImpl implements PalabraRepository {

    List<Palabra> listPalabra = new ArrayList<>();

    int intentos = 5;

    int intentosUsados = 0;

    int intentosRestantes = 0;

    String palabraCorrecta = "hola";

    @Override
    public String comprobar(String palabra) {
        if (intentosUsados != intentos) {
            intentosUsados++;
            if (palabraCorrecta.equals(palabra)) {
                return "Has acertado la palabra";
            } else {
                return "Has fallado la palabra";
            }
        } else {
            return "Has perdido tus intentos";
        }
    }

    @Override
    public int getIntentosUsados() {
        return intentosUsados;
    }

    @Override
    public int getIntentosRestantes() {
        intentosRestantes = intentos - intentosUsados;
        return intentosRestantes;
    }
}
