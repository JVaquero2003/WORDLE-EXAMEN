package com.examen.wordle.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Dificil")
public class PalabraServiceDificil extends PalabraServiceImpl {

    public PalabraServiceDificil() {

        PalabraCorrecta = "aprobado";

        intentos = 6;
    }
}
