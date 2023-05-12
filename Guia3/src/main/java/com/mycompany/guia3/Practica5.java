/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a
continuación solicite números al usuario hasta que la suma de los
números introducidos supere el límite inicial.
 */
package com.mycompany.guia3;

import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica5 {
    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);

        System.out.print("Ingrese un valor limite: ");
        int limite = leer.nextInt();

        int suma = 0;
        int num;

        while (suma <= limite) {
            System.out.print("Ingrese un numero: ");
            num = leer.nextInt();
            suma += num;
        }

        System.out.println("La suma de los numeros introducidos es " + suma);
    }
}
    

