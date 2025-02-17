package lektion6;

import java.util.Scanner;

public class Primzahlen {
	
	public static boolean prim(int num) {
		
		for(int i = 2; i < num; i++) {
			if (num % i == 0 ) {
			
				return false;
			}
			
		}
		return true;

	}	
	
	
	
	
	public static void main(String[] args) {
		System.out.println("Sayı giriniz: ");
		Scanner scanner= new Scanner(System.in);
		int num = scanner.nextInt();
		prim(num);
		if (prim(num)==true) {
			System.out.println("Asal");
		}else {
			System.out.println("Asal değil");
		}
		
		
		
		
	}

}
