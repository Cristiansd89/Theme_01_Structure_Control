package ProgramacionModula;
import java.util.Scanner;
public class Ejercicio_09 {

	public static void main(String[] args) {
		double emp =  PideTrabajadores();
		double tarifa =  PideTarifa();
		CalculoSalario (emp,tarifa);
		
	
		
	}////////////////////////
	public static void CalculoSalario (double emp,double tarifa) {
		for (int i = 0;i < emp;i++) {
			System.out.println("Empleado " + i);
			double Hextras = PideHoras();
			double Sbruto = CalculoSbruto(tarifa,Hextras);
			double impuestos = calculoImpuestos (tarifa,Hextras,Sbruto);
			double neto = Sbruto - impuestos;
			VerResultados( Sbruto, impuestos, neto);
		}
		
	}
	public static int PideTrabajadores() {
		Scanner ent = new Scanner(System.in);
		int emp;
		System.out.println("Introduce el numero de empleados: ");
		do
		{
			emp = ent.nextInt();
			if(emp <= 0)
				System.err.println("EL numero de empleados tiene que ser mayor que 0.");
		}while(emp <= 0);
		return emp;
	}
	public static double PideHoras() {
		Scanner ent = new Scanner(System.in);
		double Hextras = 0;
		double horas;
		final double jornada = 38;
		do {
			System.out.println("Cuantas horas han heho:");
			horas = ent.nextDouble();
			if(horas <= jornada) {
				System.out.println("tiene que contar las horas extras: ");
				
			}
			else if (horas > jornada) {
				Hextras= horas - jornada;
			}
			
		}while(horas <= jornada);
		
		return Hextras;
	}/////////////////////
	
	public static double PideTarifa() {
		Scanner ent = new Scanner(System.in);
		double tarifa;
		System.out.println("Cuanto es la tarifa ordinaria : ");
		tarifa = ent.nextInt();
		return tarifa; 
	}///////////////////////////////
	//Sumamos las horas extras y la tarifa para sacar el sueldo bruto
	public static double CalculoSbruto(double tarifa,double Hextra) {
		double CalculoHoras = 0;
		double Sbruto;
		final double precioH = tarifa *1.5;
		
			CalculoHoras = Hextra * precioH;
			Sbruto = CalculoHoras + (tarifa * 38);
		
		return Sbruto;
		
	}////////////////////////////
	public static double calculoImpuestos (double tarifa,double Hextras,double Sbruto) {
		
		final double tramo1 = (Sbruto - 600);
		final double tramo2 = (Sbruto - 1200);
		double impuestos= 0;
		
		if (Sbruto<= 600 ) {
			impuestos = 0;
		}else if ( Sbruto > 600 && Sbruto <= 1200) {
			impuestos = tramo1 * 0.25;; 
		}else if (Sbruto > 1200 &&Sbruto <= 1800) {
			impuestos = 600 * 0.25 + tramo2 * 0.45;
		}
		return impuestos;
	}////////////////////////////////////////////////////
	public static void VerResultados(double Sbruto,double impuestos,double neto) {
		System.out.println("El salario bruto es: " + Sbruto);
		System.out.println("Impuestos: " + impuestos);
		System.out.println("El salario neto es: " + neto);
	}
}
