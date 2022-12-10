package transparencia45;

import java.util.Scanner;

public class ejercicio2 {
	public static void main (String[] args ) {
		
		int base, elevado, resultado = 0;
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Dime un numero para la base");
		base=sc.nextInt();
		System.out.println("Dime un numero para el exponente");
		elevado=sc.nextInt();
		
		resultado=base*base;
		
		if(elevado>2) {
		for (int i=2;i<elevado;i++) {
			resultado*=base;
			
		}
		System.out.println("El resultado es "+ resultado);
	}

}
}
