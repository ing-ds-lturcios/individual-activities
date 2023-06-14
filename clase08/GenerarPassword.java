import java.util.Scanner;

public class GenerarPassword {
    public static void main(String[] args) {
        int complejidad = 0;
        int longitud = 0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("Generador de contraseñas");
        System.out.print("Ingrese la longitud de la contraseña: ");
        longitud = teclado.nextInt();
        complejidad = getComplejidad(teclado);
        System.out.println("La contraseña es: " + generarPassword(longitud, complejidad));
    }

    public static int getComplejidad(Scanner teclado){
        System.out.println("Indique la fortaleza de la contraseña:");
        System.out.println("1. Solo letras mayúsculas");
        System.out.println("2. Agregar minúsculas");
        System.out.println("3. Agregar números");
        System.out.println("4. Agregar caracteres especiales");
        System.out.print("Ingrese el nivel de complejidad: ");
        return teclado.nextInt();
    }

    public static String generarPassword(int longitud, int complejidad) {
        String password = "";
        String caracteres = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+-*/=()[]{}!#$%&";
        int alcance = switch (complejidad) {
            case 1 -> 26;
            case 2 -> 52;
            case 3 -> 62;
            case 4 -> 78;
            default -> 0;
        };
        for (int i = 0; i < longitud; i++) {
            int posicion = (int) (Math.random() * alcance);
            password += caracteres.substring(posicion, posicion + 1);
        }
        return password;
    }
}
