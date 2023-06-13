import java.util.Arrays;
import java.util.Scanner;

public class EjercicioLucas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String[] array = new String[15];
        int contador = 0, contador2 = 0;
        String palabra = "", palabra2 = "";
        System.out.println("Vamos a cuantificar palabras repetidas");
        System.out.println("--------------------------------------");

        for (int i = 0; i < array.length; i++) {
            System.out.print("Ingrese una palabra [" + i + "]: ");
            array[i] = teclado.next();
        }

        Arrays.sort(array);

        for (int i = 0; i < array.length; i++) {
            if (i == 0) {
                palabra2 = array[i];
                contador2 = 1;
            } else {
                if (array[i].equals(palabra2)) {
                    contador2++;
                } else {
                    if (contador2 > contador) {
                        contador = contador2;
                        palabra = palabra2;
                    }
                    palabra2 = array[i];
                    contador2 = 1;
                }
            }
        }
        if (contador2 > contador) {
            contador = contador2;
            palabra = palabra2;
        }
        System.out.println("La palabra que más se repite es: " + palabra + " y se repite " + contador + " veces");
    }

}
