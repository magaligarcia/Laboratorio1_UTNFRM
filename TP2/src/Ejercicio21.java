import java.util.Scanner;

public class Ejercicio21 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese un número entero mayor a cero: ");
        int numeroIngresado = sc.nextInt();

        System.out.println("La suma de todos los números desde "+numeroIngresado+" hasta 1 es: " +factorial(numeroIngresado));
    }

    private static int factorial(int n) {
        if (n==0)
        return 0;
    else
        return n+(factorial(n-1));
    }
}
