/*
Crear una clase PersonaService,
en el paquete servicio, con los siguientes métodos:
a) Método crearPersona que pida al usuario Nombre y fecha de
nacimiento de la persona a crear. Retornar el objeto Persona creado.
b) Método calcularEdad que calcule la edad del usuario utilizando el
atributo de fecha de nacimiento y la fecha actual.
c) Método menorQue recibe como parámetro una Persona y una edad.
Retorna true si la persona es menor que la edad consultada o false
en caso contrario.
d) Método mostrarPersona que muestra la información de la persona
deseada.
 */
package servicios;

import entidades.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class PersonaService {

    Persona p1 = new Persona();
    Scanner leer = new Scanner(System.in);

    public Persona crearPersona() {

        System.out.println("Ingrese su nombre");
        p1.setNombre(leer.nextLine());
        System.out.println("Ingrese el dia de nacimiento");
        p1.setDia(leer.nextInt());
        System.out.println("Ingrese el mes de nacimiento");
        p1.setMes(leer.nextInt());
        System.out.println("Ingrese el año de su nacimiento");
        p1.setAnio(leer.nextInt());

        return p1;
    }

    public Date fechaNacimiento() {

        int dia = p1.getDia();
        int mes = p1.getMes();
        int anio = p1.getAnio();

        return new Date(anio - 1900, mes - 1, dia);
    }

    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

    public int calcularEdad(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth()
                || (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }

        return anios;

    }

    public void menorQue() {
        Date a = fechaNacimiento();
        Date b = fechaActual();
        boolean menor = calcularEdad(a, b) < 18;
        if (menor) {
            System.out.println("La persona es Menor de edad");
        } else {
            System.out.println("La persona es Mayor de edad");
        }
    }
}
