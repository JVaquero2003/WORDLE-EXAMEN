package com.examen.wordle.Service;

import java.util.List;

import org.eclipse.tags.shaded.org.apache.bcel.generic.ReturnInstruction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import com.examen.wordle.Model.Letra;
import com.examen.wordle.Repository.PalabraRepository;

@Service
public abstract class PalabraServiceImpl implements PalabraService {

    @Autowired
    @Qualifier("palabra")
    public PalabraRepository palabraRepository;

    String PalabraCorrecta;

    int intentos;

    @Override
    public void setPalabraCorrecta() {
        palabraRepository.cogerPalabraCorrecta(PalabraCorrecta, intentos);
    }

    @Override
    public List<Letra> comprobar(String palabra) {
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

    @Override
    public List<String> getListPalabra() {
        return palabraRepository.getListPalabra();
    }

    @Override
    public String getPalabraPorIntento(int intento) {
        return palabraRepository.getPalabraPorIntento(intento);
    }

    @Override
    public String getPalabraCorrecta() {
        return palabraRepository.getPalabraCorrecta();
    }

    @Override
    public void clearListLetra() {
        palabraRepository.clearListLetra();
    }
}
