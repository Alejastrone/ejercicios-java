/*
Desarrollar una clase Cancion con los siguientes atributos: título y autor.
Se deberá definir además dos constructores: uno vacío que inicializa el
título y el autor a cadenas vacías y otro que reciba como parámetros el
título y el autor de la canción. Se deberán además definir los métodos
getters y setters correspondientes.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Cancion {
    // Atributos
    private String titulo;
    private String autor;
    // Constructor null
    public Cancion() {
    }
    // Constructor
    public Cancion(String titulo, String autor) {
        this.titulo = titulo;
        this.autor = autor;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
    
    // Ingresar datos
    public void crearCancion(){
       Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el titulo de la cancion :");
        this.titulo = leer.nextLine();
        System.out.print("Ingrese el autor de la cancion :");
        this.autor = leer.nextLine();
    }
    
    
}
