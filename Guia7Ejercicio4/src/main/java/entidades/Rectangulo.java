/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Rectangulo {

    // Atributos
    private int altura;
    private int base;

    // Constructor
    public Rectangulo(int altura, int base) {
        this.altura = altura;
        this.base = base;
    }

    // Constructor null
    public Rectangulo() {
    }

    // Ingreso de datos de los atributos
    public void Rectangulo() {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese altura");
        this.altura = leer.nextInt();
        System.out.println("Ingrese base");
        this.base = leer.nextInt();
    }

    // Metodo para calcular el perimetro 
    public int Perimetro(int altura, int base) {
        int perimetro = (base + altura) * 2;
        return perimetro;
    }

    // Metodo para calcular la superficie
    public int Superficie(int altura, int base) {
        int superficie = base * altura;
        return superficie;
    }

    // Metodo para dibujar el rectangulo con *
    public void Dibu(int altura, int base) {
        for (int i = 0; i < base; i++) {
            for (int j = 0; j < altura; j++) {
                if (i > 0 && i < base  && j > 0 && j < altura ) {
                    System.out.print("* ");
                } else {
                    System.out.print("* ");
                }
            }
            System.out.println("");
        }

    }

    // Getter & Setter
    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }
}
