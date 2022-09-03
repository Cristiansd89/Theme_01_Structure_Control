package EstructuraCondicional;

import java.io.IOException;

public class CaracterNumero_06 {

	public static void main(String[] args) throws IOException {
		
		
		System.out.println(" Introducuze un caracter");
		
		char car = (char)System.in.read();
		if(car>='0' && car<='9') {
			System.out.println(  " Es un n�mero");
		}else {
			System.out.println( car+ " Es una letra");
		}

	}

}
