/*
Realizar un algoritmo que llene un vector de tamaño N con valores
aleatorios y le pida al usuario un número a buscar en el vector. El
programa mostrará dónde se encuentra el numero y si se encuentra
repetido
 */
package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica2 {
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del vector");
        int tamVector = sc.nextInt();
        int[] vector = new int[tamVector];
        for (int i = 0; i < tamVector; i++) {
            vector[i] = (int) (Math.random() * 100 + 1);
            //Math.random()  
        }
        for (int elemento : vector) {
            System.out.println(" [ " + elemento + " ] ");
        }
        System.out.println(" Ingrese el número que desea buscar");
        int numBuscar = sc.nextInt();

        int cont = 0;
        for (int i = 0; i < tamVector; i++) {
            if (vector[i] == numBuscar) {
                System.out.println("El número " + numBuscar + "\n"
                        + "Se encuentra en la posición " + i);
                cont++;
            }
        }
        if (cont == 0) {
            System.out.println("El número que ingreso no se encuentra");
        }else{
            System.out.println("El número se ha encontrado " + cont + " veces");
        }       
    }

}
