package com.acm.punto2taller1;

import com.acm.punto2taller1.conversores.ConversorPrincipal;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.Scanner;

public class Punto2taller1Application {

    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(Configuracion.class);
        ConversorPrincipal conversorPrincipal = context.getBean(ConversorPrincipal.class);

        try (Scanner entrada = new Scanner(System.in)) {
            System.out.println("Por favor ingrese el valor en celsius para convertir a fahrenheit");
            double valorCelsius = entrada.nextDouble();

            System.out.println("Por favor ingrese el valor en kilometros para convertir a millas");
            double valorKilometros = entrada.nextDouble();

            System.out.println("Por favor ingrese el valor en horas para convertir a minutos");
            double valorHoras = entrada.nextDouble();

            double resultadoTemperatura = conversorPrincipal.convertir("temperatura", valorCelsius);
            double resultadoDistancia = conversorPrincipal.convertir("distancia", valorKilometros);
            double resultadoTiempo = conversorPrincipal.convertir("tiempo", valorHoras);

            System.out.println("Convirtiendo temperatura de celsius a fahrenheit");
            System.out.println("Resultado final: " + resultadoTemperatura);

            System.out.println("Convirtiendo distancia de kilometros a millas");
            System.out.println("Resultado final: " + resultadoDistancia);

            System.out.println("Convirtiendo tiempo de horas a minutos");
            System.out.println("Resultado final: " + resultadoTiempo);
        }
    }

}
