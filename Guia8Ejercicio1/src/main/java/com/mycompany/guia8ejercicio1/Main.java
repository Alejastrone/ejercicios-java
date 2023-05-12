
package com.mycompany.guia8ejercicio1;

import entidades.Cuenta;
import java.util.Scanner;
import servicios.CuentaServicio;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Abramos una cuenta de banco");
        
        CuentaServicio cb = new CuentaServicio();
        Cuenta c1 = cb.crearCuenta();
        int opcion = 0;
        do{
        System.out.println("Opcion 1 = Crear cuenta");
        System.out.println("Opcion 2 = Ingresar saldo");
        System.out.println("Opcion 3 = Retirar saldo");
        System.out.println("Opcion 4 = Retiro rapido 20%");
        System.out.println("Opcion 5 = Consultar saldo");
        System.out.println("Opcion 6 = Consultar Datos");
        System.out.println("Opcion 7 = Salir");
        System.out.println("");
        System.out.println("Ingrese una opcion");
        
        Scanner leer = new Scanner(System.in);
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
                cb.crearCuenta();               
                break;               
           case 2:
               cb.ingresarSaldo(c1);               
                break;
           case 3:
               cb.retirarSaldo(c1);               
                break;
           case 4:
                cb.retiroRapido(c1);                
                break;
           case 5:
               cb.consultarSaldo(c1);               
                break;
           case 6:
               cb.consultarDatos(c1);               
                break;
            case 7:               
                break;    
            default:
                throw new AssertionError();
        } 
        } while (opcion!=8);
    }
    
}
