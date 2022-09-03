package bucles;
import java.io.IOException;
import java.util.Scanner;
public class PositivoNegativoParImpar_12_03 {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		int N;
		char letra;
		
		
		do {
			System.out.println("Introduce un n�mero: ");
			N=entrada.nextInt();
			if(N!=0) {
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
			}
			//hay que volver a realizar la pregunta al final para poder romper el bucle
			System.out.println("�Quieres introducir mas numeros S/N?");
			letra = (char)System.in.read();
		}while(letra !='N' && letra!='n');
		
		System.out.println("Fin del programa");


	}
}
