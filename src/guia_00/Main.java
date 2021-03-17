package guia_00;

import java.io.PrintStream;
import java.util.Scanner;

public class Main {


    public static Scanner scan = new Scanner(System.in);

    public static void main(String[] args) {
        int selected;

        do {
            selected = menu();
            switch(selected) {
                case 1:
                    Ejercicio_01.rtaEjercicio_01();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 2:
                    Ejercicio_02.rtaEjercicio_02();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 3:
                    Ejercicio_03.rtaEjercicio_03();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 4:
                    Ejercicio_04.rtaEjercicio_04();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 5:
                    Ejercicio_05.rtaEjercicio_05();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 6:
                    Ejercicio_06.rtaEjercicio_06();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 7:
                    Ejercicio_07.rtaEjercicio_07();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 8:
                    Ejercicio_08.rtaEjercicio_08();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 9:
                    Ejercicio_09.rtaEjercicio_09();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 10:
                    Ejercicio_10.rtaEjercicio_10();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;


                case 11:
                    Ejercicio_11.rtaEjercicio_11();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;


                case 12:
                    Ejercicio_12.rtaEjercicio_12();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 13:
                    Ejercicio_13.rtaEjercicio_13();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 14:
                    Ejercicio_14.rtaEjercicio_14();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 15:
                    Ejercicio_15.rtaEjercicio_15();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 16:
                    Ejercicio_16.rtaEjercicio_16();
                    Pausa.pausar();
                    limpiarPantalla();

                    break;

                case 17:
                    Ejercicio_17.rtaEjercicio_17();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;

                case 18:
                    Ejercicio_18.rtaEjercicio_18();
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
                case 0:
                    System.out.println("Programa finalizado.");
                    break;
                default:
                    limpiarPantalla();
                    System.out.println("¡¡¡Ejercicio Inexistente.!!!");
                    Pausa.pausar();
                    limpiarPantalla();
                    break;
            }
        }while(selected !=0);
    }


    public static int menu() { // Menu
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    GUIA 00: INTRODUCCION A JAVA.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t    MENU");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [1].Ejercicio 01.");
        System.out.println("\t   [2].Ejercicio 02.");
        System.out.println("\t   [3].Ejercicio 03.");
        System.out.println("\t   [4].Ejercicio 04.");
        System.out.println("\t   [5].Ejercicio 05.");
        System.out.println("\t   [6].Ejercicio 06.");
        System.out.println("\t   [7].Ejercicio 07.");
        System.out.println("\t   [8].Ejercicio 08.");
        System.out.println("\t   [9].Ejercicio 09.");
        System.out.println("\t  [10].Ejercicio 10.");
        System.out.println("\t  [11].Ejercicio 11.");
        System.out.println("\t  [12].Ejercicio 12.");
        System.out.println("\t  [13].Ejercicio 13.");
        System.out.println("\t  [14].Ejercicio 14.");
        System.out.println("\t  [15].Ejercicio 15.");
        System.out.println("\t  [16].Ejercicio 16.");
        System.out.println("\t  [17].Ejercicio 17.");
        System.out.println("\t  [18].Ejercicio 18.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n");
        System.out.println("\t   [0].Salir del programa.");
        System.out.println("\n\t____________________________________________________________________");
        System.out.println("\n\n\t  Elija una opcion: ");
        System.out.println("\n");
        int input = scan.nextInt();
        return input;
    }


    public static void limpiarPantalla() {         // se dejan 60 espacios creando una especie de cls de la consola
        for(int i=0;i<60;i++) {
            System.out.println("\n");
        }
    }


    public static class Pausa {
        public static void pausar() {
            System.out.println("\n");
            System.out.println(" ----------------------------------------");
            System.out.println("|Presionar la tecla ENTER para continuar.|");
            System.out.println(" ----------------------------------------");
            Scanner aceptar = new Scanner(System.in);
            System.out.println("\n");
            aceptar.nextLine(); // queda esperando que precionemos la tecla enter para continuar
        }
    }
}