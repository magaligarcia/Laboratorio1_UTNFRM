/**@author: Magali Garcia - DNI: 36552605 - Legajo: 809963 - magalimaribelgarcia@gmail.com
 * Laboratorio 1 Turno Tarde - Colecciones con Asociación en JAVA
 *  * Ejercicio 4: Menú restaurante
 * */

package Ejercicio04;
import java.util.ArrayList;
import java.util.Scanner;

public class MenuRestaurant {
    public static void main(String[] args) {
        ArrayList<Plato> platos = new ArrayList<Plato>();
        ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();
        //Declaración de variables
        int opcionPlatoBebida;
        boolean esBebida;
        String nombrePlato;
        double precioPlato;
        int cantidadIngrediente;
        String nombreIngrediente;
        String unidadMedida;
        String salir;

        System.out.println("╔═════════════════╗");
        System.out.println("   CARGA DE MENÚ ");
        System.out.println("╚═════════════════╝\n");
        System.out.println("1) Ingresar un PLATO");
        System.out.println("2) Ingresar una BEBIDA");
        opcionPlatoBebida = leerOpcionPlatoBebida();

        if (opcionPlatoBebida == 1) {
            while (true) {
                Plato platillo = new Plato();
                System.out.println("Ingrese el nombre del plato: ");
                nombrePlato = leerCadena();
                System.out.println("Ingrese el precio de cada plato de "+nombrePlato);
                precioPlato = leerDouble();
                 esBebida = false;

                platillo.setNombreCompleto(nombrePlato);
                platillo.setPrecio(precioPlato);
                platillo.setEsBebida(esBebida);

                while(true) {
                    Ingrediente ingredient = new Ingrediente();
                    System.out.println("Ingrese un ingrediente del platillo " + nombrePlato);
                    nombreIngrediente = leerCadena();
                    System.out.println("Ingrese en números la cantidad de "+nombreIngrediente+" que lleva la receta: ");
                    cantidadIngrediente = leerNumeroEntero();
                    System.out.println("Ingrese la unidad de medida de la cantidad de "+nombreIngrediente);
                    unidadMedida = leerCadena();

                    //SETTERS INGREDIENTES:
                    ingredient.setNombre(nombreIngrediente);
                    ingredient.setCantidad(cantidadIngrediente);
                    ingredient.setUnidadMedida(unidadMedida);
                    platillo.addArrayIngredientes(ingredient);

                    //SALIR DE LA CARGA DE INGREDIENTES?
                    System.out.println("Desea ingresar otro INGREDIENTE del platillo "+nombrePlato+"? \n---> s (si) n (no)");
                    salir = leerCadena();
                    if(salir.equals("n")){
                        break;
                    }
                }// fin while ingrediente
                platos.add(platillo);

                //SALIR DE LA CARGA DE PLATOS?
                System.out.println("Desea ingresar otro PLATO al menú? \n---> s (si) n (no)");
                salir = leerCadena();
                if(salir.equals("n")){
                    break;
                }
            }//fin while plato
        } else { //Si la opcion elegida es bebida:
            while (true) {
                Plato bebida = new Plato();
                esBebida = true;
                System.out.println("Ingrese el nombre de la bebida: ");
                String nombreBebida = leerCadena();
                System.out.println("Ingrese el precio de la bebida: ");
                double precioBebida = leerDouble();

                //SETTERS BEBIDAS:
                bebida.setNombreCompleto(nombreBebida);
                bebida.setPrecio(precioBebida);
                bebida.setEsBebida(esBebida);
                platos.add(bebida);

                //SALIR DE LA CARGA DE BEBIDAS?
                System.out.println("Desea ingresar otra bebida al menú? \n---> s (si) n (no)");
                salir = leerCadena();
                if(salir.equals("n")){
                    break;
                }
            }//fin while bebidas
        }//fin else

        mostrarMenu(platos, ingredientes);

    }//fin main
    private static void mostrarMenu(ArrayList<Plato> plato, ArrayList<Ingrediente> ingredientes) {
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("       BIENVENIDO AL MENÚ        ");
        System.out.println("▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        for (Plato p : plato) {
            System.out.println("\n --- " + p.getNombreCompleto().toUpperCase() + " --- ");
            System.out.println("Precio: $ " + p.getPrecio());
            System.out.println("Ingredientes: ");
            System.out.println(completarConEspacios("NOMBRE") + "\t" + completarConEspacios("CANTIDAD / UNIDAD DE MEDIDA ") + "");
            for (Ingrediente i : ingredientes) {
                System.out.println(
                        completarConEspacios(i.getNombre()) + "\t "
                      + completarConEspacios(String.valueOf(i.getCantidad()) + "\t "
                      + completarConEspacios(i.getUnidadMedida())));
            }
        }
    }

    private static int leerOpcionPlatoBebida() {
        int numero = 0;
        while (true) {
            numero = new Scanner(System.in).nextInt();
            if (numero <= 0 || numero > 2) {
                System.out.println("La opción ingresada NO ES VALIDA. Por favor reintentelo: ");
            } else {
                break;
            }
        }
        return numero;
    }

    private static String leerCadena(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("***************************** ERROR ********************************");
                System.out.println("El valor ingresado no puede ser vacio. Por favor reintentelo:");
            }else{
                break;
            }
        }
        return cadena;
    }
    private static int leerNumeroEntero(){
        int numero = 0;
        while(true){
            numero = new Scanner(System.in).nextInt();
            if(numero <= 0){
                System.out.println("************************** ERROR *****************************");
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
                break;
            }
        }
        return numero;
    }

    private static double leerDouble(){
        double num;
        while(true){
            num = new Scanner(System.in).nextDouble();
            if(num <= 0){
                System.out.println("**************** ERROR *******************");
                System.out.println("El número debe ser un entero mayor a cero.");
            }else{
                break;
            }
        }
        return num;
    }
    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }
}