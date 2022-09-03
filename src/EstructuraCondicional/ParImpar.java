package EstructuraCondicional;

import java.util.Scanner;
public class ParImpar {

	public static void main(String[] args) {
		
		Scanner entrada=new Scanner(System.in);
		int num;
		System.out.println("Introduce un n�mero");
		num=entrada.nextInt();
		if(num%2==0) {
			System.out.println( num+ " Es par");
		}else {
			System.out.println(num+ " Es impar");
		}

	}

}
