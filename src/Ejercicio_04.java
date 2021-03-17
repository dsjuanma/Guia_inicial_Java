package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 4. Programa java que declare cuatro variables enteras A, B, C y D y asignarle un valor a
 *    cada una. A continuación realiza las instrucciones necesarias para que: B tome el
 *    valor de C, C tome el valor de A, A tome el valor de D, D tome el valor de B.
 *
 ***************************************************************/

public class Ejercicio_04 {

       public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_04() {
        scan.reset();

        int A = 5;
        int B = 8;
        int C = 21;
        int D = 23;
        int aux = 0;


        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 04.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El valor de 'A' es: %s\n",A);
        System.out.printf("El valor de 'B' es: %s\n",B);
        System.out.printf("El valor de 'C' es: %s\n",C);
        System.out.printf("El valor de 'D' es: %s\n",D);
        System.out.println("\n");

        aux = B;
        B = C;
        C = A;
        A = D;
        D=aux;

        System.out.printf("El valor de 'A' ahora es: %s\n",A);
        System.out.printf("El valor de 'B' ahora es: %s\n",B);
        System.out.printf("El valor de 'C' ahora es: %s\n",C);
        System.out.printf("El valor de 'D' ahora es: %s\n",D);
    }
}