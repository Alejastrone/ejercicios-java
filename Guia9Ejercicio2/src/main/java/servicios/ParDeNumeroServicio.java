/*
a) Método mostrarValores que muestra cuáles son los dos números
guardados.
b) Método devolverMayor para retornar cuál de los dos atributos tiene
el mayor valor
c) Método calcularPotencia para calcular la potencia del mayor valor de
la clase elevado al menor número. Previamente se deben redondear
ambos valores.
d) Método calculaRaiz, para calcular la raíz cuadrada del menor de los
dos valores. Antes de calcular la raíz cuadrada se debe obtener el
valor absoluto del número.
 */
package servicios;
// Importamos la clase del objeto
import entidades.ParDeNumero;

/**
 *
 * @author astr0b1te
 */
public class ParDeNumeroServicio {
    // Metodo de crear la clase objeto
    public void mostrarValores(ParDeNumero cs){
        System.out.println(Math.round(cs.getNum1()));
        System.out.println(Math.round(cs.getNum2()));
    }
    
    public void devolverMayor(ParDeNumero cs){
        double mayor = Math.max(cs.getNum1(), cs.getNum2());
        System.out.println("El mayor es: " + mayor);
    }
    
    public void calcularPotencia(ParDeNumero cs){
        double mayor = Math.round(Math.max(cs.getNum1(), cs.getNum2()));
        double menor = Math.round(Math.min(cs.getNum1(), cs.getNum2()));
        double potencia = Math.pow(mayor, menor);
        System.out.println("La potencia es:" + potencia);
    }
    
    public void calcularRaiz(ParDeNumero cs){
        double min = Math.min(cs.getNum1(), cs.getNum2());
        double absoluto = Math.abs(min);
        double raiz = Math.sqrt(absoluto);
        System.out.println("La raiz es: " + raiz);
    }
}
