
package Service;

import Entidades.Persona;
import java.util.Scanner;


public class PersonaService {
    Scanner leer = new Scanner(System.in);
    // creamos la funcion y lo llamamos crearPersona
    public Persona crearPersona(){
        //INSTANCIAR UN OBJETO DE TIPO PERSONA y lo nombramos p1 al objeto creado
        Persona p1 = new Persona();
        System.out.println("Ingrese el nombre");
        // usamos el set para ingresar los datos al objeto creado como p1.setXxxxxxxx
        p1.setNombre(leer.next());
        System.out.println("Ingrese la edad");
        p1.setEdad(leer.nextInt());
        System.out.println("Ingrese el peso");
        p1.setPeso(leer.nextDouble());
        return p1;
    }
    
    public void mostrarPersona(Persona p1){
        // usamos el get para traer  los datos del objeto creado como p1.getXxxxxxxx
        System.out.println("El nombre es: " + p1.getNombre());
    }
    
    
}
