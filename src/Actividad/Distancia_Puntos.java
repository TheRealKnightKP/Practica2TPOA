package Actividad;
import java.util.Scanner;

public class Distancia_Puntos {
	
	public static void main (String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		double x1, y1, x2, y2, x3, y3;
		
		System.out.println("Ingrese las coordenadas del punto A");
		System.out.print("X1: ");
		x1 = scanner.nextDouble();
		System.out.println("y1: ");
		y1 = scanner.nextDouble();
		
		System.out.println("\nIngrese las coordenadas del punto B:");
        System.out.print("x2: ");
        x2 = scanner.nextDouble();
        System.out.print("y2: ");
        y2 = scanner.nextDouble();
        
       
        System.out.println("\nIngrese las coordenadas del punto C:");
        System.out.print("x3: ");
        x3 = scanner.nextDouble();
        System.out.print("y3: ");
        y3 = scanner.nextDouble();
        
        
        double ladoAB = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        double ladoBC = Math.sqrt(Math.pow((x3 - x2), 2) + Math.pow((y3 - y2), 2));
        double ladoCA = Math.sqrt(Math.pow((x1 - x3), 2) + Math.pow((y1 - y3), 2));
        
        
        System.out.println("\n--- RESULTADOS ---");
        System.out.printf("Lado AB = %.2f\n", ladoAB);
        System.out.printf("Lado BC = %.2f\n", ladoBC);
        System.out.printf("Lado CA = %.2f\n", ladoCA);
        
        
        
        
        String tipoTriangulo = clasificarTriangulo(ladoAB, ladoBC, ladoCA);
        System.out.println("\nEl triángulo es " + tipoTriangulo + ".");
        
        scanner.close();
	}
	public static String clasificarTriangulo(double lado1, double lado2, double lado3) {
	    
	    
	    if (lado1 + lado2 <= lado3) {
	        return "INVÁLIDO (no forma un triángulo)";
	    }
	    if (lado1 + lado3 <= lado2) {
	        return "INVÁLIDO (no forma un triángulo)";
	    }
	    if (lado2 + lado3 <= lado1) {
	        return "INVÁLIDO (no forma un triángulo)";
	    }

	
	    double tolerancia = 0.01;  
	    
	   
	    if (Math.abs(lado1 - lado2) < tolerancia) {
	        if (Math.abs(lado2 - lado3) < tolerancia) {
	            return "EQUILÁTERO";
	        } else {
	            return "ISÓSCELES";
	        }
	    }

	    
	    if (Math.abs(lado2 - lado3) < tolerancia) {
	        return "ISÓSCELES";
	    }

	    if (Math.abs(lado1 - lado3) < tolerancia) {
	        return "ISÓSCELES";
	    }

	    return "ESCALENO";
	}
}	
