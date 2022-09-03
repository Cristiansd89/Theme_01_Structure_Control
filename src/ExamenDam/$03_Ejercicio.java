package ExamenDam;
import java.util.Scanner;

public class $03_Ejercicio {

	public static void main(String[] args) {
		
				Scanner ent = new Scanner (System.in);
				
				int multiplicacion = 1;
				
			
				for (int i = 1; i <= 9; i++) {
					if(i %2 != 0) {
						multiplicacion = multiplicacion* i;
					
				}
				System.out.println("La multpplicacion de los 5 primeros numeros impares es:  " +multiplicacion);

			}

		}

	}


