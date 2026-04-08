package com.acm.punto1taller1.alerta;

public class GeneradorAlertaCritica implements GeneradorAlerta {

    @Override
    public String generarAlerta(String evento) {
        return "Alerta critica: " + evento;
    }
}

