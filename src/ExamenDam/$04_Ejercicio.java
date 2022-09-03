package ExamenDam;
import java.util.Scanner;


public class $04_Ejercicio {

	public static void main(String[] args) {
		int num = PideNumero();
		boolean perfecto = EsPerfecto(num);
		Mostrar(perfecto);

	}
	public static int PideNumero() {
		Scanner ent = new Scanner(System.in);

		int num;
		System.out.println("Numero: ");
		num = ent.nextInt();
		return num;
	}
	public static boolean EsPerfecto(int num) {
		int suma = 0;
		for(int i=1;i<num;i++) {
			if(num%i==0) {
				suma+=i;
			}
			
		}
		if(suma==num) {
			return true;
		}else {
			return false;
		}

	}
	public static void Mostrar(boolean perfecto) {
		if (true) {
			System.out.println("es un numero perfecto");
		}else {
			System.out.println("no es  perfecto");
		}

	}
}
