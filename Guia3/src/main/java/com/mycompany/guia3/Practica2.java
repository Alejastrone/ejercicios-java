/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el
programa pondrá un mensaje de Correcto, sino mostrará un mensaje de
Incorrecto. Nota: investigar la función equals() en Java.
 */
package com.mycompany.guia3;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Practica2 {
    
    public static void main(String[] args) {
        
        System.out.println("Hello World!, Ingrese una palabra y si esa palabra es igual a “eureka”");
        Scanner leer = new Scanner(System.in);
        String frase, eureka;
        
        frase = leer.nextLine();
        
        if (frase.equals("eureka")){
            System.out.println("Felicidades usted ingreso la palabra “eureka”");
            
        }else{            
            System.out.println("Usted ingreso "+frase+" y es diferente  a “eureka”");
            
        }
}
}