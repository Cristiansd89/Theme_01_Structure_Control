package EjerciciosGenerales;
import java.io.IOException;
import java.util.Scanner;

public class CuentaCifras_03 {

	public static void main(String[] args) throws IOException {
		Scanner entrada=new Scanner(System.in);
		int num,cifras;
		char car;
		
		
		do {
			System.out.println("introduce un numero: ");
			num=entrada.nextInt();
			cifras=0;
			while(num!=0) {
				num=num/10;
				cifras++;
				
		}
		System.out.println("El numero tiene " +cifras+ " cifras ");
		System.out.println("�Quieres continuar?");	
		car = (char)System.in.read();
		
		}while(car !='n' && car !='N');
		}

}
