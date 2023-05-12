/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se
debe salir del bucle y mostrar el mensaje "Se capturó el numero cero". El
programa deberá calcular y mostrar el resultado de la suma de los números
leídos, pero si el número es negativo no debe sumarse.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicios4 {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int suma = 0;
        int numero;

        for (int i = 1; i <= 20; i++) {
            System.out.print("Ingrese un número: ");
            numero = scanner.nextInt();

            if (numero == 0) {
                System.out.println("Se capturó el número cero.");
                break;
            }

            if (numero > 0) {
                suma += numero;
            }
        }

        System.out.println("La suma de los números positivos ingresados es: " + suma);
    }
}
