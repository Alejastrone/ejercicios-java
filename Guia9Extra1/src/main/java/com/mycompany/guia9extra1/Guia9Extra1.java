/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guia9extra1;

import java.util.Scanner;


/**
 *
 * @author astr0b1te
 */
public class Guia9Extra1 {

    public static void main(String[] args) {
        System.out.println("Hello World! adivinemos el mes"); 
        
    Scanner leer = new Scanner (System.in).useDelimiter("\n");
    
    String meses[] = {"enero", "febrero", "marzo", "abril", "mayo", "junio",
            "julio", "agosto", "septiembre", "octubre", "noviembre", "diciembre"};
    String mesSecreto = meses[ (int)(Math.random()*12)];
        System.out.println(mesSecreto);
        
        System.out.println("Adivine el mes secreto. Introduzca el nombre del mes en minúsculas:\n");
        
        do {
            String messi = leer.next().toLowerCase();
            if (mesSecreto.equals(messi)) {
                System.out.println("CORRECTO");
                break;
            }else{
                System.out.println("Inténtelo nuevamente");            
            }
        } while (true);   
        
    }
}
