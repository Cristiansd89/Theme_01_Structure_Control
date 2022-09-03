package EstructuraCondicional;

import java.util.Scanner;
public class MayorNumeros_08 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		System.out.println( "Primer N�mero");
		int num1=entrada.nextInt();
		
		System.out.println( "Segundo N�mero");
		int num2=entrada.nextInt();
		
		System.out.println( "Tercer N�mero");
		int num3=entrada.nextInt();
		if(num1>num2 && num1>num3) {
			System.out.println("El mayor es " +num1);
			
		}else if(num2>num1 && num2>num3) {
			System.out.println("El mayor es " +num2);
		}else if(num3>num1 && num3>num2) {
			System.out.println("El mayor es " +num3);
		}
	}

}
