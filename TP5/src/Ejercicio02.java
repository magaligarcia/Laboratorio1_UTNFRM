/**Magali Maribel Garcia - DNI: 36552605 - Legajo: 809963 - Laboratorio 1 - Turno Tarde
 * Ejercicio 2:
 * Codifique mediante código JAVA los pseudocódigos de los algoritmos fundamentales presentados en el apunte “Algoritmos Fundamentales” correspondiente.
 *  Ordenamiento por inserción
 *  Algoritmo de la burbuja
 *  Ordenamiento por selección
 *  Búsqueda secuencial
 * */

public class Ejercicio02 {
    public static void main(String[] args) {
        int[] lista = new int[12];
        lista = CrearVectorAleatorio(12);

        System.out.println("Array sin ordenar: ");
        mostrarArray(lista); //Muestra un array aleatorio desordenado

// DESCOMENTAR PARA PROBAR CADA MÉTODO:
        OrdenamientoInsercion(lista);
        //OrdenamientoBurbuja(lista);
        //OrdenamientoSeleccion(lista);

        //BusquedaSecuencial(lista, 4);

        System.out.println("Array ordenado: ");
        mostrarArray(lista); //Muestra el array ordenado según el método que se descomento

    }

    static void OrdenamientoInsercion(int lista[]) {

        for (int i = 1; i < lista.length; i++) {
            int valor = lista[i];
            int j = i - 1;

            while (j >= 0 && lista[j] > valor) {
                lista[j + 1] = lista[j];
                j--;
            }//fin while
            lista[j + 1] = valor;
        }//fin for
    }// fin Insercion

    static void OrdenamientoBurbuja(int lista[]) {
        int n = lista.length;
        boolean intercambiado;
        int aux;
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
    }

    static void OrdenamientoSeleccion(int lista[]) {
        int n = lista.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = i + 1; j < n; j++) {
                if (lista[i] > lista[j]) {
                    int aux = lista[i];
                    lista[i] = lista[j];
                    lista[j] = aux;
                }//fin for
            }//fin for
        }
    }

    static void BusquedaSecuencial(int lista[], int numBuscado) {
        int n = lista.length;
        boolean seEncontró = false;
        int posicion;
        // recorremos la lista, revisando cada elemento de la misma, para ver
        // si es el alumno a.
        for (int i = 1; i < n - 1; i++) {
            // comparamos el alumno de la posición actual con el alumno buscado: a
            if (lista[i] == numBuscado) {
                // encontramos el alumno buscado
                seEncontró = true;
                posicion = i +1;
                System.out.println("La posicion del número encontyrado es: "+posicion);
            }//fin if
            // si nunca se cumple L[i] == a, entonces la variable que indica si se
            // encontró o no el alumno: seEncontró, quedará valiendo falso.
        }//fin for
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
