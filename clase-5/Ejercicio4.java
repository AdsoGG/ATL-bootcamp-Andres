import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese la cuenta total de la mesa");
        double cuenta = read.nextDouble();
        System.out.println("Ingrese el procentaje de propina");
        double propina = read.nextDouble();
        System.out.println("La propina a pagar es de: "+ (cuenta * (propina / 100)));

    }
}
