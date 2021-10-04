import java.util.Scanner;
/* Magali Garcia - Laboratorio 1 - Turno Tarde
EJERCICIO: Solicite el ingreso de una cadena y determine el tamaño de la misma y cuantas
vocales tiene en total (recorre el String con charAt) */

public class Ejercicio07 {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    System.out.println("Ingrese una frase: ");
    String cadenaIngresada = sc.nextLine();
    int cantCaracteres;
    int contadorVocales = 0;

    cadenaIngresada = cadenaIngresada.toLowerCase();  //Convierto a minusculas
    cantCaracteres = cadenaIngresada.replace(" ","").length();  //elimino los espacios entre palabras y cuento la cantidad de caracteres

    for(int i = 0; i < cantCaracteres; i++){
        char c= cadenaIngresada.charAt(i);
        if(c =='a' || c == 'e' || c =='i' || c =='i' || c == 'o' || c == 'u')
            contadorVocales++;
        }
        System.out.println("===============================================");
        System.out.println("La frase ingresada tiene " + cantCaracteres + " caracteres en total. \nDe los cuales " + contadorVocales + " son vocales.");
        System.out.println("===============================================");
    }
}
