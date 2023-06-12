import java.util.Scanner;

public class Clase005_CalcularEdadPerro {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese la edad del perro: ");
        int edadPerro = input.nextInt();
        int edadHumano = 0;
        if (edadPerro > 0){
            edadHumano = edadPerro * 7;
        }
        System.out.println("La edad del perro en años humanos es: " + edadHumano);
    }
}
