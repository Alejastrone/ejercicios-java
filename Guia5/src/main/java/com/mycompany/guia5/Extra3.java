/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.guia5;

import java.util.Random;

/**
 *
 * @author astr0b1te
 */
public class Extra3 {
    
    public static void main(String[] args) {
        int[] vector = new int[10];
        llenarVector(vector);
        imprimirVector(vector);
    }

    public static void llenarVector(int[] vector) {
        Random rand = new Random();
        for (int i = 0; i < vector.length; i++) {
            vector[i] = rand.nextInt(100);
        }
    }

    public static void imprimirVector(int[] vector) {
        for (int i = 0; i < vector.length; i++) {
            System.out.print(vector[i] + " ");
        }
    }
}
    

