import java.util.Scanner;

public class IngresarMostrarNumerosFunc {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int opcion;
        System.out.println("¿Cuántos números desea ingresar?");
        opcion = teclado.nextInt();
        ingresarNumeros(opcion);
    }

    private static void ingresarNumeros(int cantidad) {
        Scanner teclado = new Scanner(System.in);
        int[] numeros = new int[cantidad];
        for (int i = 0; i < cantidad; i++) {
            System.out.println("Ingrese el número " + (i + 1));
            numeros[i] = teclado.nextInt();
        }
        mostrarNumeros(numeros);
    }
    private static void mostrarNumeros(int[] numeros) {
        for (int i = 0; i < numeros.length; i++) {
            System.out.println("El número " + (i + 1) + " es " + numeros[i]);
        }
    }
}
