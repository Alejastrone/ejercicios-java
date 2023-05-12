/*
Realizar un programa que solo permita introducir solo frases o palabras
de 8 de largo. Si el usuario ingresa una frase o palabra de 8 de largo se
deberá de imprimir un mensaje por pantalla que diga “CORRECTO”, en
caso contrario, se deberá imprimir “INCORRECTO”. Nota: investigar la
función Lenght() en Java.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica3 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese una palabra de 8 caracteres");
        Scanner leer = new Scanner(System.in);
        String frase;
        
        frase = leer.nextLine();
        int length = frase.length();
        
        if (length == 8){
            System.out.println("Felicidades usted ingreso la palabra de 8 caracteres");
            
        }else{            
            System.out.println("Usted ingreso una palabra que no contiene 8 caracteres");
            
        }
        
    
}
}