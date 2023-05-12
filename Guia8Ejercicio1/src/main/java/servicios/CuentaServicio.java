/*
Método retirar(double): recibe una cantidad de dinero a retirar y se le
restara al saldo actual. Si la cuenta no tiene la cantidad de dinero a
retirar se retirará el máximo posible hasta dejar la cuenta en 0.
d) Método extraccionRapida: le permitirá sacar solo un 20% de su saldo.
Validar que el usuario no saque más del 20%.
e) Método consultarSaldo: permitirá consultar el saldo disponible en la
cuenta.
f) Método consultarDatos: permitirá mostrar todos los datos de la
cuenta.
 */
package servicios;

import entidades.Cuenta;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class CuentaServicio {

    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta() {
        
        Cuenta c1 = new Cuenta();

        System.out.print("Ingrese el numero del DNI :");
        c1.setDniCliente(leer.nextInt());
        System.out.print("Ingrese un numero de su cuenta :");        
        c1.setNumeroCuenta(leer.nextInt());
        return c1;

    }

    public double ingresarSaldo(Cuenta c1) {
        System.out.print("Ingrese el monto a depositar :");
        double actual = c1.getSaldoActual();
        double deposito = leer.nextDouble();
        c1.setSaldoActual(actual + deposito);

        return c1.getSaldoActual();

    }

    public double retirarSaldo(Cuenta c1) {
        double actual = 0;
        double retiro = 0;
        System.out.print("Ingrese el monto a retirar :");
        do {
            actual = c1.getSaldoActual();
            retiro = leer.nextDouble();            
        } while (retiro >= c1.getSaldoActual());
        c1.setSaldoActual(actual - retiro);
        return c1.getSaldoActual();

    }

    public double retiroRapido(Cuenta c1) {
        double actual = 0;
        double retiro = 0;
        System.out.println("Monto a retirar no mayor al 20% de su saldo");
        do {
            actual = c1.getSaldoActual();
            retiro = leer.nextDouble();
            System.out.println("Saldo maximo  :" + c1.getSaldoActual() * 0.20);
        } while (retiro > (c1.getSaldoActual() * 0.20));
        c1.setSaldoActual(actual - retiro);
        return c1.getSaldoActual();

    }

    public void consultarSaldo(Cuenta c1) {
        System.out.println("Monto disponible :"+c1.getSaldoActual());
    }

    public void consultarDatos(Cuenta c1) {
        System.out.println("Datos de la cuenta :"+c1.toString());
    }
}
