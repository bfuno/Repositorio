import java.util.Scanner;

public class MayorDeDos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer número: ");
        int num1 = sc.nextInt();

        System.out.print("Ingrese el segundo número: ");
        int num2 = sc.nextInt();

        int mayor;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }

        System.out.println("El número mayor es: " + mayor);
    }
}
