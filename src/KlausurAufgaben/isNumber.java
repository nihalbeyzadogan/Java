package KlausurAufgaben;

import java.util.Scanner;

public class isNumber {
	
	public static int isNumber() {
		//mit valueOf()
		boolean zahlEingegeben = false;
		String eingabe = "";
		int zahl = 0;
		
		while(zahlEingegeben == false) {
			try {
				System.out.println("Bitte zahl eingeben:");
				Scanner scanner = new Scanner(System.in);
				eingabe = scanner.nextLine();
				zahl = Integer.valueOf(eingabe);
				zahlEingegeben = true;
			}catch(Exception e) {
				System.out.println("Bitte wiederholen Sie die Eingabe.");
				}
			}
			return zahl;	
		}
	
	public static void main(String[] args) {
		int ergebnis = isNumber();
		System.out.println(ergebnis);
	}
	
}
	/*
}
	public static int isNumber() {
		
		boolean zahlEingegeben = false;
		int zahl = 0;
		
		while(zahlEingegeben == false) {
		try {
			System.out.println("Bitte zahl eingeben:");
			Scanner scanner = new Scanner(System.in);
			zahl = scanner.nextInt();
			zahlEingegeben = true;
		}catch(Exception e) {
			System.out.println("Bitte wiederholen Sie die Eingabe.");
			}
		}
		return zahl;	
	}
	
	public static void main(String[] args) {
		int ergebnis = isNumber();
		System.out.println(ergebnis);
	}
}
*/