package ExamenDam;
import java.util.Scanner;

public class $02_Ejercicio {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int maximo ;
		int minimo;
		int valor;
		boolean salir= false;
		System.out.println("Introduce un numero maximo :");
		maximo = ent.nextInt();
		
		System.out.println("Introduce un numero minimo :");
		minimo = ent.nextInt();
		
		System.out.println("Introduce un numero dentro del rango :");
		
		while (!salir) {
			valor = ent.nextInt(); 
			salir =(valor > minimo && valor < maximo);
			
			if (!salir) {
				System.out.println("Error esta fuera del rango");
				
			}
			
		}
		System.out.println("esta dentro del rango");

	}

}
