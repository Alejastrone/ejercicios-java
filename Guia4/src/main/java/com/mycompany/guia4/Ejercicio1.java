/*
 Escribir un programa que procese una secuencia de caracteres ingresada por
teclado y terminada en punto, y luego codifique la palabra o frase ingresada de
la siguiente manera: cada vocal se reemplaza por el carácter que se indica en
la tabla y el resto de los caracteres (incluyendo a las vocales acentuadas) se
mantienen sin cambios.
aeiou
@#$%*
Realice un subprograma que reciba una secuencia de caracteres y retorne la
codificación correspondiente. Utilice la estructura “según” para la
transformación.
Por ejemplo, si el usuario ingresa:
Ayer, lunes, salimos a las once y 10.
La salida del programa debería ser: @y#r, l*n#s, s@l$m%s @ l@s %nc# y 10.
 */

package com.mycompany.guia4;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Ejercicio1 {

    public static void main(String[] args) {
        
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese una secuencia de caracteres: ");
        String frase = leer.nextLine();      
        String codificado = codificar(frase);          
        int j = frase.length();
        if (frase.charAt(j-1)== '.') {
                System.out.println("Secuencia codificada: " + codificado);}
        if (frase.charAt(j-1)!= '.') {
            System.out.print("Ingrese un punto al final de la secuencia de caracteres: ");}   
    }
    public static String codificar(String secuencia) {              
            String codificado = "";        
               for (int i = 0; i < secuencia.length(); i++) {
                  char c = secuencia.charAt(i);
                     switch (c) {
                          case 'a':
                          case 'A':
                                  codificado += "@";
                                  break;
                         case 'e':
                         case 'E':
                                  codificado += "#";
                                  break;
                         case 'i':
                         case 'I':
                                  codificado += "$";
                                  break;
                         case 'o':
                         case 'O':
                                  codificado += "%";
                                  break;
                         case 'u':
                         case 'U':
                                  codificado += "*";
                                  break;
                         default:
                                  codificado += c;
            }
        }
        return codificado;
    
    }
    }
