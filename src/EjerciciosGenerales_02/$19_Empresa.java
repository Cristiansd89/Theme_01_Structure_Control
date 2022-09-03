package EjerciciosGenerales_02;

import java.util.Scanner;


public class $19_Empresa {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		double puntuacion;
		double dinero = 2400;
		System.out.println("introduce puntuacion: ");
		puntuacion = ent.nextDouble();
		
		if (puntuacion == 0.0) {
			System.out.println("Incaptable: "+dinero*0.0);
		}else if  (puntuacion == 0.4) {
			System.out.println("Aceptable: "+dinero*0.4);
		}else if  (puntuacion >= 0.6) {
			System.out.println("Meritorio: "+dinero*0.6);
		}
	}

}
