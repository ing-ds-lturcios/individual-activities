public class Clase005_CalcularPropina {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Ingrese el total de la cuenta de consumo: $ ");
        double totalCuenta = input.nextDouble();
        System.out.print("Ingrese el porcentaje de propina: % ");
        double propinaPorcentaje = input.nextDouble();
        double propina = totalCuenta * (propinaPorcentaje / 100);
        System.out.println("El cargo de la propina es: $ " + propina);
        System.out.println("El total a pagar es: $ " + (totalCuenta + propina));
    }
}
