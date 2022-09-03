package bucles;

import java.util.Scanner;
public class PsitivoNegativoParImpar_12 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int N=0;
		
		System.out.println("Introduce un n�mero: ");
		N=entrada.nextInt();
		while(N!=0) {
			
			if(N>=1) {
				System.out.println(N+ " Es un n�mero positivo ");
			
			}else if(N<=-1) {
				System.out.println(N+ " Es un n�mero negativo ");
			}
			if(N%2==0) {
				System.out.println(" es n�mero par");
				
			}else {
				System.out.println("y es impar");
			}
			//hay que volver a realizar la pregunta al final para poder romper el bucle
			System.out.println("Vuelve a introducir un n�mero (Pulsa 0 para finalizar)");
			N=entrada.nextInt();
		}System.out.println("fin del programa");

	}

}
