package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 12.Programa que pase una velocidad en Km/h a m/s. La velocidad se lee por teclado
 *
 ***************************************************************/

public class Ejercicio_12 {


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_12(){
        scan.reset();
        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 12.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.println("Ingrese La velocidad en Km/h y sera convertida a modo M/S: ");

        Scanner consola = new Scanner(System.in);
        int km = consola.nextInt();
        //int km= scan.nextInt();

        double millas = (km * 0.62137);

        System.out.printf("La velocidad ingresada es: %s que convertidos a millas son: %.2s",km,millas);




    }

}
