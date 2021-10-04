/*
Magali Garcia - Laboratorio 1, turno tarde.
EJERCICIO:
CASTEO: Codifique un programa que solicite el ingreso de un numero decimal y asigne el mismo a una variable valorDecimal de tipo double, aplique las
operaciones de CASTING para convertir la variable a los siguientes tipos de datos, short, int, long, String, float investigue las diferentes formas de lograr la conversión. Muestre por pantalla el resultado de las conversiones.
*/
import java.util.Scanner;

public class Ejercicio01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número decimal: ");
        double valorDecimal = sc.nextDouble();

        short valorShort = (short) valorDecimal;
        int valorInt = (int) valorDecimal;
        long valorLong = (long) valorDecimal;
        String valorString = String.valueOf(valorDecimal);
        float valorFloat = (float) valorDecimal;

        System.out.println("El numero ingresado es: " + valorDecimal);
        System.out.println("=========================================");
        System.out.println("Conversión a short: " + valorShort);
        System.out.println("Conversión a int: " + valorInt);
        System.out.println("Conversión a long: " + valorLong);
        System.out.println("Conversión a String: " + valorString);
        System.out.println("Conversión a float: "+valorFloat);
    }

}
/* Hay dos tipos de casteos, el implicito que ocurre cuando se pasa de un tipo de dato más pequeño a uno mas grande, por ejemplo:
int num1 = 100;
long num2 = num1;
Y el explicito, cuando se pasa de un tipo de dato con valor grande a uno más pequeño, pudiendo perder datos en el proceso, por ejemplo:
int num1 = 100;
short num2 = (short) num1;
en este caso antes de asignarle  num1 a num2 le especifico que tiene que convertilo a short
*/
