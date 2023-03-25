
import java.util.Scanner;

public class Punto7 { 
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int[] pruebas = new int[5]; 
	        
	        
	        for (int i = 0; i < 5; i++) {
	            System.out.print("Ingrese el resultado de la prueba " + (i + 1) + ": ");
	            pruebas[i] = sc.nextInt();
	        }
	        
	       
	        int total = 0;
	        for (int i = 0; i < 5; i++) {
	            total += pruebas[i];
	        }
	        double promedio = total / 5.0;
	        
	        
	        System.out.println("El promedio de los resultados de las pruebas es: " + promedio);
	    }
	}
