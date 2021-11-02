/** Magali Maribel Garcia - DNI: 36552605 - Legajo: 809963 - Laboratorio 1 - Turno Tarde
 * Ejercicio 1:
 * 1- Explique brevemente en qué consisten los siguientes Algoritmos Fundamentales.
     * Algoritmos de Ordenación:
         *  Ordenamiento por Inserción
         *  Algoritmo de la burbuja
         *  Ordenamiento por selección
         *  Algoritmo Quick-Sort
     * Algoritmos de Búsqueda:
         *  Búsqueda Secuencial
         *  Búsqueda Binaria
     * Algoritmos de Recorrido:
         *  Recorrido de Profundidad
         *  Recorrido de Anchura
 * */
public class Ejercicio01 {}
/**********************************************************************************************************************************************************
 * ALGORITMO DE ORDENACIÓN: *******************************************************************************************************************************
 *  Ordenamiento por inserción:
 *      Se toma un primer elemento considerado ordenado, luego un segundo elemento se compara con el ya ordenado y de ser menor se coloca a su izquierda.
 *      este paso se repite con el resto de elementos no ordenados, recorriendo toda la lista y dezplazando a la derecha todos los elementos mayores a el.
 *
 *  Algoritmo de la burbuja:
 *      Consiste en comparar una pareja de elementos e intercambiar sus valores en caso de que no se encuentren ordenados, así el valor mas pequeño flota
 *      como una burbuja hacia el principio de la lista. Se detiene cuando ya todos los valores estan en orden.
 *
 *  Ordenamiento por selección:
 *      Recorre toda la lista buscando el menor de todos los elementos, lo colaca al principio de la lista, se repite esta accion ignorando el/los elemento/s ya ordenado,
 *      colocando cada elemento uno detras del otro. Su rendimiento no es optimo ya que recorre toda la lista por mas que los elementos ya se encuentren ordenados o parcilamente ordenados
 *
 *  Algoritmo Quick-Sort:
 *      Este algoritmo consiste en seleccionar un elemento pivote de la lista a ordenar, poniendo a un lado los menores a él y del otro los mayores. De esta manera el pivote
 *      Se repite este proceso con el resto de sublistas formadas a los lados del pivote, siempre que tengan mas de un elemento, hasta que la lista quede ordenada.
 *
 *
 **********************************************************************************************************************************************************
 * ALGORITMOS DE BUSQUEDA: ********************************************************************************************************************************
 *  Búsqueda Secuencial:
 *      (Método utilizado para listas no ordenadas)
 *      Recorre la lista, elemento a elemento, desde el primero al ultimo hasta que se encuentre el que se busca o termine la lista
 *
 *  Búsqueda Binaria:
 *      (Método utilizado para listas ordenadas)
 *      Este método se puede iniciar desde un valor central de la lista ordenada y ver si ese elemento es mayor o menor al buscado, de esta manera
 *      se busca solo en una mitad de la lista, en lugar de la lista completa. Repitiendo este mismo paso con cada segmento obtenido, reduciendo cada vez
 *      más el espacio de busqueda.
 *
 *
 **********************************************************************************************************************************************************
 *ALGORITMOS DE RECORRIDO: ********************************************************************************************************************************
 *  Recorrido de Profundidad:
 *      El recorrido de un árbol con este método comienza desde su nodo raiz y continua por su primer hijo, hasta su descendiente más lejano,
 *      antes de pasar al siguiente hijo debe recorrerse todos los descendientes del primero.
 *
 *  Recorrido de Anchura:
 *      Este método consta en comenzar por el nodo raiz, luego recorre todos sus hijos para despues continuar con los hijos de sus hijos y así sucesivamente.
 *      Cada nivel es procesado completamente antes de continuar con el siguiente.
 *
 * */