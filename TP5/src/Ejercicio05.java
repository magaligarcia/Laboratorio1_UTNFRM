/**Magali Maribel Garcia - DNI: 36552605 - Legajo: 809963 - Laboratorio 1 - Turno Tarde
 * Ejercicio 5:
 * Codifique un algoritmo que solicite un 2 valores enteros mayores o iguales a 2, que se
 * corresponden a cantidad de filas y columnas. Cree un arreglo de tamaño[X,Y] de tipo entero,
 * el tamaño se corresponde a los 2 valores enteros ingresados inicialmente.
 * Solicite al usuario que ingrese números enteros para cargar cada una de las celdas de la matriz.
 * Finalizada la carga calcule el promedio entero de los elementos asignados y cargados en la matriz.
 * Para terminar determine si el promedio calculado se encuentra asignado en alguna de las celdas,
 * si es así indique la posición o posiciones correspondientes, caso contrario muestre el mensaje     “No se encontró ninguna coincidencia”.

 * */
import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        final int maxFilasColumnas = 1000;
        final int minFilasColumnas = 2;

        Scanner scArray = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Cantidad de filas y columnas de la matriz: ");
        System.out.println("====================================================");
        System.out.println("Ingrese un número mayor o igual a 2 para la cantidad de filas: ");
        int X = scArray.nextInt();
        X = validarRangoNumIngresado(X,minFilasColumnas,maxFilasColumnas);

        System.out.println("Ingrese un número mayor o igual a 2 para la cantidad de columnas: ");
        int Y = scArray.nextInt();
        Y = validarRangoNumIngresado(Y,minFilasColumnas,maxFilasColumnas);

        int[][] array = new int[X][Y];
        System.out.println("=====================");
        System.out.println("Matriz de "+X+" x "+Y);
        System.out.println("=====================");
        LlenarMatriz(array);
        int promedio = PromedioMatriz(array);

        System.out.println("--------------------------------------------------------------------");
        System.out.println("El promedio entero de los elementos cargados en la matriz es: " + promedio + " ");
        System.out.println("--------------------------------------------------------------------");

        BusquedaSecuencial(array, promedio);
    }//fin main

    private static void LlenarMatriz(int matriz[][]) {
        Scanner scMatriz = new Scanner(System.in);
    for (int i=0 ; i< matriz.length ; i++){
        for (int j=0 ; j < matriz[i].length ; j++){
            System.out.print("Ingrese un número para la posición --> FILA " + (i+1) + ", COLUMNA " +(j+1) + " ");
            matriz[i][j] = scMatriz.nextInt();
        }
    }
                System.out.println("\nMATRIZ INGRESADA:");
    imprimirArray(matriz);
}

    private static int validarRangoNumIngresado(int numIngresado, int minimo, int maximo) {
        int ingreso = numIngresado;
        while(ingreso < minimo || ingreso > maximo){
            Scanner sc = new Scanner(System.in);
            System.out.println("Error, ingreso un número no valido. Reintentelo con un número entre "+minimo+ " y "+maximo + " (incluidos): ");
            ingreso = sc.nextInt();
        }
        return ingreso;
    }

    private static void imprimirArray(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf(" %d ", matriz[y][x]);
            }
            System.out.println();
        }
    }

    // Promedio de una Matriz
    private static int PromedioMatriz(int[][] m) {
        int resultado = 0;
        int cantidad = 0;
        int promedio = 0;
        int f, c;

        for (f = 0; f < m.length; f++) {
            for (c = 0; c < m[f].length; c++) {
                resultado += m[f][c];
                cantidad++;
            }
        }
        promedio = resultado / cantidad;
        return promedio;
    }

    private static void BusquedaSecuencial(int lista[][], int numBuscado) {
        int n = lista.length;
        boolean seEncontró = false;
        int posicionFila;
        int posicionColumna;
        for (int i = 0; i < lista.length; i++) {
            for (int j = 0; j < lista[i].length; j++) {
                if (lista[i][j] == numBuscado) {
                    seEncontró = true;
                    posicionFila = i + 1;
                    posicionColumna = j + 1;
                    System.out.println("El número de promedio es igual al valor almacenado en la posicion: FILA: " + posicionFila + ", COLUMNA: " + posicionColumna);
                }//fin if
            }
        }//fin for
        if(seEncontró == false){
            System.out.println("El número de promedio no se encontro dentro de la matriz ingresada. ");
        }
    }

}//fin ejercicio