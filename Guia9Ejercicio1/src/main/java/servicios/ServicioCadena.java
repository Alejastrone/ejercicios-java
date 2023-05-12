package servicios;

import entidades.Cadena;
import java.util.Scanner;

/**
 *
 * @author astr0b1te
 */
public class ServicioCadena {

    public void mostrarVocales(Cadena uno) {

        int contVocal = 0;

        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese una frase: ");
        uno.setFrase(leer.nextLine());
        uno.setLongFrase(uno.getFrase().length());
        for (int i = 0; i < uno.getLongFrase(); i++) {
            String letra = uno.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase("a") || letra.equalsIgnoreCase("e") || letra.equalsIgnoreCase("i") || letra.equalsIgnoreCase("o") || letra.equalsIgnoreCase("u")) {
                contVocal++;
            }
        }
        System.out.println("La cantidad de vocales es: " + contVocal);
    }

    public void invertirFrase(Cadena uno) {

        String letra = "";
        for (int i = uno.getLongFrase(); i > 0; i--) {
            letra = uno.getFrase().substring(i - 1, i);
            System.out.print(letra);
        }
        System.out.println("");
    }

    public void vecesRepetido(Cadena uno) {
        Scanner leer = new Scanner(System.in);
        int contVocal = 0;
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.nextLine();
        for (int i = 0; i < uno.getLongFrase(); i++) {
            String letraf = uno.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(letraf)) {
                contVocal++;
            }
        }
        System.out.println("La cantidad repetida de la letra [ " + letra + " ] es : " + contVocal);
    }

    public void compararLongitud(Cadena uno) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frese para comparar la cantidad de letras");
        String nueva_frase = leer.nextLine();
        if (uno.getLongFrase() == nueva_frase.length()) {
            System.out.println("La frase tiene la misma cantidad");
        } else {
            System.out.println("La frase no tiene la misma cantidad");
        }
    }

    public void unirFrases(Cadena uno) {
        Scanner leer = new Scanner(System.in);
        System.out.println("Ingrese una nueva frese para unirla con la frace principal");
        String nueva_frase = leer.nextLine();
        System.out.println(uno.getFrase() + " " + nueva_frase);
    }

    public void reemPlazar(Cadena uno) {
        Scanner leer = new Scanner(System.in);

        System.out.println("Ingrese la letra a reemplazar");
        String letra = leer.nextLine();
        for (int i = 0; i < uno.getLongFrase(); i++) {
            String letraf = uno.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(letraf)) {
                letraf = "a";
            } else {
                letraf = letraf;
            }
            System.out.print(letraf);
            System.out.println("");
        }


    }

    public void contiene(Cadena uno) {
        Scanner leer = new Scanner(System.in);
        int contador = 0;
        System.out.println("Ingrese la letra a buscar");
        String letra = leer.nextLine();
        for (int i = 0; i < uno.getLongFrase(); i++) {
            String letraf = uno.getFrase().substring(i, i + 1);
            if (letra.equalsIgnoreCase(letraf)) {
                contador++;

            }
        }
        if (contador > 0) {
            System.out.println("Verdadero si contiene la letra ingresada"+contador);
        } else {
            System.out.println("Falso no contiene la letra ingresada");
        }
    }
}
