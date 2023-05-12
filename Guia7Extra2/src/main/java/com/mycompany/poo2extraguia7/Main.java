/*
Definir una clase llamada Puntos que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Puntos. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */

package com.mycompany.poo2extraguia7;

import entidades.Punto;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Claculemos la distancia");
        
        Punto d1 = new Punto();
        d1.crearPunto();
        
        System.out.println("LA distancia es de :"+d1.distancia(d1.getX1(), d1.getX2(),d1.getY1(),d1.getY2()));
    }
}
