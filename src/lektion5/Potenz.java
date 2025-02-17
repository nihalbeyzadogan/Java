package lektion5;

import java.util.Iterator;
import java.util.Scanner;

public class Potenz {

	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Enter base: ");
		double b= scanner.nextDouble();
		System.out.println("Enter n: ");
		int n = scanner.nextInt();
		
		double result = 1.0;
		
		if ( n == 0) {
			result = 1;
		}else if (n > 0) {
			for(int i = 1; i <= n; i++) {
				result *= b;
			}
		 }else {
			for(int j = 1; j <= -n; j++) {
				result *= (1.0 / b);
			}
		}
		
		System.out.printf("Sonuç: %.5f%n", result);
		scanner.close();
	}

}
