package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 10. Programa que lea una cantidad de grados Fahrenheit y lo convierta a grados
 * centígrados.
 *
 ***************************************************************/


public class Ejercicio_10 {


    public static Scanner scan = new Scanner(System.in);


    public static void rtaEjercicio_10(){
        scan.reset();
        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 10.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.println("Ingrese la temperatura en modo Farenheit: ");
        int temp = scan.nextInt();

        double convertirTemp = ((temp -32) / 1.8);
        System.out.println("La temperatura 'Farenheit' ingresada es:"+ temp + "º");
        System.out.printf("%sº 'Farenheit' equivalen a %.4sº 'Centigrados'.\n",temp,convertirTemp );





    }

}
