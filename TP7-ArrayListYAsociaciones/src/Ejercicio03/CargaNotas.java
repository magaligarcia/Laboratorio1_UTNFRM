package Ejercicio03;
import java.util.ArrayList;
import java.util.Scanner;

public class CargaNotas {
    public static void main(String[] args) {
        ArrayList<Alumno> alumnos = new ArrayList<Alumno>();
        ArrayList<Nota> notas = new ArrayList<Nota>();
        int contadorNotas = 0;
        int acumuladorNotas = 0;
        double  promedio;

        while(true) {
            Alumno alumno = new Alumno();
            System.out.println("╔═══════════════════════════╗");
            System.out.println("  INGRESE DATOS DEL ALUMNO");
            System.out.println("╚═══════════════════════════╝\n");

            System.out.println("Nombre completo: ");
            String nombreCompleto = leerCadena();
            System.out.println("Número de legajo: ");
            long legajo = leerLong();

            alumno.setNombreCompleto(nombreCompleto);
            alumno.setLegajo(legajo);
            alumnos.add(alumno);

            while (true) {
                Nota nota = new Nota();
                System.out.println("Ingrese el nombre de la catedra: ");
                String nombreCatedra = leerCadena();
                System.out.println("Nota: ");
                int notaExamen = (int)leerNumeroEntero();

                nota.setNotaExamen(notaExamen);
                nota.setCatedra(nombreCatedra);
                notas.add(nota);
                contadorNotas++;
                acumuladorNotas = acumuladorNotas +notaExamen;

                System.out.println("Desea ingresar otra nota del alumno " + nombreCompleto.toUpperCase() +"? ---> s (si) n (no) ");
                String salir = leerCadena();
                if(salir.equals("n")){
                    break;
                }
            }
            System.out.println("Desea ingresar otro alumno? ---> s (si) n (no)");
            String salir = leerCadena();
            if(salir.equals("n")){
                promedio = (acumuladorNotas / contadorNotas);
                break;
            }
        }

        for ( int i=0; i < alumnos.size(); i++) {
            System.out.println("╔══════════════════════════════╗");
            System.out.println("    Alumno: " + alumnos.get(i).getNombreCompleto());
            System.out.println("    Número de legajo: " + alumnos.get(i).getLegajo()+"\n");
            for (int j=0; j < notas.size(); j++){
                System.out.println("    Catedra: " + notas.get(j).getCatedra());
                System.out.println("       Nota: " + notas.get(j).getNotaExamen());
            }
            System.out.println("\n    Promedio total de notas: "+promedio);
            System.out.println("╚══════════════════════════════╝\n");
        }

    }//main

    private static String leerCadena(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("***************************** ERROR ********************************");
                System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente el texto.");
            }else{
                break;
            }
        }
        return cadena;
    }

    private static long leerLong(){
        long num;
        while(true){
            num = new Scanner(System.in).nextLong();
            if(num <= 0){
                System.out.println("**************** ERROR *******************");
                System.out.println("El número debe ser un entero mayor a cero.");
            }else{
                break;
            }
        }
        return num;
    }

    private static long leerNumeroEntero(){
        long numero = 0;
        while(true){
            numero = new Scanner(System.in).nextLong();
            if(numero <= 0){
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
                break;
            }
        }
        return numero;
    }

}
