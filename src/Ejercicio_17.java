package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 17. Programa que lea un número entero N de 5 cifras y muestre las cifras que ocupan
 * posiciones impares.
 *
 ***************************************************************/

public class Ejercicio_17 {

    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_17(){
        scan.reset();

        System.out.println("Ingrese un Numero de cinco cifras: ");
        int num = scan.nextInt();
        String cifras = String.valueOf(num); // Convierte a cadenas los tipos de datos pasados como parámetro
        char [] decimal = cifras.toCharArray();// Convierte una cadena en un array de caracteres.

        for(int x = 0 ; x < decimal.length ; x++){ // recorremos desde 0 hasta el ultimo valor del arreglo
            if (decimal[x]%2 !=0) { // evaluamos si el mod es distinto de cero para saber si es impar o par
                System.out.println("[" + x + "] " + decimal[x]);

            }
            else
                System.out.println("[" + x + "] ");

        }


    }
}
