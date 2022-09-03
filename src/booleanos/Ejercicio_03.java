package booleanos;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_03 {

	public static void main(String[] args) throws IOException {
		
		Scanner ent = new Scanner(System.in);
		String frase;
		String salir;
		
		char letra;
		boolean continuar = false;
		
		while(!continuar ){
		
			System.out.println("Introduce una palabra");
			frase = ent.nextLine();
			System.out.println("la palabra introducida es " + frase);
			
			System.out.println("Desea continuar?");
			salir = ent.nextLine();
			continuar =(salir.equals("n"));
			//con los string no vale  los operadores normaes tenemso que
			//utilizar la funcion equals
		
		}
		System.out.println("fin del programa");
	}

}
