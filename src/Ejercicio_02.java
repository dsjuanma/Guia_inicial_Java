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

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_02() {
        scan.reset();

        int X = 50;
        int Y = 30;
        double N = 15.7;
        double M = 25.5;

        show.println("  -------------------");
        show.println(" |   Ejercicio 02.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'X' es: %s\n",X);
        show.printf("El valor de 'Y' es: %s\n",Y);
        show.printf("El valor de 'N' es: %s\n",N);
        show.printf("El valor de 'M' es: %s\n",M);
        show.println("\n");
        show.printf("La suma entre (N + M) es: %s\n",N + M);
        show.printf("La diferencia entre (M-N) es: %s\n",M - N);
        show.printf("El cociente entre (X / N) es: %s\n",X / N);
        show.printf("El producto entre (X * Y) es: %s\n",X * Y);
    }
}