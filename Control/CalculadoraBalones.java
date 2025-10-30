import java.util.Scanner;


public class CalculadoraBalones {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Ingrese la cantidad de balones a comprar: ");
        int cantidad = scanner.nextInt();
        double precioTotal;
        
        if (cantidad > 15) {
            precioTotal = cantidad * 85;
        } else if (cantidad > 10) {
            precioTotal = cantidad * 92;
        } else {
            precioTotal = cantidad * 99;
        }
        
        System.out.println("El costo total es: $" + precioTotal);
        
        scanner.close();
    }
}