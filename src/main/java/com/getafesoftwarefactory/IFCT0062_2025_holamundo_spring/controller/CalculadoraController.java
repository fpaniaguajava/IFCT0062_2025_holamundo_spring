package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.controller;

import com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services.CalculadoraService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculadoraController {

    private CalculadoraService calculadoraService;
    public CalculadoraController(CalculadoraService calculadoraService){
        this.calculadoraService = calculadoraService;
    }

    @GetMapping("/sumar")
    public String sumar(Model model, @RequestParam Integer sumando1, @RequestParam Integer sumando2) {
        Integer resultado = this.calculadoraService.sumar(sumando1, sumando2);
        model.addAttribute("resultado", resultado);
        return "resultado";
    }

}
