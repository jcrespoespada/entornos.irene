package ejerciciosClasesString;

import java.util.Scanner;

public class FechaDeNAcimiento {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input= new Scanner (System.in);
		
        System.out.print("Introduce el día de nacimiento: ");
        int dia = input.nextInt();

        input.nextLine(); 
        

        System.out.print("Introduce el mes (Enero, Febrero, etc.): ");
        String mes = input.nextLine();

        System.out.print("Introduce el año de nacimiento: ");
        int anio = input.nextInt();

        System.out.println("Tu fecha de nacimiento es: " + dia + "/" + mes + "/" + anio);

        input.close();
	}

}
