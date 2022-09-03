package EjerciciosGenerales_02;

import java.util.Scanner;
public class $01_Rectangulo {

	public static void main(String[] args) {
		Scanner ent = new Scanner(System.in);
		int base, altura;
		int Area ;
		int perimetro;
		
		System.out.println("Base :");
		base = ent.nextInt();
		
		System.out.println("altura :");
		altura = ent.nextInt();
		
		Area = base* altura;
		perimetro = (base*2) + (altura*2);
		
		System.out.println("el area es : "+Area);
		System.out.println("El perimetro es :" +perimetro);
				

	}

}
