package vista;
import java.util.Scanner;


public class Vista {

	Scanner scan = new Scanner(System.in);
	
	// Debo inicializar esta Vista?
	public Vista() {

	}
	
	//La vista pediendo la opción del usuario si continuar o salir.
	public int View() {
		
		int a;
		System.out.println("Choose an option: \n"
				+ "1. Continue \n"
				+ "2. Stop.");
		
		a = scan.nextInt();
		
		return a;
	}
	
	public void Edad(int x) {
		System.out.println("Your age is: " + x);
	}
	
}
