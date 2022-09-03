package EjerciciosGenerales;
import java.util.Scanner;


public class NumeroPerfecto {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n,suma=0;
		System.out.println("Introduce un N�mero: ");
		n=entrada.nextInt();
		
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				System.out.println(suma+=i);	
			}
			
		}
		if(suma==n) {
			System.out.println(n+" Es un n�mero perfecto");
		}else {
			System.out.println(n+" No es un n�mero perfecto");
		}

	}

}
