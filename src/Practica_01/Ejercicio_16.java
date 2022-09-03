package Practica_01;
import java.util.Scanner;
//introduce un numero por teclado  y saca su factorial
public class Ejercicio_16 {

	public static void main(String[] args) {
		Scanner entrada= new Scanner(System.in);
		int num;
		
		int factorial=1;
		System.out.println("introduce un número: ");
		num = entrada.nextInt();
		
		for (int i = 2; i<= num ; i++) {
			
			factorial = factorial * i;
		}
		System.out.println("El factorial de " +num+ " es " +factorial);
	}
	

}
