package lektion6;

import java.util.Scanner;

public class Runden {
	
	public static void beyza(double num) {
		double check = num - (int) num;
		int num2 = (int) num ;
		if(check < 0.5) {
			System.out.printf("Sayınız: " + num2);
		}else {
			System.out.printf("Sayınız: " + (num2 +1));
		}
		
	}
	
	
	
	public static void main(String[] args) {
		Scanner scanner= new Scanner(System.in);
		System.out.println("Sayı giriniz: ");
		double num = scanner.nextDouble();
		
		beyza(num);
		
		
	}

}
