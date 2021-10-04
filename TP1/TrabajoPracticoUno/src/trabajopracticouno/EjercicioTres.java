/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajopracticouno;

/**
 *
 * @author Magali Garcia
 */
public class EjercicioTres {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int NumeroUno = 10;
        int NumeroDos = 2;
        int Suma = NumeroUno + NumeroDos;
        int Resta = NumeroUno - NumeroDos;
        int Multiplicacion = NumeroUno * NumeroDos;
        int Division = NumeroUno / NumeroDos;
        int Modulo = NumeroUno % NumeroDos;
        
        System.out.println("--------------------- OPERACIONES ARITMÉTICAS ---------------------");
        System.out.println("La suma de los numeros: " + NumeroUno + " + " + NumeroDos + " es: " + Suma);
        System.out.println("La resta de los numeros: " + NumeroUno + " - " + NumeroDos + " es: " + Resta);
        System.out.println("La multiplicación de los numeros: " + NumeroUno + " x " + NumeroDos + " es: " + Multiplicacion);
        System.out.println("La division de los numeros: " + NumeroUno + " / " + NumeroDos + " es: " + Division);
        System.out.println("El módulo entre los numeros: " + NumeroUno + " % " + NumeroDos + " es: " + Modulo);
    }
    
}
