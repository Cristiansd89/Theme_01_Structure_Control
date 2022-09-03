package EjerciciosGenerales_02;
import java.util.Scanner;

public class $17_Tributar {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int edad;
		int sueldo;
		
		System.out.println("edad :");
		edad =ent.nextInt();
		
		System.out.println("sueldo :");
		sueldo =ent.nextInt();
		
		
		
		if (edad > 16 && sueldo > 1000) {
			System.out.println("Usted puede Tributar");
		}else {
			System.out.println("no puede tributar ");
		}

	}

}
