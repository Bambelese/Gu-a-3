package casos3_java;

import java.util.Scanner;

public class caso4 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int num, num_mayor, c;
		c=1;
		num_mayor= 0;
		
		while(c<=4) {
			System.out.println("Ingrese número "+c+": ");
			num= sc.nextInt();
			if(num>num_mayor) {
				num_mayor = num;
			}
			
			c++;
		}
		System.out.println("El número mayor es: "+num_mayor);

	}

}
