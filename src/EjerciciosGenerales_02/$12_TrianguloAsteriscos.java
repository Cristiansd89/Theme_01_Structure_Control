package EjerciciosGenerales_02;
import java.util.Scanner;
public class $12_TrianguloAsteriscos {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		int altura;
		
		System.out.println("Altura: ");
		altura = ent.nextInt();
		
		for (int i = 0; i<= altura; i++) {
			System.out.println("");
			for (int j = 0; j <= i;j++) {
				System.out.print("*");
			}
			
		}

	}

}
