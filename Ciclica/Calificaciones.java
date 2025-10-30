import java.util.Scanner;

public class Calificaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] notas = new double[10];
        int aceptadas = 0;

        while (aceptadas < 10) {
            System.out.print("Ingrese la calificación " + (aceptadas + 1) + " (6-10): ");
            if (!sc.hasNextDouble()) {
                System.out.println("Entrada inválida. Ingrese un número.");
                sc.next(); // descarta token no numérico
                continue;
            }
            double cal = sc.nextDouble();
            if (cal >= 6.0 && cal <= 10.0) {
                notas[aceptadas++] = cal;
            } else {
                System.out.println("Calificación fuera de rango. Debe estar entre 6 y 10.");
            }
        }

        sc.close();

        double suma = 0;
        System.out.println("\nCalificaciones aceptadas:");
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("%2d: %.2f%n", i + 1, notas[i]);
            suma += notas[i];
        }
        System.out.printf("Promedio: %.2f%n", suma / notas.length);
    }
}