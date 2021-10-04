/*Magali Garcia -Laboratorio 1 (Turno Tarde)
EJERCICIO:- Cree una clase FuncionesPrograma y codifique una función estática que reciba
como parámetro una fecha de tipo Date YYYY-MM-DD y retorne la fecha como una cadena.
public static String getFechaString(Date fecha){
……….
}
Cree una clase Principal que contenga un método main y haga uso de la función
getFechaString*/
import java.util.Date;
public class Ejercicio17 {
    public static void main(String[] args) {
        Date fecha = new Date();

        System.out.println(FuncionesPrograma.getFechaString(fecha));
        System.out.println(FuncionesPrograma.getFechaDate(0,0,0));
    }
}
