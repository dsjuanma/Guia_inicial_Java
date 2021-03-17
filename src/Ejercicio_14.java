package guia_00;



import java.util.Scanner;

/****************************************************************
 *
 * 14. Programa que calcula el volumen de una esfera.
 *
 ***************************************************************/

public class Ejercicio_14 {

    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_14 (){
        scan.reset();

        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 14.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.print("Ingresar el radio de una esfera: ");

        double radio = scan.nextDouble();

        double volumen = ((4.0/3) * Math.PI * Math.pow(radio,3));

        System.out.println("EL Radio ingresado es: " + radio);
        System.out.printf("El Volumen de la Esfera es: %.6s",volumen);

    }

}
