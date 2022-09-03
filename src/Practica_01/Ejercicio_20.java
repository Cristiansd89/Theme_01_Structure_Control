package Practica_01;

import java.io.IOException;
import java.util.Scanner;

public class Ejercicio_20 {

	public static void main(String[] args) throws IOException {
		Scanner entrada = new Scanner(System.in);
		int contadorPalabrabas = 0; //Esta varible controla el numero de palabras introducidas
		int letras = 0; /*Esta variablecontrola la cantidad de letras que elusuario introduce y 
		así diferenciar si es un punto o una palabra.*/
		char frase;

		
		
		System.out.println("introduce una frase acabada en  punto :");
		
		
		do {
			frase = (char)System.in.read(); //leemos caracter por caracter que introduce el usuario.
			if (frase == ' ') {//si el caracter que leemos es un espacio  en blanco significara que tenemos una palabra.
				contadorPalabrabas++; //incrementamos la variable que estamos utilizando para contabilizar el numero de palabras introducidas
				
			}
			
			letras++; //cada vez que leamos una letra incrementamos la variable letra que daremos uso posteriormente
			
				
		}while (frase !='.');
		if (contadorPalabrabas > 0 || letras > 1 ) {/*Si contador de palabras es > 0 quiere decir que hemos introducido al memos una palabra
													si letra es > 1 habremos introducido tambien mínimo una palabra */
			
			System.out.println("La frase tiene un total de : " +(contadorPalabrabas + 1)+  " palabras "  );
		}else {
			
			System.out.println("La frase tiene un total de : " +contadorPalabrabas + " palabras ");
		}
		
		

	}

}
