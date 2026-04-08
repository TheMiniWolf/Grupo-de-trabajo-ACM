package com.acm.punto2taller1.conversores;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class ConversorPrincipal {

    private final Conversor conversorTemperatura;
    private final Conversor conversorDistancia;
    private final Conversor conversorTiempo;

    public ConversorPrincipal(@Qualifier("conversorTemperatura") Conversor conversorTemperatura,
                              @Qualifier("conversorDistancia") Conversor conversorDistancia,
                              @Qualifier("conversorTiempo") Conversor conversorTiempo) {
        this.conversorTemperatura = conversorTemperatura;
        this.conversorDistancia = conversorDistancia;
        this.conversorTiempo = conversorTiempo;
    }

    public double convertir(String tipo, double valor) {
        if (tipo == null || tipo.isBlank()) {
            throw new IllegalArgumentException("El tipo de conversion no puede estar vacio");
        }

        if (tipo.equalsIgnoreCase("temperatura")) {
            return conversorTemperatura.convertir(valor);
        }

        if (tipo.equalsIgnoreCase("distancia")) {
            return conversorDistancia.convertir(valor);
        }

        if (tipo.equalsIgnoreCase("tiempo")) {
            return conversorTiempo.convertir(valor);
        }

        throw new IllegalArgumentException("No existe conversor para el tipo: " + tipo);
    }
}

