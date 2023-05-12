/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entidades;

import java.util.ArrayList;

/**
 *
 * @author astr0b1te
 */
public class Cocina {
    
    ArrayList Receta = new ArrayList();
    public int sal;
    public int azucar;
    public int harina;
    public int levadura;
    public int huevo;
    public int manteca;
    public int aceite;
    public int leche;
    public int agua;
    public int vinagre;
    public int soya;

    public Cocina() {
    }

    public Cocina(int sal, int azucar, int harina, int levadura, int huevo, int manteca, int aceite, int leche, int agua, int vinagre, int soya) {
        this.sal = sal;
        this.azucar = azucar;
        this.harina = harina;
        this.levadura = levadura;
        this.huevo = huevo;
        this.manteca = manteca;
        this.aceite = aceite;
        this.leche = leche;
        this.agua = agua;
        this.vinagre = vinagre;
        this.soya = soya;
    }

    public ArrayList getReceta() {
        return Receta;
    }

    public void setReceta(ArrayList Receta) {
        this.Receta = Receta;
    }

    public int getSal() {
        return sal;
    }

    public void setSal(int sal) {
        this.sal = sal;
    }

    public int getAzucar() {
        return azucar;
    }

    public void setAzucar(int azucar) {
        this.azucar = azucar;
    }

    public int getHarina() {
        return harina;
    }

    public void setHarina(int harina) {
        this.harina = harina;
    }

    public int getLevadura() {
        return levadura;
    }

    public void setLevadura(int levadura) {
        this.levadura = levadura;
    }

    public int getHuevo() {
        return huevo;
    }

    public void setHuevo(int huevo) {
        this.huevo = huevo;
    }

    public int getManteca() {
        return manteca;
    }

    public void setManteca(int manteca) {
        this.manteca = manteca;
    }

    public int getAceite() {
        return aceite;
    }

    public void setAceite(int aceite) {
        this.aceite = aceite;
    }

    public int getLeche() {
        return leche;
    }

    public void setLeche(int leche) {
        this.leche = leche;
    }

    public int getAgua() {
        return agua;
    }

    public void setAgua(int agua) {
        this.agua = agua;
    }

    public int getVinagre() {
        return vinagre;
    }

    public void setVinagre(int vinagre) {
        this.vinagre = vinagre;
    }

    public int getSoya() {
        return soya;
    }

    public void setSoya(int soya) {
        this.soya = soya;
    }

    @Override
    public String toString() {
        return "Cocina{" + "Receta=" + Receta + ", sal=" + sal + ", azucar=" + azucar + ", harina=" + harina + ", levadura=" + levadura + ", huevo=" + huevo + ", manteca=" + manteca + ", aceite=" + aceite + ", leche=" + leche + ", agua=" + agua + ", vinagre=" + vinagre + ", soya=" + soya + '}';
    }
    
    
}
