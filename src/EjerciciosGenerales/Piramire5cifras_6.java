package EjerciciosGenerales;

import java.util.Scanner;
public class Piramire5cifras_6 {

	public static void main(String[] args) {
		Scanner ent =new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero de 5 cifras:");
		num = ent.nextInt();
		
		System.out.println(num/10000);
		System.out.println(num/1000);
		System.out.println(num/100);
		System.out.println(num/10);
		System.out.println(num/1);
	}

}
