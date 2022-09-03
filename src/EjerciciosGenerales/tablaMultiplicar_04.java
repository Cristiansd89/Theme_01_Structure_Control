
package EjerciciosGenerales;
import java.util.Scanner;
public class tablaMultiplicar_04 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int n,mul;
		
		System.out.println("�Que numero quieres multiplicar?");
		n=entrada.nextInt();
		
		for(int i=1;i<=10;i++) {
			mul=n*i;
			System.out.println(n+" * "+i+" = "+mul);
		}
	}

}
