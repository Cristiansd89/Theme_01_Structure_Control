package bucles;

import java.util.Scanner;
public class Numero1_n_07fr {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		 int n;
		 
		 System.out.println("Introduce un n�mero");
		 n=entrada.nextInt();
		 System.out.println("Numeros del 1 al " +n);
		 int i=1;
		 do {
			 System.out.println(i);
			 i++;
			 
		 }while(i<=n);
	}

}
