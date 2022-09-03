package EjerciciosGenerales_02;
import java.util.Scanner;
public class $11_Factorial {

	public static void main(String[] args) {
		Scanner ent = new Scanner (System.in);
		int num;
		int factorial = 1;
		System.out.println("Numero :");
		num= ent.nextInt();
		for (int i = 1; i <= num; i++) {
			factorial = factorial* i;
			
		}
		System.out.println("el factorial de "+num+ " es " +factorial);

	}

}
