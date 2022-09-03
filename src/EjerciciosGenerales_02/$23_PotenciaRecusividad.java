package EjerciciosGenerales_02;
import java.util.Scanner;

public class $23_PotenciaRecusividad {

	public static void main(String[] args) {
		int base = PideBase ();
		int Expo =  PideExpo();
		int potencia = CalculaPotencia(base, Expo);
		MostrarPotencia(base, Expo,potencia);
	}
	public static int PideBase () {
		Scanner ent= new Scanner(System.in);
		int base;
		System.out.println("Base: ");
		base =ent.nextInt();
		return base;
	}
	public static int PideExpo() {
		Scanner ent= new Scanner(System.in);
		int Expo;
		System.out.println("Expo: ");
		Expo =ent.nextInt();
		return Expo;
	}
	public static int CalculaPotencia(int base,int Expo) {
		
		if (Expo == 0) {
			return 1;
			
		}else {
			return base * CalculaPotencia(base, Expo-1);
		}
	
		
	}
	public static void MostrarPotencia(int base,int Expo,int potencia) {
		System.out.println(+base+" Elevado a "+Expo+ " = " +potencia);
	}
}
