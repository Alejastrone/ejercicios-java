/*
a) Método fechaNacimiento que pregunte al usuario día, mes y año de
su nacimiento. Luego los pase por parámetro a un nuevo objeto Date.
El método debe retornar el objeto Date. Ejemplo fecha: Date fecha =
new Date(anio, mes, dia);
b) Método fechaActual que cree un objeto fecha con el día actual. Para
esto usaremos el constructor vacío de la clase Date. Ejemplo: Date
fechaActual = new Date();
El método debe retornar el objeto Date.
c) Método diferencia que reciba las dos fechas por parámetro y retorna
la diferencia de años entre una y otra (edad del usuario).
Si necesiten acá tienen más información en clase Date: Documentacion
Oracle
 */
package servicios;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class FechaService {   
    
     Scanner leer = new Scanner(System.in);
    public Date fechaNacimiento(){
      System.out.println("Ingrese el día:");
      int dia = leer.nextInt();
      System.out.println("Ingrese el mes:");
      int mes = leer.nextInt();
      System.out.println("Ingrese el año:");
      int anio = leer.nextInt();
      
      return new Date(anio-1900,mes-1,dia);  
    }
    
    public Date fechaActual() {
        Date fechaActual = new Date();
        return fechaActual;
    }

   /* public Integer diferencia(Date fecha1,Date fecha2){
       int diferencia = Math.abs(fecha1.getYear() - fecha2.getYear());
       return diferencia;
    }*/
    
    public int diferencia(Date fechaNacimiento, Date fechaActual) {
        int anios = fechaActual.getYear() - fechaNacimiento.getYear();
        if (fechaNacimiento.getMonth() > fechaActual.getMonth() ||
           (fechaNacimiento.getMonth() == fechaActual.getMonth() && fechaNacimiento.getDate() > fechaActual.getDate())) {
            anios--;
        }
        return anios;
    }
}

