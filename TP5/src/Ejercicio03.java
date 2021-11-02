import java.util.Scanner;

/**Magali Maribel Garcia - DNI: 36552605 - Legajo: 809963 - Laboratorio 1 - Turno Tarde
 * Ejercicio 3:
 * Modifique los algoritmos de ordenamiento anteriores (inserción, burbuja, selección)
 * para que además de la lista a ordenar revisan como parámetro un “String orden”,
 * cuyo valor será “ASC” o “DESC”, que permita definir si la lista debe ordenarse de forma ASCENDENTE o DESCENDENTE.
 * */
public class Ejercicio03 {
    public static void main(String[] args) {
        Scanner tipoOrden = new Scanner(System.in);
        System.out.println("Ingrese el tipo de orden en que sea ver la lista: ");
        System.out.println("* ASC");
        System.out.println("* DESC");
        String orden = tipoOrden.nextLine();
        int[] lista = new int[12];
        lista = CrearVectorAleatorio(12);

        System.out.println("Array sin ordenar: ");
        mostrarArray(lista); //Muestra un array aleatorio desordenado

// DESCOMENTAR PARA PROBAR CADA MÉTODO:
        OrdenamientoInsercion(lista, orden);
        //OrdenamientoBurbuja(lista, orden);
        //OrdenamientoSeleccion(lista, orden);

        System.out.println("Array ordenado: ");
        mostrarArray(lista); //Muestra el array ordenado según el método que se descomento
    }
    static void OrdenamientoInsercion(int lista[], String orden) {
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

    static void OrdenamientoBurbuja(int lista[], String orden) {
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

    static void OrdenamientoSeleccion(int lista[], String orden) {
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

    /** Crear un vector con numeros aleatorios diferentes a 0*/
    public static int[] CrearVectorAleatorio(int cantidadValores)
    {
        int vectorAleatorio[] = new int[cantidadValores];
        int aleatorio;
        int i;
        for(i = 0; i<cantidadValores; i++)
        {
            do
            {
                aleatorio = (int) (Math.random()*32);
            }
            while(aleatorio == 0);
            vectorAleatorio[i] = aleatorio;
        }
        return vectorAleatorio;
    }

    /** Muestra un vector en columna */
    static void mostrarArray(int Array[]){
        for(int i=0;i<Array.length;i++)
        {
            System.out.println("    " + Array[i]);
        }
    }// fin mostrarArray()


}
