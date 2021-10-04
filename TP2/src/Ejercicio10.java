import java.util.Scanner;

/* Magali Garcia - Laboratorio 1 - Turno Tarde
EJERCICIO: Convertir una frase a mayúsculas o minúsculas, que daremos opción a que el
usuario lo pida y mostraremos el resultado por pantalla.
 */
public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Quiere modificar la frase a Mayúsculas o Minúsculas?: \n1) Mayúsculas \n2) Minúsculas");
        byte opcionElegida = sc.nextByte();

        while(opcionElegida != 1 && opcionElegida != 2){
            System.out.println("**************************************");
            System.out.println("ERROR! Ingrese el número de la opcion elegida: \n1) Mayúsculas \n2) Minúsculas");
            System.out.println("**************************************");
            opcionElegida = sc.nextByte();
        }
        Scanner scCadena = new Scanner(System.in);
        System.out.println("Ingrese la frase: ");
        String cadenaIngresada = scCadena.nextLine();
        switch(opcionElegida){
            case 1:
                System.out.println(cadenaIngresada.toUpperCase());
                break;
            case 2:
                System.out.println(cadenaIngresada.toLowerCase());
                break;
        }

    }
}
