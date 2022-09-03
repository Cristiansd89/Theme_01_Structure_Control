package EjerciciosGenerales_02;
import java.io.IOException;
import java.util.Scanner;
public class $03_DistintoEnter {

	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		char frase;
		boolean Enter = false;
		
		
		System.out.println("Introduce una frase: ");
		frase = (char)System.in.read();
		while (!Enter){
			System.out.println(frase);
			Enter = frase =='\n';
			frase=(char)System.in.read();
		}

	}

}
