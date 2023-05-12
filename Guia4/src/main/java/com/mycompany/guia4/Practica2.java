/*
Diseñe una función que pida el nombre y la edad de N personas e
imprima los datos de las personas ingresadas por teclado e indique si
son mayores o menores de edad. Después de cada persona, el programa
debe preguntarle al usuario si quiere seguir mostrando personas y frenar
cuando el usuario ingrese la palabra “No”.
 */
package com.mycompany.guia4;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica2 {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String nombre;
        int edad, contador = 1;
        boolean seguir = true;

        while (seguir) {
            System.out.println("Ingrese los datos de la persona " + contador + ":");
            System.out.print("Nombre: ");
            nombre = sc.nextLine();
            System.out.print("Edad: ");
            edad = sc.nextInt();
            sc.nextLine(); // limpiar buffer de entrada
            
            System.out.println("La persona " + nombre + " tiene " + edad + " años y es " + esMayorDeEdad(edad));

            System.out.println("¿Desea ingresar los datos de otra persona? (Sí/No)");
            String respuesta = sc.nextLine();
            if (respuesta.equalsIgnoreCase("No")) {
                seguir = false;
            }
            contador++;
        }

        System.out.println("Programa finalizado.");
    }

    public static String esMayorDeEdad(int edad) {
        if (edad >= 18) {
            return "mayor de edad";
        } else {
            return "menor de edad";
        }
    }

}

    

    
