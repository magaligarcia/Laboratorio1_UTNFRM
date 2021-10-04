/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticouno;

import javax.swing.JOptionPane;
/**
 *
 * @author Magali Garcia
 */
public class EjercicioCuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int numeroUno = 10;
        int numeroDos = 20;
        
        if(numeroUno > numeroDos){
            JOptionPane.showMessageDialog(null, "Los números ingresados son: " + numeroUno + " y " + numeroDos+ "\n\nEl mayor es: " + numeroUno);
        } else if(numeroUno < numeroDos){
            JOptionPane.showMessageDialog(null, "Los números ingresados son: " + numeroUno + " y " + numeroDos+ "\n\nEl mayor es: " + numeroDos);
        } else {
            JOptionPane.showMessageDialog(null, "Los números ingresados son: " + numeroUno + " y " + numeroDos+ "\n\nLos números son iguales");
        }
    }
    
}
