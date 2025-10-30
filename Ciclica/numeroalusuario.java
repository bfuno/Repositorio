package DAM.Estructura_ciclica;

import java.util.Scanner;

public class numeroalusuario {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Introduce un número: ");
        int numero = scanner.nextInt();
        
        System.out.println("Números anteriores a " + numero + ":");
        for (int i = 1; i < numero; i++) {
            System.out.println(i);
        }
        
        scanner.close();
    }
}
