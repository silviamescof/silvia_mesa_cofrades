package transparencia45;

import java.util.Scanner;

public class ejercicio1 {
	public static void main (String[] args ) {
		
		int num, factorial = 1;
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("dime un numero");
		num=sc.nextInt();
		
		for(int i=1;i<=num;i++) {
			factorial*=i;
			
		}
		System.out.println("el factorial es "+ factorial);
	}

}
