/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticouno;

import java.util.Scanner;
import java.util.Random;
/**
 *
 * @author Magali Garcia
 */
public class EjercicioCatorce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Random rd = new Random(); //No pude utilizar la funcion pedida en el ejercicio
        int numeroAleatorio = rd.nextInt(101);
        int intentos = 0;
        
        Scanner Ingreso = new Scanner(System.in);
        System.out.println("Intente adivinar el número! \nIngrese un número del 1 al 100:\n\n");
        int numeroIngresado = Ingreso.nextInt();
        while(numeroIngresado != numeroAleatorio){
            if(numeroIngresado > numeroAleatorio){
                System.out.println("Es muy alto\n");
                numeroIngresado = Ingreso.nextInt();
                intentos++;
            } else if(numeroIngresado < numeroAleatorio){
                System.out.println("Es muy bajo\n");
                numeroIngresado = Ingreso.nextInt();
                intentos++;
            }
        }
        System.out.println("Correcto! \nNúmero Encontrado\n\nCantidad de intentos: " + intentos);
    }
    
}
