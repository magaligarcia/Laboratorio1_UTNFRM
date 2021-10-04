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
public class EjercicioDoce {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int diaIngresado;
        
        Scanner dia = new Scanner(System.in);
        System.out.println("Ingrese una opción de 1 al 7: \n Opción 1: LUNES \n Opción 2: MARTES \n Opción 3: MIERCOLES \n Opción 4: JUEVES \n Opción 5: VIERNES \n Opción 6: SABADO \n Opción 7: DOMINGO");
        diaIngresado = dia.nextInt();
        
        while(diaIngresado > 7 || diaIngresado < 1){
            System.out.println("\n\n---------------------------------------");
            System.out.println("************* ERROR! ************* \nDebe ingresar un número entre 1 y 7: \n\n Opción 1: LUNES \n Opción 2: MARTES \n Opción 3: MIERCOLES \n Opción 4: JUEVES \n Opción 5: VIERNES \n Opción 6: SABADO \n Opción 7: DOMINGO");
            System.out.println("---------------------------------------\n\n");
            diaIngresado = dia.nextInt();
        }
        switch(diaIngresado){
            case 6:
                System.out.println("╔════════════════════╗");
                System.out.println("  Día NO laboral");
                System.out.println("╚════════════════════╝");
                break;
            case 7:
                System.out.println("╔════════════════════╗");
                System.out.println("  Día NO laboral");
                System.out.println("╚════════════════════╝");
                break;
            default:
                System.out.println("╔════════════════════╗");
                System.out.println("    Día laboral");
                System.out.println("╚════════════════════╝");
         
                
        }
        
    }
    
}
