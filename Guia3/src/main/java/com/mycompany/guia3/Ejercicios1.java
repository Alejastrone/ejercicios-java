/*
Implementar un programa que le pida dos números enteros al usuario y
determine si ambos o alguno de ellos es mayor a 25.
 */

package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicios1 {

    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese 2 valores del 0 al 100");
        Scanner leer = new Scanner(System.in); 
        
        int num1, num2;
        num1 = leer.nextInt();
        num2 = leer.nextInt();
        
        if (num1 > 25){        
            System.out.println("El valor del primer numero "+num1+" es mayor que 25");            
        }else {
            System.out.println("El valor del primer numero "+num1+" es menor que 25");            
        }
        if (num2 > 25){        
            System.out.println("El valor del segundo numero "+num2+" es mayor que 25");            
        }else {
            System.out.println("El valor del segundo numero "+num2+" es menor que 25");            
        }
    }
}
