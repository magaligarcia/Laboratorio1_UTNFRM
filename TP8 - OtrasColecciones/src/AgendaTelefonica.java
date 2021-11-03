import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class AgendaTelefonica {
    public static void main(String[] args) {
        HashMap<String, Long> agenda = new HashMap<String, Long>();
        String nombreCompleto ="";
        String comprobandoClaveRepetida;
        long numeroTelefonico= 0;
        String contactoBuscado;
        boolean flag = true;

        System.out.println("   ☎ ❝AGENDA TELEFÓNICA❞ ☎\n");
        do {
            int opcionMenu = mostrarMenu();
            switch (opcionMenu) {
                case 1:
                    System.out.println("\n╔══════════════════════════╗");
                    System.out.println("       CARGA DE DATOS ");
                    System.out.println("╚══════════════════════════╝\n");
                    while (true) {
                        System.out.println("Ingrese el nombre del contacto: \n");
                        comprobandoClaveRepetida = leerCadena();
                        if (agenda.containsKey(comprobandoClaveRepetida.toUpperCase())) {
                            System.out.println("********************************");
                            System.out.println("El contacto ingresado ya existe!");
                            System.out.println("********************************\n");
                            flag = false;
                            break;
                        } else {
                            nombreCompleto = comprobandoClaveRepetida;
                            System.out.println("☏ Ingrese el número telefónico de " + nombreCompleto.toUpperCase() + ":\n");
                            numeroTelefonico = leerNumeroTelefono();
                            agenda.put(nombreCompleto.toUpperCase(), numeroTelefonico);
                        }
                        System.out.println("Desea cargar otro contacto en la agenda? \n         ---> s (si) n (no)");
                        String salir = leerCadena();
                        if (salir.equals("n")) {
                            flag = false;
                            break;
                        }
                    }//fin while

                    break;
                case 2:
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("          BUSCAR ");
                    System.out.println("╚══════════════════════════╝\n");

                    if (agenda.entrySet().isEmpty()) {
                        System.out.println("***************************");
                        System.out.println("     (╯°□°）╯︵ ┻━┻");
                        System.out.println("No hay contactos cargados!");
                        System.out.println("***************************\n\n");
                        flag = false;
                    } else {
                        System.out.println("Ingrese el nombre del contacto:");
                        contactoBuscado = leerCadena().toUpperCase();
                        if (agenda.containsKey(contactoBuscado)) {
                            System.out.println("\n========== ✆ ==========");
                            System.out.println(" •" + contactoBuscado + " ☏ " + agenda.get(numeroTelefonico));
                            System.out.println("========== ✆ ==========\n");
                        } else {
                            System.out.println("***********************");
                            System.out.println(" El contacto no existe");
                            System.out.println("***********************");
                        }
                    }

                    break;
                case 3:
                    System.out.println("╔══════════════════════════╗");
                    System.out.println("     LISTA DE CONTACTOS ");
                    System.out.println("╚══════════════════════════╝");
                    if(agenda.entrySet().isEmpty()){
                        System.out.println("\n***************************");
                        System.out.println("     (╯°□°）╯︵ ┻━┻");
                        System.out.println("No hay contactos cargados!");
                        System.out.println("***************************\n\n");
                        flag = false;
                    } else {
                        System.out.println("========== ✆ ==========");
                        for (Map.Entry<String, Long> entry : agenda.entrySet()){
                            System.out.println("• "+entry.getKey()+" ☏ "+entry.getValue());
                        }
                        System.out.println("========== ✆ ==========\n");
                    }
                    break;
            }
        }while(!flag);
        }

     public static int mostrarMenu(){
        int opcionElegida;
         System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
         System.out.println("            MENÚ        ");
         System.out.println(" ▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄▄");
         System.out.println("1- Cargar Datos en la Agenda ");
         System.out.println("2- Buscar Teléfono por Nombre ");
         System.out.println("3- Listar Agenda \n");
         System.out.println("-----------------------------");
         System.out.println(" Ingrese una opción:");
         while(true){
             opcionElegida = new Scanner(System.in).nextInt();
             if(opcionElegida <= 0 || opcionElegida > 3){
                 System.out.println("\n************************** ERROR *****************************");
                 System.out.println("     Debe ingresar una opcion entre 1 y 3. Reintentelo: \n");
             }else{
                 break;
             }
         }
         return opcionElegida;
     }

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

    private static long leerNumeroTelefono(){
        long numero = 0;
        while(true){
            numero = new Scanner(System.in).nextLong();
            String Snum = Long.toString(numero);
            if( Snum.length() < 8 || Snum.length() >15){
                System.out.println("\n************************** ERROR *****************************");
                System.out.println("Número telefónico no valido, debe tener entre 8 y 15 cifras. Reintentelo:\n");
            }else{
                break;
            }
        }
        return numero;
    }
}

