package ProgramacionModula;

import java.util.Scanner;
public class Ejercicio_03 {

	public static void main(String[] args) {
		int num = PedirNumero ();
		int factorial = CalculaFactorial ( num);
		Mostrar ( num, factorial);
	}
	public static int PedirNumero () {
		Scanner entrada = new Scanner(System.in);
		int num;
		System.out.println(" N�mero: ");
		num = entrada.nextInt();
		return num;
	}
	public static int CalculaFactorial (int num) {
		
		if ( num == 0)
			return 1;
		else {
			return num * CalculaFactorial (num -1);
		}
		
	}
	public static void Mostrar (int num,int factorial) {
		System.out.println("El factorial de "+ num+ "es " +factorial);
		
	}
}
