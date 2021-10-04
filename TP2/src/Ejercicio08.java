import java.util.Scanner;
/* Magali Garcia - Laboratorio 1 - Turno Tarde
EJERCICIO: Reemplaza todas las a del String anterior por una e. (aplique replace)
 */

public class Ejercicio08 {
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
            if(c =='a')
                c = 'e';
        }
        System.out.println("====================================");
        System.out.println("La frase ingresada tiene " + contadorVocales + " vocales.");
        System.out.println("====================================");
    }
}
