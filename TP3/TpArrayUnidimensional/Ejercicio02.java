/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 2: Crea un array o arreglo unidimensional con un tamaño de 5, asignale los valores
numéricos manualmente (los que tú quieras) y muestralos por pantalla. Solicite los
números mediante un bucle.
 * */
package TpArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int numerosIngresados [] = new int[5];
        Scanner teclado = new Scanner(System.in);
        System.out.println("===================");
        System.out.println(" Ingrese 5 números.");
        System.out.println("===================");

        for(int i = 0 ; i<5 ; i++){
            System.out.println("Numeros ingresados hasta el momento: " + i + "\nIngrese un numero:" );
            numerosIngresados[i] = teclado.nextInt();
        }

        System.out.println("============================");
        System.out.println("Los números ingresados son: ");
        System.out.println("============================");

        for (int i = 0 ; i<5 ; i++){
            System.out.println("    " + numerosIngresados[i]);
        }
        System.out.println("============================");
    }
}
