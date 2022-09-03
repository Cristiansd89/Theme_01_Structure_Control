package Practica_01;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_08 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		
		char caracter = 0;
		
		boolean letra;
		
		
		
		System.out.println("Introduce una respuesta n o S : ");
		
		do {
			
			
			caracter = (char)System.in.read();
			caracter = Character.toLowerCase(caracter);
			letra = (caracter != 's' && 	caracter != 'n');
			System.in.skip(2); 
			
			if(letra) {
				System.out.println("Error, introduzca una n o s :");
			}
		
		}while(letra);
		
		System.out.println("Bien hecho");
		}


	}


