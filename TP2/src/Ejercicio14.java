/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO: - Indique cual es la diferencia entre los datos primitivos (por valor) ejemplo el int
y su contraparte por referencia ejemplo Integer.
* */

public class Ejercicio14 {
    public static void main(String[] args) {
        //int es un tipo primitivo (no un objeto) por lo que no posee metodos y su valor por defecto es 0
        //Integer es un objeto o una Clase (envoltorio / Wrapper) que representa un tipo primitivo int. Posee metodos y su valor por defecto es null
        //Estos "Wrappers" proveen una serie de mecanismos que nos permiten envolver a un tipo de dato primitivo y poder tratarlos como si fueran objetos.

        int numeroInt = 8; //tipo primitivo
        Integer objetoUno = new Integer(numeroInt); //creo el envoltorio objetoUno para convertir el dato primitivo a un objeto
        System.out.println(objetoUno);//imprimo objeto

        double var = objetoUno.doubleValue();//Ahora puedo utilizar metodos para cambiar su tipo de dato
        System.out.println(var);
    }
}
