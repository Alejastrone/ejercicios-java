/*
 Crea un vector llamado ‘Equipo’ cuya dimensión sea la cantidad de compañeros
de equipo y define su tipo de dato de tal manera que te permita alojar sus
nombres más adelante.
Utilizando un Bucle for, aloja en el vector Equipo, los nombres de tus
compañeros de equipo
 */

package com.mycompany.guia5;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicio1 {

    public static void main(String[] args) {
      
        Scanner leerN = new Scanner(System.in);
        Scanner leerNom = new Scanner(System.in);
        System.out.println("Ingrese la cantidad de integrantes");
        int cant = leerN.nextInt();
        String[] equipo = new String[cant];
        for (int i = 0; i < cant; i++) {
            System.out.println("Ingrese el nombre de la persona " + (i + 1));
            equipo[i] = leerNom.nextLine();
        }
        System.out.println("");

        for (int i = 0; i < cant; i++) {
            System.out.print(" " + equipo[i] + " ");

        }
        System.out.println("");

        for (String elemento : equipo) {        // Este es el for especial para recorrer toda la matriz
            System.out.print(" " + elemento + " ");
        }

    }
}
    

