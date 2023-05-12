/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class PersonaServicios {
    
    private Scanner leer = new Scanner(System.in);    
    
     public Persona crearPersona(){
         System.out.print("Ingrese el nombre: ");
        String nombre = leer.next();
        System.out.print("Ingrese el apellido: ");
        String apellido = leer.next();
        System.out.print("Ingrese la edad: ");
        int edad = leer.nextInt();
        System.out.print("Ingrese la altura: ");
        double altura = leer.nextDouble();
        System.out.print("Ingrese la nacionalidad: ");
        String nacionalidad = leer.next();
        
        return new Persona(nombre, apellido, edad, altura, nacionalidad);
        
       
}
    
}
