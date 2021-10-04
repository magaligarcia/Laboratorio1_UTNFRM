/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO:Como transformo una variable tipo Double a una variable tipo double.*/

public class Ejercicio16 {
    public static void main(String[] args) {
        //opcion uno
        Double num = 12.55;
        double numDos = (double) num;
        System.out.println(numDos);

        //opcion dos
        Double D = 12.55;
        D.doubleValue();
        System.out.println(D);
    }
}
