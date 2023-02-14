package com.examen.wordle.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

import com.examen.wordle.Model.Jugador;
import com.examen.wordle.Model.Palabra;
import com.examen.wordle.Service.JugadorService;
import com.examen.wordle.Service.PalabraService;

@Controller
public class IndexController {

    public PalabraService palabraService;
    public JugadorService jugadorService;

    @Autowired
    public IndexController(PalabraService palabraService, JugadorService jugadorService) {
        this.palabraService = palabraService;
        this.jugadorService = jugadorService;
    }

    @GetMapping("/")
    public ModelAndView goToIndex() {
        ModelAndView mav = new ModelAndView("index");
        Palabra palabraInsertada = new Palabra();
        Jugador jugador = new Jugador();
        mav.addObject("intentosRestantes", palabraService.getIntentosRestantes());
        mav.addObject("intentosUsados", palabraService.getIntentos());
        mav.addObject("palabraInsertada", palabraInsertada);
        mav.addObject("jugador", jugador);
        return mav;
    }

    @PostMapping("wordle")
    public ModelAndView goToWordle(@ModelAttribute("palabraInsertada") Palabra palabraInsertada) {
        System.out.println(palabraInsertada);
        ModelAndView mav = new ModelAndView("wordle");
        String resultado = palabraService.comprobar(palabraInsertada.getPalabra());
        mav.addObject("resultado", resultado);
        return mav;
    }
}
