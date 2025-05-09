package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.controller;

import com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services.SaludadorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class MainController {

    @Autowired
    SaludadorService saludadorService;

    @GetMapping("/")
    public String saludar(@RequestParam String nombre, Model model) {
        //Ejemplo http://localhost:8080/?nombre=Jonathan
        String saludo = saludadorService.getSaludo(nombre);
        model.addAttribute("texto",saludo);
        return "hello";
    }
}
