/*
 Crea una aplicación que a través de una función nos convierta una
cantidad de euros introducida por teclado a otra moneda, estas pueden
ser a dólares, yenes o libras. La función tendrá como parámetros, la
cantidad de euros y la moneda a convertir que será una cadena, este no
devolverá ningún valor y mostrará un mensaje indicando el cambio
(void).
El cambio de divisas es:
i.
ii.
iii.
* 0.86 libras es un 1 €
* 1.28611 $ es un 1 €
* 129.852 yenes es un 1 €
 */
package com.mycompany.guia4;

import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Practica3 {
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        double cantidadEuros;
        String moneda;

        System.out.println("Introduce la cantidad de euros a convertir:");
        cantidadEuros = leer.nextDouble();

        System.out.println("Introduce la moneda a la que deseas convertir (libras/dolares/yenes):");
        moneda = leer.next();

        convertirDivisas(cantidadEuros, moneda);

        leer.close();
    }

    public static void convertirDivisas(double cantidadEuros, String moneda) {
        double cantidadConvertida = 0;

        switch (moneda) {
            case "libras":
                cantidadConvertida = cantidadEuros * 0.86;
                System.out.println(cantidadEuros + " euros equivalen a " + cantidadConvertida + " libras.");
                break;
            case "dolares":
                cantidadConvertida = cantidadEuros * 1.28611;
                System.out.println(cantidadEuros + " euros equivalen a " + cantidadConvertida + " dolares.");
                break;
            case "yenes":
                cantidadConvertida = cantidadEuros * 129.852;
                System.out.println(cantidadEuros + " euros equivalen a " + cantidadConvertida + " yenes.");
                break;
            default:
                System.out.println("Moneda no valida. Introduce libras, dolares o yenes.");
        }
    }
}

    

