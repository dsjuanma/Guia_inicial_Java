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


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_01() {
        scan.reset();

        int N = 15;
        double A = 33.33;
        char C = 'z';

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 01.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El valor de 'N' es: %s\n",N);
        System.out.printf("El valor de 'A' es: %s\n",A);
        System.out.printf("El valor de 'C' es: %s",C);
        System.out.println("\n");
        System.out.printf("La suma entre (N + A) es: %s\n",N + A);
        System.out.printf("La diferencia entre (A - N) es: %s\n",A - N);
        System.out.printf("El valor numerico de 'C' es: %s",(int) C);
    }
}