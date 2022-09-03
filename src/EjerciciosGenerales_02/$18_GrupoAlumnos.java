package EjerciciosGenerales_02;
import java.io.IOException;
import java.util.Scanner;

public class $18_GrupoAlumnos {

	public static void main(String[] args) throws IOException {
		Scanner ent = new Scanner(System.in);
		char sexo;
		char nombre;
		
		System.out.println("Eres H o M");
		sexo = (char)System.in.read();
		sexo = Character.toUpperCase(sexo);
		
		System.in.read();
		
		System.out.println("Nombre");
		nombre= (char)System.in.read();
		nombre = Character.toUpperCase(nombre);
		
		if (sexo == 'M') {
			if(nombre <= 'M') {
				System.out.println("Vas al grupo A");
			}else {
				System.out.println("Vas al grupo B");
			}
		}else if(sexo == 'H'){
			if(nombre >='N') {
				System.out.println("Vas al grupo A");
			}else {
				System.out.println("Vas al grupo B");
				
			}
		}

	}

}
