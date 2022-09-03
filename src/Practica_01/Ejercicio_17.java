package Practica_01;

import java.util.Scanner;

public class Ejercicio_17 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		 int altura;
		 
		 System.out.println("Altura: ");
		 altura = entrada.nextInt();
		 
		/*En el segundo for cada vez que entramos en el segundo bucle se reinicia la variable j y a la variable i se le incrementa 1 
		 * cada vez que sale del bucle
		 */
		 
		 for(int i = 0; i <= altura; i++) {
			 for(int j = 0; j < i; j++) {
				 System.out.print(" * ");
				 
			 }
			 System.out.println(" "); 
		 }

	}

}
