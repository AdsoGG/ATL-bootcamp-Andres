import java.util.Scanner;
public class Ejercicio3 {
    public static void main(String[] args){
        Scanner read = new Scanner(System.in);
        System.out.println("Ingrese el precio original del producto: ");
        double precioOriginal = read.nextDouble();
        System.out.println("Ingrese el porcentaje de descuento que le quiere aplciar al precio original");
        double descuento = read.nextDouble();
        System.out.println("El precio final del producto es: " + (precioOriginal - (precioOriginal * descuento / 100)));
    }
}
