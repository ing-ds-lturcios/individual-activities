import java.util.Scanner;

public class InvocarWhatsappTelefono {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String numero;
        System.out.println("Ingrese el numero telefonico: ");
        numero = input.nextLine();
        System.out.println("Puedes abrir Whatsapp en el siguiente numero:\nhttps://api.whatsapp.com/send?phone=" + numero);
    }
}
