package Paquete2;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pide el nombre al usuario y muestra "Hola, [nombre]".
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Como te llamas?");
		
		// String nombre = "JORGE";
		
		String nombre = input.nextLine();
		
		System.out.println("Hola "+ nombre);
		
		System.out.println("Introduce otro nombre ");
		
		nombre= input.nextLine();
		
		System.out.println("Hola "+nombre );
		
		input.close();
		

	}

}
