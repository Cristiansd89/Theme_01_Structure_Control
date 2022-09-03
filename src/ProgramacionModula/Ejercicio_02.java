package ProgramacionModula;

import java.util.Scanner;

public class Ejercicio_02 {

	public static void main(String[] args) {
		int num = PedirNumero ();
		int factorial = CalculaFactorial (num);
		MostarFactorial ( num, factorial );
		
	}
	public static int PedirNumero () {
		Scanner entrada = new Scanner (System.in);
		int num;
		System.out.println("N�mero: ");
		num = entrada.nextInt();
		
		return num;
	}
	public static int CalculaFactorial (int num) {
		int factorial = 1;
		for (int i = 2; i <= num; i++) {
			factorial = factorial * i;
		}
		return factorial;
	}
	public static void MostarFactorial (int num, int factorial ) {
		System.out.println("el factorial de " +num+ " es " +factorial);
	}
}
