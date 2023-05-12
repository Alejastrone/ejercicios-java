/*
 Escribir un programa que lea un número entero por teclado y muestre
por pantalla el doble, el triple y la raíz cuadrada de ese número.
 */
package com.mycompany.guia2;
import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica5 {
    public static void main(String[] args) {
        
        Scanner input = new Scanner(System.in);        
        
        System.out.print("Ingrese un número entero: ");
        int num = input.nextInt();        
        
        int doble = num * 2;
        int triple = num * 3;
        double raizCuadrada = Math.sqrt(num);        
        
        System.out.println("El doble de " + num + " es " + doble);
        System.out.println("El triple de " + num + " es " + triple);
        System.out.println("La raíz cuadrada de " + num + " es " + raizCuadrada);
    }
}
