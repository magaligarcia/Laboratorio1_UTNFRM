/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 6:
 * Realice una búsqueda secuencial en un arreglo unidimensional de tamaño 50 generado
        aleatoriamente mediante la función java random.
        Realice una búsqueda secuencial de la siguiente forma:
        - se lee el valor que se desea buscar,
        - se compara la primera posición;
        - si son iguales,
        - fin de la búsqueda.
        - De lo contrario, compararlo con la segunda posición, y así sucesivamente.
        - Si se llega al final del arreglo y no se encontró el valor, debe indicarlo con un mensaje
        apropiado.
        - Si se encuentra, se debe especificar la posición que ese valor ocupa en el arreglo por
        primera vez.
 * */
package TpArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio06 {
    public static void main(String[] args) {
        int largoArray = 50;
        int arrayAleatorio [] = new int[largoArray];
        int numBuscar;
        int posicionNumEncontrado = -1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese el valor a buscar: ");
        numBuscar = teclado.nextInt();

        //Genero los numeros aleatorios y los cargo en el array
        for(int i = 0 ; i<largoArray ; i++){
            arrayAleatorio[i] = (int) (Math.random()*100)+1;
            System.out.println(arrayAleatorio[i]);
        } //fin carga aleatoria

        //Busco si el numero ingresado coincide con algun valor del array
        posicionNumEncontrado = buscarNumEnArray(arrayAleatorio, numBuscar);

        if (posicionNumEncontrado == -1){
            System.out.println("No se encontro el numero ingresado dentro del array");
        } else
            System.out.println("El numero ingresado se encuentra en la posicion: "+ posicionNumEncontrado);
    }

    public static int buscarNumEnArray(int[] array, int numABuscar){
        for(int i = 0 ; i<array.length ; i++){
            if(array[i] == numABuscar){
                return i;
            } //fin if
        }// fin for busqueda
        return -1;
    }
}
