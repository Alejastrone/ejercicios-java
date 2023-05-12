/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */

package com.mycompany.guia7extra5;

import entidades.Empleado;

/**
 *
 * @author astr0b1te
 */
public class Guia7Extra5 {

    public static void main(String[] args) {
        System.out.println("Hello World! Calculemos el salario");
        
        Empleado e1 = new Empleado();
        
        e1.calcular_aumento();
    }
}
