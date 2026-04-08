package com.acm.punto1taller1.alerta;

public class GeneradorAlertaPorTipoEvento implements GeneradorAlerta {

    private final GeneradorAlerta generadorAlertaCritica;
    private final GeneradorAlerta generadorAlertaInformativa;

    public GeneradorAlertaPorTipoEvento(
            GeneradorAlerta generadorAlertaCritica,
            GeneradorAlerta generadorAlertaInformativa) {
        this.generadorAlertaCritica = generadorAlertaCritica;
        this.generadorAlertaInformativa = generadorAlertaInformativa;
    }

    @Override
    public String generarAlerta(String evento) {
        if (esEventoCritico(evento)) {
            return generadorAlertaCritica.generarAlerta(evento);
        }

        return generadorAlertaInformativa.generarAlerta(evento);
    }

    private boolean esEventoCritico(String evento) {
        return evento != null && evento.toUpperCase().contains("CRITICO");
    }
}

