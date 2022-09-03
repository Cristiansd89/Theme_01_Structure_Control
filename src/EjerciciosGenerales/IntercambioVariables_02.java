package EjerciciosGenerales;
import java.util.Scanner;

public class IntercambioVariables_02 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int a,b,aux;
		
		System.out.println("Primer Numero");
		a=entrada.nextInt();
		System.out.println("Segundo Numero");
		b=entrada.nextInt();
		System.out.println("Los valores iniciales a= " +a+ " b=" +b);
		a=a+b;
		b=a-b;
		
		
		System.out.println("primer resultado: "+a);
		System.out.println("Segundo resultado: "+b);
		System.out.println("primerTercer: " +a);
	}

}
