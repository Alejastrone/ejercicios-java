/*
Realice un programa que compruebe si una matriz dada es antisimétrica.
Se dice que una matriz A es antisimétrica cuando ésta es igual a su
propia traspuesta, pero cambiada de signo. Es decir, A es antisimétrica si
A = -AT. La matriz traspuesta de una matriz A se denota por AT y se
obtiene cambiando sus filas por columnas (o viceversa).
 */
package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica5 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        int[][] matrizA = new int[3][3];
        int[][] matrizAt = new int[3][3];
        int[][] matrizAx = new int[3][3];
        int[][] matrizAtx = new int[3][3];
        System.out.println("Introduce los elementos de la matriz:");
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizA[i][j] = sc.nextInt();
            }
        }
        for (int j = 0; j < 3; j++) {
            for (int i = 0; i < 3; i++) {
                matrizAt[i][j] = matrizA[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        
         for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                matrizAx[i][j] = matrizAt[i][j];
            }
            System.out.println("");
         }
             for (int j = 0; j < 3; j++) {
                for (int i = 0; i < 3; i++) {
                    matrizAtx[i][j] = matrizAx[i][j];        
         }
                
                if ( matrizA == matrizAtx){
                    System.out.println("La MAtriz es antisimétrica");}
                    
                else{
                        System.out.println("La Matriz no es antisimetrica");
                        }
                    
                }
    }
}

