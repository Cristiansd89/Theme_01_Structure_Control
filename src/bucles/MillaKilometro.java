package bucles;

import java.util.Scanner;

public class MillaKilometro {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		
		int milla;
		double km;
		
		 do{
			System.out.println("Millas: ");
			milla=entrada.nextInt();
			if(milla!=0) {
				km=milla*1.6093;
				System.out.printf("%d millas equivalen a %.2f KM %n", milla, km); 
			}
		}while(milla!=0);
		 System.out.println("Fin");
	}

}
