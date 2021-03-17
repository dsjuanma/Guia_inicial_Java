package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 16. Programa que lee un número de 3 cifras y muestra sus cifras por separado.
 *
 ***************************************************************/

public class Ejercicio_16 {

    public static Scanner scan = new Scanner(System.in);

public static void rtaEjercicio_16(){
    scan.reset();

    System.out.println("  -------------------");
    System.out.println(" |   Ejercicio 16.   |");
    System.out.println("  -------------------");
    System.out.println("\n");
    System.out.println("Ingrese un numero de 3 cifras: ");
    int num = scan.nextInt();
    String cifra = String.valueOf(num); // Convierte a cadenas los tipos de datos pasados como parámetro
    char [] decimal = cifra.toCharArray(); // Convierte una cadena en un array de caracteres.

    for (int x=0;x<decimal.length;x++)
        System.out.println("[" + x + "] " + decimal[x]);



}

}
