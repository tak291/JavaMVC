package vista;
import java.util.Scanner;


public class Vista {

	Scanner scan = new Scanner(System.in);
	
	// Debo inicializar esta Vista?
	public Vista() {
		
	}
	
	//Vista que recibe la letra del apellido.
	public char Apellido() {
		System.out.println("Digite la primera letra de su apellido: ");
		char a = scan.next().charAt(0);
		return a;
	}
	
	public String Mes() {
		String mes = "";
		System.out.println("Digite el mes que nació: ");
		scan.nextLine();
		mes = scan.nextLine();
		return mes;
	}
	
	public int Tel() {
		int tel;
		System.out.println("Digite el último número de su celular: ");
		tel = scan.nextInt();
		return tel;
	}
		
	
}
