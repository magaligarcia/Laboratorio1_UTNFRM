/*@author Magali Garcia - DNI: 36552605 - Laboratorio 1 Turno Tarde
 * Arrays Unidimensionales
 * Ejercicio 5:
 * Escriba una aplicación para almacenar aleatoriamente 20 números enteros positivos pares
    del 1 al 100, de los cuales se desea saber:
    a) su promedio aritmético
    b) cuántos de los números son iguales al promedio aritmético
    c) cuántos de los números son mayores que el promedio aritmético
    d) cuántos de los números son menores que el promedio aritmético
 * */
package TpArrayUnidimensional;

import java.util.Scanner;

public class Ejercicio05 {
    public static void main(String[] args) {
        int largoArray = 20;
        int numerosIngresados [] = new int[largoArray];
        int acumulador = 0;
        double promedio = 0;
        int contadorNumIgualesPromedio = 0;
        int contadorNumMayoresAlPromedio = 0;
        int contadorNumMenoresAlPromedio = 0;

        Scanner teclado = new Scanner(System.in);
        System.out.println("==========================================");
        System.out.println(" Ingrese "+largoArray+" números enteros entre 1 y 100: ");
        System.out.println("==========================================");

        for(int i = 0 ; i<largoArray ; i++){
            System.out.println("Cantidad de números ingresados hasta el momento: " + i + "\nIngrese un numero:" );
            numerosIngresados[i] = teclado.nextInt();
            acumulador += numerosIngresados[i];
        }

        promedio = acumulador / largoArray;

        for(int i = 0 ; i<largoArray ; i++){
        if(numerosIngresados[i] == promedio)
            contadorNumIgualesPromedio++;
            else if(numerosIngresados[i] > promedio)
                contadorNumMayoresAlPromedio++;
                else contadorNumMenoresAlPromedio++;
        }

        System.out.println("El promedio aritmetico es: "+promedio);
        System.out.println("Cantidad de números ingresados igual al promedio: "+contadorNumIgualesPromedio);
        System.out.println("Cantidad de números ingresados mayores que el promedio: "+contadorNumMayoresAlPromedio);
        System.out.println("Cantidad de números ingresados menores que el promedio: "+contadorNumMenoresAlPromedio);


    }
}
