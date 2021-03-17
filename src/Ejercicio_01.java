package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 1. Programa java que realice lo siguiente: declarar una variable N de tipo int, una
 *	  variable A de tipo double y una variable C de tipo char y asigna a cada una un valor.
 *	  A continuación muestra por pantalla: El valor de cada variable, la suma de N + A, la
 *	  diferencia de A - N, el valor numérico correspondiente al carácter que contiene la
 *	  variable C.
 *
 ***************************************************************/

public class Ejercicio_01 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_01() {
        scan.reset();

        int N = 15;
        double A = 33.33;
        char C = 'z';

        show.println("  -------------------");
        show.println(" |   Ejercicio 01.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'N' es: %s\n",N);
        show.printf("El valor de 'A' es: %s\n",A);
        show.printf("El valor de 'C' es: %s",C);
        show.println("\n");
        show.printf("La suma entre (N + A) es: %s\n",N + A);
        show.printf("La diferencia entre (A - N) es: %s\n",A - N);
        show.printf("El valor numerico de 'C' es: %s",(int) C);
    }
}