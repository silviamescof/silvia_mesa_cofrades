package transparencia45;

import java.util.Scanner;

public class ejercicio5 {
	
public static void main (String[] args ) {
		
		int a = 0;
		
		Scanner sc=new Scanner (System.in);
		System.out.println("dime un numero para a ");
		a=sc.nextInt();
		
		
		
		
		for(int i=0;i<=a;i++) {
			for(int j=0;j<a;j++) {
				System.out.println("*");
			}
			System.out.print("*");
		}
		
		
	}

}
