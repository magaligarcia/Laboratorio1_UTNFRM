/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 4:
 * Escriba una aplicación que:
        a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un
        arreglo unidimensional.
        b) determine y muestre el mayor de los números en el arreglo
        c) determine y muestre el menor de los números del arreglo calcule y muestre el rango
        (diferencia entre el mayor y el menor) de los elementos en el arreglo
 * */
package TpArrayUnidimensional;
import java.util.Scanner;

public class Ejercicio04 {
    public static void main(String[] args) {
        int largoArray = 20;
        double[] decimalesIngresados = new double[largoArray];
        Scanner teclado = new Scanner(System.in);
        System.out.println("==============================");
        System.out.println(" Ingrese 20 números decimales.");
        System.out.println("==============================");

        for(int i = 0 ; i<largoArray ; i++){
            System.out.println("Numeros ingresados hasta el momento: " + i + "\nIngrese un numero:" );
            decimalesIngresados[i] = teclado.nextDouble();
        }
        double resultado[] = mayorYMenorArray(decimalesIngresados);
        double rango = (resultado[1] - resultado[0]);
        System.out.println("El menor de los ingresados es: "+resultado[0]);
        System.out.println("El mayor de los numeros ingresados es: "+resultado[1]);
        System.out.println("El rango es: " + rango);
    }

    static double[] mayorYMenorArray(double[] array){
            double menor = 0;
            double mayor = 0;
            for(int i=0 ; i<array.length ; i++){
                if (menor>array[i] || menor==0) menor = array[i];
                if(mayor<array[i]) mayor = array[i];
            }
            return new double[] {menor, mayor};
        }


}
