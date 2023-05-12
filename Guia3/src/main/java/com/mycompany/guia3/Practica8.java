/*
Dibujar un cuadrado de N elementos por lado utilizando el carácter “*”.
Por ejemplo, si el cuadrado tiene 4 elementos por lado se deberá dibujar
lo siguiente:
*****
*      *
*      *
*      *
*      *
*****
 */
package com.mycompany.guia3;

import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica8 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el número de elementos por lado del cuadrado: ");
        int n = input.nextInt();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == 0 || i == n -1 || j == 0 || j == n - 1) {
                    System.out.print("*");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
    }
    
}
