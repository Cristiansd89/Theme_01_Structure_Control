package EjerciciosGenerales_02;

import java.io.IOException;
import java.util.Scanner;

public class $14_CuentaPalabras {

	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		char frase;
		int contador= 1;
		boolean salir = false;
		
		System.out.println("introduce una frase: ");
		frase =(char)System.in.read();
		if (frase == '.') {
            System.out.println("Ha introducido 0 palabras.");
		}else {
			do {
			
		
		
				frase =(char)System.in.read();
				salir = (frase =='.');
				if (frase == ' ') {
					contador = contador +1;
			
				}
			}while(!salir);
		System.out.println("Has introducido" +contador+ " palabras");
		}
	}

}
