package com.acm.punto1taller1.alerta;

public class GeneradorAlertaInformativa implements GeneradorAlerta {

    @Override
    public String generarAlerta(String evento) {
        return "Alerta informativa: " + evento;
    }
}

