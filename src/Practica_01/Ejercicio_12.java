package Practica_01;

import java.util.Scanner;

public class Ejercicio_12 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		int acumulador1 = 0;
		int acumulador2 = 0;
		int acumulador3 = 0;
		
		for(int i = 1; i <= 6; i++) {
			System.out.println("Introduce un número: ");
			num = entrada.nextInt();
			
			if(num < 15) {
				acumulador1 += +1;
			}else if (num > 55) {
				acumulador2 += +1;
			}else if(num > 45 || num < 55) {
				acumulador3 += +1;
			}else {
				
				
			}
		}//fin del for
		System.out.println(acumulador1+ " numeros menores de 15");
		System.out.println(acumulador2+ "numeros mayores de 55");
		System.out.println(acumulador3+ "numeros entre 45 y 55");
		
		
		

	}

}
