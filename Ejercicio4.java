package Paquete2;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner (System.in);
		
		System.out.println("Introduce la ciudad");
		
		String ciudad = input.nextLine();
		
		System.out.println("Vives en " + ciudad);
		
		input.close();

	}

}
