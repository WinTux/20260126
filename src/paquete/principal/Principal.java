package paquete.principal;

import java.util.Scanner;

import paquete.principal.Clases.Empleado;
import paquete.principal.Clases.Escolar;
import paquete.principal.Clases.Estudiante;
import paquete.principal.Clases.Persona;

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
		edad = (int)1.72123213;
		
		
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
		
		// Ejemplo de uso: Clase Estudiante
		Estudiante est01;
		est01 = new Estudiante();
		est01.setNombre("Arthur");
		est01.setMatricula(123);
		System.out.println("Nombre: "+est01.getNombre()+", Matrícula: "+est01.getMatricula());
		est01.setMatricula(-1);
		System.out.println("Nombre: "+est01.getNombre()+", Matrícula: "+est01.getMatricula());
		
		
		Escolar e01 = new Escolar();
		System.out.println("Nombre: "+e01.getNombre()+", Matrícula: "+e01.getMatricula());
		Escolar e02 = new Escolar("Ana","Rocha",3001,"Java","San Matías","A");
		
		usandoPolimorfismo();
    }
	private static void usandoPolimorfismo() {
		Estudiante estudiante = new Estudiante("Samantha","Roca");
		Escolar escolar = new Escolar("Pepe","Perales",333,"Programación","San Agustín","B");
		Empleado empleado = new Empleado(505);
		int numeroTelefono = 70767856;
		int item = 402;
		int[] numeros = new int[5];// estructura de datos ESTÁTICA
		numeros[0] = 90;
		numeros[2] = numeroTelefono;
		numeros[4] = item;
		
		Estudiante[] listaEstudiantes = new Estudiante[3];
		listaEstudiantes[0] = estudiante;
		//listaEstudiantes[1] = empleado;
		listaEstudiantes[2] = escolar;
		
		Persona[] listaPersonas = new Persona[3];
		//listaPersonas[0] = estudiante;
		listaPersonas[1] = empleado;
		listaPersonas[2] = escolar;
		
		listaPersonas[1].saludar();
		listaPersonas[2].saludar();
		
		estudiante = escolar;
		escolar = (Escolar) estudiante;
		
	}
	public static void ejemploMetodo() {
		System.out.println("========================");
		System.out.println("=   MÉTODO EJECUTADO   =");
		System.out.println("========================");
	}
}
