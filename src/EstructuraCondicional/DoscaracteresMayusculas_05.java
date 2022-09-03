package EstructuraCondicional;

import java.io.IOException;

public class DoscaracteresMayusculas_05 {


	public static void main(String[] args) throws IOException {
		char letra1, letra2;
		
		System.out.println(" Introducuze un caracter");
		letra1 = (char)System.in.read();
		System.out.println();
		
		System.out.println("introduzca otro");
		letra2 = (char)System.in.read();
		
		if(Character.isUpperCase(letra1) && Character.isUpperCase(letra2) ) {
			System.out.println("Son dos Mayusculas");
		}else {
			System.out.println("Nos son mayusculas las 2");
		}
	}

}
