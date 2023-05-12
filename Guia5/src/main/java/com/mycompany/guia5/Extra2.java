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
public class Extra2 {
    
 public static void main(String[] args) {
        // TODO code application logic here
        Scanner leerNum = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int N = leerNum.nextInt();

        int[] vector1 = new int[N];
        int[] vector2 = new int[N];
        
        System.out.println(" ");
        System.out.println("Llenando el primer vector");
       
        for (int i = 0; i < N; i++) {   
            System.out.println("Ingrese un número");
            vector1[i] = leerNum.nextInt();
        }
         System.out.println(" ");
         System.out.println("Llenando el segundo vector");
           
        for (int i = 0; i < N; i++) {
            System.out.println("Ingrese un número");
            vector2[i] = leerNum.nextInt();
        }
        boolean iguales = true;
        for (int i = 0; i < N; i++) {
            if (vector1[i] != vector2[i]) {
                iguales = false; 
            }
        }
        if (iguales) {
            System.out.println("Los vectores son iguales");
        } else {
            System.out.println("Los vectores no son iguales");
        }    
}
}