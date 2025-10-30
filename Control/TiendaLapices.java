import java.util.Scanner;

public class TiendaLapices {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double costoTotal;
        
        System.out.println("Ingrese la cantidad de lápices a comprar:");
        int cantidad = scanner.nextInt();
        
        if (cantidad >= 100) {
            costoTotal = cantidad * 0.80;
        } else if (cantidad > 50) {
            costoTotal = cantidad * 1.20;
        } else if (cantidad >= 30) {
            costoTotal = cantidad * 1.50;
        } else {
            costoTotal = cantidad * 2.10;
        }
        
        System.out.printf("El costo total por %d lápices es: $%.2f%n", 
                         cantidad, costoTotal);
        
        scanner.close();
    }
}