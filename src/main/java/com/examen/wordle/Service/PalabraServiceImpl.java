package com.examen.wordle.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examen.wordle.Repository.PalabraRepository;

@Service
public class PalabraServiceImpl implements PalabraService {

    @Autowired
    @Qualifier("palabra")
    public PalabraRepository palabraRepository;

    @Override
    public String comprobar(String palabra) {
        return palabraRepository.comprobar(palabra);
    }

    @Override
    public int getIntentos() {
        return palabraRepository.getIntentosUsados();
    }

    @Override
    public int getIntentosRestantes() {
        return palabraRepository.getIntentosRestantes();
    }
}
