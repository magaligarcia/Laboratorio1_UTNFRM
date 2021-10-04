/*@author Magali Garcia - DNI: 36552605 - Legajo: 809963
 * Laboratorio 1 Turno Tarde - Arrays Multidimensionales
 * Ejercicio 3:
 *  Codifique un programa que solicite un valor entero X mayor o igual a 3 y menor o
    igual a 10. Cree un arreglo de tamaño [X,X] de tipo int. Posteriormente solicite los
    valores necesarios para cargar cada una de las celdas de la matriz. Muestre por
    pantalla la matriz resultante.
    Al finalizar la carga sume cada una de las columnas del array y asigne los resultados
    en una nueva matriz de una dimensión, finalmente sume los valores de esta última
    matriz y muestre el resultado por pantalla.
*/
package TpArrayMultidimensional;
import java.util.Scanner;

public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Cantidad de filas y columnas de la matriz cuadrada: ");
        System.out.println("Ingrese un número entre 3 y 10 (incluidos): ");
        int X = teclado.nextInt();

        while(X < 3 || X > 10){
            System.out.println("ERROR! \nEl número ingresado no esta entre 3 y 10.\nReintentelo:");
            X = teclado.nextInt();
        }
        int[][] array = new int[X][X];

    //CARGA MATRIZ
        for (int i=0 ; i< array.length ; i++){
            for (int j=0 ; j < array[i].length ; j++){
                System.out.print("Ingrese un número para la posición " + (i+1) + "-" +(j+1) + ": ");
                array[i][j] = teclado.nextInt();
            }
        }
        System.out.println("\nMATRIZ INGRESADA:");
        imprimirArray(array);
        System.out.println("================\n");
        System.out.println("*******************");
        System.out.println(" SUMA DE COLUMNAS: ");
        System.out.println("*******************");
        sumaColumnas(array);
    }// FIN MAIN

    static void imprimirArray(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf(" %d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    static void sumaColumnas(int[][] matriz) {
        imprimirArray(matriz);
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("___");
        }
        System.out.println();
        int[] array = new int[matriz[0].length];
        // Luego recorrer por columna y sumar
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
            }
            array[x]= suma;//GUARDO LOS VALORES EN EL ARRAY UNIDIMENSIONAL
            System.out.printf("%d ", suma);
        }

        System.out.println();
        System.out.println("\n================");
        System.out.println("MATRIZ RESULTADO: ");
        int suma = 0;
        for (int i = 0; i < array.length; i++) { //IMPRIMO ARRAY UNIDIMENSIONAL
            System.out.print(array[i] + " ");
            suma += array[i];
        }
        System.out.println("\n================");
        System.out.printf("---> La suma de todos los elementos de la matriz resultado es: %d \n", suma);
    }
}
