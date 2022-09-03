package EjerciciosGenerales_02;

import java.util.Scanner;

public class $25_Combinacion {

	public static void main(String[] args) {
		int M = PideM ();
		int N = PideN (M);
		int factorial = calcularFactorial(M);
		int combinacion = calcularCombinacion( M, N);
		 verResultado(M, N, combinacion);
	}
	public static int PideM () {
		
		Scanner entrada = new Scanner(System.in);
		int M ;
			
		 do{
			System.out.println("Introduce M no puede ser negativo :  ");
			M = entrada.nextInt();
		}while(M < 0);
		return M;
	}////////////////////////////////
	public static int PideN (int M) {
		Scanner entrada = new Scanner(System.in);
		int N = 0 ;
			
		do {
			System.out.println("Introduce N no puede ser negativo ni mayor que M :  ");
			N = entrada.nextInt();
		
		}while(N < 0 && N > M);
		return N;
	}
	public static int calcularFactorial(int M){
		if(M == 0) {
			return 1;
		}else {
			return M * calcularFactorial(M-1);
		}
	}
	////////////////////////////////////////

	public static int calcularCombinacion(int M, int N) {
		return calcularFactorial(M)/(calcularFactorial(M)*calcularFactorial(M-N));
	}
	////////////////////////////////////////

	public static void verResultado(int M, int N, int combinacion) {
		System.out.println("La combinaciones de "+ M+ " sobre "+ N + " son " + combinacion);

	}
	}


