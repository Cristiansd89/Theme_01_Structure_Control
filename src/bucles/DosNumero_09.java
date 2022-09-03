package bucles;

import java.util.Scanner;
public class DosNumero_09 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int n1;
		int n2;
		
		System.out.println("Primer n�mero");
		n1=entrada.nextInt();
		
		System.out.println("Segundo n�mero");
		n2=entrada.nextInt();
		
		if(n1>n2) {
			for(n1=0;n1<n2;n1++) {
				
			}System.out.println("lista de numeros del " +n1+ " a " +n2);
			
		}else {
			for( n2=0;n2<n1;n2++) {
				
			}System.out.println("lista de numeros del " +n2+ " a " +n1);


		}
		
	}
}