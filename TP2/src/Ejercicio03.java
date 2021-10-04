 /*
Magali Garcia - Laboratorio 1, turno tarde.
EJERCICIO:
Codifique un algoritmo que solicite el ingreso de un numero de 3 dígitos (100 - 999) y por medio del uso de las operaciones matemáticas
módulo 10 y división por 10 efectué la suma de los 3 dígitos del número. Ejemplo ingreso 563, salida del algoritmo 14.
  */

import java.util.Scanner;

public class Ejercicio03 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("  Ingrese un número de 3 digitos (100 - 999): ");
        System.out.println("================================================");
        int numeroIngresado = sc.nextInt();
        int suma = 0;

        while(numeroIngresado < 100 || numeroIngresado > 999){
            System.out.println("ERROR! \nEl número debe estar entre: 100 y 999 \n\t\t\tReintentelo:\n\t\t\t************ ");
            numeroIngresado = sc.nextInt();
        }

        while (numeroIngresado > 0) {
            //El resto de dividir el número ingresado por 10 será igual a su ultimo digito, lo guardo en suma:
            suma = suma + numeroIngresado % 10;
            //Guardo la parte entera del número , sí es > 0 vuelve a entrar al bucle y se sumará su último digito:
            numeroIngresado = numeroIngresado / 10;
        }

        System.out.println("================================================");
        System.out.println(" La suma entre los 3 dígitos ingresados es :" + suma);
        System.out.println("================================================");
    }
}
