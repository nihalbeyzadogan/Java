package lektion6;

import java.security.DrbgParameters.NextBytes;
import java.util.Iterator;
import java.util.Scanner;

public class Fakultat {
	
	public static int fak(int num) {
		int n = 1;
		for(int i= 1; i<=num; i++) {
			n *= i;	
		}
		return n;
	}
	
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı girin: ");
		int num = scanner.nextInt(); 
		
		fak(num);
		
		System.out.print("Sayı: " + fak(num));
		
	}

}
