package controlador;

import modelo.Arreglos;
import vista.Vista;

public class Controlador {

	//Iniciamos la vista y los arreglos.
	Vista V;
	Arreglos Apellidos;
	Arreglos Fechas;
	Arreglos Tels;
	
	
	String Apellido [] = {"La verdadera", "La excitante", "La horripilante", "La alegre", " La fatal", "La pasionante", "La trágica", "La sangrienta", "La famosa", "La Gran", "La penosa", "La Triste", "La desastrosa", "La Hermosa", "La oscura", "La gloriosa", "La infeliz", "La emocionante", "La fantástica", "La terrorífica", "La aburrida", "La inreíble", "La Desraciada", "La lamentable", "La Cómica", "La miserable" };
	String Fecha []= {"Hazaña", "Reencarnación", "Batalla", "Existencia", "Muerte", "Misión", "Venganza", "Anécdota", "Vida", "Leyenda", "historia", "Biografía"};
	String Tel [] = {"De un bipolar", "De un asesino", "De un loco/a","De un adecito/a a los memes", "De un soñador/a", "De un genio incomprendido/a", "De un simbolo sexual", "De un alcohólico", "De un guerrero/a", "De un aventurero/a" };
	
	
	public Controlador() {
		V = new Vista();
		
		
		// Constructor con todos los arreglos en un arreglo
		//A = new Arreglos(Fecha, Apellido, Tel);
		
		
		//Arreglos separados
		Apellidos = new Arreglos(Apellido);
		Fechas = new Arreglos(Fecha);
		Tels = new Arreglos(Tel);
		
		System.out.println(Apellidos.getC()[3]);
		
		
	}
	

	
}
