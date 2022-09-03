package ExamenDam;
import java.util.Scanner;
public class $01_Ejercicio {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int maximo ;
		int minimo;
		int valor;
		System.out.println("Introduce un numero maximo :");
		maximo = ent.nextInt();
		
		System.out.println("Introduce un numero minimo :");
		minimo = ent.nextInt();
		
		System.out.println("Introduce un numero dentro del rango :");
		
		
		do {
			
			valor = ent.nextInt(); 
			if ( maximo < valor || minimo > valor) {
				System.out.println("Losiento esta fuera del rango vuelve a introducirlo");
			
			}
				

		}while(maximo < valor || minimo > valor);
		
		if (maximo > valor && minimo < valor) {
		System.out.println(valor+ "  Esta dentro del rango admitido");	

		}
	}
}

