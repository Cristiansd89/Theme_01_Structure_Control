
package EjerciciosGenerales;
import java.io.IOException;
import java.util.Scanner;

public class GradosKelvin {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		double gradoC,gradoK;
		char car;
		

		do {
		
			System.out.println("Grados centrigrados: ");
			gradoC=entrada.nextDouble();
			gradoK=gradoC+273;
		
			System.out.println(gradoC+ " Grados Centigrados son " +gradoK+"  Grados Kelvin " );
		
			System.out.println("Quieres Repetir?");
			car = (char)System.in.read();
		
		}while (car=='s' || car=='S');

	}

}
