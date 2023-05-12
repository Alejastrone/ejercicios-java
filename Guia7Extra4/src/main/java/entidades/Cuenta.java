/*
Crea una clase "Cuenta" que tenga atributos como "saldo" y "titular".
Luego, crea un método "retirar_dinero" que permita retirar una cantidad
de dinero del saldo de la cuenta. Asegúrate de que el saldo nunca sea
negativo después de realizar una transacción de retiro.
 */
package entidades;

import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class Cuenta {

    private int saldo = 10000;
    private String titular;

    public Cuenta() {
    }

    public Cuenta(int saldo, String titular) {
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getSaldo() {
        return saldo;
    }

    public void setSaldo(int saldo) {
        this.saldo = saldo;
    }

    public String getTitular() {
        return titular;
    }

    public void setTitular(String titular) {
        this.titular = titular;
    }

    @Override
    public String toString() {
        return "Cuenta{" + "saldo=" + saldo + ", titular=" + titular + '}';
    }

    public void retirar_dinero() {

        Scanner leer = new Scanner(System.in);
        int retiro = 0;
        do {
            System.out.println("Monto insuficiente su saldo disponible es :" + getSaldo());
            System.out.print("Monto a retirar :");
            retiro = leer.nextInt();
        } while (getSaldo() < retiro);
        setSaldo(getSaldo() - retiro);

    }
}
