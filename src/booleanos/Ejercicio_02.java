package booleanos;

import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		boolean par =  Mayorque();
		if (par == true) {
			System.out.println("Mayor que cero");
		}else {
			System.out.println("Menor que cero");
		}
	}
	public static boolean Mayorque() {
		Scanner ent = new Scanner(System.in);
		int num1;
		boolean par;
		System.out.println("Introduce un numero: ");
		num1 = ent.nextInt();
		
		if(num1 > 0) {
			return true;
			
		}else {
			return false;
		}
	}
}
