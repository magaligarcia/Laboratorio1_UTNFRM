/*@author Magali Garcia - DNI: 36552605 - Legajo: 809963
 * Laboratorio 1 Turno Tarde - Arrays Multidimensionales
 * Ejercicio 1:
 *  Crea un programa que pida por pantalla cuatro países y a continuación tres
    ciudades de cada uno de estos países. Los nombres de ciudades deben
    almacenarse en un array multidimensional cuyo primer índice sea el número
    asignado a cada país y el segundo índice el número asignado a cada ciudad. Es decir
    el array deberá tener un tamaño de 4x4
    Ejemplo de resultados que debe mostrar el programa:
    País: Argentina Ciudades: Buenos Aires Cordoba La Plata
    País: España Ciudades: Madrid Lugo Sevilla
    País: Francia Ciudades: Paris Niza Lyon
    País: Italia Ciudades: Roma Napoles Sicilia
*/
package TpArrayMultidimensional;
import java.util.Scanner;

public class Ejercicio01 {
    public static void main(String[] args) {
        int cantPaises = 4;
        int cantCiudades = 4;
        String[][] arrayPaisesYCiudades = new String[cantPaises][cantCiudades];
        Scanner teclado = new Scanner(System.in);

        for (int pais = 0 ; pais < cantPaises ; pais++ ){
            System.out.println("Ingrese pais "+(pais+1)+": ");
            arrayPaisesYCiudades[pais][0] = teclado.nextLine();

            for (int ciudad = 1 ; ciudad < cantCiudades ; ciudad++){
                System.out.println("Ingrese el nombre de la ciudad: ");
                arrayPaisesYCiudades[pais][ciudad] = teclado.nextLine();
            }
        }

        System.out.println("========================================");
        for (int i = 0 ; i < cantPaises ; i++ ){
            System.out.println();
            for (int j = 0 ; j < cantCiudades ; j++){
                System.out.println(arrayPaisesYCiudades[i][j]);
            }
        }

    }

}