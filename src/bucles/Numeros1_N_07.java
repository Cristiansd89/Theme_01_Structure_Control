package bucles;

import java.util.Scanner;

public class Numeros1_N_07 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n;
		System.out.println("Introduce un n�mero");
		n=entrada.nextInt();
		
		while(n<=1000) {
			System.out.println("lista " +n);
			n++;
		}
	
	}

}
