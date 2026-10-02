package ejerciciosClasesString;

import java.util.Scanner;

public class RadioCircunfereencia {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input= new Scanner (System.in);
		
		System.out.println("Introduce el valor del radio de la circunferencia");
        double radio = input.nextDouble();

        double area = Math.PI * radio *radio;
        double longitud = 2 * Math.PI * radio;
        
        System.out.println("El área de la circunferencia es: " + area);
		System.out.println("La longitud de la circunferencia es: "+ longitud);
        
        input.close();
	}

}
