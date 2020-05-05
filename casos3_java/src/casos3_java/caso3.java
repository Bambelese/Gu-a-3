package casos3_java;

import java.util.Scanner;

public class caso3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int c = 1, factorial = 1, num = 0;
		
		System.out.print("Ingrese un número: ");
		num = sc.nextInt();
		
		
		while (c <= num) {
			factorial*=c;
			c++;
		}
		System.out.println("El factorial de "+num+" es: "+factorial);
		
		

	}

}
