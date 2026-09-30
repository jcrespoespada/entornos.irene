package Paquete3;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Introduce un número");
		int num1= input.nextInt();
		
		System.out.println("Introduce un segundo número");
		int num2= input.nextInt();
		
		/*
		 * System.out.println("introduce dos números");
		 * int num1 = input.nextInt();
		 * int num2 = intput.nextInt();
		 */
		
		//SUMA
		int suma = num1 + num2;
		System.out.println("La suma es: " + suma);
		
		//RESTA
		System.out.println("La resta es: " +(num1 - num2));
		
		//MULTIPLICAIÓN
		System.out.println("La multiplicación es: " + (num1*num2));
		
		//DIVISIÓN 
		
		if(num2 != 0) {
			
			System.out.println("La división es: " + (num1/num2));
		
		} else {
			System.out.println("No se puede dividie entre 0");
		}
		
		//System.out.println("La división es: " + (num1/num2));


		
		/*
		 * num1 = 0 y num2 = 5 --> resultado da 0
		 * num1 = 5 y num2 = 0 --> no se puede dividir entre 0
		 * 						   si no esta el if else sale mensaje de error
		 * 
		 * num1 = 0 y num2 = 0 --> no se puede dividir entre 0
		 * 						   si no esta el if else sale mensaje de error
		 **/
		
		
	}

}
