/*
 Realizar un programa que pida dos números enteros positivos por
teclado y muestre por pantalla el siguiente menú:El usuario deberá elegir
una opción y el programa deberá mostrar el resultado por pantalla y
luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en
vez de salir del programa directamente, se debe mostrar el siguiente
mensaje de confirmación: ¿Está seguro que desea salir del programa
(S/N)? Si el usuario selecciona el carácter ‘S’ se sale del programa, caso
contrario se vuelve a mostrar el menú.
 */
package com.mycompany.guia3;

import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica6 {
    
    public static void main(String[] args) {

        Scanner leer = new Scanner(System.in);
        int opcion = 0, num1 = 0, num2 = 0, resultado = 0;
        String confirmacion, confirmacionup;

        do {
            
            System.out.println("---- MENÚ ----");
            System.out.println("1. Sumar");
            System.out.println("2. Restar");
            System.out.println("3. Multiplicar");
            System.out.println("4. Dividir");
            System.out.println("5. Salir");

            
            System.out.println("Seleccione una opción: ");
            opcion = leer.nextInt();

            
            switch (opcion) {
                case 1:
                    
                    System.out.println("Ingrese el primer número: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = leer.nextInt();
                    
                    resultado = num1 + num2;
                    System.out.println("El resultado de la suma es: " + resultado);
                    break;

                case 2:
                    
                    System.out.println("Ingrese el primer número: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = leer.nextInt();
                    
                    resultado = num1 - num2;
                    System.out.println("El resultado de la resta es: " + resultado);
                    break;

                case 3:
                    
                    System.out.println("Ingrese el primer número: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = leer.nextInt();
                    
                    resultado = num1 * num2;
                    System.out.println("El resultado de la multiplicación es: " + resultado);
                    break;

                case 4:
                    
                    System.out.println("Ingrese el primer número: ");
                    num1 = leer.nextInt();
                    System.out.println("Ingrese el segundo número: ");
                    num2 = leer.nextInt();
                    
                    if (num2 == 0) {
                        System.out.println("No se puede dividir por cero");
                    } else {
                        
                        resultado = num1 / num2;
                        System.out.println("El resultado de la división es: " + resultado);
                    }
                    break;

                case 5:
                    
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    confirmacion = leer.next();
                     confirmacion = confirmacion.toUpperCase();                  
                    if  (confirmacion.equals("S")) {
                        System.out.println("Saliendo del programa...");
                        break;
                    } else {
                        
                        opcion = 0;
                    }
                    break;

                default:
                    System.out.println("Opción inválida, seleccione otra opción");
                    break;
            }

        } while (opcion < 5);

        }
}
    
