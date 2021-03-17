package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 2. Programa java que realice lo siguiente: declarar dos variables X e Y de tipo int, dos
 *	  variables N y M de tipo double y asigna a cada una un valor. A continuación show
 *	  por pantalla una serie de operaciones entre ellas.
 *
 ***************************************************************/

public class Ejercicio_02 {


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_02() {
        scan.reset();

        int X = 50;
        int Y = 30;
        double N = 15.7;
        double M = 25.5;

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 02.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El valor de 'X' es: %s\n",X);
        System.out.printf("El valor de 'Y' es: %s\n",Y);
        System.out.printf("El valor de 'N' es: %s\n",N);
        System.out.printf("El valor de 'M' es: %s\n",M);
        System.out.println("\n");
        System.out.printf("La suma entre (N + M) es: %s\n",N + M);
        System.out.printf("La diferencia entre (M-N) es: %s\n",M - N);
        System.out.printf("El cociente entre (X / N) es: %s\n",X / N);
        System.out.printf("El producto entre (X * Y) es: %s\n",X * Y);
    }
}