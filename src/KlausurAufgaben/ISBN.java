package KlausurAufgaben;

import java.util.Scanner;

public class ISBN {
	private String isbn;

	
	
	public static boolean isISBN(String isbn) {
	
		String ohneStriche = isbn.replace("-", "");
		int summe = 0;
		for (int i = 0; i<10 ;i++) {
			int zahl = ohneStriche.charAt(i) - 48;   //ÖNEMLİ!!! chardan sayıya çevirmek için 48 çıkarıyorum çünkü ASCII de 0, 48 den başlıo. '0' şeklinde de yazabilirim
			summe += zahl * (i + 1);
		}
		
		int modulo = summe % 11;
		if(modulo == 0) {
			return true;
			
		}else {
			return false;
		}

	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("bitte geben Sie eine ISBN ein");
		String isbn= scanner.nextLine();
		
		if(isISBN(isbn)) {
			System.out.println("Isbn ist gültig");
		}else {
			System.out.println("Isbn ist nicht gültig");
		}
		
		

	
	}
}
