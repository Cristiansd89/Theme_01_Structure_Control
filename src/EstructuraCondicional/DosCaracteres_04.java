package EstructuraCondicional;

import java.io.IOException;

public class DosCaracteres_04 {

	public static void main(String[] args) throws IOException {
		char letra1;
		char letra2;
		
		System.out.println("Primera Letra");
		letra1 = (char)System.in.read(); //lee un car�cter
		System.in.read(); //saltar el intro que ha quedado en el buffer
		System.out.println("Segunda Letra");
		letra2 = (char)System.in.read(); //lee un car�cter
		
		if(letra1==letra2) {
			System.out.println("Son iguales");
		}else {
			System.out.println("Son distintas");
		}
	}

}



