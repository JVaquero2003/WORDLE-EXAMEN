package com.examen.wordle.Repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.examen.wordle.Model.Letra;

@Repository("palabra")
public class PalabraRepositoryImpl implements PalabraRepository {

    List<String> listPalabra = new ArrayList<>();

    List<Letra> listLetra = new ArrayList<>();

    int intentos;

    int intentosUsados = 0;

    int intentosRestantes = 0;

    String palabraCorrecta;

    @Override
    public List<Letra> comprobar(String palabra) {
        System.out.println(palabra);
        if (intentosUsados != intentos && palabra.length() == palabraCorrecta.length()) {
            intentosUsados++;
            for (int x = 0; x < palabra.length(); x++) {
                if (palabra.charAt(x) == palabraCorrecta.charAt(x)) {
                    Letra letra = new Letra(palabra.charAt(x), "verde");
                    System.out.println(letra);
                    listLetra.add(letra);
                } else if (palabra.charAt(x) != palabraCorrecta.charAt(x)) {
                    Letra letra = new Letra(palabra.charAt(x), "rojo");
                    for (int i = 0; i < palabra.length(); i++) {
                        if (palabraCorrecta.charAt(i) == letra.getLetra()) {
                            letra.setColor("amarillo");
                            System.out.println(letra.toString());
                        }
                    }
                    listLetra.add(letra);
                }

            }
            listPalabra.add(palabra);
        } else if (intentosUsados != intentos) {
            listPalabra.add(palabra);
            intentosUsados++;
        }
        return listLetra;
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

    @Override
    public String getPalabraCorrecta() {
        return palabraCorrecta;
    }

    @Override
    public void clearListLetra() {
        listLetra.clear();
    }

    @Override
    public void cogerPalabraCorrecta(String palabra, int intentos) {
        this.palabraCorrecta = palabra;
        this.intentos = intentos;
    }

}
