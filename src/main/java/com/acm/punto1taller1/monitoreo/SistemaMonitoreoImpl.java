package com.acm.punto1taller1.monitoreo;

import com.acm.punto1taller1.alerta.GeneradorAlerta;

public class SistemaMonitoreoImpl implements SistemaMonitoreo {

    private final GeneradorAlerta generadorAlerta;

    public SistemaMonitoreoImpl(GeneradorAlerta generadorAlerta) {
        this.generadorAlerta = generadorAlerta;
    }

    @Override
    public String ejecutarMonitoreo(String evento) {
        return generadorAlerta.generarAlerta(evento);
    }
}

