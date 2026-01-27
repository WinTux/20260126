package paquete.principal;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		System.out.println("¡Hola mundo!");
		// Variables
		//Numericas
		int edad;
		float estatura;
		double peso;
		//Lógica
		boolean casado;
		//Texto
		char genero; //M F
		String nombre; 
		
		nombre = "Pepe Perales";
		genero = 'M';
		casado = false; // true
		peso = 56.4;
		estatura = 1.7f;
		estatura = (float) 1.72123213253;
		
		estatura = Float.parseFloat("1.81");
		
		// Tipos de error
		// 1. Sintaxis
		// 2. Ejecución
		// 3. Semántico
		
		// Lectura de datos
		Scanner leer = new Scanner(System.in);
		System.out.println("========================");
		System.out.println("Por favor, ingrese su nombre:");
		nombre = leer.nextLine();
		System.out.println("Por favor, ingrese su edad:");
		edad = leer.nextInt();
		
		System.out.println("Hola "+nombre+", veo que tienes "+edad+" años.");
		
		// Llamando al método ejemploMetodo
		ejemploMetodo();
	}
	public static void ejemploMetodo() {
		System.out.println("========================");
		System.out.println("=   MÉTODO EJECUTADO   =");
		System.out.println("========================");
	}
}
