package guia_00;

import java.io.PrintStream;
import java.util.Scanner;



/****************************************************************
 *
 * 18. Programa que lea tres números enteros H, M, S que contienen hora, minutos y
 * segundos respectivamente, y comprueba si la hora que indican es una hora válida
 *
 ***************************************************************/

public class Ejercicio_18 {

    public static Scanner scan = new Scanner(System.in);

    public static void rtaEjercicio_18(){
        scan.reset();

        System.out.print("Ingresar hora: ");
        int h = scan.nextInt();

        System.out.print("Ingresar minutos: ");
        int m = scan.nextInt();

        System.out.print("Ingresar segundos: ");
        int s = scan.nextInt();

        boolean hValida = h > (-1) && h < 25;
        boolean mValido = m > (-1) && m < 61;
        boolean sValido = s > (-1) && s < 61;

        boolean valido = hValida && mValido && sValido;

        if(valido) System.out.printf("\nLa hora es: %s:%s:%s\n",h,m,s);
        if(!valido) System.out.println("\n¡¡¡Formato de hora invalido.!!!");


    }
}
