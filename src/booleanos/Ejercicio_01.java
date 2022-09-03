package booleanos;

import java.util.Scanner;
public class Ejercicio_01 {

	public static void main(String[] args) {
		boolean par = par();
		if(par == true) {
			System.out.println("EL numero es par");
			
		}else
			System.out.println("No es par");
		

	}
	public static boolean par() {
		Scanner ent = new Scanner(System.in);
		int num1;
		boolean par;
		System.out.println("Introduce un numero: ");
		num1 = ent.nextInt();
		
		if (num1 %2==0) {
			return true;
	}
		return false;
	}
}
