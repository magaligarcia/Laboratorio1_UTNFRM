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
public class EjercicioOnce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String contraseña = "HolaMundo";
        String contraseñaIngresada;
        int intentos = 3;
        
        Scanner password = new Scanner(System.in);
        System.out.println("Ingrese la contraseña: ");
        contraseñaIngresada = password.nextLine();
        
        while(intentos > 0 && contraseñaIngresada.equals(contraseña) == false){
            System.out.println("\n\n\n========================================");
            System.out.println("ERROR!\nLa contraseña ingresada es INCORRECTA.\nPor favor, reinténtelo. \n\nCantidad de intentos: " + intentos);
            System.out.println("========================================\n\n\n");
            contraseñaIngresada = password.nextLine();
            intentos--;
        }
        
        if(intentos <= 0){
            JOptionPane.showMessageDialog(null, "Lo siento, usted ha agotado la cantidad de intentos posibles. \n\nComuníquese con atención al cliente");
        } else {
            System.out.println("╔═════════════════════════╗");
            System.out.println("    Acceso Correcto  ");
            System.out.println("╚═════════════════════════╝");
        }
    }
}
