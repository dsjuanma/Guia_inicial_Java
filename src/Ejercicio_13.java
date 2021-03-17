package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 13.Programa que lea la longitud de los catetos de un triángulo rectángulo y calcule la
 *    longitud de la hipotenusa según el teorema de Pitágoras.
 *
 ***************************************************************/

public class Ejercicio_13 {


    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_13(){
        scan.reset();

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 13.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.printf("Ingrese el valor del Cateto Adyacente: ");
        double catetoAd = scan.nextDouble();
        System.out.printf("Ingrese el valor del Cateto Opuesto: ");
        double catetoOp = scan.nextDouble();

        double hipotenusa = Math.sqrt(Math.pow(catetoAd,2) + Math.pow(catetoOp,2));

        System.out.printf("\nEl valor del cateto Adyacente es: %s\n",catetoAd);
        System.out.printf("El valor del cateto Opuesto es: %s\n",catetoOp);
        System.out.printf("La longitud de la hipotenusa es: %.3s\n",hipotenusa);

    }
}
