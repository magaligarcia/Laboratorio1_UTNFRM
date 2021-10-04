/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 7:
 * Escriba una aplicación que solicite y cargue en un arreglo 10 dígitos enteros, luego cree
    dos nuevos arreglos y asigne al primero los números ingresados por el usuario de forma
    ascendente y en el segundo de forma descendente. Muestre los 2 arreglos por pantalla.
 * */
package TpArrayUnidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio07 {
    public static void main(String[] args) {
        int largoArray = 10;
        int[] array = new int[largoArray];
        int[] array2 = new int[largoArray];
        int[] array3 = new int[largoArray];

        cargarArray(array); //cargo el primer array y lo muestro
        System.out.println("==========================================================");
        System.out.println("Orden ingresado : "+Arrays.toString(array));
        array2 = clonarArray(array,largoArray); //creo un segundo array con el valor del primero
        imprimeArrayOrdenAscendente(array2); //lo ordeno de forma ascendente y lo muestro
        array3 = clonarArray(array, largoArray);//creo un tercer array tambien con el valor del primero
        imprimeArrayOrdenDescendente(array3);//lo ordeno de forma descendente y lo muestro
        System.out.println("==========================================================");
    }//FIN MAIN

    public static int[] cargarArray(int[] array){
        Scanner teclado = new Scanner(System.in);
        for(int i = 0 ; i<array.length ; i++){
            System.out.println("Cantidad de números ingresados hasta el momento: " + i + "\nIngrese un numero:" );
            array[i] = teclado.nextInt();
        }
        return array;
    }

    public static int[] clonarArray(int[] arrayOrigen, int length) {
        int[] arrayNuevo = new int[length];
        for(int i = 0 ; i<arrayNuevo.length ; i++){
            arrayNuevo[i] = arrayOrigen[i];
        }
        int[] arrayNuevo1 = arrayNuevo;
        return arrayNuevo1;
    }

    //utilizo metodo de burbujeo
    static void imprimeArrayOrdenAscendente(int Array[]){
        int aux;
        for (int i = 0;i < Array.length; i++){
            for (int j = 0; j< Array.length-1; j++){
                if (Array[j] > Array[j+1]){
                    aux = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = aux;
                }
            }
        }
        System.out.println("Orden Ascendente: "+Arrays.toString(Array));
    }

    //utilizo metodo de burbujeo
    static void imprimeArrayOrdenDescendente(int Array[]){
        int aux;
        for (int i = 0;i < Array.length; i++){
            for (int j = 0; j< Array.length-1; j++){
                if (Array[j] < Array[j+1]){
                    aux = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = aux;
                }
            }
        }
        System.out.println("Orden Descendente: "+Arrays.toString(Array));
    }

}
