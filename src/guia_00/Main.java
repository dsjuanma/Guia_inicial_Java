package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {

    public static PrintStream show = System.out;
    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    Ejercicio_01.resolverEjercicio_01();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
               /* case 2:
                    Ejercicio_02.resolverEjercicio_02();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    Ejercicio_03.resolverEjercicio_03();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 4:
                    Ejercicio_04.resolverEjercicio_04();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 5:
                    Ejercicio_05.resolverEjercicio_05();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 6:
                    Ejercicio_06.resolverEjercicio_06();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 7:
                    Ejercicio_07.resolverEjercicio_07();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 8:
                    Ejercicio_08.resolverEjercicio_08();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 9:
                    Ejercicio_09.resolverEjercicio_09();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 10:
                    Ejercicio_10.resolverEjercicio_10();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 11:
                    Ejercicio_11.resolverEjercicio_11();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 12:
                    Ejercicio_12.resolverEjercicio_12();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 13:
                    Ejercicio_13.resolverEjercicio_13();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 14:
                    Ejercicio_14.resolverEjercicio_14();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 15:
                    Ejercicio_15.resolverEjercicio_15();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 16:
                    Ejercicio_16.resolverEjercicio_16();
                    Pausa.pausar();
                    limpiarPantalla();

                    break;
                case 17:
                    Ejercicio_17.resolverEjercicio_17();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 18:
                    Ejercicio_18.resolverEjercicio_18();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;*/
                case 0:
                    show.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    show.println("¡¡¡Ejercicio incorrecto.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }


    public static int menu() {
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t    MENU");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [1].Ejercicio 01.");
        show.println("\t   [2].Ejercicio 02.");
        show.println("\t   [3].Ejercicio 03.");
        show.println("\t   [4].Ejercicio 04.");
        show.println("\t   [5].Ejercicio 05.");
        show.println("\t   [6].Ejercicio 06.");
        show.println("\t   [7].Ejercicio 07.");
        show.println("\t   [8].Ejercicio 08.");
        show.println("\t   [9].Ejercicio 09.");
        show.println("\t  [10].Ejercicio 10.");
        show.println("\t  [11].Ejercicio 11.");
        show.println("\t  [12].Ejercicio 12.");
        show.println("\t  [13].Ejercicio 13.");
        show.println("\t  [14].Ejercicio 14.");
        show.println("\t  [15].Ejercicio 15.");
        show.println("\t  [16].Ejercicio 16.");
        show.println("\t  [17].Ejercicio 17.");
        show.println("\t  [18].Ejercicio 18.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n");
        show.println("\t   [0].Salir del programa.");
        show.println("\n\t____________________________________________________________________");
        show.println("\n\n\t  Elija una opcion: ");
        show.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {
        for(int i=0;i<10;i++) {
            show.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            show.println("\n");
            show.println(" ----------------------------------------");
            show.println("|Presionar la tecla ENTER para continuar.|");
            show.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            show.println("\n");
            aceptar.nextLine();
        }
    }
}