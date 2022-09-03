package EjerciciosGenerales_02;
import java.io.IOException;
import java.util.Scanner;
public class $02_Conversor {

	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		char letra;
		
		System.out.println("introduce una nota: ");
		letra =(char)System.in.read();
		
		switch (letra){
			case 'I':
				System.out.println("4");
				break;
			case 'F':
				System.out.println("5");
				break;
			case 'B':
				System.out.println("6");
				break;
			case 'N':
				System.out.println("7");
				break;
			case 'S':
				System.out.println("9");
				break;
			
		}

	}

}
