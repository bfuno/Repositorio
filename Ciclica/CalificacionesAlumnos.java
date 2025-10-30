import java.util.Scanner;

public class CalificacionesAlumnos {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        double[][] calificaciones = new double[5][3];
        
        for (int i = 0; i < 5; i++) {
            System.out.println("\nIngrese las calificaciones del alumno " + (i + 1) + ":");
            for (int j = 0; j < 3; j++) {
                System.out.print("Calificación " + (j + 1) + ": ");
                calificaciones[i][j] = scanner.nextDouble();
            }
        }
        
        System.out.println("\nCalificaciones ingresadas:");
        for (int i = 0; i < 5; i++) {
            System.out.print("Alumno " + (i + 1) + ": ");
            for (int j = 0; j < 3; j++) {
                System.out.print(calificaciones[i][j] + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}