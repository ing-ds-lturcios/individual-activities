import java.util.Scanner;

public class CalcularArea {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Bienvenido al programa para calcular el área de una figura");
        System.out.println("1. Calcular el área de un cuadrado o rectángulo");
        System.out.println("2. Calcular el área de un triángulo");
        System.out.println("3. Salir");
        int opcion = 0;
        opcion = teclado.nextInt();
        switch(opcion) {
            case 1 -> {
                System.out.print("Ingrese el lado de la figura: ");
                float lado = teclado.nextFloat();
                System.out.print("Ingrese el otro lado de la figura (0 si es cuadrado): ");
                float lado2 = teclado.nextFloat();
                if (lado2 == 0) {
                    lado2 = lado;
                }
                System.out.println("El área de la figura es: " + obtenerAreaCuadro(lado, lado2));
            }
            case 2 -> {
                System.out.print("Ingrese la base de la figura: ");
                float base = teclado.nextFloat();
                System.out.print("Ingrese la altura de la figura: ");
                float altura = teclado.nextFloat();
                System.out.println("El área de la figura es: " + obtenerAreaTriangulo(base, altura));
            }
            case 3 -> System.out.println("Gracias por usar el programa");
            default -> System.out.println("Opción no válida");
        }

        teclado.nextLine();
        teclado.close();
    }

    private static float obtenerAreaTriangulo(float base, float altura) {
        return (base * altura) / 2;
    }

    private static float obtenerAreaCuadro(float lado, float lado2) {
        return lado * lado2;
    }
}
