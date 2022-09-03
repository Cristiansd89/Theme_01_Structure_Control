package EstructuraCondicional;

import java.util.Scanner;

public class DivisionDosnumeros_07 {

	

		public static void main(String[] args) {
			Scanner entrada=new Scanner(System.in);
			
			System.out.println("Primer n�mero");
			double num1=entrada.nextDouble();
			
			System.out.println("Segundo n�mero");
			double num2=entrada.nextDouble();
			
			if(num2==0) {
				System.out.println("no se puede Dividir por cero");
			}else {
			System.out.println(num1+ " / " +num2+ " = " +num1/num2);
			 
			}

		}
	}

