/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */

package com.mycompany.guia7extra4;

import entidades.Cuenta;

/**
 *
 * @author astr0b1te
 */
public class Guia7Extra4 {

    public static void main(String[] args) {
        System.out.println("Hello World! Retiremos de nuestra cuenta");
        
        Cuenta c1 = new Cuenta();
        
        c1.retirar_dinero();
        
        System.out.println("Monto restante :"+c1.getSaldo());
        
        
    }
}
