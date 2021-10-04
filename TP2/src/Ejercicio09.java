/* Magali Garcia - Laboratorio 1 - Turno Tarde
EJERCICIO: Recorre el String del ejercicio 6 y transforma cada carácter a su código ASCII.
Muéstralos en línea recta, separados por un espacio entre cada carácter.
 */
public class Ejercicio09 {
    public static void main(String[] args) {
        String cadena = "La lluvia en Mendoza es escasa";
        int cantCaracteresConEspacios = cadena.length();
        System.out.println("La frase: " + cadena + "\nTransformada en codigo ASCII es:\n");

        for(int i = 0; i < cantCaracteresConEspacios; i++){
            char c= cadena.charAt(i);
            int valorAscii = c;
            System.out.print(valorAscii + (" "));
        }

    }
}
