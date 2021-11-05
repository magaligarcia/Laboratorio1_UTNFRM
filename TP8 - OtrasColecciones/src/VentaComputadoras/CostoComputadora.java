package VentaComputadoras;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;

public class CostoComputadora {
    public static void main(String[] args) {
        String marcaComputadora = " ";
        String modeloComputadora = " ";
        String salir = " ";
        HashSet<Computadora> computadoras = new HashSet<Computadora>();
        while(true) {
            Computadora nuevaComputadora = new Computadora();
            System.out.println("╔═════════════════╗");
            System.out.println("  CARGA DE DATOS ");
            System.out.println("╚═════════════════╝\n");
            System.out.println("Ingrese la marca: ");
            marcaComputadora = leerCadena();
            System.out.println("Ingrese el modelo: ");
            modeloComputadora = leerCadena();
            nuevaComputadora.setMarca(marcaComputadora);
            nuevaComputadora.setModelo(modeloComputadora);

            while (true) {
                ComponenteCPU nuevoComponente = new ComponenteCPU();
                System.out.println("   ╔══════════════════════════╗");
                System.out.println("       CARGA DE COMPONENTES ");
                System.out.println("   ╚══════════════════════════╝\n");
                System.out.println("Ingrese un componente: ");
                String componenteNuevaPC = leerCadena();
                System.out.println("Ingrese la marca del componente: ");
                String marcaComponente = leerCadena();
                System.out.println("Ingrese la cantidad: ");
                int cantidadComponente = leerNumeroEntero();
                System.out.println("Ingrese el precio: ");
                double precioComponente = leerDouble();

                nuevoComponente.setComponente(componenteNuevaPC);
                nuevoComponente.setMarca(marcaComponente);
                nuevoComponente.setCantidad(cantidadComponente);
                nuevoComponente.setPrecio(precioComponente);
                nuevaComputadora.addArrayComponentes(nuevoComponente);
                System.out.println("Desea agregar otro componente? \n---> s (si) n (no)");
                salir = leerCadena();
                if (salir.equals("n")) {
                    break;
                }
            }
        computadoras.add(nuevaComputadora);
        System.out.println("Desea cargar una nueva computadora? \n---> s (si) n (no)");
        salir = leerCadena();
        if(salir.equals("n")){
            break;
        }
    }
        //MOSTRAR DATOS INGRESADOS
        int contadorComputadoras = 1;

        for (Computadora compu : computadoras) {
        double total = 0;
        double subTotal = 0;
        double precioSugerido = 0;
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
        System.out.println("         DETALLES COMPUTADORA "+contadorComputadoras);
        System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
            contadorComputadoras++;
            System.out.println("• MARCA:  "+marcaComputadora);
            System.out.println("• MODELO: "+modeloComputadora);
            System.out.println(completarConEspacios("COMPONENTE")+ "\t" + completarConEspacios("MARCA") + "\t" + completarConEspacios("CANTIDAD") + "\t" + completarConEspacios("PRECIO X UNIDAD")+ "\t" + completarConEspacios("SUBTOTAL"));
            System.out.println("----------------------------------------------------------------------------------------------------------");
            for (ComponenteCPU compo : compu.getComponentes()) {
                System.out.println(
                        completarConEspacios(compo.getComponente()) + "\t" +
                        completarConEspacios(compo.getMarca()) + "\t" +
                        completarConEspacios(Integer.toString(compo.getCantidad())) + "\t" +
                        completarConEspacios(Double.toString(compo.getPrecio())) + "\t" + completarConEspacios(Double.toString(subTotal = compo.getPrecio() * compo.getCantidad())));
                total += subTotal;
            }
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("                                                                                  COSTO TOTAL: $"+ total);
            if (total < 50000){
                precioSugerido = total + (total*40/100);
            } else {
                precioSugerido = total + (total*30/100);
            }
            System.out.println("                                                                     PRECIO DE VENTA SUGERIDO: $" + precioSugerido);
            System.out.println("\n");
        }

    }//fin main

    private static String leerCadena(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("\n***************************** ERROR ********************************");
                System.out.println("       El valor ingresado no puede ser vacio. Reintentelo:");
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
