import java.util.Scanner;

public class MenorDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número entero: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        int a = sc.nextInt();

        System.out.print("Ingrese el segundo número entero: ");
        while (!sc.hasNextInt()) {
            System.out.print("Entrada inválida. Ingrese un número entero: ");
            sc.next();
        }
        int b = sc.nextInt();

        if (a < b) {
            System.out.println("El menor es: " + a);
        } else if (b < a) {
            System.out.println("El menor es: " + b);
        } else {
            System.out.println("Ambos números son iguales: " + a);
        }

        sc.close();
    }
}