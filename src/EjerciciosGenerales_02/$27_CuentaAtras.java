package EjerciciosGenerales_02;

import java.util.Scanner;


public class $27_CuentaAtras {

	public static void main(String[] args) {
		int num = PideNumero();
		int atras =  CuentaAtras(num);
		Motrar(num,atras);
	}
	public static int PideNumero() {
		Scanner ent= new Scanner(System.in);
		int num;
		System.out.println("introduce Numero: ");
		num = ent.nextInt();
		return num;
	}
	public static int CuentaAtras(int num) {
	
		for( int i = 0; num> i; num--) {
			
		}
		return num;
	}
	public static void Motrar(int num,int atras) {
		System.out.println(atras);
	}
}
