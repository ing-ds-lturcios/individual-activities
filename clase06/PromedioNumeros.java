import java.util.Scanner;

public class PromedioNumeros {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] numeros = new int[3];
        int total = 0;
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = input.nextInt();
            total += numeros[i];
        }
        System.out.print("Los números ingresados son: ");
        for (int i = 0; i < 3; i++) {
            System.out.print(numeros[i]);
            if (i < 2) {
                System.out.print(", ");
            }
        }
        System.out.println("La suma de los números ingresados es: " + total);
        System.out.println("El promedio de los números ingresados es: " + (total/3));
    }
}
