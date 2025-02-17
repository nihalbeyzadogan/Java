package lektion3;

import java.util.Scanner;

public class Schaltjahr {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Yıl giriniz");
		int jahr = scanner.nextInt();
		
		/*if (jahr % 4 == 0 ) {
			if (jahr % 100 == 0) {
				if (jahr % 400 == 0) {
					System.out.println("Shaltjahr: da ganzzahlig durch 4 und 100 teilbar, aber auch durch 400");
				} else {
					System.out.println("Kein Schaltjahr: da ganzzahlig durch 4 und 100 teilbar, aber nicht durch 400");
				}
			} else {
				System.out.println("Schaltjahr: da ganzzahlig durch 4 teilbar");
			}
		} else {
			System.out.println("Kein Schaltjahr: da nicht ganzzahlig durch 4 teilbar");
		}*/
		if ((jahr % 4 == 0 && jahr % 100 != 0) || (jahr % 400 == 0)) {
			System.out.println(jahr +" ein");
		}else {
			System.out.println(jahr + " kein");
		}
		
		
		
		
		
		scanner.close();
	}

}
