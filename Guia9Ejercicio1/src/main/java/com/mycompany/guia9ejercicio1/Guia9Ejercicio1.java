/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.guia9ejercicio1;

import entidades.Cadena;
import servicios.ServicioCadena;

/**
 *
 * @author astr0b1te
 */
public class Guia9Ejercicio1 {

    public static void main(String[] args) {
        System.out.println("Hello World! Hagamos una cadena");

        ServicioCadena Sc = new ServicioCadena();
        Cadena uno = new Cadena();
        Sc.mostrarVocales(uno);
        Sc.invertirFrase(uno);
        Sc.vecesRepetido(uno);
        Sc.compararLongitud(uno);
        Sc.unirFrases(uno);
        Sc.reemPlazar(uno);
        Sc.contiene(uno);
    }
}
