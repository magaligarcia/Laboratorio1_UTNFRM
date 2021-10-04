/*@author Magali Garcia - DNI: 36552605 - Legajo: 809963
 * Laboratorio 1 Turno Tarde - Arrays Multidimensionales
 * Ejercicio 5:
 *Codifique la siguiente matriz de 2 dimensiones, que se corresponde a una máquina
    expendedora de golosinas donde la columna 1 es la golosina, la columna 2 el precio
    y la columna 3 la cantidad (stock) actual de golosinas
    Tendremos un pequeño menú con las siguientes opciones:
    a. Pedir golosina: pedirá la posición de la golosina que quiera. Esta máquina
    tiene golosinas en cada posición, identificados por su fila y columna, que
    será lo que introduzca el usuario al pedir una golosina, por ejemplo si el
    usuario teclea 2 significa que está pidiendo la golosina que está en la fila 2.
    Al seleccionar una golosina debe disminuir la cantidad disponible de la
    golosina. En caso de agotar el stock de la golosina deberá informar de la
    situación al cliente y solicitarle que seleccione otra golosina.
    b. Mostrar golosinas: mostrara todas las golosinas con la cantidad actual
    disponible.
    c. Rellenar golosinas: esta es una función exclusiva de un técnico por lo que
    para su ejecución nos pedirá una contraseña, si el usuario escribe
    “AdminXYZ” nos autorizara y pedirá la posición de la golosina y la cantidad a
    recargar. La cantidad ingresada se sumara a la cantidad actual existente.
    d. Apagar maquina: sale del programa, antes de salir mostrara las ventas
    totales durante la ejecución del programa. Es decir la suma de todos los
    precios de las golosinas seleccionadas desde el inicio del programa.
*/
package TpArrayMultidimensional;
import java.util.Scanner;

public class Ejercicio05 {

        static String[][]golosinas = {{"KitKat","32","10"},{"Chicles","2","50"},{"Caramelos de Menta","2","50"},{"Huevo Kinder","25","10"},
                {"Chetoos","30","10"},{"Twix","26","10"},{"M&M'S","35","10"},{"Papas Lays","40","20"},{"Milkybar","30","10"},{"Alfajor Tofi","20","15"}
                ,{"Lata Coca","50","20"},{"Chitos","45","1"}};

        static double montoTotal = 0;

        public static void main(String[] args) {

            menuOpciones();
        }

        static boolean salir = false;
        private static void menuOpciones(){
            System.out.println("Inicia");
            while(!salir){
                System.out.println("----------------------");
                System.out.println("Menú Opciones");
                System.out.println("----------------------");
                System.out.println("a- Pedir Golosina");
                System.out.println("b- Mostrar Golosina");
                System.out.println("c- Rellenar Golosinas");
                System.out.println("d- Apagar Maquina");
                System.out.println("Seleccione la opción a ejecutar");
                String opcion = new Scanner(System.in).nextLine();
                if(opcion.equals("a")){
                    pedirGolosina();
                }else if(opcion.equals("b")){
                    System.out.println("Las Golosinas Disponibles son:");
                    mostrarGolosina();
                }else if(opcion.equals("c")){
                    rellenarGolosina();
                }else if(opcion.equals("d")){
                    apagarMaquina();
                    salir = true;
                }else{
                    System.out.println("Opción Incorrecta. Intente nuevamente.");
                    System.out.println("----------------------");
                }
            }
        }

        private static void pedirGolosina(){

            mostrarGolosina();
            System.out.println("--------------------");
            System.out.println("Ingrese código golosina");
            int codigo = new Scanner(System.in).nextInt();
            if(!isCodigoCorrecto(codigo)){
                System.out.println("ERROR: Código incorrecto");
                pedirGolosina();
            }
            int stockActual = Integer.parseInt(golosinas[codigo - 1][2]);
            if(stockActual > 0){
                golosinas[codigo - 1][2] = Integer.toString(stockActual - 1);
                System.out.println("Gracias por comprar " + golosinas[codigo - 1][0] + ".");
                montoTotal += Double.parseDouble(golosinas[codigo - 1][1]);
                menuOpciones();
            }else{
                System.out.println("La golosina " + golosinas[codigo - 1][0] + " no posee stock, seleccione otra golosina");
                pedirGolosina();
            }
        }

        private static void mostrarGolosina(){
            System.out.println("-----------------------------------------");
            for(int i=0; i < golosinas.length; i++){
                System.out.println((i+1) + "\t" + completarConEspacios(golosinas[i][0]) + "\t" + "$"+ golosinas[i][1] + "\t" + golosinas[i][2] + " Unidades");
            }
            System.out.println("-----------------------------------------");
        }

        private static String completarConEspacios(String cadena){
            int cantidadEspacios = 25 - cadena.length();
            for(int i=0; i < cantidadEspacios; i++){
                cadena += " ";
            }
            return cadena;
        }

        private static void rellenarGolosina(){

            System.out.println("Ingrese la clave para ejecutar esta función.");

            String clave = new Scanner(System.in).nextLine();
            if(clave.equalsIgnoreCase("AdminXYZ")){
                System.out.println("Clave Correcta");
                while(true){
                    mostrarGolosina();
                    System.out.println("Ingrese código golosina");
                    int codigo = new Scanner(System.in).nextInt();
                    if(!isCodigoCorrecto(codigo)){
                        System.out.println("ERROR: Código golosina incorrecto, intente nuevamente");
                    }else{
                        System.out.println("Ingrese la cantidad a rellenar");
                        int cantidad = new Scanner(System.in).nextInt();
                        golosinas[codigo - 1][2] = Integer.toString(Integer.parseInt(golosinas[codigo - 1][2]) + cantidad);
                        System.out.println("El stock de la golosina " + golosinas[codigo - 1][0] + " fue actualizado. Stock Actual " + golosinas[codigo - 1][2]);
                        break;
                    }
                }
            }else{
                System.out.println("ERROR: La clave es incorrecta, no puede continuar.");
            }
            menuOpciones();
        }

        private static void apagarMaquina(){
            System.out.println("TOTAL de VENTAS REALIZADAS: $" + montoTotal);
            System.out.println("Gracias por su compra.");
        }

        private static boolean isCodigoCorrecto(int codigo){
            if(codigo < 1 || codigo > 12){
                return false;
            }
            return true;
        }
    }