/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
* Arrays Unidimensionales
* Ejercicio 1: ¿Qué sucede si tratamos de acceder un elemento fuera del tamaño del array?
* */
package TpArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        int array [] = {1,3,5,6,7};
        Scanner sc = new Scanner(System.in);
        for(int i = 0 ; i<=5 ; i++){            //CAMBIAR (i<=5) POR (i<5)
            System.out.println(array[i]);
        }
    }
}
/* Si tratamos de acceder a un elemento fuera del tamaño del array nos dará el error "ArrayIndexOutOfBoundsException"
* En el ejemplo el for itera hasta hasta la posicion 5, pero el array comienza desde la posicion 0, no 1. Por lo que estaremos intentando acceder a un
* elemento fuera de rango, para solucionarlo debemos iterar mientras la variable i sea menor a 5 (i<5)*/