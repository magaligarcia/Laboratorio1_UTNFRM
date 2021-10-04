/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO: Solicite el ingreso de un número y conviértalo a un String mediante
String.valueOf*/

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número: ");
        int numeroIngresado = sc.nextInt();

        String cadena = String.valueOf(numeroIngresado);

        System.out.println(cadena + " Ahora es una cadena de texto.");
    }
}
