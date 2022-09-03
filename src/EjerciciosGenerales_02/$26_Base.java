package EjerciciosGenerales_02;

import java.util.Scanner;

public class $26_Base {

	public static void main(String[] args) {
		int num1 = PideNumero ();
		int binario = Binario (num1);
	}
	public static int PideNumero () {
		Scanner ent= new Scanner(System.in);
		int num1;
		System.out.println("Numero  : ");
		num1 =ent.nextInt();
		return num1;
	}
	public static int Binario(int num) {
		if (num < 2) {
			return num;
			
		}else {
			return num%2+Binario(num/2)*10;
			
		}
		
	}
	public static void MostrarBinario(int num,int binario) {
		System.out.println(binario);
	

	}
}

