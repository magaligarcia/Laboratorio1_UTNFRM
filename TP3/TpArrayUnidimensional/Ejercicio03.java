/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 3: Crea un array o arreglo unidimensional donde tú le indiques el tamaño por teclado y crear
una función que rellene el array o arreglo con los múltiplos de un numero pedido por
teclado. Por ejemplo, si defino un array de tamaño 5 y elijo un 3 en la función, el array
contendrá 3, 6, 9, 12, 15. Muéstralos por pantalla usando otra función distinta.
 * */
package TpArrayUnidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el tamaño del array: ");
        int tamañoArray = teclado.nextInt();
        int array [] = new int[tamañoArray];

        System.out.println("Ingrese un número para saber sus multiplos: ");
        int numSeleccionado = teclado.nextInt();

        rellenarArray(tamañoArray, numSeleccionado, array);
        System.out.println("Los primeros " + tamañoArray +" multiplos de " + numSeleccionado + " son: ");
        mostrarArray(array);
    }

    static void rellenarArray(int tamanio, int numIngresado, int array[]){
        for (int i=1 ; i<=tamanio ; i++){
            int resultado = i * numIngresado;
            array[i-1] = resultado;
        }
    }//fin rellenarArray()

    static void mostrarArray(int Array[]){
        System.out.println("==============");
        for(int i=0;i<Array.length;i++)
        {
            System.out.println("    " + Array[i]);
        }
        System.out.println("==============");
    }// fin mostrarArray()
}
