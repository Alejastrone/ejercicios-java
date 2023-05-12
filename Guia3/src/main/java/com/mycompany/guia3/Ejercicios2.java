/*
Considera que estás desarrollando una web para una empresa que fabrica
motores (suponemos que se trata del tipo de motor de una bomba para mover
fluidos). Definir una variable tipoMotor y permitir que el usuario ingrese un valor
entre 1 y 4. El programa debe mostrar lo siguiente:
o Si el tipo de motor es 1, mostrar un mensaje indicando “La bomba es
una bomba de agua”.
o Si el tipo de motor es 2, mostrar un mensaje indicando “La bomba es
una bomba de gasolina”.
o Si el tipo de motor es 3, mostrar un mensaje indicando “La bomba es
una bomba de hormigón”.
o Si el tipo de motor es 4, mostrar un mensaje indicando “La bomba es
una bomba de pasta alimenticia”.
o Si no se cumple ninguno de los valores anteriores mostrar el mensaje
“No existe un valor válido para tipo de bomba”
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicios2 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Elija una de las 4 opcines de bomba ");
        Scanner leer = new Scanner(System.in);
        int bomba;
        
        bomba = leer.nextInt();
        
        switch (bomba) {
                case 1:
                        System.out.println("La bomba es\n" +
"una bomba de agua");
                        break;
                case 2:
                        System.out.println("La bomba es\n" +
"una bomba de gasolina");
                        break;
                case 3:
                        System.out.println("La bomba es\n" +
"una bomba de hormigón");
                        break;
                case 4:
                        System.out.println("La bomba es\n" +
"una bomba de pasta alimenticia");
                        break;               
                default:
                        System.out.println("No existe un valor válido para tipo de bomba");
        
    
}
}
}