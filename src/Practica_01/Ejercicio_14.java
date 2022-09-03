package Practica_01;
//Calculadora con menu
import java.util.Scanner;
public class Ejercicio_14 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int a, b;
		int suma ;
		int resta ;
		int multi ;
		int division;
		int boton  ;
		 
		 
		 System.out.println("1º numero: ");
		 a = entrada.nextInt();
		 
		 System.out.println("2º numero: ");
		 b = entrada.nextInt();
		do {	 
		 
		 System.out.println("¿Quieres hacer?");
		 System.out.println("1-Si quieres sumar ");
		 System.out.println("2-Si quieres restar ");
		 System.out.println("3-Si quieres multiplicar ");
		 System.out.println("4-Si quieres dividir ");
		 System.out.println("Tiene que ser una accion contemplada: ");
		 boton = entrada.nextInt();	 
				
		}while(boton <1 || boton > 4);	 
		
		switch(boton) { 
			case 1 :
				suma = a + b;
				System.out.println(a+" + " +b+ " = " +suma);
				break;
			case 2 :
				resta = a - b;
				System.out.println(a+" - " +b+ " = " +resta);
				break;
			case 3 :
				multi = a * b;
				System.out.println(a+" * " +b+ " = " +multi);
				break;
			case 4 :
				if(b == 0) {
					System.out.println("No se puede divir por cero");
				
				
				}else {
					division = a / b;
					System.out.println(a+" / " +b+ " = " +division);
				
			}
				break;

		
		 }
			 
	}
	
	
	

}
