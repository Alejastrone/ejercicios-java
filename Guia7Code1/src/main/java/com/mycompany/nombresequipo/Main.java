package com.mycompany.nombresequipo;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Main {  // Clase Main

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner leer = new Scanner(System.in);

        Persona persona1 = new Persona();
        System.out.print("Ingrese el nombre de la persona: ");
        persona1.nombre = leer.next();
        System.out.print("Ingrese el apellido de la persona: ");
        persona1.apellido = leer.next();
        System.out.print("Ingrese la edad de la persona: ");
        persona1.edad = leer.nextInt();
        System.out.print("Ingrese la nacionalidad de la persona: ");
        persona1.nacion = leer.next();
        System.out.println("Finalizado");
        

        
        System.out.println(persona1.nombre);
        System.out.println(persona1.apellido);
        System.out.println(persona1.edad);
        System.out.println(persona1.nacion);
        
    }

}
