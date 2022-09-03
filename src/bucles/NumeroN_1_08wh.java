package bucles;

import java.util.Scanner;
public class NumeroN_1_08wh {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N;
		int i=1;
		System.out.println("Introduce un Numero");
		N=entrada.nextInt();
		while(N>=i) {
			System.out.println("los numeros " +N);
			N--;
			
		}
	}

}
