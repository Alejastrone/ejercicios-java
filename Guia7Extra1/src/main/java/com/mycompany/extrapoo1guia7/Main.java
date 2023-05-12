/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package com.mycompany.extrapoo1guia7;

import entidades.Cancion;

/**
 *
 * @author astr0b1te
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("Hello World! Para hacer una cancion");

        Cancion c1 = new Cancion();
        c1.crearCancion();

        System.out.println("El autor es :" + c1.getAutor());
        System.out.println("El titulo es :" + c1.getTitulo());

    }
}
