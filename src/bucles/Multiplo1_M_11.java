package bucles;

import java.util.Scanner;

public class Multiplo1_M_11 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int M;
		int N;
		//Lectura de dosn�meros enteros N y M
		//N y M deben ser positivos
		//N debe ser menor que M
		do {
		System.out.println("Introduce un Numero positivo : ");
		N=entrada.nextInt();
			if(N<=0) {
				System.out.println("Debes introducir un n�mero positivo");
			}//Este primer do es para obligar a intorducir un numero positivo
		}while(N<=0);
		do {
			//En este do se va pedir un numero mayor que el de arriba
			System.out.println("introduce otro n�mero mayor que " +N+ " : ");
			M=entrada.nextInt();
			
			if(M<=0) {
				System.out.println("Debes introducir un n�mero mayor que " +N);
			}
		}while(M<=N);
		
		//Mostrar los multiplos de N desde 1 hasta M
		System.out.println("\nM�ltiplos de  " + N + "  hasta " + M + " : ");
		for(int i=1; i<M;i++) {
			if(i%N==0) {
				System.out.println("los multiplos son " +i);
			}//Con la M se indica hasta donde queremos que aparezcan los multilos y con la N del if le estamos diciendo 
			 //Desde donde los queremos, solo mostrara en pantalla los multiplos cuyo resto dividio por N sea =0 
		}

	}

}
