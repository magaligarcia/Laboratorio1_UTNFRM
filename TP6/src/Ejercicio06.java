package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 6:
 *  Codifique una aplicación que solicite y cargue en una ArrayList<Integer> 10
 * dígitos enteros, luego cree dos nuevas ArrayList<Integer> y asigne a la
 * primera los números ingresados por el usuario de forma ascendente y en la
 * segunda de forma descendente. Muestre las 2 listas por pantalla.
 * Investigue como ordenar una Lista(List<>)
 * */
public class Ejercicio06 {
    public static void main(String[] args) {
        final int ARRAYLISTSIZE = 10;
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        numeros.ensureCapacity(ARRAYLISTSIZE);
        Scanner sc = new Scanner(System.in);
        String n;
        int num;

        for (int i=0; i < ARRAYLISTSIZE; i++){
            System.out.println("Introzca un número entero para la posicion "+(i+1)+": ");
            n = sc.nextLine();
            while(!esEntero(n)){
                System.out.println("No ingreso un número entero. Por favor, reintentelo: ");
                n = sc.nextLine();
            }
            if (esEntero(n)){
                num = Integer.parseInt(n);
                numeros.add(num);
            }
        }
        System.out.println("╔════════════════════════════════════════╗");
        System.out.println("     Numeros en el orden ingresado: \n     "+numeros);
//DESCENDENTE
        ArrayList<Integer> numerosDesc = new ArrayList<Integer>();
        Comparator<Integer> comparador = Collections.reverseOrder();
        Collections.sort(numeros, comparador);
        for (int i = 0; i < ARRAYLISTSIZE; i++) {
            numerosDesc.add(numeros.get(i));
        }
        System.out.println("\n     Numeros en orden descendente: \n     "+numerosDesc);

//ASCENDENTE
        ArrayList<Integer> numerosAsc = new ArrayList<Integer>();
        Collections.sort(numeros);
        for (int i = 0; i < ARRAYLISTSIZE; i++) {
            numerosAsc.add(numeros.get(i));
        }
        System.out.println("\n     Numeros en orden ascendente: \n     "+numeros);
        System.out.println("╚════════════════════════════════════════╝\n");
    }//main

    //Devuelve true si en una cadena que llega todos son numeros, false en caso contrario
    public static boolean esEntero(String cad)
    {
        for(int i = 0; i<cad.length(); i++)
            if( !Character.isDigit(cad.charAt(i)) )
                return false;

        return true;
    }
}//Ejercicio06
