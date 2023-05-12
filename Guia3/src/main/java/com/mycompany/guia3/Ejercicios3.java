/*
Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0
y 10 la nota se pedirá de nuevo hasta que la nota sea correcta.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicios3 {
    
    public static void main(String[] args) {        
        System.out.println("Hello World!, Ingrese la nota del alumno del 0 al 10 ");
        Scanner leer = new Scanner(System.in);
        int num1;
        num1 = -1;
        
        while (num1<0 || num1>10) {
            num1 = leer.nextInt();
                 if (num1<0 || num1>10){
                          System.out.println("Hello World!, Ingrese un valor valido ");
                          
                          }                
                 }
         System.out.println("La nota ingresada es: " + num1);       
    
        }
}