package Practica_01;

import java.util.Scanner;
/*introducir por teclado la vase y la altura de un rectángulo
 * imprimir en pantalla su área y perimetro
 */
public class Ejercicio_01 {

	public static void main(String[] args) {
		Scanner entrada=new Scanner(System.in);
		int altura;
		int base;
		int area;
		int perimetro;
		System.out.println("introduce altura :");
		altura = entrada.nextInt();
		
		System.out.println("introduce base: ");
		base = entrada.nextInt();
		
		area = base * altura;
		perimetro = (base * 2)+ (altura * 2);
		
		System.out.println("El area del rectangulo es: " +area);
		System.out.println("El perimetro del rectangulo : " +perimetro);
		
		
	}

}
