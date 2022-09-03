package bucles;

import java.util.Scanner;
public class NumeroN_1_08do_wh {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N;
		int i=1;
		System.out.println("Introduce un Numero");
		N=entrada.nextInt();
		System.out.println("lista numeros " +N);
		do {
			System.out.println("Lista " +N);
			N--;
			
		}while(N>=i);
	}

}
