/*
 Define variables donde puedas alojar los resultados y prueba usar dos
operadores de cada tipo.
 */
package com.mycompany.guia2;

/**
 *
 * @author astr0b1te
 */
public class Ejercicio3 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World! Mis primeras variables con valores");
        int num1 = 5;
        int num2 = 7;
        System.out.println("numero a = "+ num1 + " numero b = "+num2);
        int suma = num1 + num2;
        int resta = num1 - num2;
        System.out.println("La suma de los 2 numero da = "+ suma);
        double division = num2 / num1;
        double division2 = num1 * num2;
        System.out.println("la divicion de b entre a es = "+ division);
        boolean logico = num2 < num1;
        boolean logico2 = num2 != num1;
        System.out.println("El valor de a es mayor que b = "+logico);
        num1++;
        

}
    
}
