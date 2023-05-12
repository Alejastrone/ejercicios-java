/*
Crea una clase "Empleado" que tenga atributos como "nombre", "edad" y
"salario". Luego, crea un método "calcular_aumento" que calcule el
aumento salarial de un empleado en función de su edad y salario actual.
El aumento salarial debe ser del 10% si el empleado tiene más de 30
años o del 5% si tiene menos de 30 años.
 */
package entidades;
import java.util.Scanner;
/**
 *
 * @author astr0b1te
 */
public class Empleado {
    private String nombre;
    private int edad;
    private int salario;

    public Empleado() {
    }

    public Empleado(String nombre, int edad, int salario) {
        this.nombre = nombre;
        this.edad = edad;
        this.salario = salario;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getSalario() {
        return salario;
    }

    public void setSalario(int salario) {
        this.salario = salario;
    }

    @Override
    public String toString() {
        return "Empleado{" + "nombre=" + nombre + ", edad=" + edad + ", salario=" + salario + '}';
    }
    
    public void calcular_aumento(){
        
        Scanner leer = new Scanner(System.in);
        
        System.out.print("Ingrese el nombre del empleado :");
        setNombre(leer.nextLine());
        System.out.print("Ingrese la edad del empleado :");
        setEdad(leer.nextInt());        
        System.out.print("Ingrese el salario inicial :");
        setSalario(leer.nextInt());
        
        System.out.println("");
        
        if ( getEdad() > 30 ){
            System.out.println("El salario es de ;"+getSalario()*1.10);
        }else{
            System.out.println("El salario es de :"+getSalario()*1.05);
        }
    }
    
}
