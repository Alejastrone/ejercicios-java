/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package com.mycompany.guia7extra6;

import entidades.Rectangulo;

/**
 *
 * @author astr0b1te
 */
public class Guia7Extra6 {

    public static void main(String[] args) {
        System.out.println("Hello World! Creamos un Rectangulo");

        Rectangulo rectangulo1 = new Rectangulo();

        rectangulo1.calcular_area();
        rectangulo1.dibujar_rectangulo();
    }
}
