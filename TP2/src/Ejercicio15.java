/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO:Indique que sucede si realizo la siguiente declaración de variable:
            int numero = null;
            ¿Qué debo modificar para poder asignar null a la variable?
*/

public class Ejercicio15 {
    public static void main(String[] args) {
    /* Lo que sucede al declarar una variable int inicializada en null, es que nos dará un error de 'tipo de datos incompatibles', ya que un dato
    primitivo siempre se inicializa en un valor, en este caso int tiene el valor por defecto: 0, solo los objetos pueden tener el valor por defecto: null,
    por lo que es necesario utilizar el wrapper Integer
     */

    //int numeroInt = null; //ERROR: incompatible types: <nulltype> cannot be converted to int

    Integer numero = null;
    System.out.println(numero);

    }
}
