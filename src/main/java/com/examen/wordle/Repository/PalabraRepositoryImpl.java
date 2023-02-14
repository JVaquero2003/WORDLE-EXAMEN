package com.examen.wordle.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository("palabra")
public class PalabraRepositoryImpl implements PalabraRepository {

    List<String> listPalabra = new ArrayList<>();

    int intentos = 5;

    int intentosUsados = 0;

    int intentosRestantes = 0;

    String palabraCorrecta = "hola";

    @Override
    public String comprobar(String palabra) {
        if (intentosUsados != intentos) {
            intentosUsados++;
            if (palabraCorrecta.equals(palabra)) {
                listPalabra.add(palabra);
                return "Has acertado la palabra";
            } else {
                listPalabra.add(palabra);
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

    @Override
    public List<String> getListPalabra() {
        return listPalabra;
    }

    @Override
    public String getPalabraPorIntento(int intento) {
        String palabra = "";
        for (int i = 0; i < listPalabra.size(); i++) {
            System.out.println(i);
            System.out.println(intento);
            if (i == intento - 1) {
                palabra = listPalabra.get(i);
            }
        }
        return palabra;
    }

}
