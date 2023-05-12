/*
En NIFService
se dispondrá de los siguientes métodos:

b) Método crearNif(): le pide al usuario el DNI y con ese DNI calcula la
letra que le corresponderá. Una vez calculado, le asigna la letra que
le corresponde según
c) Método mostrar(): que nos permita mostrar el NIF (ocho dígitos, un
guion y la letra en mayúscula; por ejemplo: 00395469-F).
La letra correspondiente al dígito verificador se calculará a traves de un
método que funciona de la siguiente manera: Para calcular la letra se
toma el resto de dividir el número de DNI por 23 (el resultado debe ser
un número entre 0 y 22). El método debe buscar en un array (vector) de
caracteres la posición que corresponda al resto de la división para
obtener la letra correspondiente. La tabla de caracteres es la siguiente:
 */
package servicios;

import entidades.Nif;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class NifService {

    Scanner leerint = new Scanner(System.in);
    Nif nif1 = new Nif();

    public Nif crearNif() {

        System.out.println("Intrudusca el numero del DNI");
        nif1.setDni(leerint.nextInt());

        return nif1;
    }

    public void calculaLetra() {

        String juegoCaracteres[] = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
        int i = nif1.getDni() % 23;
        nif1.setLetra(juegoCaracteres[i]);
        System.out.println("Imprecion de la letra  :" + nif1.getLetra());

    }
    
    public void mostrar(){
        int dni = nif1.getDni();
        String letra = nif1.getLetra();
        System.out.println("El numero de documento Nif es  :"+dni+"-"+letra);
                
    }
}
