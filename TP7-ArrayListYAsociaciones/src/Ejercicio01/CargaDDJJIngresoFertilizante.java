package Ejercicio01;

import java.util.Scanner;
import java.util.Date;

public class CargaDDJJIngresoFertilizante {

/*1- Cree la clase java Ejercicio01.CargaDDJJIngresoFertilizante que contenga la definición de una variable
    “fertilizantesPermitidos” que se corresponde al siguiente array de 2 dimensiones, 10 filas por
    3 columnas
*/
    private static String[][] fertilizantesPermitidos = {
            {"101",     "UREA",                 "BS"},
            {"102",     "SULFATO AMONICO",      "BS"},
            {"103",     "NITRATO AMONICO",      "BS"},
            {"104",     "NITRATO DE CALCIO",    "BS"},
            {"105",     "SUPERFOSFATO SIMPLE",  "BD"},
            {"106",     "SUPERFOSFATO TRIPLE",  "BD"},
            {"107",     "NITRATO AMONICO",      "BS"},
            {"108",     "CLORURO DE POTASIO",   "BD"},
            {"109",     "SULFATO DE POTASIO",   "BS"},
            {"110",     "NITROGENO LIQUIDO",    "BD"}};

    public static void main(String[] args) {
/*2 a. Crear una instancia (new) de la clase Ejercicio01.DDJJIngresoFertilizante*/
        DDJJIngresoFertilizante ddjj = new DDJJIngresoFertilizante();

/*2 b. Solicite al usuario los datos razón social de la empresa, el cuit, el año y mes de la
    declaración y asigne los mismos en los correspondientes atributos. Valide que la razón
    social no sea vacía, que el cuit posea 11 dígitos y que el mes y año de la declaración no
    supere el mes y año actual, si los datos no cumplen esta condición mostrar un mensaje y
    solicitar el ingreso nuevamente.*/
        System.out.println("DDJJ Ingreso de Fertilizantes a Mendoza");
        System.out.println("Ingrese los siguientes datos;");
        System.out.println("Nombre Empresa:");
        String empresa = leerCadena();
        System.out.println("CUIT Empresa");
        long cuitEmpresa = leerCUIT();
        System.out.println("Año DDJJ");
        int anioDDJJ = leerAnio();
        System.out.println("Mes FFJJ");
        int mesDDJJ = leerMes(anioDDJJ);

        ddjj.setAnioDeclaracion(anioDDJJ);
        ddjj.setCuitEmpresa(cuitEmpresa);
        ddjj.setEmpresa(empresa);
        ddjj.setMesDeclaracion(mesDDJJ);

/*2 c. Solicitar al usuario la cantidad de fertilizantes discriminados por tipo envase que desea
    ingresar a la provincia. Validar que el número ingresado sea mayor a cero. Aplique el
    valor ingresado por el usuario para inicializar la variable detallesFertilizantes de la clase
    Ejercicio01.DDJJIngresoFertilizante con el tamaño indicado: Ejemplo si se ingresa 12 el array tendrá
    un tamaño de 12 filas por 6 columnas.*/

        while(true){
            System.out.println("---------------------------------------");
            String[] fertilizanteEncontrado = buscarFertilizante();
            System.out.println("El fertilizante " + fertilizanteEncontrado[1].toUpperCase() + " ha sido encontrado.");
            System.out.println("Ingrese la cantidad de fertilizantes " + fertilizanteEncontrado[1].toUpperCase() + " a ingresar");
            int cantidadFert = (int)leerNumeroEntero();

            double subTotal = 0;

            String tipoEnvase = fertilizanteEncontrado[2];
            int capacidad = 0;
            if("BD".equals(tipoEnvase)){
                System.out.println("Indique la capacidad del Bidon en litros");
                capacidad = (int)leerNumeroEntero();
                subTotal = 12 * cantidadFert;
            } else {
                capacidad = getCapacidadBolsa();
                double montoXBolsa = getMontoXTamanioBolsa(capacidad);
                subTotal = montoXBolsa * cantidadFert;
                }

            DDJJFertilizanteIngresoDetalle detalle = new DDJJFertilizanteIngresoDetalle(); //creo instancia del objeto (Siempre debe estar dentro del bucle, en este caso While) y le seteo los correspondiente atributos:
            detalle.setCantidad(capacidad);
            detalle.setCapacidadEnvase(subTotal);
            detalle.setCodigo(fertilizanteEncontrado[0]);//posicion 0 es el codigo
            detalle.setNombre(fertilizanteEncontrado[1]);//posicion 1  es el nombre
            detalle.setSubtotal(subTotal);
            detalle.setTipoEnvase(tipoEnvase);

            ddjj.addDetalleFerilizante(detalle);//le agrego el detalle que acabo de crear e instanciar

            System.out.println("Desea continuar? s (si) n (no)");
            String salir = leerCadena();
            if(salir.equals("s")){
                break; //para que se rompa la estructura del While en caso de querer salir
            }
        }
        //calculo la suma de los subtotales
        ddjj.calcularMontoIngresoTotal();
        //imprimo
        imprimirDDJJ(ddjj);
    }

