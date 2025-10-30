import java.util.Scanner;

public class CostoBates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el número de bates: ");
        if (!sc.hasNextInt()) {
            System.out.println("Entrada inválida.");
            sc.close();
            return;
        }

        int n = sc.nextInt();
        if (n <= 0) {
            System.out.println("Número de bates comprados: 0");
            System.out.println("Costo total: $0");
            sc.close();
            return;
        }

        int costo;
        if (n <= 10) {
            costo = n * 250;
        } else {
            costo = 10 * 250 + (n - 10) * 230;
        }

        System.out.println("Número de bates comprados: " + n);
        System.out.println("Costo total: $" + costo);
        sc.close();
    }
}