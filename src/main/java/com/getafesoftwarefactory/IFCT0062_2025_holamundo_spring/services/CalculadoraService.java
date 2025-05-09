package com.getafesoftwarefactory.IFCT0062_2025_holamundo_spring.services;

import org.springframework.stereotype.Service;

@Service
public class CalculadoraService {
    public Integer sumar(Integer sumando1, Integer sumando2) {
        return sumando1 + sumando2;
    }
}
