import java.time.LocalDate;
import java.util.Scanner;

public class CalculaEdad {

	public static void main(String[] args) {
		// TODO Esbozo de método generado automáticamente
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Introduce el año de nacimiento (yyyy):");
		int anio=Integer.parseInt(sc.next());
		
		/*System.out.println("Introduce el mes de nacimiento (mm):");
		int mes=Integer.parseInt(sc.next());
		
		System.out.println("Introduce el día de nacimiento (dd):");
		int dia=Integer.parseInt(sc.next());*/
		
		//int edad=LocalDate.now().getYear() - LocalDate.of(anio, mes, dia).getYear();
		
		int edad=LocalDate.now().getYear()-anio;
		
		System.out.println("Tu edad es: " + edad);
		
		sc.close();

	}

}
