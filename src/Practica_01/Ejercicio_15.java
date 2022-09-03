package Practica_01;
import java.util.Scanner;
//imprime por pantalla la potencia de un numero
public class Ejercicio_15 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int num, expo;
		int potencia=1;
		System.out.println("Número: ");
		num = entrada.nextInt();
		
		System.out.println("Exponente: ");
		expo = entrada.nextInt();
		
		for (int i = 0; i <= expo; i++) {
			
			potencia  = potencia * expo;
		}
		System.out.println(num+" elevado a "  +expo+  " es "+potencia);
	}

}
