package EjerciciosGenerales_02;

import java.util.Scanner;
public class $28_Multiplos {

	public static void main(String[] args) {
		Scanner ent= new Scanner(System.in);
		int num;
		int hasta;
		System.out.println("los multiplos del  :");
		num = ent.nextInt();
		
		System.out.println("Hasta el :");
		hasta = ent.nextInt();
		
		
		for (int i= 1; i < hasta; i++) {
			if (i%num == 0) {
				System.out.println(i);
			}
		}
		
				
	}

}
