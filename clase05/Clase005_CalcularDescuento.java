import java.util.Scanner;

public class Clase005_CalcularDescuento {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: $ ");
        double precioOriginal = input.nextDouble();
        System.out.print("Ingrese el porcentaje de descuento: % ");
        double descuento = input.nextDouble();
        double precioFinal = precioOriginal - (precioOriginal * descuento / 100);
        System.out.println("El precio final es: $ " + precioFinal);
    }
}
