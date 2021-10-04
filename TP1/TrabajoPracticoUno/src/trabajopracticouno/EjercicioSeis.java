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
public class EjercicioSeis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner price = new Scanner(System.in);
        System.out.println("Ingrese el precio del producto: ");
        double precioIngresado = price.nextDouble();
        int IVA = 21;
        
        double precioFinal = precioIngresado + (precioIngresado * IVA / 100);
        JOptionPane.showMessageDialog(null, "El precio final con IVA incluido es de: " + precioFinal);
    }
    
}
