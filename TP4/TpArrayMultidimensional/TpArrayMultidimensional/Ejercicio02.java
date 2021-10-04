/*@author Magali Garcia - DNI: 36552605 - Legajo: 809963
 * Laboratorio 1 Turno Tarde - Arrays Multidimensionales
 * Ejercicio 2:
 *  Crea un programa que pida por pantalla 2 valores numéricos enteros X e Y. Cree un
    primer array de tamaño [X,Y] de tipo entero y almacene en cada posición un valor
    entero que deberá ser ingresado por el usuario. A continuación cree un segundo
    array de tamaño [Y,X] y almacene en cada posición un valor entero que deberá ser
    ingresado por el usuario. Finalmente cree un tercer array de tamaño [X,Y] que será
    el resultante de multiplicar cada una de las posiciones de las filas del array uno por
    cada una de las posiciones de las columnas del array 2.
    Muestre por pantalla cada uno de los arrays con sus valores.
*/
package TpArrayMultidimensional;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        separadorDoble();
        System.out.println("    Multiplicando dos matrices:");
        separadorDoble(); saltoDeLinea();
//INGRESO FILAS Y COLUMNAS
        System.out.println("Ingrese el número de filas: ");
        separadorSimple();
        int X = teclado.nextInt();

        System.out.println("Ingrese el número de columnas: ");
        separadorSimple();
        int Y = teclado.nextInt();

        int[][] array1 = new int[X][Y];
        int[][] array2 = new int[Y][X];
        int[][] array3 = new int[X][Y];

        separadorDoble();
        System.out.println("Completando la PRIMERA matriz de "+X+"x"+Y+": ");
        separadorDoble();

        for (int i=0 ; i< array1.length ; i++){
            for (int j=0 ; j < array1[i].length ; j++){
                System.out.print("Ingrese un número para la posición " + (i+1) + "-" +(j+1) + ": ");
                array1[i][j] = teclado.nextInt();
            }
        }
        System.out.println("\nPRIMERA MATRIZ:");
        imprimirArray(array1);

        separadorDoble();
        System.out.println("Completando la SEGUNDA matriz  de "+Y+"x"+X+": ");
        separadorDoble();
        for (int i=0 ; i< array2.length ; i++){
            for (int j=0 ; j < array2[i].length ; j++){
                System.out.print("Ingrese un número para la posición " + (i+1) + "-" +(j+1) + ": ");
                array2[i][j] = teclado.nextInt();
            }
        }
        System.out.println("\nSEGUNDA MATRIZ:");
        imprimirArray(array2);
        separadorDoble();

        array3 = multiplicacionMatrices(array1,array2);

        System.out.println("****** MATRIZ RESULTADO ******\n");
        imprimirArray(array3);
        separadorDoble();
    }// fin main

    static void imprimirArray(int[][] puzzle){
        for (int[] row : puzzle) {
            for (int elem : row) {
                System.out.printf("%4d", elem);
            }
            System.out.println();
        }
        System.out.println();
    }

    public static int[][] multiplicacionMatrices ( int[][] a, int[][] b) {
        int[][] c = new int[a.length][b[0].length];

        for (int i= 0; i<c.length; i++)
            for (int j=0; j<c[0].length; j++)
                for (int k=0; k<b.length; k++)
                    c[i][j] = c[i][j] + a[i][k] * b[k][j];
        return c;
    }

    static void separadorDoble(){
        System.out.println("=====================================");
    }

    static void separadorSimple(){
        System.out.println("-----------------------------");
    }

    static void saltoDeLinea(){
        System.out.println();
    }


}
