/*
Crea una clase "Rectángulo" que tenga atributos "lado1" y "lado2" y un
método "calcular_area" que calcule y devuelva el área del rectángulo.
Luego crea un objeto "rectangulo1" de la clase "Rectángulo" con lados
de 4 y 6 y imprime el área del rectángulo.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Rectangulo {
    
    private int lado1;
    private int lado2;

    public Rectangulo() {
    }

    public Rectangulo(int lado1, int lado2) {
        this.lado1 = lado1;
        this.lado2 = lado2;
    }

    public int getLado1() {
        return lado1;
    }

    public void setLado1(int lado1) {
        this.lado1 = lado1;
    }

    public int getLado2() {
        return lado2;
    }

    public void setLado2(int lado2) {
        this.lado2 = lado2;
    }

    @Override
    public String toString() {
        return "Rectangulo{" + "lado1=" + lado1 + ", lado2=" + lado2 + '}';
    }
    
    public void calcular_area(){
        Scanner leer = new Scanner(System.in);
        System.out.print("Ingrese el valor de lado 1:");
        setLado1(leer.nextInt());
        System.out.print("Ingrese el valor del lado 2 :");
        setLado2(leer.nextInt());
        System.out.print("el area del rectangulo es :"+getLado1()*getLado2());
        System.out.println("");
    }
    
    public void dibujar_rectangulo(){
         for (int i = 0; i < getLado1(); i++) {
            for (int j = 0; j < getLado2(); j++) {
                if (i > 0 && i < getLado1()  && j > 0 && j < getLado2() ) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }
    }
}
