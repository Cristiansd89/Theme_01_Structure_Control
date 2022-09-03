package EjerciciosGenerales_02;

import java.util.Scanner;

public class $22_FactorialRescusividad {

	public static void main(String[] args) {
		int num = PideNumero();
		int Factorial = CalcularFactorial( num);
		MostrarFactorial( num, Factorial);
		
	}/////////////////////
	public static int PideNumero() {
		Scanner ent = new Scanner(System.in);

		int num;
		System.out.println("Numero: ");
		num = ent.nextInt();
		return num;
	}/////////////////////
	public static int CalcularFactorial(int num) {
		
		if ( num == 0)
			return 1;
		else {
			return num * CalcularFactorial (num -1);
		}
	}///////////////////////
	public static void MostrarFactorial(int num,int Factorial) {
		System.out.println("El factorial de "+num+ " es " +Factorial);
	}

	

}

