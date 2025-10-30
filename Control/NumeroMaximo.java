package DAM.Estructura_control;

import java.util.Scanner;

public class NumeroMaximo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int maximo = Integer.MIN_VALUE; // valor más pequeño posible para iniciar
        int numero;

        System.out.println("Programa que determina el número máximo de cinco valores.");

        for (int i = 1; i <= 5; i++) {
            System.out.print("Ingrese el número " + i + ": ");
            numero = sc.nextInt();

            if (numero > maximo) {
                maximo = numero;
            }
        }

        System.out.println("\nEl número máximo es: " + maximo);
    }
}


