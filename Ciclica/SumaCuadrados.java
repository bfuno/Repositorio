public class SumaCuadrados {
    public static void main(String[] args) {
        long suma = 0;
        
        for (int i = 1; i <= 100; i++) {
            suma += (long) Math.pow(i, 2);
        }
        
        System.out.println("La suma de los cuadrados de los primeros 100 números es: " + suma);
    }
}