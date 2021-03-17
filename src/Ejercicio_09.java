package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 9. Programa Java que lea un número entero por teclado y calcule el doble y el triple de
 * ese número y lo muestre por pantalla.
 *
 ***************************************************************/
public class Ejercicio_09 {




    public static void rtaEjercicio_09(){

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 09.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.println("Ingrese por favor un Numero entero: ");
        Scanner consola = new Scanner(System.in);
       int num = consola.nextInt();
        System.out.printf("El Numero Ingresado es %s y el Doble es: %s\n",num,num * 2);
        System.out.printf("El Numero Ingresado es %s y el Triple es: %s",num,num * 3);



    }
}
