/*
 
 */
package com.mycompany.guia9ejercicio5;

import entidades.Persona;
import java.util.Date;
import servicios.PersonaService;

/**
 *
 * @author astr0b1te
 */
public class Guia9Ejercicio5 {

    public static void main(String[] args) {
        System.out.println("Hello World! ingresemos los datos de una persona y veamos su edad");

        PersonaService ps = new PersonaService();
        Persona p1 = ps.crearPersona();        
        Date a = ps.fechaNacimiento();
        Date b = ps.fechaActual();
        System.out.println("La Edad de " + p1.getNombre() + " es de " + ps.calcularEdad(a, b));
        ps.menorQue();
                
    }
}
