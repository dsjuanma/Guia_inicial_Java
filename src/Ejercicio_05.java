package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 5. Programa Java que declare una variable A de tipo entero, asignarle un valor. A
 *	  continuación show un mensaje indicando si A es par o impar.
 *
 ***************************************************************/

public class Ejercicio_05 {


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_05() {
        scan.reset();

        int A = (int) (Math.random() * 1000);

        String estado = (A % 2 == 0) ? "par" : "impar";

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 05.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El valor de 'A' es %s y es un numero %s.\n",A,estado);
    }
}