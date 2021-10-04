import java.util.Scanner;

/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO: Pedir el ingreso de dos cadenas por por teclado, indicar si la segunda cadena se
encuentra dentro de la primera (usar indexOf o contains).
* */
public class Ejercicio13 {
    public static void main(String[] args) {
        Scanner scCadenaUno = new Scanner(System.in);
        System.out.println("Al ingresar dos cadenas de texto, se le dirá si la segunda se encuentra dentro de la primera.");
        System.out.println("Ingrese la primer frase: ");
        String cadenaUno = scCadenaUno.nextLine();

        Scanner scCadenaDos = new Scanner(System.in);
        System.out.println("Ingrese la segunda frase:");
        String cadenaDos = scCadenaDos.nextLine();

        if(cadenaUno.contains(cadenaDos)){
            System.out.println("**************************************************");
            System.out.println("La segunda frase se encuentra dentro de la primera");
            System.out.println("**************************************************");
        } else {
            System.out.println("*****************************************************");
            System.out.println("La segunda frase NO se encuentra dentro de la primera");
            System.out.println("*****************************************************");
        }

    }
}
