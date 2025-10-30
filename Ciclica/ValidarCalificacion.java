import java.util.Scanner;

public class ValidarCalificacion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double calificacion;

        while (true) {
            System.out.print("Ingrese una calificación (0 a 10): ");
            if (!sc.hasNextDouble()) {
                sc.next(); // descarta entrada no numérica
                System.out.println("Entrada inválida. Intente de nuevo.");
                continue;
            }
            calificacion = sc.nextDouble();
            if (calificacion >= 0 && calificacion <= 10) {
                break;
            } else {
                System.out.println("Calificación fuera de rango. Intente de nuevo.");
            }
        }

        System.out.println("Calificación válida: " + calificacion);
        sc.close();
    }
}