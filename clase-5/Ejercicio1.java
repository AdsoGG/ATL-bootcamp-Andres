import java.util.Scanner;
public class Ejercicio1 {
        public static void main(String[] args) {
            Scanner read = new Scanner(System.in);
            System.out.println("Ingrese la edad de su perro:");
            int edadPerro = read.nextInt();
            System.out.println("La edad en años perrunos es: " + edadPerro * 7 + " años.");
            read.close();
        }
}
