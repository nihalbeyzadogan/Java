package lektion6;

import java.util.Scanner;

public class Dreieck {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Sayı: ");
		int num = scanner.nextInt();
		
		for(int i=0; i < num; i++) {
		
			for(int j= 0; j < num - i; j++) {
				System.out.print(" ");
			}
			for(int k =  0; k <= i;k++) {
				System.out.print(" *");
			}
				System.out.println();
		}
		
		
		
	}

}
