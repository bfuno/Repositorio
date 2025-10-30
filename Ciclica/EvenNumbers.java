public class EvenNumbers {
    public static void main(String[] args) {
        System.out.println("Números pares entre 2 y 15:");
        
        for (int i = 2; i <= 15; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}