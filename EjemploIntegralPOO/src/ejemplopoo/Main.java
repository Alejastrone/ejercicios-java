
package ejemplopoo;

import Service.PersonaService;


public class Main {

    public static void main(String[] args) {
        // creamos el objetoServicio y le asignamos ps como nombre
       PersonaService ps = new PersonaService();
       // aqui llamamos al servicio y que muertre todo sus funciones y datos
       ps.crearPersona();
    }
    
}
