/*
Crear un programa que dado un número determine si es par o impar.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica1 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese un valor");
        Scanner leer = new Scanner(System.in);
        int num;
        
        num = leer.nextInt();
        
        if (num % 2 == 0){
            
           System.out.println("el valor "+num+" ingresado es par");           
        } else { 
            System.out.println("el valor "+num+" ingresado es IN-par");
        }
    }  
}
