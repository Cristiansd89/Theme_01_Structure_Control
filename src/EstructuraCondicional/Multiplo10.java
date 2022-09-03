package EstructuraCondicional;

import java.util.Scanner;
public class Multiplo10 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un n�mero");
		num=entrada.nextInt();
		if(num%10==0) {
			System.out.println( num + " Es multiplo de 10");
		}else {
			System.out.println( num + " Es multiplo de 10");
		}

	}
}
