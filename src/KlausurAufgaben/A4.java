package KlausurAufgaben;

import java.util.Scanner;

public class A4 {
	
	public static double berechneMasse(double volumen, double anteil) {
		final double dichte = 0.8;
		return volumen * anteil *dichte;
	}
	
	public static double berechneKonz(double alMasse, double gewicht, char typ) {
		double reduktion;
		
		
		switch(typ) {
        case 'm': reduktion = 0.7; 
        	break; 
        case 'w': reduktion = 0.6; 
        	break; 
        case 'j': reduktion = 0.5; 
        	break; 
        default:
            System.out.println("Ungültiger Typ! (Erlaubt: m, w, j)");
            return -1.0;
		}
		
		
		return alMasse / (gewicht * reduktion);
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
	    System.out.print("Volumen des Getränks (in ml): ");
	    double volumen = scanner.nextDouble();
	    
	    System.out.print("Alkoholvolumenanteil (z.B. 0.05 für 5%):");
	    double anteil = scanner.nextDouble();
		
	    System.out.print("Gewicht der Person (in kg): ");
	    double gewicht = scanner.nextDouble();
		
		System.out.println("(m = männlich, w= weiblich und j=jugendlich)");
	    char typ = scanner.next().charAt(0);
		
	    double alkoholMasse = berechneMasse(volumen, anteil);

	    double alkoholKonzentration = berechneKonz(alkoholMasse, gewicht, typ);
	    
	    if (alkoholKonzentration != -1.0) {
	        System.out.printf("Blutalkoholkonzentration: %.2f‰\n", alkoholKonzentration);

	        // Alkol sınırlarını kontrol et
	        if (alkoholKonzentration >= 0.5) {
	            System.out.println("Sie dürfen kein Auto mehr fahren!");
	        } else if (alkoholKonzentration >= 0.3) {
	            System.out.println("Sie sollten kein Auto mehr fahren!");
	        } else {
	            System.out.println("Sie dürfen Auto fahren.");
	        }
	    }

	    scanner.close();
	}
}
