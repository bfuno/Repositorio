import java.util.Scanner;

public class DeseaContinuar {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String linea;
        do {
            System.out.print("¿Desea continuar S/N? ");
            linea = sc.nextLine().trim();
            if (linea.isEmpty()) continue;
            char c = Character.toUpperCase(linea.charAt(0));
            if (c == 'N') break;
        } while (true);
        sc.close();
    }
}