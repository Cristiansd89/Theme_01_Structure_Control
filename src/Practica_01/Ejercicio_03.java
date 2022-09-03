
package Practica_01;
//introduce un numero por teclado .Visualizar por pantalla si es
//mayor o menor que 0
import java.util.Scanner;
public class Ejercicio_03 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		int num;
		
		System.out.println("Introduce un numero: ");
		num = entrada.nextInt();
		
		if(num > 0) {
			System.out.println(num+ "  Es mayor que 0");
		}else if(num < 0) {
			System.out.println(num+ " Es menor que 0");
		}else {
			System.out.println(" Es cero");
			
		}

	}

}
