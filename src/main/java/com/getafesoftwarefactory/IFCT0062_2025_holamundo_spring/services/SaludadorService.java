package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services;

import org.springframework.stereotype.Service;

@Service
public class SaludadorService {
    public String getSaludo(String nombre){
        return "Hola " + nombre;
    }
}
