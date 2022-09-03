package ProgramacionModula;

import java.util.Scanner;

public class Ejercicio_07 {

	public static void main(String[] args) {
		
			int num1 = pideNum1();
			int num2 = pideNum2();
			int mcd = calculaMcd (num1, num2);
			Mostrar(num1, num2,mcd);
		}////////////////////////
		public static int pideNum1() {
			Scanner ent = new Scanner(System.in);
			int num1;
			System.out.println("Numero 1 :");
			num1 = ent.nextInt();
			return num1;
			
		}////////////////////////
		public static int pideNum2() {
			Scanner ent = new Scanner(System.in);
			int num2;
			System.out.println("Numero 2 :");
			num2 = ent.nextInt();
			return num2;

		}///////////////////////////

		public static int calculaMcd (int num1, int num2) {
			if (num1== num2) {
				return num1;
					
			}else if(num1 > num2) {
				return calculaMcd ( num1 - num2, num2);
			}else {
				return calculaMcd (num1,  num2-num1);
			}
				
			}//////////////////////
			public static void Mostrar(int num1, int num2,int mcd) {
				System.out.println("El MCD de " +num1+ " y " +num2+ " es " +mcd);
			}
		

	

}

