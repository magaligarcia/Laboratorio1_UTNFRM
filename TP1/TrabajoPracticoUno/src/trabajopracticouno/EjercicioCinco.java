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
public class EjercicioCinco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
            Scanner number = new Scanner(System.in);
            System.out.println("Ingrese un número para saber si es divisible por 2: ");
            int numeroIngresado = number.nextInt();
            if(numeroIngresado % 2 == 0){
                JOptionPane.showMessageDialog(null, "Usted ingreso el número: " + numeroIngresado + "\n\nEste número si es divisible entre 2");
            } else {
                JOptionPane.showMessageDialog(null, "Usted ingreso el número: " + numeroIngresado + "\n\nEste número NO es divisible entre 2");
            }
            
    }
    
}
