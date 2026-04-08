package com.acm.punto2taller1.conversores;

import org.springframework.stereotype.Component;

@Component
public class ConversorDistancia implements Conversor {

    @Override
    public String getTipo() {
        return "distancia";
    }

    @Override
    public double convertir(double valor) {
        return valor * 0.621371;
    }
}

