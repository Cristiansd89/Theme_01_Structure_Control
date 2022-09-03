package bucles;

import java.util.Scanner;

public class DosNumeros_10 {

	public static void main(String[] args) {
	Scanner entrada=new Scanner(System.in);
	int n1;
	int n2;
	
	System.out.println("introduce un n�mero : ");
	n1=entrada.nextInt();
	
	System.out.println("introduce el seguno n�mero");
	n2=entrada.nextInt();
	
	if(n1<n2) {	
		while (n1<n2) {
		
			n1+=1;
			if(n1%2==0) {
			System.out.println(n1);
			}
		}

	}else {
		while (n2<n1) {
			
			n2+=1;
			if(n2%2==0) {
				System.out.println(n2);
			}
		}
		
	}
	}
	
}