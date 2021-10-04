import java.util.Scanner;
/*
Magali Garcia - Laboratorio 1, turno tarde.
EJERCICIO:
  Desarrolle un programa que ayude a una cajera a determinar el número de billetes y monedas que se necesitan de cada una de las
  siguientes denominaciones 200, 100, 50, 20, 10, 5, 2 y 1, y monedas de 0.50, 0.25, 0.10 y 0.05 centavos para una cantidad de dinero
  dada. Ejemplo si la cantidad es 1390,55 se necesitan 6 billetes de 200, 1 billete de 100, 1 billete de 50, 2 billetes de 20,
  1 moneda de 0.50 y una moneda de 0.05 centavos.
*/
public class Ejercicio04 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("================================================");
        System.out.println("  Ingrese el monto: $ ");
        System.out.println("================================================");
        double montoIngresado = sc.nextDouble();
        double parteDecimal = montoIngresado % 1; // Lo que sobra de dividir al número entre 1
        double parteEntera = montoIngresado - parteDecimal; // Le quitamos la parte decimal usando una resta
        int suma = 0;

        while (montoIngresado < 0) {
            System.out.println("ERROR! \nEl monto debe ser mayor a cero \n\t\tReintentelo:\n\t\t************ ");
            montoIngresado = sc.nextDouble();
        }
        calcularBilletesMonedas((int) parteEntera, parteDecimal);
    }

    /*
    * Dependiendo el contador muestra el mensaje Billete en singular o Billetes en plural
    * */
    public static String singularOPlural(int contador) {
        String pluralOSingular = "";
        if(contador > 1){
            pluralOSingular = "s";
        } return pluralOSingular;
    }

    public static void calcularBilletesMonedas(int parteEntera, double parteDecimal) {
        int contadorBilletes_200 = parteEntera / 200;
        parteEntera %= 200;
        int contadorBilletes_100 = parteEntera / 100;
        parteEntera %= 100;
        int contadorBilletes_50 = parteEntera / 50;
        parteEntera %= 50;
        int contadorBilletes_20 = parteEntera / 20;
        parteEntera %= 20;
        int contadorBilletes_10 = parteEntera / 10;
        parteEntera %= 10;
        int contadorBilletes_5 = parteEntera / 5;
        parteEntera %= 5;
        int contadorBilletes_2 = parteEntera / 2;
        parteEntera %= 2;
        int contadorBilletes_1 = parteEntera / 1;

        int contadorMonedas_050 = (int) (parteDecimal / 0.50);
        parteDecimal %= 0.50;
        int contadorMonedas_025 = (int) (parteDecimal / 0.25);
        parteDecimal %= 0.25;
        int contadorMonedas_010 = (int) (parteDecimal / 0.10);
        parteDecimal %= 0.10;
        int contadorMonedas_005 = (int) (parteDecimal / 0.05);

        //Si no se necesitan billetes no se muestra este bloque:
        if(contadorBilletes_200 != 0 || contadorBilletes_100 !=0 || contadorBilletes_50 !=0 || contadorBilletes_20 !=0 || contadorBilletes_10 !=0 || contadorBilletes_5 !=0 || contadorBilletes_2 !=0 ) {
            System.out.println("========================");
            System.out.println("|         |   CANTIDAD |");
            System.out.println("| BILLETE |      A     |");
            System.out.println("|         |   ENTREGAR |");
            System.out.println("========================");

            if (contadorBilletes_200 != 0)
                System.out.println("   $200  | " + contadorBilletes_200 + " Billete" + singularOPlural(contadorBilletes_200));
            if (contadorBilletes_100 != 0)
                System.out.println("   $100  | " + contadorBilletes_100 + " Billete");
            if (contadorBilletes_50 != 0)
                System.out.println("   $ 50  | " + contadorBilletes_50 + " Billete");
            if (contadorBilletes_20 != 0)
                System.out.println("   $ 20  | " + contadorBilletes_20 + " Billete" + singularOPlural(contadorBilletes_20));
            if (contadorBilletes_10 != 0)
                System.out.println("   $ 10  | " + contadorBilletes_10 + " Billete");
            if (contadorBilletes_5 != 0)
                System.out.println("   $  5  | " + contadorBilletes_5 + " Billete");
            if (contadorBilletes_2 != 0)
                System.out.println("   $  2  | " + contadorBilletes_2 + " Billete" + singularOPlural(contadorBilletes_2));
            if (contadorBilletes_1 != 0)
                System.out.println("   $  1  | " + contadorBilletes_1 + " Billete");
        }

        //Si no se necesitan monedas no se muestra este bloque:
        if(contadorMonedas_050 != 0 || contadorMonedas_025 !=0 || contadorMonedas_010 !=0 || contadorMonedas_005 !=0){
            System.out.println("========================");
            System.out.println("|         |   CANTIDAD |");
            System.out.println("| MONEDA  |      A     |");
            System.out.println("|         |   ENTREGAR |");
            System.out.println("========================");

            if (contadorMonedas_050 != 0)
                System.out.println("   $0.50  | " + Math.round(contadorMonedas_050) + " Moneda");
            if (contadorMonedas_025 != 0)
                System.out.println("   $0.25  | " + Math.round(contadorMonedas_025) + " Moneda");
            if (contadorMonedas_010 != 0)
                System.out.println("   $0.10  | " + Math.round(contadorMonedas_010) + " Moneda" + singularOPlural(Math.round(contadorMonedas_010)));
            if (contadorMonedas_005 != 0)
                System.out.println("   $0.05  | " + Math.round(contadorMonedas_005) + " Moneda");
            }
    }
}
