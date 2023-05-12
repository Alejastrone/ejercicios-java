/*
Escribir un programa que pida dos números enteros por teclado y calcule
la suma de los dos. El programa deberá después mostrar el resultado de
la suma
 */
package com.mycompany.guia2;
import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica1 {
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        
        System.out.println("Ingrese 2 numeros enteros");
        int num1 = leer.nextInt();
        int num2 = leer.nextInt();
        
        int total = num1 + num2;
        System.out.println("El total de la suma es = "+ total);
    
}
}