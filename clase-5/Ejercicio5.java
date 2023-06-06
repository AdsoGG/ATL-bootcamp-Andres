import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        int random = (int)(Math.random()*100);
        System.out.println("Adivina el numero entre 1 y 100");
        int num = read.nextInt();
        if (num == random){
            System.out.println("BINGO! Lo has conseguido.");
        } else {
            System.out.println("Mas suerte la proxima. El numero oculto era " + random);
        }
    }
}
