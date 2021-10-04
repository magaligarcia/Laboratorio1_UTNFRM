/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticouno;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Magali Garcia
 */
public class EjercicioTrece {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int numeroIngresado;
        boolean primo = true;
        
        Scanner numeroPrimo = new Scanner(System.in);
        System.out.println("Ingrese un número para saber si es primo: ");
        numeroIngresado = numeroPrimo.nextInt();

        if (numeroIngresado <= 1) {
            primo = false;
            }
        
        for(int i = 2; i < numeroIngresado; i++) {
            if (numeroIngresado % i == 0) {
                primo = false;
                break;
            }
        }
        
        if (primo){
            JOptionPane.showMessageDialog(null, "---------  " + numeroIngresado + "  --------- \n----  ES PRIMO  ----");
        } else
            JOptionPane.showMessageDialog(null, "------------  " + numeroIngresado + "  ------------ \n----  NO ES PRIMO  ----");
    }
}
