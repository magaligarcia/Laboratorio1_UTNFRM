/*
Magali Garcia - Laboratorio 1, turno tarde.
EJERCICIO: Suma los dígitos de un número ingresado por el usuario de forma recursiva.
Ejemplo: el usuario ingresa 1596
El programa debe sumar 1 + 5 + 9 + 6
 */

import java.util.Scanner;

public class Ejercicio22 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor a cero: ");
        int numeroIngresado = sc.nextInt();
        System.out.println("======================================================");
        System.out.println("La suma entre los digitos del número ingresado es: " + sumaDigitos(numeroIngresado));
        System.out.println("======================================================");
    }

    private static int sumaDigitos(int n) {
        if (n == 0)
            return 0;
        else
            return sumaDigitos(n/10) + n%10;
    }
}
