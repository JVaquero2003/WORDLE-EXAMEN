package com.examen.wordle.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Facil")
public class PalabraServiceFacil extends PalabraServiceImpl {

    public PalabraServiceFacil() {

        PalabraCorrecta = "mar";

        intentos = 20;
    }
}
