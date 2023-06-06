import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese una distancia en millas:");
        double miles = read.nextDouble();
        System.out.println("La distancia en kilomentros es: " + miles * 1.60934 + " km.");
        read.close();
    }
}
