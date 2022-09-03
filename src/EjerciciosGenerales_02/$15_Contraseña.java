package EjerciciosGenerales_02;

import java.util.Scanner;

public class $15_Contraseña {
	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int contraseña;
		
		boolean ContraCorrecta = false;
		
		System.out.println("Introduzca Contrase�a:");
		
		do {
			contraseña = ent.nextInt();
			ContraCorrecta =(contraseña == 3333);
			if (!ContraCorrecta) {
				System.out.println("Error vuelve a introducir la Contrase�a");
			}
			
			
		}while(!ContraCorrecta);
		
		if(ContraCorrecta) {
			System.out.println("has introducido la contrase�a correcta "+contraseña);
		}

	}

}
