package Practica_01;

import java.io.IOException;
import java.util.Scanner;
public class Ejercicio_07 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
	
		char caracter;
		
		System.out.println("Introduce una respuesta n o S : ");
		do {
			
			
			caracter = (char)System.in.read();
			caracter = Character.toLowerCase(caracter);
			
			System.in.skip(2); 
			
			if(caracter != 's' && 	caracter != 'n') {
				System.out.println("Error, introduzca una n o s :");
			}
		
		}while(	caracter != 's' && 	caracter != 'n');
		
			System.out.println("Bien hecho");
		}
	}


