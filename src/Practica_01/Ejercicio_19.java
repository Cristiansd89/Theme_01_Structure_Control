package Practica_01;

import java.util.Scanner;
public class Ejercicio_19 {

	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		int nota = 0 ;
		int contador = 0;
		int suma = 0;
		boolean salir = false;
		
		while(!salir) {
			
			System.out.println("Nota: ");
			nota = entrada.nextInt();
			salir = (nota == -99);
			
			
			if(nota > 0) {
				
				suma = suma + nota;
				contador ++;
			}
		}
		if(contador > 0) {
		System.out.println("la nota media es " +suma/contador);
		}else {
			System.out.println("No has introducido notas");
		}
	}

}
