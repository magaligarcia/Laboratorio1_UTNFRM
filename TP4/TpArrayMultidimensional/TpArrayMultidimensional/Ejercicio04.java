/*@author Magali Garcia - DNI: 36552605 - Legajo: 809963
 * Laboratorio 1 Turno Tarde - Arrays Multidimensionales
 * Ejercicio 4:
 * Codifique un programa que solicite un valor entero X mayor o igual a 4 y menor o
    igual a 10. Cree un arreglo de tamaño [X,X] de tipo int, nos piden hacer un menú
    con estas opciones:
    a) Rellenar TODA la matriz de números, debes pedírselo al usuario.
    b) Suma de una fila que se pedirá al usuario (validar que elija una correcta)
    c) Suma de una columna que se pedirá al usuario (controlar que elija una
    correcta)
    d) Sumar la diagonal principal
    e) Sumar la diagonal inversa
    f) La media de todos los valores de la matriz
    IMPORTANTE: hasta que no se haga la primera opción a, el resto de opciones no se
    deberán de ejecutar, simplemente mostrar un mensaje que diga que debes
    rellenar la matriz. Mostrar por pantalla el resultado de la ejecución de cada una de
    las opciones del menú.
*/
package TpArrayMultidimensional;

import java.util.Arrays;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {

        //Ingreso y validacion
        Scanner teclado = new Scanner(System.in);
        System.out.println("====================================================");
        System.out.println("Cantidad de filas y columnas de la matriz cuadrada: ");
        System.out.println("====================================================");
        System.out.println("Ingrese un número entre 4 y 10 (incluidos): ");
        int X = teclado.nextInt(); //Tamaño del la matriz X.X
        char opcionSeleccionada;
        boolean IngresoMatriz = false;

        while(X < 4 || X > 10){
            System.out.println("ERROR! \nEl número ingresado no esta entre 4 y 10.\nReintentelo:");
            X = teclado.nextInt();
        }
        int[][] array = new int[X][X];
        do {
        opcionSeleccionada = MostrarMenu();
        switch(opcionSeleccionada){
            case 'a':
                //CARGA MATRIZ
                for (int i=0 ; i< array.length ; i++){
                    for (int j=0 ; j < array[i].length ; j++){
                        System.out.print("Ingrese un número para la posición " + (i+1) + "-" +(j+1) + ": ");
                        array[i][j] = teclado.nextInt();
                    }
                }
                System.out.println("\nMATRIZ INGRESADA:");
                imprimirArray(array);
                IngresoMatriz = true;
                break;
            case 'b':
                if (IngresoMatriz == true){
                    seleccionYSumaFila(array);
                }else
                    mensajeError();
                break;
            case 'c':
                if (IngresoMatriz == true){
                seleccionYSumaColumna(array);
                }else
                    mensajeError();
                break;
            case 'd':
                if (IngresoMatriz == true){
                sumarDiagonalPrincipal(array);
                }else
                    mensajeError();
                break;
            case 'e':
                if (IngresoMatriz == true){
                sumarDiagonalInversa(array);
                }else
                    mensajeError();
                break;
            case 'f':
                if (IngresoMatriz == true){
                mediaArray(array);
                }else
                    mensajeError();
                break;
            default:
                opcionSeleccionada = 'x';
                System.out.println("--- PROGRAMA FINALIZADO ---");
        }
        } while (opcionSeleccionada != 'x');

    }// fin main

    //Muestra el menu de opciones y devuelve la opcion seleccionada y validada
    static char MostrarMenu(){
        Scanner opcionMenu = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("               MENÚ DE OPCIONES                 ");
        System.out.println("================================================");
        System.out.println("a) Rellenar TODA la matriz de números.");
        System.out.println("b) Suma de una fila");
        System.out.println("c) Suma de una columna");
        System.out.println("d) Sumar la diagonal principal");
        System.out.println("e) Sumar la diagonal inversa");
        System.out.println("f) La media de todos los valores de la matriz");
        System.out.println("x) Salir");
        System.out.println("================================================");
        System.out.println("Ingrese una opción: ");
        char opcionSeleccionada = opcionMenu.next().charAt(0);
        while(opcionSeleccionada != 'a' && opcionSeleccionada !='b' && opcionSeleccionada != 'c' && opcionSeleccionada != 'd' && opcionSeleccionada != 'e' && opcionSeleccionada != 'f' && opcionSeleccionada !='x'){
            System.out.println("ERROR! \nOpción incorrecta.\nReintentelo:");
            opcionSeleccionada = opcionMenu.next().charAt(0);
        }
        return opcionSeleccionada;
    }
    static void imprimirArray(int[][] matriz) {
        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf(" %d ", matriz[y][x]);
            }
            System.out.println();
        }
    }
    static void seleccionYSumaFila(int[][] matriz){
        System.out.println("---------------------------------");
        System.out.println("Seleccione que fila desea sumar: ");
        System.out.println("---------------------------------");
        int filaSeleccionada;

        //muestro las filas ingresadas:
        for (int x = 0; x < matriz.length; x++) {
            System.out.printf("\nFila N°"+ x +": "+ Arrays.toString(matriz[x]));
        }

        //seleccion de fila:
        Scanner scFila = new Scanner(System.in);
        filaSeleccionada = scFila.nextInt();

        //valido que ingrese una fila existente:
        while (filaSeleccionada > matriz.length || filaSeleccionada < matriz.length){
            System.out.println("Error! ingresó un número de fila inexistente. Reintentelo: ");
            filaSeleccionada = scFila.nextInt();
        }

        //sumar todas las filas
        System.out.println("\n\n*****************************************************");
        int[] array = new int[matriz[0].length];//creo un array unidimensional

        for (int y = 0; y < matriz.length; y++) {
            int suma = 0;
            for (int x = 0; x < matriz[y].length; x++) {
                suma += matriz[y][x];
                array[y]= suma;//guardo los resultados de las sumas en un nuevo array unidimensional
            }
            //mostrar resultado de suma solo de la fila seleccionada:
            if(filaSeleccionada == y) {
                System.out.printf("La suma de los elementos de la fila "+y+" es = %d\n", array[y]);}
        }
        System.out.println("*****************************************************\n\n");
    }
    static void seleccionYSumaColumna(int[][] matriz){
        System.out.println("----------------------------------------------");
        System.out.println("Ingrese el número de columna que desea sumar: ");
        System.out.println("----------------------------------------------");

        for (int y = 0; y < matriz.length; y++) {
            for (int x = 0; x < matriz[y].length; x++) {
                System.out.printf(" %d |", matriz[y][x]);
            }
            System.out.println();
        }
        //imprimo linea divisora:
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print("____");
        }
        //imprimo numero de columna
        System.out.println();
        for (int x = 0; x < matriz[0].length; x++) {
            System.out.print(" "+x+" |");
        }
        System.out.println("<-- Opciones");
        int columnaSeleccionada;

        //seleccion de fila:
        Scanner scFila = new Scanner(System.in);
        columnaSeleccionada = scFila.nextInt();

        //valido que ingrese una columna existente:
        while (columnaSeleccionada > matriz.length || columnaSeleccionada < matriz.length){
            System.out.println("Error! ingresó un número de columna inexistente. Reintentelo: ");
            columnaSeleccionada = scFila.nextInt();
        }

        //suma de columnas
        System.out.println("\n\n*****************************************************");
        int[] array = new int[matriz[0].length];//creo un array unidimensional
        for (int x = 0; x < matriz[0].length; x++) {
            int suma = 0;
            for (int y = 0; y < matriz.length; y++) {
                suma += matriz[y][x];
                array[x]= suma;//guardo los resultados de las sumas en un nuevo array unidimensional
            }
            //mostrar resultado de suma solo de la fila seleccionada:
            if(columnaSeleccionada == x) {
                System.out.printf("La suma de los elementos de la columna "+x+" es = %d\n", array[x]);}
        }
        System.out.println("*****************************************************\n\n");
    }
    static void sumarDiagonalPrincipal(int[][] matriz){
        int suma = 0;
        int x = 0, y = 0;
        while (x < matriz.length && y < matriz[0].length) {
            suma += matriz[y][x];

            x++;
            y++;
        }

        System.out.println("Diagonal principal: ");
        //imprimo la diagonal:
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                if(j==k)
                System.out.printf(" %d ", matriz[j][k]);
            }
        }
        System.out.println("\n\n*************************************************");
        System.out.println("     LA SUMA DE LA DIAGONAL PRINCIPAL ES: "+ suma);
        System.out.println("*************************************************\n\n");
    }
    static void sumarDiagonalInversa(int[][] matriz){
        int suma = 0;
        int x = 0, y = matriz.length - 1;
        while (x < matriz.length && y >= 0) {
            suma += matriz[y][x];
            x++;
            y--;
        }
        System.out.println("Diagonal inversa: ");
        //imprimo la diagonal:
        for (int j = 0; j < matriz.length; j++) {
            for (int k = 0; k < matriz[j].length; k++) {
                if(j+k == matriz.length-1){
                    System.out.printf(" %d ", matriz[j][k]);}
            }
        }
        System.out.println("\n\n*************************************************");
        System.out.println("     LA SUMA DE LA DIAGONAL INVERSA ES: "+ suma);
        System.out.println("*************************************************\n\n");

    }
    static void mediaArray(int[][] matriz){
        int ALTURA = matriz.length;
        int ANCHURA = matriz.length;
        int sumatoria = 0;
        int cantidadElementos = ALTURA * ANCHURA;

        // Recorrer la matriz y sumar
        for (int y = 0; y < ALTURA; y++) {
            for (int x = 0; x < ANCHURA; x++) {
                int elementoActual = matriz[y][x];
                sumatoria = sumatoria + elementoActual;
            }
        }
        // El promedio es = sumatoria / cantidadDeElementos
        float promedio = (float)sumatoria / (float) cantidadElementos;
        System.out.println("\n******************************************************");
        System.out.println("La media de todos los valores de la matriz es: " + promedio);
        System.out.println("******************************************************");
    }
    static void mensajeError(){
        System.out.println("**********************   ERROR!   ***************************");
        System.out.println("Debes ingresarle valores a la matriz primero! \n(Opción 'a')");
        System.out.println("*************************************************************");
    }
}//fin programa
