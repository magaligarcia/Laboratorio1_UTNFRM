import java.util.Scanner;

public class OperacionesFraccion {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el numerador de la primer fraccion");
        int num1 = sc.nextInt();
        System.out.println("Ingrese el denominador de la primer fraccion");
        int denom1 = sc.nextInt();

        System.out.println("Ingrese el numerador de la segunda fraccion");
        int num2 = sc.nextInt();
        System.out.println("Ingrese el denominador de la segunda fraccion");
        int denom2 = sc.nextInt();

        Fraccion f1 = new Fraccion();
        f1.setNumerador(num1);
        f1.setDenominador(denom1);

        Fraccion f2 = new Fraccion();
        f2.setNumerador(num2);
        f2.setDenominador(denom2);

        Fraccion f = new Fraccion();
        System.out.println("===================");
        System.out.println("     RESULTADOS    ");
        System.out.println("===================");
        System.out.println(f1 + " + " + f2 + " = " + f.sumarFracciones(f1, f2));
        System.out.println(f1 + " - " + f2 + " = " + f.restarFracciones(f1, f2));
        System.out.println(f1 + " * " + f2 + " = " + f.multiplicarFracciones(f1, f2));
        System.out.println(f1 + " : " + f2 + " = " + f.dividirFracciones(f1, f2));
        System.out.println("===================");
    }
}
