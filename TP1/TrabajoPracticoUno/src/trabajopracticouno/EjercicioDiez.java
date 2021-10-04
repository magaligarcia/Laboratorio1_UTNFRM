/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticouno;

import java.util.Scanner;

/**
 *
 * @author Magali Garcia
 */
public class EjercicioDiez {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner number = new Scanner(System.in);
        int numeroIngresado;
        do{
        System.out.println("Ingrese un número MAYOR o IGUAL a cero: ");
        numeroIngresado = number.nextInt();
        }while(numeroIngresado < 0);
        System.out.println("El numero ingresado es " + numeroIngresado);
    }
    
}
