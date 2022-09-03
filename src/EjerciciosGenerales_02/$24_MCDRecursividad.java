package EjerciciosGenerales_02;
import java.util.Scanner;

public class $24_MCDRecursividad {

	public static void main(String[] args) {
		int num1 = PidePrimernum();
		int num2 = PideSegunnum();
		int mcd = CalculaMCD ( num1,num2);
		MostrarNumero(mcd) ;
	}
	public static int PidePrimernum() {
		Scanner ent= new Scanner(System.in);
		int num1;
		System.out.println("Numero 1 : ");
		num1 =ent.nextInt();
		return num1;
		
	}
	public static int PideSegunnum() {
		Scanner ent= new Scanner(System.in);
		int num2;
		System.out.println("Numero 2 : ");
		num2 =ent.nextInt();
		return num2;
}
	public static int CalculaMCD (int num1,int num2) {
		
		if  (num1 == num2) {
			return num1;
		}else {
			if (num1 > num2) {
				return  CalculaMCD (num1-num2, num2);
			}else {
				return  CalculaMCD (num1, num2-num1);
			}
		}
		
	}
	public static void MostrarNumero(int mcd) {
		System.out.println("el mcd es "+mcd);
	}
}
