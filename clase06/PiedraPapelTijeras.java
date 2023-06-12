import java.util.Scanner;

public class PiedraPapelTijeras {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Ingresa tu selección: Piedra, Papel, Tijeras");
        String opcionUsuario = "";
        opcionUsuario = input.nextLine();
        String opcionComputadora = "";
        int random = (int) (Math.random() * 3);
        switch (random) {
            case 0:
                opcionComputadora = "Piedra";
                break;
            case 1:
                opcionComputadora = "Papel";
                break;
            case 2:
                opcionComputadora = "Tijeras";
                break;
        }
        System.out.println("Tú seleccionaste " + opcionUsuario);
        System.out.println("Computadora seleccionó " + opcionComputadora);
        if (opcionUsuario.equals(opcionComputadora)) {
            System.out.println("Es un empate!");
        } else if (opcionUsuario.equals("Piedra")) {
            if (opcionComputadora.equals("Tijeras")) {
                System.out.println("Tú ganas!");
            } else if (opcionComputadora.equals("Papel")) {
                System.out.println("Tú pierdes!");
            }
        } else if (opcionUsuario.equals("Papel")) {
            if (opcionComputadora.equals("Piedra")) {
                System.out.println("Tú ganas!");
            } else if (opcionComputadora.equals("Tijeras")) {
                System.out.println("Tú pierdes!");
            }
        } else if (opcionUsuario.equals("Tijeras")) {
            if (opcionComputadora.equals("Papel")) {
                System.out.println("Tú ganas!");
            } else if (opcionComputadora.equals("Piedra")) {
                System.out.println("Tú pierdes!");
            }
        }


    }
}
