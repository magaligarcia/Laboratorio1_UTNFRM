package src;

import java.util.ArrayList;
import java.util.Scanner;

/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones 1
 *  * Ejercicio 4:
 *Codifique una aplicación que permita almacenar palabras en un
     * ArrayList<String> hasta que se ingrese la palabra “salir”, al finalizar
     * muestre por pantalla:
     * a) Las palabras ingresadas
     * b) Indicar cuál de las palabras ingresadas posee más caracteres
     * c) Indicar si se ingresaron o no palabras iguales o repetidas
     * d) Mostrar las palabras repetidas ingresadas y cuantas veces se repitió esa
     * palabra
 * */
public class Ejercicio04 {
    public static void main(String[] args) {
        bienvenida();
        ArrayList<String> palabrasIngresadas = new ArrayList<String>();
        String palabra = " ";
        String palabraConMasCaracteres = "";
        int contadorCaracteres =0;
        int contadorPalabraRepetida =0;
        String palabraRepetida="";

        Scanner sc = new Scanner(System.in);
        System.out.println("Introduzca una palabra o ingrese 'salir' para finalizar la carga: ");
        palabra = sc.nextLine();

        while (!palabra.equals("salir")) {
            boolean existe =palabrasIngresadas.contains(palabra);
            if(existe){
                contadorPalabraRepetida++;
                palabraRepetida = palabra;
            }

            if (contieneSoloLetras(palabra)) {
                palabrasIngresadas.add(palabra);
                if(palabra.length() >= contadorCaracteres){
                    contadorCaracteres = palabra.length();
                    palabraConMasCaracteres = palabra;
                }
            } else{
                Scanner scReintento = new Scanner(System.in);
                System.out.println("No es valido");
                System.out.println("reintentelo");
                palabra = scReintento.nextLine();
            }
            Scanner scConfirm = new Scanner(System.in);
            System.out.println("Introduzca una palabra o ingrese 'salir' para finalizar la carga: ");
            palabra = scConfirm.nextLine();
        }
        if(contadorPalabraRepetida >1){
            contadorPalabraRepetida++;
        }
        mostrarDatos (palabrasIngresadas,palabraConMasCaracteres,contadorCaracteres,palabraRepetida,contadorPalabraRepetida);

    }//fin main

        public static void bienvenida () {
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("                   BIENVENIDO");
            System.out.println("     Ingrese la cantidad de palabras que quiera");
            System.out.println("     y se le mostrará cual posee más caracteres,");
            System.out.println("       y si se ingresaron palabras repetidas.");
            System.out.println("     Para finalizar la carga de palabras ingrese:");
            System.out.println("                     'salir'");
            System.out.println("╚══════════════════════════════════════════════════╝\n");
        }

        public static boolean contieneSoloLetras (String cadena){
            for (int x = 0; x < cadena.length(); x++) {
                char c = cadena.charAt(x);
                // Si no está entre a y z, ni entre A y Z
                if (!((c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))) {
                    return false;
                }
            }
            return true;
        }

        public static void mostrarDatos (ArrayList<String> palabrasIngresadas, String palabraConMasCaracteres, int contadorCaracteres, String palabraRepetida, int contadorPalabraRepetida){
            System.out.println("╔══════════════════════════════════════════════════╗");
            System.out.println("    PALABRAS INGRESADAS: \n    " + palabrasIngresadas);
            System.out.println("\n    PALABRA CON MÁS CARACTERES -> " + palabraConMasCaracteres);
            System.out.println("    CANTIDAD DE CARACTERES:    -> " + contadorCaracteres);
            System.out.println("\n    PALABRA REPETIDA           -> " + palabraRepetida);
            System.out.println("    CANTIDAD DE REPETICIONES:  -> " + contadorPalabraRepetida);
            System.out.println("╚══════════════════════════════════════════════════╝\n");
            System.out.print("                FIN DEL PROGRAMA\n");

        }

    }
