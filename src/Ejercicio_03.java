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


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_03() {
        scan.reset();

        int N = 63;

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 03.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El valor de 'N' es: %s\n",N);
        System.out.printf("El valor de 'N + 77' es: %s\n",N + 77);
        System.out.printf("El valor de 'N - 3' es: %s\n",N - 3);
        System.out.printf("El doble del valor de 'N' es: %s\n",N * 2);
    }
}