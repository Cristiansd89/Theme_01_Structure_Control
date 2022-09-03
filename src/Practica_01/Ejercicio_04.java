package Practica_01;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_04 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		char calificacion;
		
		System.out.println("Introduce un nota: ");
		calificacion = (char)System.in.read();
		
		switch (calificacion) {
			case 'I' : System.out.println(" Es un 4");
				break;
			case 'F' : System.out.println("Es un 5");
				break;
			case 'B': System.out.println("Es un 6");
				break;
			case 'N' : System.out.println("Es un 7");
				break;
			case 'S' : System.out.println("Es un 9");
				break;
		
		
		
		}//fin de switch

	}

}
