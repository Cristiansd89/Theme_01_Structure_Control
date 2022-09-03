package EjerciciosGenerales_02;
import java.util.Scanner;

public class $13_MCD {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num1;
		int num2;
		
		System.out.println("Numero 1 :");
		num1 = ent.nextInt();
		System.out.println("Numero 2 :");
		num2 = ent.nextInt();
		
		while (num1!= num2) {
			if (num1 > num2) {
				num1 = num1 - num2;
				
			}else {
				num2 =num2-num1;
			}
			
		}
		System.out.println("El minimo comun es " +num1);

	}

}
