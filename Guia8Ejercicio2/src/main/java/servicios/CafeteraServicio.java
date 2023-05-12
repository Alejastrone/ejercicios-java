/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Cafetera;

/**
 *
 * @author astr0b1te
 */
public class CafeteraServicio {
    public void llenarCafetera(Cafetera uno){
       int cap = uno.getCapacidadMaxima();
       uno.setCantidadActual(cap);
       
    }
    public int servirTaza(Cafetera uno, int tamTaza){
        int actual= uno.getCantidadActual();
        if (actual<tamTaza) {
            System.out.println("La taza no se lleno completamente");
            System.out.println("En la taza se sirvió; " + (actual));
            System.out.println("Falto para llenar la taza: " + (tamTaza-actual));
            uno.setCantidadActual(0);           
        } else {
            System.out.println("Se lleno la taza");
            uno.setCantidadActual(actual-tamTaza);           
        }  
        return uno.getCantidadActual();        
    }   
    public void vaciarCafetera(Cafetera uno){
        uno.setCantidadActual(0);
    }
    
    public int agregarCafe(Cafetera uno, int cafe){
      int actual= uno.getCantidadActual();
      uno.setCantidadActual(actual + cafe);
       return uno.getCantidadActual();
    }
   
    public void mostrarCafetera(Cafetera uno){
        System.out.println(uno.toString());
    }
}
    

