/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author astr0b1te
 */
public class Mes {
    
    String[] mese = {"Enero", "Febrero", "Marzo", "Abril", "Mayo", "Junio", "Julio", "Agosto", "Septiembre", "Octubre", "Noviembre", "Diciembre"};

    public Mes() {
    }

    public String[] getMese() {
        return mese;
    }

    public void setMese(String[] mese) {
        this.mese = mese;
    }

    @Override
    public String toString() {
        return "Mes{" + "mese=" + mese + '}';
    }
    
    
}
