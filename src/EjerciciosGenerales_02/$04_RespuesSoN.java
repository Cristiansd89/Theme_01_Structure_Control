package EjerciciosGenerales_02;
import java.io.IOException;
import java.util.Scanner;


public class $04_RespuesSoN {

	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		char car;
		boolean continuar = false;
		
		System.out.println("Desear continuar (s/n)");
		do {
		
		car = (char)System.in.read();
		car = Character.toLowerCase(car);
		continuar = (car == 's' && car =='n');
		
		System.in.skip(2);
		continuar = (car == 's' || car =='n');
		if (!continuar) {
			System.out.println("Error introduce otra letra");
		}
		
		}while(!continuar);
		System.out.println("Fin del programa");
	}

}
