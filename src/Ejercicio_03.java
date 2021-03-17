package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 3. Programa Java que declare una variable entera N, asignarle un valor. A continuación
 *	  escribe las instrucciones que realicen lo siguiente: incrementar N en 77, reducir su
 *    valor a 3, duplicar su valor.
 *
 ***************************************************************/

public class Ejercicio_03 {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void resolverEjercicio_03() {
        scan.reset();

        int N = 63;

        show.println("  -------------------");
        show.println(" |   Ejercicio 03.   |");
        show.println("  -------------------");
        show.println("\n");

        show.printf("El valor de 'N' es: %s\n",N);
        show.printf("El valor de 'N + 77' es: %s\n",N + 77);
        show.printf("El valor de 'N - 3' es: %s\n",N - 3);
        show.printf("El doble del valor de 'N' es: %s\n",N * 2);
    }
}