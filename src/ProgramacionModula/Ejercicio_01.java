package ProgramacionModula;

import java.util.Scanner;

public class Ejercicio_01 {

	public static void main(String[] args) {
		int altura = pideAltura();
		int base = pideBase();
		int CalculoArea = CalculoArea (altura, base );
		int CalculoPerimetro = CalculoPerimetro (altura, base);
		Mostrar (altura, base, CalculoArea, CalculoPerimetro);
	}
	public static int pideAltura() {
		Scanner entrada = new Scanner(System.in);
		int altura;
		System.out.println("Introduce Altura: ");
		altura = entrada.nextInt();
		return altura;
		
	}
	public static int pideBase() {
		Scanner entrada = new Scanner(System.in);
		int base;
		System.out.println("Introduce Altura: ");
		base = entrada.nextInt();
		return base;
		
	}
	public static int CalculoArea (int altura, int base ) {
		int CalculoArea;
		CalculoArea = base * altura;
		
		return CalculoArea;
		
	}
	public static int CalculoPerimetro (int altura, int base){
		int CalculoPerimetro;
		CalculoPerimetro = (base *2 ) + (altura * 2);
		return CalculoPerimetro;
		
		
	}
	public static void Mostrar (int altura, int base, int CalculoArea, int CalculoPerimetro) {
		System.out.println("El perimetro es " +CalculoPerimetro);
		System.out.println("El Area es " +CalculoArea);
		
	}
}
