import java.sql.SQLOutput;
import java.util.Scanner;

/**Magali Maribel Garcia - DNI: 36552605 - Legajo: 809963 - Laboratorio 1 - Turno Tarde
 * Ejercicio 4:
     * Codifique un algoritmo que permita cargar un array de una dimensión de 20 elementos enteros.
     * Finalizada la carga de los 20 elementos el programa debe solicitar como se desea ordenar el
     * array ASCENDENTE O DESCENDENTE y que método de ordenamiento aplicar (inserción, burbuja, selección),
     * según las opciones elegidas aplique el algoritmos fundamental de ordenamiento que corresponda.
     * Muestre por pantalla el array original desordenado y su resultante ordenado según las opciones elegidas.
 * */
public class Ejercicio04 {
    public static void main(String[] args) {
        final int cantidadElementosArray = 20;
        int[] lista = new int[cantidadElementosArray];
        String ordenElegido = "";
        Scanner scArray = new Scanner(System.in);
        System.out.println("=================================================");
        System.out.println("Ingrese 20 números enteros para cargar el array: ");
        System.out.println("=================================================");
        rellenarArray(lista);

        Scanner tipoOrden = new Scanner(System.in);
        System.out.println("==================================================");
        System.out.println("Ingrese el tipo de orden en que sea ver la lista: ");
        System.out.println("==================================================");
        System.out.println("* ASC");
        System.out.println("* DESC");
        String orden = tipoOrden.nextLine();

    /*    while(orden != "ASC" && orden != "DESC") {
            System.out.println("Error, debe ingresar una opcion valida, escriba ASC, para seleccionar el orden de tipo ASCENDENTE o ingrese DESC para seleccionar el tipo de orden DESCENDENTE. \nEN MAYUSCULAS");
            orden = tipoOrden.nextLine();
        }
*/
        if(orden == "ASC")
        {
            ordenElegido = "Ascendente";
        } else
            ordenElegido = "Descendente";


        Scanner metOrdenam = new Scanner(System.in);
        System.out.println("======================================================");
        System.out.println("Ingrese el método de ordenamiento que desea utilizar: ");
        System.out.println("======================================================");
        System.out.println("1) Inserción");
        System.out.println("2) Burbuja");
        System.out.println("3) Selección");
        int metOrden = metOrdenam.nextInt();

        System.out.println("Array sin ordenar: ");
        mostrarArray(lista); //Muestra un array desordenado
        String metElegido = "";
        switch(metOrden){
            case 1:
                OrdenamientoInsercion(lista, orden);
                metElegido = "Inserción";
                break;
            case 2:
                OrdenamientoBurbuja(lista, orden);
                metElegido = "Burbuja";
                break;
            case 3:
                OrdenamientoSeleccion(lista, orden);
                metElegido = "Selección";
                break;

        }//fin switch

        System.out.println("===========================================================");
        System.out.println("Array ordenado por: Método " + metElegido + " de forma " + ordenElegido);
        System.out.println("===========================================================");
        mostrarArray(lista); //Muestra un array ordenado



    }//fin main

    private static void rellenarArray(int array[]) {
        Scanner teclado = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ingrese un numero para la posicion " + (i + 1) + " del array:");
            array[i] = teclado.nextInt();
        }
    }

    private static void mostrarArray(int Array[]){
        for(int i=0;i<Array.length;i++)
        {
            System.out.println("    " + Array[i]);
        }
    }// fin mostrarArray()

    private static void OrdenamientoInsercion(int lista[], String orden) {
        switch (orden){
            case "ASC":
                for (int i = 1; i < lista.length; i++) {
                    int valor = lista[i];
                    int j = i - 1;

                    while (j >= 0 && lista[j] > valor) {
                        lista[j + 1] = lista[j];
                        j--;
                    }//fin while
                    lista[j + 1] = valor;
                }//fin for
                break;
            case "DESC":
                for (int i = 1; i < lista.length; i++) {
                    int valor = lista[i];
                    int j = i - 1;

                    while (j >= 0 && lista[j] < valor) {
                        lista[j + 1] = lista[j];
                        j--;
                    }//fin while
                    lista[j + 1] = valor;
                }//fin for

                break;
            default:
                System.out.println("Error! Ingreso una opcion no valida.");
        }//fin switch
    }// fin Insercion

    private static void OrdenamientoBurbuja(int lista[], String orden) {
        int n = lista.length;
        boolean intercambiado;
        int aux;

        switch (orden) {
            case "ASC":
                do {
                    intercambiado = false;
                    for (int i = 1; i < n; i++)
                        // si este par no está ordenado
                        if (lista[i - 1] > lista[i]) {
                            // los intercambiamos y recordamos que algo ha cambiado
                            aux = lista[i - 1];
                            lista[i - 1] = lista[i];
                            lista[i] = aux;
                            intercambiado = true;
                        }
                }
                while (intercambiado == true);
                break;

            case "DESC":
                do {
                    intercambiado = false;
                    for (int i = 1; i < n; i++)
                        // si este par no está ordenado
                        if (lista[i - 1] < lista[i]) {
                            // los intercambiamos y recordamos que algo ha cambiado
                            aux = lista[i - 1];
                            lista[i - 1] = lista[i];
                            lista[i] = aux;
                            intercambiado = true;
                        }
                }
                while (intercambiado == true);
                break;
            default:
                System.out.println("Error! Ingreso una opcion no valida.");
        }
    }

    private static void OrdenamientoSeleccion(int lista[], String orden) {
        int n = lista.length;
        switch (orden) {
            case "ASC":
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (lista[i] > lista[j]) {
                            int aux = lista[i];
                            lista[i] = lista[j];
                            lista[j] = aux;
                        }//fin for
                    }//fin for
                }
                break;
            case "DESC":
                for (int i = 0; i < n - 1; i++) {
                    for (int j = i + 1; j < n; j++) {
                        if (lista[i] < lista[j]) {
                            int aux = lista[i];
                            lista[i] = lista[j];
                            lista[j] = aux;
                        }//fin for
                    }//fin for
                }
                break;
            default:
                System.out.println("Error! Ingreso una opcion no valida.");
        }//FIN SWITCH
    }

}//FIN EJERCICIO
