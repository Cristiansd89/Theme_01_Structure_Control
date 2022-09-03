
package Practica_01;

import java.util.Scanner;
public class Ejercicio_02 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num;
		
		System.out.println("introduce un numero :");
		num = entrada.nextInt();
		
		if(num%2==0) {
			System.out.println(num+ " Es un numero par");
			
		}else {
			System.out.println(num+ " Es un numero impar: ");
			
			
		}//fin de else
	}

}
