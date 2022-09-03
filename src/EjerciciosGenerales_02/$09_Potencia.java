package EjerciciosGenerales_02;
import java.util.Scanner;




public class $09_Potencia {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		int base;
		int Expo;
		int potencia = 1;
		System.out.println("Base: ");
		base =ent.nextInt();
		System.out.println("Expo: ");
		Expo =ent.nextInt();
		
		for(int i = 0; i < Expo; i++) {
			potencia = potencia * base;
			
		}
		System.out.println(base+" elevado a " +Expo+ " = " +potencia);
	}

}
