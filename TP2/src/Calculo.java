import java.util.Scanner;
public class Calculo {
    public static void main(String[] args) {
        OperacionMatematica opMat = new OperacionMatematica();
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el 1er Valor");
        String num1 = sc.nextLine().replaceAll(",", ".");
        double valor1 = Double.valueOf(num1);

        System.out.println("Ingrese el 2do Valor");
        String num2 = sc.nextLine().replaceAll(",", ".");
        double valor2 = Double.valueOf(num2);

        opMat.setValor1(valor1);
        opMat.setValor2(valor2);

        System.out.println("======================");
        System.out.println("      RESULTADOS      ");
        System.out.println("======================");
        System.out.println(" " + opMat.getValor1() + " + " + opMat.getValor2() + " = " + opMat.aplicarOperacion("+"));
        System.out.println(" " + opMat.getValor1() + " - " + opMat.getValor2() + " = " + opMat.aplicarOperacion("-"));
        System.out.println(" " + opMat.getValor1() + " * " + opMat.getValor2() + " = " + opMat.aplicarOperacion("*"));
        System.out.println(" " + opMat.getValor1() + " / " + opMat.getValor2() + " = " + opMat.aplicarOperacion("/"));
        System.out.println("======================");


    }
}
