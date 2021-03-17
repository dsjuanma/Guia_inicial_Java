package guia_00;


import java.io.PrintStream;
import java.util.Scanner;

/****************************************************************
 *
 * 6. Programa Java que declare una variable B de tipo entero y asignarle un valor. A
 *    continuación mostrar un mensaje indicando si el valor de B es positivo o negativo.
 *
 ***************************************************************/
public class Ejercicio_06 {

    public static void rtaEjercicio_06(){

        int B = (int) (Math.random() * 1000 - 500);
        String real = "Es neutro, no es positivo,ni negativo";

        if(B>0) real = "Positivo";
        if(B<0) real = "Negativo";

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 06.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("El Valor del Numero es: %s y es un Numero: %s", B , real);

    }

}