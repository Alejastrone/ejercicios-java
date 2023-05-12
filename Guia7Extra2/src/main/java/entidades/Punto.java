/*
Definir una clase llamada Punto que contendrá las coordenadas de dos
puntos, sus atributos serán, x1, y1, x2, y2, siendo cada x e y un punto.
Generar un objeto puntos usando un método crearPuntos() que le pide al
usuario los dos números y los ingresa en los atributos del objeto.
Después, a través de otro método calcular y devolver la distancia que
existe entre los dos puntos que existen en la clase Punto. Para conocer
como calcular la distancia entre dos puntos consulte el siguiente link:
http://www.matematicatuya.com/GRAFICAecuaciones/S1a.html
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Punto {
    
    // Atributos
    private int x1, x2;    
    private int y1, y2;    
    
    // Constructor null
    public Punto() {
    }
    // Constructor
    public Punto(int x1, int x2, int y1, int y2) {
        this.x1 = x1;
        this.x2 = x2;
        this.y1 = y1;
        this.y2 = y2;
    }
    // Getter & Setter
    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }
    // Ingresar datos
    public void crearPunto(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor x1 :");
        this.x1 = leer.nextInt();
        System.out.print("Ingrese el valor x2 :");
        this.x2 = leer.nextInt();
        System.out.print("Ingrese el valor y1 :");
        this.y1 = leer.nextInt();
        System.out.print("Ingrese el valor y2 :");
        this.y2 = leer.nextInt();
    }
    public double distancia(int x1, int x2, int y1, int y2){
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));        
    }    
}
