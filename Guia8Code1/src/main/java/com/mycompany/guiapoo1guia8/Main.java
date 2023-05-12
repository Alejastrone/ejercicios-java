/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.guiapoo1guia8;

import entidades.Persona;
import servicios.PersonaServicios;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        PersonaServicios p1 = new PersonaServicios();
        Persona per1 = p1.crearPersona();
       System.out.println(per1.toString());
        
    }
}
