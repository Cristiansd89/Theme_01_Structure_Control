package EjerciciosGenerales;
import java.util.Scanner;
public class NumerosAcabados2 {
		

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n,conta=0;
		
		do {
			System.out.println("N�meros :");
			n=entrada.nextInt();
			if (n%10==2){
				conta+=1;
			}
			
		}while(n>0);
		
		System.out.println("La cantidad de numeros acabados en 2 es: " +conta);
		
	}

}
