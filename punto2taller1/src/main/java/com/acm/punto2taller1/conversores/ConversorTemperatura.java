package com.acm.punto2taller1.conversores;

import org.springframework.stereotype.Component;

@Component
public class ConversorTemperatura implements Conversor {

    @Override
    public String getTipo() {
        return "temperatura";
    }

    @Override
    public double convertir(double valor) {
        return (valor * 9 / 5) + 32;
    }
}

