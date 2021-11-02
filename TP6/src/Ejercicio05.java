package src;

import java.util.ArrayList;
import java.util.Scanner;

/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 5:
 *  Realice una búsqueda secuencial en un ArrayList<Integer> que contenga
 *  50 elementos generados aleatoriamente mediante la función java random.
 *  Realice una búsqueda secuencial de la siguiente forma:
     * - se lee el valor que se desea buscar,
     * - se compara la primera posición;
     * - si son iguales,
     * - fin de la búsqueda.
     * - De lo contrario, compararlo con la segunda posición, y así
     * sucesivamente.
     * - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo
     * con un mensaje apropiado.
     * - Si se encuentra, se debe especificar la posición que ese valor ocupa en
     * la lista por primera vez.
 * */
public class Ejercicio05 {
    public static void main(String[] args) {
        final int ARRAYLISTSIZE = 50;
        ArrayList<Integer> numerosAleatorios = new ArrayList<Integer>();
        numerosAleatorios.ensureCapacity(ARRAYLISTSIZE);
        boolean seEncontró = false;
        int posicion;
        int numeroBuscado;

        Scanner sc = new Scanner(System.in);
        System.out.println("--> Ingrese el valor a buscar (max 100):");
        numeroBuscado = sc.nextInt();

        cargarArrayListConNumAleatorios(numerosAleatorios,50,100);

        for (int i = 1; i < (ARRAYLISTSIZE - 1) && !seEncontró ; i++) {
            if (numerosAleatorios.get(i-1).equals(numeroBuscado)) {
                seEncontró = true;
                posicion = i;
                mostrarMensajeEncontrado(numeroBuscado,posicion);
            }
        }
        if(!seEncontró){
            mostrarMensajeNoEncontrado();
        }
    }
    /**Recibe el ArrayList donde se cargaran los numeros aleatorios, la cantidad de numeros a generar y el maximo valor posible a generar
     * */
    public static void cargarArrayListConNumAleatorios(ArrayList<Integer> numeros, int cantNumeros, int maximo){
        for (int i = 0; i < cantNumeros; i++){
            int num = (int)(Math.random()*maximo) + 1;
                numeros.add(num);
        }

        System.out.println("---------- NÚMEROS GENERADOS ALEATORIAMENTE ----------");
        System.out.println(numeros);
        System.out.println("------------------------------------------------------\n");
    }

    public static void mostrarMensajeEncontrado(int numeroBuscado, int posicion ){
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("                    ╮(⌒▽⌒)╭");
        System.out.println("     El número "+numeroBuscado+" se encuentra en la posición: " + posicion);
        System.out.println("╚══════════════════════════════════════════════════╝\n");
    }

    public static void mostrarMensajeNoEncontrado(){
        System.out.println("╔════════════════════════════════════════════════════════════╗");
        System.out.println("                      ¯\\_(⊙︿⊙)_/¯");
        System.out.println("  El número ingresado no se encuentra en la lista aleatoria");
        System.out.println("╚════════════════════════════════════════════════════════════╝\n");
    }
}
