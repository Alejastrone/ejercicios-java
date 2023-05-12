/*
 Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima
el número ingresado seguido de tantos asteriscos como indique su valor. Por
ejemplo:
5 *****
3 ***
11 ***********
2 **
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicios5 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese 4 valores del 1 al 20");
        Scanner leer = new Scanner(System.in);
        int num, num1, num2, num3;
        num = leer.nextInt();
        num1 = leer.nextInt();
        num2= leer.nextInt();
        num3= leer.nextInt();
        
        System.out.print(num+" ");
        for (int i = 0; i < num; i++) {            
            System.out.print("*");    
           
        }     
         System.out.println("");
        System.out.print(num1+" ");
        for (int i = 0; i < num1; i++) {            
            System.out.print("*");
            
        }
        System.out.println("");
        System.out.print(num2+" ");
        for (int i = 0; i < num2; i++) {            
            System.out.print("*");
            
            
        } 
        System.out.println("");
        System.out.print(num3+" ");
        for (int i = 0; i < num3; i++) {            
            System.out.print("*");
            
            
        }     
        
        
}
}
    

