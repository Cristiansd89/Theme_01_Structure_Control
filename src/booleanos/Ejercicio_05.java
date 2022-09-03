package booleanos;
import java.util.Scanner;

public class Ejercicio_05 {

	public static void main(String[] args) {
		int pin =  pin();

	}
	public static int pin() {
		Scanner ent= new Scanner (System.in);
		int pin;
		int contador = 0;
		boolean PinValido = false;
		 do{
			System.out.println("introduzca un pin :");
			pin = ent.nextInt();
			PinValido =(pin == 1111);
			if(!PinValido) {
				contador++;
			}
				
		 }while(!PinValido && contador < 3 );
		
		if(PinValido) {
			System.out.println("El pin es valido");
			
		}else {
			System.out.println("has agotado elnumero de intentos");
		}
		return pin;
	} 
	
}

