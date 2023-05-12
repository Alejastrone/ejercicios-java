/*
Realizar un algoritmo que llene un vector con los 100 primeros números
enteros y los muestre por pantalla en orden descendente.
 */
package com.mycompany.guia5;

/**
 *
 * @author astr0b1te
 */
public class Practica1 {
    public static void main(String[] args) {
        // TODO code application logic here
        int[] vector = new int[100];
        for (int i = 0; i < 100 ; i++) {
            vector [i] = i + 1; 
        } 
        System.out.println(" ");
        
        for (int i = 99; i >= 0; i--) {
            System.out.println(vector [i]) ;
        }
        System.out.println(" ");
    }  
}
