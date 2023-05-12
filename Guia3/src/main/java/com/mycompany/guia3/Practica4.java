/*
Escriba un programa que pida una frase o palabra y valide si la primera
letra de esa frase es una ‘A’. Si la primera letra es una ‘A’, se deberá de
imprimir un mensaje por pantalla que diga “CORRECTO”, en caso
contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la función
Substring y equals() de Java.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica4 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese una palabra");
        Scanner leer = new Scanner(System.in);
        String frase, letra;
        
        frase = leer.nextLine();
        System.out.println(frase);
        frase = frase.toUpperCase();
        System.out.println(frase);
        letra = frase.substring(0, 1);
        System.out.println(letra);
        boolean igual = letra.equals("A");
        System.out.println(igual);
        
        if (igual){
            System.out.println("Felicidades usted ingreso la palabra que inicia con A");
            
        }else{            
            System.out.println("Usted ingreso una palabra que no inicia en A");
            
        }
    
}
}