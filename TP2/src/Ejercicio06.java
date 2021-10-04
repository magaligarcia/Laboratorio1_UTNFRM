/* Magali Garcia - Laboratorio 1 - Turno Tarde
EJERCICIO: Del siguiente String “La lluvia en Mendoza es escasa” indique cual es el tamaño
de la cadena es decir su número de caracteres.
 */
public class Ejercicio06 {
    public static void main(String[] args) {
        String cadena = "La lluvia en Mendoza es escasa";
        int cantCaracteresConEspacios = cadena.length();
        int cantCaracteres = cadena.replace(" ","").length();

        System.out.println("La frase: \n  ' " + cadena + "'\n\ntiene " + cantCaracteres + " caracteres (" + cantCaracteresConEspacios + " contando los espacios)");

    }
}
