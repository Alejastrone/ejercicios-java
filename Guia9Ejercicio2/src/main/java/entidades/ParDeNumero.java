/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author astr0b1te
 */
public class ParDeNumero {
    // Atributos
    private double num1;
    private double num2;
    // Constructor por parametros
    public ParDeNumero(double num1, double num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    
    // Constructor vacio con los Math.random para generar los numeros aleatorios
    public ParDeNumero() {
        this.num1 = Math.random()*10;
        this.num2 = Math.random()*10;
    }
    // Getter & Setter
    public double getNum1() {
        return num1;
    }

    public void setNum1(double num1) {
        this.num1 = num1;
    }

    public double getNum2() {
        return num2;
    }

    public void setNum2(double num2) {
        this.num2 = num2;
    }

    @Override
    public String toString() {
        return "ParDeNumero{" + "num1=" + num1 + ", num2=" + num2 + '}';
    }
    
    
}
