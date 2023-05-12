/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package servicios;

import java.util.Arrays;

/**
 *
 * @author astr0b1te
 */
public class ArregloService {
    public void inicializarA(double[] A){
        for(int i = 0; i < A.length; i++){
            A[i] = Math.round(Math.random()*100);
        }
    }
    
    public void mostrar(double[] A){
        System.out.println(Arrays.toString(A));
    }
    
    public void ordenar(double[] A){
        Arrays.sort(A);
        for (int i = 0; i < A.length / 2; i++) {
            double temp = A[i];
            A[i] = A[A.length - 1 - i];
            A[A.length - 1 - i] = temp;
        }
        /*double[] arrayinv = new double[A.length];
        for (int i = A.length -1;i > 0;i-- ){
            int var = A.length - i;
            arrayinv[var] = (int) A[i - 1];
            System.out.print("[" + arrayinv[i] + "]");
        }
        System.out.println("");
        A = arrayinv;*/
    }
    
    public void inicializarB(double[] A, double[] B){
        for (int i = 0; i < 10; i++){
            B[i] = A[i];
        }
        for(int i = 10; i < B.length; i++){
            B[i] = 0.5;
        }
        
    }
}
