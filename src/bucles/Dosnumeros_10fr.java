package bucles;

import java.util.Scanner;

public class Dosnumeros_10fr {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int n2,n1;
		do {
			//llamamos la clase Scanner para introducir datos
			System.out.println("Primer numero");
			 n1=entrada.nextInt();
			System.out.println("Segundo numero");
			 n2=entrada.nextInt();
		
			if(n2>=n1) {
			System.out.println("El mayor debe ser el primero");
			}
		}while(n2>=n1) ;
		
		for(int i=n2;i<n1;i++) {
			if(i%2==0) {
				System.out.println(i);
				
			}
		}
	
	
}
}