    private static int getCapacidadBolsa(){
        int tamanioBolsa = 0;
        while(true){
            System.out.println("Ingrese la capacidad en kilos de la bolsa. 5, 10, 25 o 50");
            tamanioBolsa = new Scanner(System.in).nextInt();
            if(tamanioBolsa != 5 && tamanioBolsa != 10 && tamanioBolsa != 25 && tamanioBolsa != 50){
                System.out.println("El tamaño de la bolsa no existe, debe ser de 5, 10, 25 o 50. Ingrese nuevamente la capacidad de la bolsa.");
            }else{
                break;
            }
        }
        return tamanioBolsa;
    }

    private static double getMontoXTamanioBolsa(int tamanioBolsa){
        double monto = 0;
        if(tamanioBolsa == 5){
            monto = 5;
        }else if(tamanioBolsa == 10){
            monto = 8;
        }else if(tamanioBolsa == 25){
            monto = 20;
        }else if(tamanioBolsa == 50){
            monto = 36;
        }
        return monto;
    }

    private static String[] buscarFertilizante(){
        String [] fertilizante = new String[3];
        while(true){
            System.out.println("Ingrese el codigo del fertilizante a ingresar");
            String codigo = leerCadena();

            boolean encontrado = false;
            for(int i=0; i < fertilizantesPermitidos.length; i++){
                if(fertilizantesPermitidos[i][0].equals(codigo)){
                    fertilizante[0] = fertilizantesPermitidos[i][0];
                    fertilizante[1] = fertilizantesPermitidos[i][1];
                    fertilizante[2] = fertilizantesPermitidos[i][2];
                    encontrado = true;
                    break;
                }
            }
            if(!encontrado){
                System.out.println("El codigo " + codigo + " del fertilizante ingresado no  existe, intente nuevamente.");
            }else{
                break;
            }
        }

        return fertilizante;
    }

    private static int leerAnio(){
        int anio;
        while(true){
            anio = new Scanner(System.in).nextInt();
            if(anio > (new Date().getYear() + 1900)){
                System.out.println("El año no puede superar el actual. Ingrese nuevamente el año.");
            }else{
                break;
            }
        }
        return anio;
    }

    private static int leerMes(int anio){
        int mes;
        while(true){
            mes = new Scanner(System.in).nextInt();
            if((anio == (new Date().getYear() + 1900)) && (mes > (new Date().getMonth() + 1))){
                System.out.println("El mes no puede superar el actual. Ingrese nuevamente el mes.");
            }else{
                break;
            }
        }
        return mes;
    }

    private static long leerCUIT(){
        long cuit;
        while(true){
            cuit = new Scanner(System.in).nextLong();
            if(cuit <= 0){
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            }else if(Long.toString(cuit).length() != 11){
                System.out.println("El cuit debe poseer 11 digitos. Ingrese nuevamente el cuit.");
            }else{
                break;
            }
        }
        return cuit;
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

    private static double leerNumeroDecimal(){
        double numero = 0;
        while(true){
            numero = new Scanner(System.in).nextDouble();
            if(numero <= 0){
                System.out.println("El numero debe ser mayor a cero. Ingrese nuevamente el numero.");
            }else{
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
                System.out.println("El valor ingresado no puede ser vacio. Ingrese nuevamente la cadena.");
            }else{
                break;
            }
        }
        return cadena;
    }

    private static String completarConEspacios(String cadena){
        int cantidadEspacios = 20 - cadena.length();
        for(int i=0; i < cantidadEspacios; i++){
            cadena += " ";
        }
        return cadena;
    }

    private static void imprimirDDJJ(DDJJIngresoFertilizante ddjj){
        System.out.println("--------------------------------------------------------");
        System.out.println("Empresa: " + ddjj.getEmpresa());
        System.out.println("CUIT: " + ddjj.getCuitEmpresa());
        System.out.println("Mes: " + ddjj.getMesDeclaracion());
        System.out.println("Año: " + ddjj.getAnioDeclaracion());
        System.out.println(completarConEspacios("Código Fertilizante") + "\t"+completarConEspacios("Nombre Fertilizante")+"\t"+completarConEspacios("Tipo Envase")+"\t"+completarConEspacios("Capacidad Envase")+"\t"+completarConEspacios("Cantidad Envase")+"\t"+completarConEspacios("Subtotal")+"");
        for(int i=0; i < ddjj.getDetallesFertilizantes().size(); i++){
            System.out.println(
                      completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getCodigo()) + "\t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getNombre()) + " \t "
                    + completarConEspacios(ddjj.getDetallesFertilizantes().get(i).getTipoEnvase()) + " \t "
                    + completarConEspacios(Double.toString(ddjj.getDetallesFertilizantes().get(i).getCapacidadEnvase())) + " \t "
                    + completarConEspacios(Integer.toString(ddjj.getDetallesFertilizantes().get(i).getCantidad())) + " \t "
                    + completarConEspacios(Double.toString(ddjj.getDetallesFertilizantes().get(i).getSubtotal())) + "");
        }
        System.out.println("--------------------------------------------------------");
        System.out.println("El monto total a abonar por el ingreso es: " + ddjj.getMontoXIngreso());
        System.out.println("--------------------------------------------------------");
    }



}
