/*
Crea una clase "Juego" que tenga un método "iniciar_juego" que permita
a dos jugadores jugar un juego de adivinanza de números. El primer
jugador elige un número y el segundo jugador intenta adivinarlo. El
segundo jugador tiene un número limitado de intentos y recibe una pista
de "más alto" o "más bajo" después de cada intento. El juego termina
cuando el segundo jugador adivina el número o se queda sin intentos.
Registra el número de intentos necesarios para adivinar el número y el
número de veces que cada jugador ha ganado.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Juego {

    // Atributos
    private int jugador1, jugador2;
    private int num1, num2, numwin, intento;

    // Constructor null
    public Juego() {
    }

    // Constructor
    public Juego(int jugador1, int jugador2, int num1, int num2, int numwin, int intento) {
        this.jugador1 = jugador1;
        this.jugador2 = jugador2;
        this.num1 = num1;
        this.num2 = num2;
        this.numwin = numwin;
        this.intento = intento;
    }

    // Getter & Setter
    public int getJugador1() {
        return jugador1;
    }

    public void setJugador1(int jugador1) {
        this.jugador1 = jugador1;
    }

    public int getJugador2() {
        return jugador2;
    }

    public void setJugador2(int jugador2) {
        this.jugador2 = jugador2;
    }

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

    public int getNumwin() {
        return numwin;
    }

    public void setNumwin(int numwin) {
        this.numwin = numwin;
    }

    public int getIntento() {
        return intento;
    }

    public void setIntento(int intento) {
        this.intento = intento;
    }

    // Ingresar datos
    public void crearJuego() {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        System.out.println("Tiene 5 intento para adivinar");
        for (int i = 0; i < 5; i++) {
            System.out.print("JUGADOR 1: Ingrese el numero a adivinar :");
            this.jugador1 = leer.nextInt();
            System.out.print("JUGADOR 2: Adivine el numero que ingreso el jugadro 2 :");
            this.jugador2 = leer.nextInt();
            if (jugador1 == jugador2) {
                contador = contador + 1;
                System.out.println("El jugador 2 a adivinado el numero del jugador 1 es el  :" + jugador1);
            } else {
                
                System.out.println("Sigue intentando");
            }
            System.out.println("tiene 5 intento; ya realizo el intento  :" + (i + 1));
            System.out.println("El jugador adivino " + contador + " veces");
        }

    }

}
