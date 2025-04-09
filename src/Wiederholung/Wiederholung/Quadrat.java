package Wiederholung;

import java.util.Scanner;

public class Quadrat {

	public static void printQuadrat(int zeilen) {
		 if (zeilen < 2 || zeilen <= 0) {
	            System.out.println("Die Anzahl der Zeilen muss mindestens 2 oder '+' sein.");
	            return;
	        }
		
		 // Erste Zeile drucken
	        for (int i = 0; i < zeilen; i++) {
	            System.out.print("*");
	        }
	        System.out.println();

	        // Mittlere Zeilen drucken
	        for (int i = 0; i < zeilen - 2; i++) {
	            System.out.print("*");  // Erste Spalte
	            for (int j = 0; j < zeilen - 2; j++) {
	                System.out.print(" ");  // Leerzeichen in der Mitte
	            }
	            System.out.println("*");  // Letzte Spalte
	        }
	        
	   
	        for (int i = 0; i < zeilen; i++) {
	            System.out.print("*");
	            }
	        System.out.println();
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Zeile zahlen:");
		int zeile = scanner.nextInt();
		
		printQuadrat(zeile);
		
		
	}

}
