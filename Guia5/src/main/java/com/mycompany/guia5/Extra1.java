/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Extra1 {
    public static void main(String[] args) {
    Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leerNum.nextInt();
        
        int[] vector = new int [N];
        int suma = 0;
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un número");  
            vector [i] = leerNum.nextInt();            
            suma += vector [i];
        }
        for (int i = 0; i < N; i++) {
            System.out.print( " [" + vector [i] + "] "); 
    } 
        System.out.println(" ");
        System.out.println("La suma de los números es: " + suma);
}
}