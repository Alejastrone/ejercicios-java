
package com.mycompany.guia7ejercicio4;

import entidades.Rectangulo;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! creemos un rectangulo");
        // Creacion o identacion del Objeto 
        Rectangulo cuadrado = new Rectangulo();   
        // Invocaion o llamado del Molde o clase
        cuadrado.Rectangulo();
        // Mostrar por pantalla lo requerido
        System.out.println(cuadrado.Perimetro(cuadrado.getAltura(), cuadrado.getBase()));
        System.out.println(cuadrado.Superficie(cuadrado.getAltura(), cuadrado.getBase()));
        cuadrado.Dibu(cuadrado.getAltura(), cuadrado.getBase());
    }
    
}
    

