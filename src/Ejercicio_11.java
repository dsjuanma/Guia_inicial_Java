package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 11. Programa que lee por teclado el valor del radio de una circunferencia, calcula y
 * muestra por pantalla la longitud y el área de la circunferencia.
 *
 ***************************************************************/


public class Ejercicio_11 {

    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_11(){
        scan.reset();

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 11.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.print("Ingresar el valor del radio de una circunferencia: ");

        double radio = scan.nextDouble();
        double circunferencia = (2 * radio * Math.PI);
        double area = (Math.pow(radio,2) * Math.PI);

        System.out.printf("\nLa longitud de la circunferencia es: %.5s\n",circunferencia);
        System.out.printf("El area de la circunferencia es: %.5s\n",area);



    }
}
