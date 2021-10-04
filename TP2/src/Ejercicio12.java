/* Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO: Dada una cadena, extraer la cuarta y quinta letra usando el método substring.
 */

import java.util.Scanner;

public class Ejercicio12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese una palabra para extraer la cuarta y quinta letra: ");
        String palabraIngresada = sc.nextLine();

        String primeraParte = palabraIngresada.substring(0,3);
        String segundaParte = palabraIngresada.substring(5);
        System.out.println("******************************");
        System.out.println(primeraParte + segundaParte);
        System.out.println("******************************");
    }
}
