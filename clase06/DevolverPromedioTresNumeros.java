public class DevolverPromedioTresNumeros {
    public static void main(String[] args) {
        System.out.println("Ingrese el primer número");
        int numero1 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el segundo número");
        int numero2 = Integer.parseInt(System.console().readLine());
        System.out.println("Ingrese el tercer número");
        int numero3 = Integer.parseInt(System.console().readLine());
        int promedio = (numero1 + numero2 + numero3) / 3;
        System.out.println("El promedio de los tres números es: " + promedio);
    }
}
