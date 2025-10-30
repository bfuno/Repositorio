import java.util.Scanner;

public class SalarioObrero2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese las horas trabajadas: ");
        int horas = sc.nextInt();
        double salario;

        if (horas <= 40) {
            salario = horas * 14;
        } else {
            salario = 40 * 14 + (horas - 40) * 26;
        }

        System.out.println("El salario del obrero es: $" + salario);
    }
}
