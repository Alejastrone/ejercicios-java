/*
ISBN, Título, Autor, Número de páginas,
 */
package entidades;


/**
 *
 * @author astr0b1te
 */
public class Libro {
    
    public String titulo;
    public String autor;
    public int paginas;
    public int ISBN;

    public Libro() {
    }
    
    public Libro(String titulo, String autor, int paginas, int ISBN) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
        this.ISBN = ISBN;    
      
    }
}  
