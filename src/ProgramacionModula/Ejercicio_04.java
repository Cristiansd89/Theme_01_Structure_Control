package ProgramacionModula;

import java.util.Scanner;
public class Ejercicio_04 {

	public static void main(String[] args) {
		int base = PedirBase();
		int Exponente = PedirExponente ();
		int potencia =  Calculapotencia(base, Exponente );
		MostrarPotencia (base, Exponente, potencia);
	}
	public static int PedirBase () {
		Scanner entrada = new Scanner (System.in);
		int base;
		System.out.println("N�mero: ");
		base = entrada.nextInt();
		
		return base;
	}
	public static int PedirExponente () {
		Scanner entrada =new Scanner(System.in);
		int Exponente;
		System.out.println("Elevado a ");
		Exponente = entrada.nextInt();
		return Exponente;
	}
	public static int Calculapotencia(int base, int Exponente ) {
		int potencia = 1;
		for (int i = 0;i < Exponente; i++) {
			potencia = potencia * base;
			
		}
		return potencia;
	}public static void MostrarPotencia (int base, int Exponente, int potencia) {
		System.out.println(base+ " Elevado a " +Exponente+  " = " +potencia);
	}
}
