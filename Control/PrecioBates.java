import java.util.Scanner;

public class PrecioBates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        System.out.print("Ingrese la cantidad de bates a comprar: ");
        int cantidad = sc.nextInt();

        double precioUnitario;
        double total;

 
        if (cantidad >= 10) {
            precioUnitario = 100;
        } else {
            precioUnitario = 108; 
        }

        total = cantidad * precioUnitario;

    
        System.out.println("Precio por bate: $" + precioUnitario);
        System.out.println("Total a pagar: $" + total);
    }
}
