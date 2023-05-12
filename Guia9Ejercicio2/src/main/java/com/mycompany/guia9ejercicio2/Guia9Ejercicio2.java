/*
Realizar una clase llamada ParDeNumeros que tenga como atributos dos
números reales con los cuales se realizarán diferentes operaciones
matemáticas. La clase debe tener un constructor vacío, getters y setters.
En el constructor vacío se usará el Math.random para generar los dos
números. Crear una clase ParDeNumerosService, en el paquete
Servicios, que deberá además implementar los siguientes métodos:

 */

package com.mycompany.guia9ejercicio2;

import entidades.ParDeNumero;
import servicios.ParDeNumeroServicio;

/**
 *
 * @author astr0b1te
 */
public class Guia9Ejercicio2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        ParDeNumero cs = new ParDeNumero();
        ParDeNumeroServicio c1 = new ParDeNumeroServicio();
        
        c1.mostrarValores(cs);
        c1.devolverMayor(cs);
        c1.calcularPotencia(cs);
        c1.calcularRaiz(cs);
    }
}
