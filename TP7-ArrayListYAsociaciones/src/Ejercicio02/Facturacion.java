package Ejercicio02;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Facturacion {
    private static String[][] articulos = {
            {"101",     "Leche",            "25"},
            {"102",     "Gaseosa",          "30"},
            {"103",     "Fideos",           "15"},
            {"104",     "Arroz",            "28"},
            {"105",     "Vino",             "120"},
            {"106",     "Manteca",          "20"},
            {"107",     "Lavandina",        "18"},
            {"108",     "Detergente",       "46"},
            {"109",     "Jabón en Polvo",   "96"},
            {"110",     "Galletas",         "60"}};

    public static void main(String[] args) {
        Factura fact = new Factura();   //2 - a
        DetalleFactura detalle = new DetalleFactura();
        System.out.println("╔═══════════════╗");
        System.out.println("   FACTURACIÓN");
        System.out.println("╚═══════════════╝");
        System.out.println("Ingrese los siguientes datos:"); // 2 - b
        System.out.println("---> Fecha de factura: ");
        String fechaFactura = leerCadena();
        System.out.println("---> Número de factura: ");
        long numeroFactura = leerLong();
        System.out.println("---> Cliente: ");
        String cliente = leerCadena();
        double subtotal = 0;
        double descuento = 0;

        fact.setFechaFactura(fechaFactura);
        fact.setNumeroFactura(numeroFactura);
        fact.setCliente(cliente);

        while(true){
            String[] articuloEncontrado = buscarCodigo();
            System.out.println("El articulo " + articuloEncontrado[1].toUpperCase() + " ha sido encontrado.");
            System.out.println("Ingrese la cantidad de unidades de " + articuloEncontrado[1].toUpperCase() + " a facturar");
            int cantidadUnidades = (int)leerNumeroEntero();
            double precioUn = Integer.parseInt(articuloEncontrado[2]);

            detalle.setCantidad(cantidadUnidades);
            detalle.setCodigoArticulo(articuloEncontrado[0]);
            detalle.setNombreArticulo(articuloEncontrado[1]);
            detalle.setPrecioUnitario(precioUn);

            if(cantidadUnidades > 5){

            descuento = (detalle.getPrecioUnitario() * 0.1);
            subtotal = (detalle.getPrecioUnitario() * cantidadUnidades) - (descuento * cantidadUnidades);
            } else {
                subtotal = (detalle.getPrecioUnitario() * cantidadUnidades);
            }

            detalle.setDescuentoItem(descuento);
            detalle.setSubtotal(subtotal);

            fact.addDetalleFactura(detalle); //le agrego el detalle que acabo de crear e instanciar

            System.out.println("Desea continuar? s (si) n (no)");
            String salir = leerCadena();
            if(salir.equals("n")){
                break;
            }
        }

        //calculo la suma de los subtotales
        fact.calcularMontoTotal();
        //imprimo
        imprimirFactura(fact);
    }

    private static String leerCadena(){
        String cadena = "";
        while(true){
            cadena = new Scanner(System.in).nextLine();
            if(cadena.isEmpty()){
                System.out.println("***************************** ERROR ********************************");
                System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente la cadena.");
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

    private static String[] buscarCodigo(){
        String [] articulo = new String[3];
        while(true){
            System.out.println("Ingrese el código del articulo a facturar: ");
            String codigo = leerCadena();

            boolean encontrado = false;
            for(int i=0; i < articulos.length; i++){
                if(articulos[i][0].equals(codigo)){
                    articulo[0] = articulos[i][0];
                    articulo[1] = articulos[i][1];
                    articulo[2] = articulos[i][2];
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("El codigo ingresado no  existe, intente nuevamente.");
            }else{
                break;
            }
        }

        return articulo;
    }

    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }

    private static void imprimirFactura( Factura fact){
        System.out.println("╔════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╗");
        System.out.println("    Fecha de factura: " + fact.getFechaFactura());
        System.out.println("    Número de factura: " + fact.getNumeroFactura());
        System.out.println("    Cliente: " + fact.getCliente() + "\n");
        System.out.println(completarConEspacios("Código del articulo") + "\t"+completarConEspacios("Nombre del articulo")+"\t"+completarConEspacios("Cantidad")+"\t"+completarConEspacios("Precio Unitario")+"\t"+completarConEspacios("Descuento")+"\t"+completarConEspacios("Subtotal")+"");
        DecimalFormat formato = new DecimalFormat("#.00");
        for(int i=0; i < fact.getDetallesFactura().size(); i++){
            System.out.println(
                              completarConEspacios(fact.getDetallesFactura().get(i).getCodigoArticulo()) + "\t "
                            + completarConEspacios(fact.getDetallesFactura().get(i).getNombreArticulo()) + " \t "
                            + completarConEspacios(Integer.toString(fact.getDetallesFactura().get(i).getCantidad())) + " \t "
                            + "$ " + completarConEspacios(String.valueOf(fact.getDetallesFactura().get(i).getPrecioUnitario())) + " \t "
                            + "$ " + completarConEspacios(String.valueOf(formato.format(fact.getDetallesFactura().get(i).getDescuentoItem()))) + " \t "
                            + "$ " + completarConEspacios(String.valueOf(fact.getDetallesFactura().get(i).getSubtotal())) + "");
        }
        System.out.println("\n  --------------------------------------------------------");
        System.out.println("    El monto total a abonar por el ingreso es: $ " + fact.getTotalCalculadoFactura());
        System.out.println("\n╚════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════════╝");
    }

}
