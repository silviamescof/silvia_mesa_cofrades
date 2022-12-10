package transparencia45;

import java.util.Scanner;

public class ejercicio3 {
	public static void main (String[] args ) {
		
		int a = 0, b = 0, resultadoa, resultadob;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("dime un numero para a ");
		a=sc.nextInt();
		System.out.println("dime un numero para b");
		b=sc.nextInt();
		
		resultadoa=a;
		
		for(int i=1;i<b;i++) {
			resultadoa+=a;
		}
		
		System.out.println("el resultado es "+resultadoa);
	}

}
