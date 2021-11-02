/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 2:
 *  Codifique una aplicación que:
     * a) lea 20 números decimales ingresados por teclado por el usuario y los coloque en un ArrayList<Double>.
     * b) determine y muestre el mayor de los números en el arreglo
     * c) determine y muestre el menor de los números del arreglo calcule y muestre el rango (diferencia entre el mayor y el menor) de los elementos en el arreglo
 * */
package src;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ejercicio02 {
    public static void main(String[] args) {
        int capacidadArray = 3;
        boolean esDecimal;
        double mayor;
        double menor;
        double rango;

        cabecera();
        Scanner sc = new Scanner(System.in);
        //creando el ArrayList:
        ArrayList<Double> decimales = new ArrayList<Double>();
        //Determino su longitud para no utilizar recursos demás:
        decimales.ensureCapacity(capacidadArray);

        String n;
        for (int i = 0 ; i< capacidadArray; i++){
            System.out.println("Introzca un número decimal para la posicion " + (decimales.size()+1) + ": ");
            n = sc.nextLine();
            esDecimal = validarNumDecimal(n);
            while(esDecimal != true){
                System.out.println("No ingreso un número decimal. Por favor, reintentelo: ");
                n = sc.nextLine();
                esDecimal = validarNumDecimal(String.valueOf(n));
            }
                decimales.add(Double.parseDouble(n));
        }

        mayor = Collections.max(decimales);
        menor = Collections.min(decimales);
        rango = (mayor - menor);

        mostrarResultados(decimales, mayor, menor, rango);
    }

        //Devuelve true si la cadena tiene la sintaxis de un decimal
        public static boolean validarNumDecimal(String cad)
        {
            boolean hayPunto=false;
            StringBuffer parteEntera = new StringBuffer();
            StringBuffer parteDecimal = new StringBuffer();
            int i=0, posicionDelPunto;

            for( i=0;i<cad.length(); i++ )
                if ( cad.charAt(i) == '.')                          //Detectar si hay un punto decimal en la cadena
                    hayPunto=true;
            if(hayPunto)                                            //Si hay punto guardar la posicion donde se encuentra el carater punto
                posicionDelPunto=cad.indexOf('.');                  //(si la cadena tiene varios puntos, detecta donde esta el primero).
            else
                return false;                                       //Si no hay punto; no es decimal

            if( posicionDelPunto == cad.length()-1 || posicionDelPunto== 0)    //Si el punto esta al final o al principio no es un decimal
                return false;

            for( i=0;i<posicionDelPunto; i++ )
                parteEntera.append(cad.charAt(i)) ;                 //Guardar la parte entera en una variable

            for(i = 0; i<parteEntera.length(); i++)
                if( ! Character.isDigit(parteEntera.charAt(i)) )    //Si alguno de los caracteres de la parte entera no son digitos no es decimal
                    return false;

            for( i=posicionDelPunto+1;i<cad.length(); i++ )
                parteDecimal.append(cad.charAt(i));                 //Guardar la parte decimal en una variable

            for(i = 0; i<parteDecimal.length(); i++)
                if( ! Character.isDigit(parteDecimal.charAt(i)) )   //Si alguno de los caracteres de la parte decimal no es un digito no es decimal
                    return false;                                   //Incluye el caso en el que la cadena tenga dos o mas puntos

            return true;                                            //Si paso todas las pruebas anteriores, la cadena es un Numero decimal
        }


    public static void cabecera(){
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("                   BIENVENIDO");
        System.out.println("          Ingreso de 20 números decimales");
        System.out.println("     Todos los números ingresados deben tener");
        System.out.println("       un '.' punto decimal, no se permiten ");
        System.out.println("         letras ni caracteres especiales.");
        System.out.println("╚══════════════════════════════════════════════════╝\n");

    }

    public static void mostrarResultados(ArrayList<Double> decimales, double mayor, double menor, double rango){
        System.out.println("╔══════════════════════════════════════════════════╗");
        System.out.println("  Ha ingresado los siguientes " + decimales.size() + " números decimales:");
        System.out.println("╚══════════════════════════════════════════════════╝");
        System.out.println(decimales);
        System.out.println();
        System.out.println("╔════════════════════════╗");
        System.out.println("  El mayor es: " + mayor);
        System.out.println("  El menor es: " + menor);
        System.out.println("  El rango es: " + rango);
        System.out.println("╚════════════════════════╝");

    }

}
