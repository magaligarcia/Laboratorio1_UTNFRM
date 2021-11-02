package src.Ejercicio07Celda;

import java.util.ArrayList;
import java.util.Scanner;
/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 7:
 *  Codifique la clase celda con los atributos:
     * int fila;
     * int columna;
     * String valor;
     *  Crea una clase Matriz que contenga una variable global
     * ArrayList<Celda>
     * ArrayList<Celda> matrizCuadrada = new ArrayList<Celda>();
     *  Codifique un programa que solicite al usuario un valor para la
     * celda y que solicite la posición donde se desea almacenar el valor,
     * cree una instancia de la clase Celda, asigne los valores cargados
     * por el usuario y agregue la instancia a la lista matrizCuadrada;
     * repita este proceso hasta que el usuario ingrese como valor la
     * cadena “FIN”.
     *  Muestre por pantalla los valores cargados en matrizCuadrada.
     *  Codifique un método que reciba como parámetro los valores fila y
     * columna y retorne el valor almacenado, en caso de que la fila y la
     * columna no exista retorne el mensaje “La fila y columna indicada
     * no ha sido asignada”
 * */
class Matriz {

    static ArrayList<Celda> matrizCuadrada = new ArrayList<>();

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean salir = false;

        do {
            System.out.println("Ingrese un valor para la celda, escriba FIN para salir");
            System.out.println("******************************************************");
            String valor = sc.next();
            if (valor.equalsIgnoreCase("FIN")) {
                salir = true;
            } else {
                System.out.println("Indique la FILA donde desea guardar el valor");
                System.out.println("********************************************");
                int fil = sc.nextInt();
                System.out.println("Indique la COLUMNA donde desea guardar el valor");
                System.out.println("***********************************************");
                int col = sc.nextInt();
                matrizCuadrada.add(new Celda(fil, col, valor));
            }
        } while (salir == false);

        matrizCuadrada.trimToSize();

        System.out.println("Los valores ingresados son:");
        for (Celda e : matrizCuadrada) {
            System.out.println(e.imprimir());
        }

        System.out.println("╔═══════════════════════════════════════════════════════════════════╗");
        System.out.println("  Ingrese la fila y la columna para mostrar el dato correspondiente");
        System.out.println("╚═══════════════════════════════════════════════════════════════════╝");

        System.out.print("Fila:");
        int fil = sc.nextInt();

        System.out.print("Columna:");
        int col = sc.nextInt();

        String dato = buscarDato(fil, col);
        System.out.println("╔═══════════════════════════════════════════════════╗");
        System.out.println("   El dato en la Fila " + fil + " y Columna " + col + " es: " + dato);
        System.out.println("╚═══════════════════════════════════════════════════╝");
    }

    private static String buscarDato(int fil, int col) {
        boolean encontro = false;
        String dato = "";
        for (Celda i : matrizCuadrada) {
            if (i.getFila() == fil && i.getColumna() == col) {
                encontro = true;
                dato = i.getValor();
            }
        }
        if (encontro == false) {
            System.out.println("La fila y columna indicada no ha sido asignada\n");
        }
        return dato;
    }
}