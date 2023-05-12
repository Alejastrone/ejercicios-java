/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas
y después toda en minúsculas.
 */
package com.mycompany.guia2;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica3 {
     public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String frase;
        
        System.out.println("Ingrese una frase");
        frase = leer.nextLine();
        System.out.println(frase.toUpperCase());
        System.out.println(frase.toLowerCase());
    
}
}