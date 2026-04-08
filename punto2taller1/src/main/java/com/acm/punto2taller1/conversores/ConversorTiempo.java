package com.acm.punto2taller1.conversores;

import org.springframework.stereotype.Component;

@Component
public class ConversorTiempo implements Conversor {

    @Override
    public String getTipo() {
        return "tiempo";
    }

    @Override
    public double convertir(double valor) {
        return valor * 60;
    }
}

