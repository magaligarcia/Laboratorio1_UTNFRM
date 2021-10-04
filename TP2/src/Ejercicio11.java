import java.util.Scanner;

/* Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO: Pedir dos palabras por teclado, indicar si son iguales. (equals, compareTo,
compareToIgnoreCase)
 */
public class Ejercicio11 {
    public static void main(String[] args) {
        Scanner scCadena1 = new Scanner(System.in);
        System.out.println("Ingrese la primer palabra a comparar: ");
        String cadena1 = scCadena1.nextLine();

        Scanner scCadena2 = new Scanner(System.in);
        System.out.println("Ingrese la segunda palabra a comparar: ");
        String cadena2 = scCadena2.nextLine();

        if (cadena1.equals(cadena2)){
            System .out.println("************************************");
            System.out.println("Las palabras ingresadas son iguales!");
            System .out.println("************************************");
        } else {
            System .out.println("************************************");
            System.out.println("Las cadenas son diferentes entre sí");
            System .out.println("************************************");
        }

    }
}
