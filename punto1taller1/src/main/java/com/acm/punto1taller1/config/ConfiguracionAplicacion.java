package com.acm.punto1taller1.config;

import com.acm.punto1taller1.alerta.GeneradorAlerta;
import com.acm.punto1taller1.alerta.GeneradorAlertaCritica;
import com.acm.punto1taller1.alerta.GeneradorAlertaInformativa;
import com.acm.punto1taller1.alerta.GeneradorAlertaPorTipoEvento;
import com.acm.punto1taller1.monitoreo.SistemaMonitoreo;
import com.acm.punto1taller1.monitoreo.SistemaMonitoreoImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfiguracionAplicacion {

    @Bean
    public GeneradorAlertaCritica generadorAlertaCritica() {
        return new GeneradorAlertaCritica();
    }

    @Bean
    public GeneradorAlertaInformativa generadorAlertaInformativa() {
        return new GeneradorAlertaInformativa();
    }

    @Bean
    public GeneradorAlerta generadorAlerta(GeneradorAlertaCritica generadorAlertaCritica,GeneradorAlertaInformativa generadorAlertaInformativa) {
        return new GeneradorAlertaPorTipoEvento(generadorAlertaCritica, generadorAlertaInformativa);
    }

    @Bean
    public SistemaMonitoreo sistemaMonitoreo(GeneradorAlerta generadorAlerta) {
        return new SistemaMonitoreoImpl(generadorAlerta);
    }
}

