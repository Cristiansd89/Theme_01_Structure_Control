package EjerciciosGenerales_02;


public class $09_TablaMultiplicar {

	public static void main(String[] args) {
		int num = 10;
	
		
		for(int i = 1;i < num;i++) {
			System.out.println("");
			for(int j = 1; j<num;j++) {
				int mul = i * j ;
				System.out.println( i+" * " +j+ " = " +mul);
				
			}
			
		}

	}

}
