package DAM.Estructura_control;
import java.util.Scanner;

public class SalarioObrero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

       
        double pagoHora = 50;          
        int horasDia = 8;             
        int diasQuincena = 15;        

   
        double salarioBruto = pagoHora * horasDia * diasQuincena;
        double compensacion = salarioBruto * 0.02;    
        double imss = salarioBruto * 0.015;           
        double ispt = salarioBruto * 0.012;           

        double salarioNeto = salarioBruto + compensacion - (imss + ispt);

        
        System.out.println("---- Cálculo del salario del obrero ----");
        System.out.println("Salario bruto: $" + salarioBruto);
        System.out.println("Compensación (2%): $" + compensacion);
        System.out.println("Descuento IMSS (1.5%): $" + imss);
        System.out.println("Descuento ISPT (1.2%): $" + ispt);
        System.out.println("---------------------------------------");
        System.out.println("Salario neto: $" + salarioNeto);
    }
}

