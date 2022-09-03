package bucles;

import java.util.Scanner;
public class CuentaCifras_13 {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int contador= 0;
		int num;
		boolean continuar = false;
		String letra;
		
		 while(!continuar) {
			System.out.println("introduce un numero: ");
			num = ent.nextInt();
				//se divide la variable num numero hasta quede cero
			//y se cuenta el numero de veces que ha sumado el contador
			 while(num > 0) {
				 num=num/10;
				 contador++;
				 
			 }
			 System.out.println("tiene "+contador+ "cirfras");
			 System.out.println("Quieres continuar? s/n");
			 letra = ent.nextLine();
			 continuar = letra =="n";
		 }
		 System.out.println("Fin del programa");
		
		 
	}

}
