package entidades;


/**
 *
 * @author astr0b1te
 */
public class Persona {   // Molde Clase Objeto

// atributos
    public String nombre;
    public String apellido;
    public int edad;
    public String nacion;

    // constructores
    public Persona() {

    }

    public Persona(String nombre, String apellido, int edad, String nacion) {

        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
        this.nacion = nacion;

    }
    // métodos propios

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNacion() {
        return nacion;
    }

    public void setNacion(String nacion) {
        this.nacion = nacion;
    }
  
}
