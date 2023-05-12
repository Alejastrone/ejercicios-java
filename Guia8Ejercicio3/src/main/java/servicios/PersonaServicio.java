/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import entidades.Persona;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class PersonaServicio {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public boolean esMayorDeEdad(Persona alex){
        boolean mayor = true;
        if (alex.getEdad()>18) {
        mayor = true;
            //System.out.println("Es mayor de edad.");
        } else{
            mayor =false;
            //System.out.println("Es menor de edad.");
        }
        return mayor;
    }
 
    
 public Persona crearPersona(){    
     String resp;
     System.out.println("Crearemos su usuario");
     System.out.println("Ingrese su nombre:");
     String nombre = leer.next();
     System.out.println("Ingrese su edad: ");
     int edad = leer.nextInt();
     do {
     System.out.println("Ingrese su sexo: "
             + "H (hombre) -  M(mujer) - o(otro)"); 
     resp = leer.next();
         if (!resp.equalsIgnoreCase("h")&&!resp.equalsIgnoreCase("m")&&!resp.equalsIgnoreCase("o")){
             System.out.println("Ingrese una respuesta correcta");    
         }
          } while(!resp.equalsIgnoreCase("h")&&!resp.equalsIgnoreCase("m")&&!resp.equalsIgnoreCase("o"));
     System.out.println("Ingrese su peso: ");
     int peso = leer.nextInt();
     System.out.println("Ingrese su altura: ");
     double altura = leer.nextDouble();
     return new Persona(nombre,edad,resp,peso,altura);    
 }
 
    public int calcularIMC(Persona alex){
    int peso = alex.getPeso();
    int resultado;
    double altura = alex.getAltura();
    double IMC = (peso/(Math.pow(altura,2)));
        if (IMC<20) {
           resultado = -1;
            //System.out.println("Su peso es menor al peso ideal");
        } else if (IMC>25){
           resultado = 1; 
            //System.out.println("Su peso es mayor al peso ideal");
        } else{
           resultado = 0;
            //System.out.println("Su peso es ideal");
        }
        System.out.println(IMC);
        return resultado;
    }
    
    public int[] edades(Persona uno, Persona dos, Persona tres, Persona cuatro){
    int edades[]= {uno.getEdad(),dos.getEdad(), tres.getEdad(), cuatro.getEdad()};
    return edades;
    }
}