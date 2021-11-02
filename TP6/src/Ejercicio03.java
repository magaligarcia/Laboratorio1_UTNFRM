/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 3:
 *Codifique una aplicación para almacenar en un ArrayList<Integer>
 *     aleatoriamente 20 números enteros positivos pares del 1 al 100, de los
 *     cuales se desea saber:
 *     a) su promedio aritmético
 *     b) cuántos de los números son iguales al promedio aritmético
 *     c) cuántos de los números son mayores que el promedio aritmético
 *     d) cuántos de los números son menores que el promedio aritmético
 * */
package src;
import java.util.ArrayList;

public class Ejercicio03 {
    public static void main(String[] args) {
        final int capacidadArray = 20;
        double promedio;
        bienvenida();
        ArrayList<Integer> numeros = new ArrayList<Integer>();
        //Determino su longitud para no utilizar recursos demás:
        numeros.ensureCapacity(capacidadArray);
        cargarArrayListConNumAleatoriosPares(numeros,capacidadArray, 100);
        promedio = promedioDeArrayList(numeros);
        System.out.println("╔═════════════════════════════════════════════╗");
        System.out.println("  El promedio total es: "+ promedio );
        cantDeMayoresAlPromedio(numeros, promedio);
        System.out.println("╚═════════════════════════════════════════════╝\n");
}

    public static void bienvenida(){
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("                   BIENVENIDO");
        System.out.println("   Se generarán 20 números aleatorios, enteros, ");
        System.out.println("                positivos y pares ");
        System.out.println("     Se mostrará el promedio de esos números");
        System.out.println("      Cuantos son iguales, cuantos mayores ");
        System.out.println("        y cuantos menores al promedio dado");
        System.out.println("╚══════════════════════════════════════════════════╝\n");
    }

/**Recibe el ArrayList donde se cargaran los numeros aleatorios pares, la cantidad de numeros a generar y el maximo valor posible a generar
 * */
    public static void cargarArrayListConNumAleatoriosPares(ArrayList<Integer> numeros, int cantNumeros, int maximo){
        for (int i = 0; i < cantNumeros; i++){
            int num = (int)(Math.random()*maximo) + 1;
            if(num % 2 == 0){
                int numero = num;
                numeros.add(num);
            }else
                i--;
        }
        System.out.println("Números generados aleatoriamente:");
        System.out.println(numeros + "\n");
    }
/**Recibe el ArrayList, calcula el promedio de sus elementos y lo retorna*/
    public static double promedioDeArrayList(ArrayList<Integer> numeros){
        int suma = 0;
        double promedio;

        for(int i = 0; i < numeros.size(); i++)
        {
            suma += numeros.get(i);
        }
        promedio = (double)suma / numeros.size();
        return promedio;
    }
/**Recibe el ArrayList y el promedio, calcula y muestra la cantidad de numeros menores, iguales y mayores al promedio*/
    public static void cantDeMayoresAlPromedio(ArrayList<Integer> numeros, double promedio) {
    int cantMayores =0;
    int cantIguales =0;
    int cantMenores =0;
        for(int i = 0; i < numeros.size(); i++){
            if (numeros.get(i) == promedio){
                cantIguales++;
            } else if(numeros.get(i) > promedio){
                cantMayores++;
            } else
                cantMenores++;
        }
        System.out.println("  Cantidad de números menores al promedio: " + cantMenores);
        System.out.println("  Cantidad de números iguales al promedio: " + cantIguales);
        System.out.println("  Cantidad de números mayores al promedio: " + cantMayores);
    }
}

