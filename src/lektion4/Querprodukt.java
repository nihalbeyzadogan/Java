package lektion4;

import java.util.Scanner;

public class Querprodukt {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie bitte eine Zahl ein:");
		int zahl= scanner.nextInt();
		boolean validNum = false;
		int quer = 1;
		
			if (zahl <= 1_000_000 && zahl >= 1 ) {
				while (zahl > 0) {
					quer = quer * (zahl % 10);
					zahl = zahl / 10;}
				}else {
					System.out.println("Zahl ist ungültig");
					return;
			}
			System.out.println("Querprodukt:" + quer);
		}
		
	}


