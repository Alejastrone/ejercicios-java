/*
 Dada una cantidad de grados centígrados se debe mostrar su
equivalente en grados Fahrenheit. La fórmula correspondiente es: F = 32
+ (9 * C / 5).
 */
package com.mycompany.guia2;

import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica4 {
    
    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        double fahrenheit, celsius;
        
        System.out.println("Ingrese los grados celsius reales");
        
         celsius  = leer.nextDouble();
        fahrenheit = (celsius * 9/5) + 32;
        System.out.println(celsius + " grados Celsius son " + fahrenheit + " grados Fahrenheit.");
    
}
}