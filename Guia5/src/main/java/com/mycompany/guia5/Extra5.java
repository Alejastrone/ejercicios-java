/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Extra5 {
    public static void main(String[] args) {
        // TODO code application logic here       
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese filas: ");
        int m = input.nextInt();
        System.out.print("Ingrese columnas: ");
        int n = input.nextInt();
        int suma = 0;
        System.out.println("");
        int[][] matriz = llenarMatriz(m, n);
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(" [" + matriz[i][j] + "]");
                suma += matriz[i][j];
            }
            System.out.println("");
        }
        System.out.println("");
        System.out.println("La suma de todos los números es: " + suma);
    }

    public static int[][] llenarMatriz(int m, int n) {

        int[][] matriz = new int[m][n];
        Random rand = new Random();
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                matriz[i][j] = rand.nextInt(11);
            }
        }
        return matriz;
    }
}
    

