package EjerciciosGenerales_02;
import java.util.Scanner;
public class $07_ConjuntoNumeros {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int num;
		int quince = 0;
		int cincuenta = 0;
		int contador = 0 ;
		int MasDe = 0 ;
		do {
			System.out.println("Numero: ");
			num = ent.nextInt();
			if (num>0){
				contador= contador +1;
			}
			if(num < 15) {
				quince = quince+1;
				
			}else if(num > 45 && num> 55){
				cincuenta= cincuenta +1;
			}else if(num > 55) {
				MasDe = MasDe +1;
			}
		}while (contador < 6);
		System.out.println("menores de 15 "+quince);
		System.out.println("Entre 45 y 55 : " +cincuenta);
		System.out.println("mas de 55 : " +MasDe );

	}

}
