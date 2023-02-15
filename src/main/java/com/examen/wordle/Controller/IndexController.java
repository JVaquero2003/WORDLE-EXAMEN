package com.examen.wordle.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.examen.wordle.Model.Jugador;
import com.examen.wordle.Model.Letra;
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
        palabraService.setPalabraCorrecta();
        palabraService.clearListLetra();
        ModelAndView mav = new ModelAndView("index");
        Palabra palabraInsertada = new Palabra();
        Jugador jugador = new Jugador();
        mav.addObject("intentosRestantes", palabraService.getIntentosRestantes());
        mav.addObject("intentosUsados", palabraService.getIntentos());
        mav.addObject("palabraInsertada", palabraInsertada);
        mav.addObject("jugador", jugador);
        return mav;
    }

    @GetMapping("/wordle")
    public ModelAndView goToWordle() {
        ModelAndView mav = new ModelAndView("wordle");
        mav.addObject("listPalabra", palabraService.getListPalabra());
        return mav;
    }

    @PostMapping("wordle")
    public ModelAndView goToWordle(@ModelAttribute("palabraInsertada") Palabra palabraInsertada) {
        System.out.println(palabraInsertada);
        ModelAndView mav = new ModelAndView("wordle");
        List<Letra> resultado = palabraService.comprobar(palabraInsertada.getPalabra());
        mav.addObject("listPalabra", palabraService.getListPalabra());
        mav.addObject("resultado", resultado);
        return mav;
    }

    @PostMapping("ranking")
    public ModelAndView goToRanking(@RequestParam("intento") int intento) {
        ModelAndView mav = new ModelAndView("wordle");
        mav.addObject("listPalabra", palabraService.getListPalabra());
        mav.addObject("listPalabraPorIntento", palabraService.getPalabraPorIntento(intento));
        return mav;
    }
}
