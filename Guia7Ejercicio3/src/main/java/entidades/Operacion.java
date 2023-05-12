/*
Crear una clase llamada Operacion que tenga como atributos privados
numero1 y numero2. A continuación, se deben crear los siguientes
métodos:
a) Método constructor con todos los atributos pasados por parámetro.
b) Método constructor sin los atributos pasados por parámetro.
c) Métodos get y set.
d) Método para crearOperacion(): que le pide al usuario los dos
números y los guarda en los atributos del objeto.
e) Método sumar(): calcular la suma de los números y devolver el
resultado al main.
f) Método restar(): calcular la resta de los números y devolver el
resultado al main
g) Método multiplicar(): primero valida que no se haga una
multiplicación por cero, si fuera a multiplicar por cero, el método
devuelve 0 y se le informa al usuario el error. Si no, se hace la
multiplicación y se devuelve el resultado al main
h) Método dividir(): primero valida que no se haga una división por cero,
si fuera a pasar una división por cero, el método devuelve 0 y se le
informa al usuario el error se le informa al usuario. Si no, se hace la
división y se devuelve el resultado al main.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Operacion {

    // Atributos
    private int num1;
    private int num2;

    // Constructor null
    public Operacion() {
    }

    // Constructor
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }

    // Getter & Setter
    public int getNum1() {
        return num1;
    }

    public void setNum1(int num1) {
        this.num1 = num1;
    }

    public int getNum2() {
        return num2;
    }

    public void setNum2(int num2) {
        this.num2 = num2;
    }

    // Ingresamos datos
    public void crearOperacion() {
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor del primer numero :");
        this.num1 = leer.nextInt();
        System.out.print("Ingrese el valor del segundo numero :");
        this.num2 = leer.nextInt();
    }

    // Metodos o funciones
    public double sumar() {
        return num1 + num2;
    }

    public double restar() {
        return num1 - num2;
    }

    public double multi() {
        if (num1 == 0 || num1 == 0) {
            System.out.println("La multiplicacion da 0 ingrese otros valores");
        } else {
        }
        return num1 * num2;
    }

    public double divi() {
        if (num1 == 0 || num2 == 0) {
            System.out.println("La division da 0 ingrese otros valores");
        } else {
        }
        return num1 / num2;
    }

}
