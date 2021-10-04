import java.util.Scanner;

public class Ejercicio23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("\n=======================================");
        System.out.println("   Ingrese una frase para invertirla: ");
        System.out.println("=======================================\n");
        String str = sc.nextLine();

        System.out.println(invertir(str, str.length()-1));
        System.out.println("\n=======================================");
    }

    private static String invertir(String str, int index){
        if(index == 0){
            return str.charAt(0) + "";
        }
        char letter = str.charAt(index);
        return letter + invertir(str, index-1);
    }
}
