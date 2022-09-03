package EstructuraCondicional;

import java.util.Scanner;
public class Hora_09 {

	public static void main(String[] args) {
Scanner entrada=new Scanner(System.in);
		
		System.out.println( "Hora");
		int H=entrada.nextInt();
		
		System.out.println( "Minutos");
		int M=entrada.nextInt();
		
		System.out.println( "Segundos");
		int S=entrada.nextInt();

		if(H>0 && H<24 && M>=0 && M<60 && S>=0 && S<60){
			System.out.println("Hora Correcta");
		}else {
			System.out.println("Hora inCorrecta");
		}
	}

}
