package ProgramacionModula;
import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		int base =  PideBase ();
		int expo = pideExpo ();
		int potencia = CalculaPotencia (base, expo);
		Mostrar(base, expo, potencia);
	}
	public static int PideBase () {
		Scanner entrada = new Scanner (System.in);
		int base;
		System.out.println("Base:");
		base = entrada.nextInt();
		return base;
	}
	public static int pideExpo () {
		Scanner entrada = new Scanner (System.in);
		int expo;
		System.out.println("Exponente: ");
		expo = entrada.nextInt();
		return expo;
	}
	public static int CalculaPotencia (int base, int expo) {
		
		if (expo == 0) {
			return 1;
			
		}else {
			return base * CalculaPotencia ( base, expo- 1);
		}
	}
	public static void Mostrar(int base, int expo, int potencia) {
		System.out.println(base+ " Elevado a " +expo+ " = " +potencia);
	}
}
