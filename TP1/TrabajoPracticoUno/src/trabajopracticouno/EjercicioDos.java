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
public class EjercicioDos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner name = new Scanner(System.in);
        System.out.println("Ingrese su nombre");
        String nombre = name.nextLine();
        JOptionPane.showMessageDialog(null, "Bienvenido/a " + nombre);
    }
    
}
