/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

/**
 *
 * @author astr0b1te
 */
public class Cadena {

    private String frase;
    private int longFrase;

    public Cadena() {

    }

    public Cadena(String frase, int longFrase) {
        this.frase = frase;
        this.longFrase = longFrase;

    }

    public String getFrase() {
        return frase;
    }

    public void setFrase(String frase) {
        this.frase = frase;
    }

    public int getLongFrase() {
        return longFrase;
    }

    public void setLongFrase(int longFrase) {
        this.longFrase = longFrase;
    }

    @Override
    public String toString() {
        return "Cadena{" + "frase=" + frase + ", longFrase=" + longFrase + '}';
    }

}
