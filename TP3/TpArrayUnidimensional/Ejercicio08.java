/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 8:
 * Solicite al usuario el ingreso de una cadena de números separadas por guiones medio, por
    ejemplo:
    45-9-8-6-45-23-21-74-96-32-45-25
    Posteriormente aplique el método SPLIT de los String de Java para convertir la cadena en
    un arreglo, y calcular la suma total de los elementos y el valor promedio calculado.

 * */
package TpArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio08 {
    public static void main(String[] args) {
        int suma;
        int promedio;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese una serie de numeros separados por guines medio para calcular su suma.");
        System.out.println("Por ejemplo: 45-9-8-6-45-23-21-74-96-32-45-25");
        String cadenaIngresada = teclado.nextLine();

        String[] cadenaSeparada = cadenaIngresada.split("\\-");
        int[] cadenaConvertidaAInt = convertirElementosStringAInt(cadenaSeparada);
        suma = sumarElementosArray(cadenaConvertidaAInt);
        promedio = calculaPromedio(suma, cadenaConvertidaAInt.length);

        System.out.println("La suma total de los números ingresados es: " + suma);
        System.out.println("El valor promedio es: " + promedio);
    }

    static int[] convertirElementosStringAInt(String Array[]) {
        int[] valores = new int[Array.length];
        for(int i = 0; i < valores.length; i++){
            valores[i] = Integer.parseInt(Array[i]);
        }
        return valores;
    }

    static int sumarElementosArray(int[] Array){
        int suma = 0;
        for(int i = 0; i < Array.length; i++) {
            suma += Array[i];
        }
        return suma;
    }

    static int calculaPromedio(int total, int elementos){
        int promedio = total / elementos;
        return promedio;
    }

}
