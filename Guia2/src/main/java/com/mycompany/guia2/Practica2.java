/*
 Escribir un programa que pida tu nombre, lo guarde en una variable y lo
muestre por pantalla.
 */
package com.mycompany.guia2;
import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica2 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        String nombre;
        
        System.out.println("Hello World! Ingrese su nombre");        
        nombre = leer.nextLine();
                       
        System.out.println("Mi nombre es  "+ nombre);
    
}
}