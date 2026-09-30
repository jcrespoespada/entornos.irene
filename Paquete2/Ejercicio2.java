package Paquete2;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Pide un número y muestra el doble.
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num = input.nextInt();
		
		//forma corta
		System.out.println("El doble de " + num + " Es: "+ (num*2));
		
		//forma larga
		int doble = num *2;
		
		System.out.println("El doble de " + num + " Es:" + doble);
		
		input.close();
	}

}
