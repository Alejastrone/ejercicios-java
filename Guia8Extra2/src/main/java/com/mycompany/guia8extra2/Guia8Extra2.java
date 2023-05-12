/*
Dígito Verificador. Crear una clase NIF que se usará para mantener DNIs
con su correspondiente letra (NIF). Los atributos serán el número de DNI
(entero largo) y la letra (String o char) que le corresponde. 
 */
package com.mycompany.guia8extra2;

import entidades.Nif;
import servicios.NifService;

/*
 *
 * @author astr0b1te1
 */
public class Guia8Extra2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        NifService ns = new NifService();
        Nif nif1 = ns.crearNif();
        System.out.println("El DNI es  :" + nif1.toString());        
        ns.calculaLetra();
        ns.mostrar();
        
    }
}
