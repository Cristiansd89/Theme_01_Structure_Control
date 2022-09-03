package Practica_01;
import java.util.Scanner;

import java.util.Scanner;
public class Ejercicio_18 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num1, num2;
		
		System.out.println("Número 1: ");
		num1 = entrada.nextInt();
		
		System.out.println("Número 2: ");
		num2 = entrada.nextInt();
		
		while(num1 != num2) {
			if(num1 > num2) {
				num1=num1-num2;
				
			}else {
				num2=num2-num1;
			}
		
	
		}
		System.out.println("El MCD es : "+num1);
	}

}