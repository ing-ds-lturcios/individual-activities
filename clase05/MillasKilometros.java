import java.util.Scanner;

public class Clase005_MillasKilometros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la distancia en millas: ");
        double millas = input.nextDouble();
        double kilometros = millas * 1.60934;
        System.out.println(millas + " millas son " + kilometros + " kilometros");
    }
}
