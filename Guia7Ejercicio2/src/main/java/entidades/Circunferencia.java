/*
Declarar una clase llamada Circunferencia que tenga como atributo
privado el radio de tipo real. A continuación, se deben crear los
siguientes métodos:
a) Método constructor que inicialice el radio pasado como parámetro.
b) Métodos get y set para el atributo radio de la clase Circunferencia.
c) Método para crearCircunferencia(): que le pide el radio y lo guarda
en el atributo del objeto.
d) Método area(): para calcular el área de la circunferencia (Area=〖
π*radio〗^2).
e) Método perimetro(): para calcular el perímetro
(Perimetro=2*π*radio).
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Circunferencia {

    Scanner leer = new Scanner(System.in);

    // Atributos
    private double radio = leer.nextDouble();

    // Constructor null
    public Circunferencia() {
    }

    // Constructor
    public Circunferencia(double radio) {
        this.radio = radio;
    }

    // Getter & Setter
    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    // Ingresar datos    
    public double area(double radio) {

        return Math.PI * radio * radio;
    }

    public double perimetro(double radio) {

        return 2 * Math.PI * radio;
    }

}
