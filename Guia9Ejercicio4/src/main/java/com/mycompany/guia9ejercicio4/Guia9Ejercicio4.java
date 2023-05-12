/*
Vamos a usar la clase Date que ya existe en Java. Crearemos la clase
FechaService, en paquete Servicios, que tenga los siguientes métodos:

 */

package com.mycompany.guia9ejercicio4;

import java.util.Date;
import servicios.FechaService;

/**
 *
 * @author astr0b1te
 */
public class Guia9Ejercicio4 {

    public static void main(String[] args) {
        System.out.println("Hello World! veamos tu edad");
        FechaService f1 = new FechaService(); 
      Date usuario = f1.fechaNacimiento();
      Date usuario2 = f1.fechaActual();
      
        System.out.println("La fecha de nacimiento es: " + usuario + " Y la fecha actual es: " + usuario2);
        System.out.println("Su edad es: " + f1.diferencia(usuario, usuario2) );
    }
}
