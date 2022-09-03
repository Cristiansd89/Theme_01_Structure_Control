package EjerciciosGenerales_02;
import java.util.Scanner;


public class $16_Division {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double divisor;
		double dividendo;
		
		System.out.println("Dividendo: ");
		dividendo = ent.nextInt();
		System.out.println("divisor: ");
		divisor = ent.nextInt();
		while (divisor <= 0) {
			System.out.println("El divisor tien que ser mayor que cero");
			System.out.println("divisor: ");
			divisor = ent.nextInt();
			
			}
		System.out.println(+dividendo+" / "+divisor+ " = " +dividendo/divisor);
		}	
		
		
	}


