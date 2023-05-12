/*
Crear una clase llamada Libro que contenga los siguientes atributos:
ISBN, Título, Autor, Número de páginas, y un constructor con todos los
atributos pasados por parámetro y un constructor vacío. Crear un
método para cargar un libro pidiendo los datos al usuario y luego
informar mediante otro método el número de ISBN, el título, el autor del
libro y el número de páginas.
 */
package com.mycompany.guia7ejercicio1;

import entidades.Libro;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World!");

        Scanner leer = new Scanner(System.in);
        Libro libro1 = new Libro();

        System.out.print("Ingrese el titulo del libro: ");
        libro1.titulo = leer.nextLine();
        System.out.print("Ingrese el autor del libro: ");
        libro1.autor = leer.nextLine();
        System.out.print("Ingrese la cantidad de paginas: ");
        libro1.paginas = leer.nextInt();
        System.out.print("Ingrese el ISBN del libro : ");
        libro1.ISBN = leer.nextInt();
        
        System.out.println("El titulo es : "+libro1.titulo);
        System.out.println("El autor es : "+libro1.autor);
        System.out.println("La cantidad de pagina es de : "+libro1.paginas);
        System.out.println("El ISBN es : "+libro1.ISBN);
        

    }

}
