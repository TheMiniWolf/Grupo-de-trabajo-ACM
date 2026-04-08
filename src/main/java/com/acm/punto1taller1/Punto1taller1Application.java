package com.acm.punto1taller1;

import com.acm.punto1taller1.monitoreo.SistemaMonitoreo;
import com.acm.punto1taller1.config.ConfiguracionAplicacion;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Punto1taller1Application {

    public static void main(String[] args) {
        try (AnnotationConfigApplicationContext contexto =
                     new AnnotationConfigApplicationContext(ConfiguracionAplicacion.class)) {
            SistemaMonitoreo sistemaMonitoreo = contexto.getBean(SistemaMonitoreo.class);
            String alertaCritica = sistemaMonitoreo.ejecutarMonitoreo("Evento critico: Servidor principal sin respuesta");
            String alertaInformativa = sistemaMonitoreo.ejecutarMonitoreo("Evento informativo: Reinicio programado");

            System.out.println(alertaCritica);
            System.out.println(alertaInformativa);
        }
    }
}
