/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package com.mycompany.guia7ejercicio2;

import entidades.Circunferencia;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {

        System.out.println("Hello World! Esto es construir un Radio");
        System.out.print("ingrese el valor del radio :");
        
        Circunferencia circulo1 = new Circunferencia();       
        
        System.out.println("El radio ingresado es :"+circulo1.getRadio());
        System.out.println("El area de la circunferencia es de :"+circulo1.area(circulo1.getRadio()));
        System.out.println("El perimetro de la circunferencia es :"+circulo1.perimetro(circulo1.getRadio()));
        
    }

}
