package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 15. Programa que calcula el área de un triángulo a partir de la longitud de sus lados..
 *
 ***************************************************************/

public class Ejercicio_15 {

    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_15(){
        scan.reset();

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 15.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.println("Ingrese el lado A del Triangulo: ");
        double ladoA = scan.nextDouble();
        System.out.println("Ingrese el lado B del Triangulo: ");
        double ladoB = scan.nextDouble();
        System.out.println("Ingrese el lado C del Triangulo: ");
        double ladoC = scan.nextDouble();

        double sobreArea = ((ladoA + ladoB + ladoC) / 2);
        double area = Math.sqrt(sobreArea * (sobreArea - ladoA) * (sobreArea - ladoB) * (sobreArea - ladoC));

        System.out.printf("\nEl valor del lado A es: %s",ladoA);
        System.out.printf("\nEl valor del lado B es: %s",ladoB);
        System.out.printf("\nEl valor del lado C es: %s",ladoC);
        System.out.printf("\nEl valor del area del triangulo es: %s",area);




    }

}
