package ProgramacionModula;

import java.util.Scanner;
public class Ejercicio_11 {

	public static void main(String[] args) {
		int num = PideNumero();
		int binario = Binario(num);
		MostrarBinario(num,binario);
	}
	public static int PideNumero() {
		Scanner ent= new Scanner(System.in);
		int num;
		System.out.println("introduce Numero: ");
		num = ent.nextInt();
		return num;
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
