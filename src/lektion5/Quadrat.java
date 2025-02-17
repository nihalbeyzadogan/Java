package lektion5;

import java.util.Scanner;

public class Quadrat {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Bir Sayı giriniz: ");
		double num = scanner.nextDouble();
		
		System.out.print("Steps: ");
		int steps = scanner.nextInt();
		
		double res = num / 2;
		
		for (int i = 0; i < steps; i++) {
			res = (res + num / res) / 2;
		}
		System.out.printf("tahmini karekök: %.5f%n" , res);
		System.out.printf("Gerçek karekök: %.1f%n", Math.sqrt(num));
	}

}
