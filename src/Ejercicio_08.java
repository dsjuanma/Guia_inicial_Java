package guia_00;


import java.util.Scanner;

/****************************************************************
 *
 * 8. Programa Java que lea un nombre y muestre por pantalla:
 * “Buenos días, {NOMBRE}”
 *
 ***************************************************************/

public class Ejercicio_08 {




    public static void rtaEjercicio_08(){
        System.out.println("  -------------------");
        System.out.println(" |   Ejercicio 08.   |");
        System.out.println("  -------------------");
        System.out.println("\n");

        System.out.println("Escribe tu Nombre: ");
        Scanner consola = new Scanner(System.in); // creamos una nueva clase para leer desde la consola
        String nombre= consola.nextLine(); // almacenamos los datos leidos desde la consola en la variable nombre
        System.out.println("Bienvenido: " + nombre);


    }
}
