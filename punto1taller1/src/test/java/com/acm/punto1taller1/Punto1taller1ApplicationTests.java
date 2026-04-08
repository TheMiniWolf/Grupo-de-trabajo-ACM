package com.acm.punto1taller1;

import com.acm.punto1taller1.config.ConfiguracionAplicacion;
import com.acm.punto1taller1.monitoreo.SistemaMonitoreo;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import static org.junit.jupiter.api.Assertions.assertTrue;

class Punto1taller1ApplicationTests {

    @Test
    void debeGenerarAlertaCritica() {
        try (AnnotationConfigApplicationContext contexto =
                     new AnnotationConfigApplicationContext(ConfiguracionAplicacion.class)) {
            SistemaMonitoreo sistemaMonitoreo = contexto.getBean(SistemaMonitoreo.class);
            String alerta = sistemaMonitoreo.ejecutarMonitoreo("Evento critico: Fallo de base de datos");
            assertTrue(alerta.contains("Alerta critica"));
        }
    }

    @Test
    void debeGenerarAlertaInformativa() {
        try (AnnotationConfigApplicationContext contexto =
                     new AnnotationConfigApplicationContext(ConfiguracionAplicacion.class)) {
            SistemaMonitoreo sistemaMonitoreo = contexto.getBean(SistemaMonitoreo.class);
            String alerta = sistemaMonitoreo.ejecutarMonitoreo("Evento informativo: Mantenimiento exitoso");
            assertTrue(alerta.contains("Alerta informativa"));
        }
    }
}

