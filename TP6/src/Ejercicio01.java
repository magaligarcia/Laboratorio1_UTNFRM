/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 1:
     *  Cree un ArrayList<Integer>, que permita asignar los valores numéricos
     * manualmente (los que tú quieras) hasta ingresar un valor menor a 0,
     * mostrar los números por pantalla. Solicite los números mediante un bucle
 * */

package src;
import java.util.ArrayList;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        //creando el ArrayList:
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        int n;
        do {
            System.out.println("Introzca un número entero o ingrese 0 (Cero) para salir: ");
            n = sc.nextInt();
            if (n != 0){
                numeros.add(n);
            }
        }while (n != 0);

        System.out.println("╔═════════════════════════════════════════╗");
        System.out.println("  Ha ingresado los siguientes " + numeros.size() + " números:");
        System.out.println("╚═════════════════════════════════════════╝");
        System.out.println(numeros);

    }



}
