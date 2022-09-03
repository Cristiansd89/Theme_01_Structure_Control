package EjerciciosGenerales;
import java.util.Scanner;
public class IntercambiaVariables_01 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int A,B,aux;
		
		System.out.println("Introduce el primer N�mero: ");
		A=entrada.nextInt();
		System.out.println("Introduce el Segundo N�mero: ");
		B=entrada.nextInt();
		
		aux=A;
		A=B;
		B=aux;
		
		System.out.println("El primer N�mero introducido no era: "+A );
		System.out.println("El Segundo N�mero no era: " +B);
		System.out.println("Aqui no se que habia: " +aux);
	}

}
