import java.util.Scanner;

public class EntrarMostrarNumeros {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int menor = 0, mayor = 0, promedio = 0;

        System.out.println("¿Cuántos números desea ingresar? ");
        int cantidad = teclado.nextInt();
        int[] numeros = new int[cantidad];

        System.out.println("Se solicitarán " + numeros.length + " números");

        for (int i = 0; i < numeros.length; i++) {
            System.out.println("Ingrese un número: ");
            numeros[i] = teclado.nextInt();
            if (i == 0){
                menor = numeros[i];
                mayor = numeros[i];
            } else {
                if (numeros[i] < menor){
                    menor = numeros[i];
                }
                if (numeros[i] > mayor){
                    mayor = numeros[i];
                }
            }
            promedio += numeros[i];
        }

        System.out.println();
        System.out.println("Los números ingresados son: ");
        for (int j : numeros) {
            System.out.println(j);
        }

        System.out.println();
        System.out.println("El número menor es: " + menor);
        System.out.println("El número mayor es: " + mayor);
        System.out.println("El promedio es: " + (promedio / numeros.length));
    }
}
