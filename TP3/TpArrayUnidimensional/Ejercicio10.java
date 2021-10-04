/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 10:
 * Dado 2 array de enteros, el primero de tamaño 5 y el segundo de tamaño 10,
 * pedir los valores numéricos enteros para cargar cada uno de los arreglos,
 * cree un tercer arreglo de tamaño 5 que contenga en cada posición la suma de la
 * multiplicación de cada elemento del array uno, por cada elemento del array 2
 * ARRAY3= (posición 0 del arreglo 1 * posición 0 del arreglo 2) +
 * (posición 0 del arreglo 1 * posición 1 del arreglo 2) +
 * (posición 0 del arreglo 1 * posición 2 del arreglo 2) + .....+ (posición 4 del arreglo 1 * posición 9 del arreglo 2)
 * Use 2 estructuras iterativas anidadas para realizar el cálculo y asignación de los valores en el 3 array.
 */
package TpArrayUnidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        int[] primerArray = new int[5];
        int[] segundoArray = new int[10];
        int[] tercerArray = new int[5];

        System.out.println("========================================");
        System.out.println("Ingrese 5 números para el primer array: ");
        System.out.println("========================================");
        rellenarArray(primerArray);
        System.out.println("=========================================");
        System.out.println("Ingrese 10 números para el segundo array: ");
        System.out.println("=========================================");
        rellenarArray(segundoArray);

        // for anidados para rellenar el 3er array con la suma de la multiplicación
        // de cada elemento del 1er array, por cada elemento del 2do array
        for (int i = 0 ; i < primerArray.length ; i++){
            for (int j = 0 ; j< segundoArray.length ; j++){
                tercerArray[i] += primerArray[i] * segundoArray[j];
                }
        }

        System.out.println("Primer Array: "+Arrays.toString(primerArray));
        System.out.println("Segundo Array: "+Arrays.toString(segundoArray));
        System.out.println("Tercer Array: "+Arrays.toString(tercerArray));
    }

    static void rellenarArray(int array[]){
        Scanner teclado = new Scanner(System.in);
        for (int i=0 ; i<array.length ; i++){
            System.out.println("Ingrese un numero para la posicion "+ (i+1) +" del array:");
            array[i] = teclado.nextInt();
        }
    }//fin rellenarArray()
}
