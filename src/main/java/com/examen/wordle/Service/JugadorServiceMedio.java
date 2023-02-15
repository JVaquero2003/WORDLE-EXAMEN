package com.examen.wordle.Service;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Component;

@Component
@Profile("Medio")
public class JugadorServiceMedio extends JugadorServiceImpl {

}
