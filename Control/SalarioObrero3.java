import java.util.Scanner;

public class SalarioObrero3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int horasRegulares = 40;
        double tarifaNormal = 50.0;
        double tarifaExtra = 70.0;
        
        System.out.print("Ingrese el número de horas trabajadas: ");
        double horasTrabajadas = scanner.nextDouble();
        
        double salario;
        
        if (horasTrabajadas <= horasRegulares) {
            salario = horasTrabajadas * tarifaNormal;
        } else {
            double horasExtras = horasTrabajadas - horasRegulares;
            salario = (horasRegulares * tarifaNormal) + (horasExtras * tarifaExtra);
        }
        
        System.out.printf("El salario total es: $%.2f%n", salario);
        
        scanner.close();
    }
}