package Linkedlist;

import java.util.Scanner;

public class main1 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Funktion liste = new Funktion();
		System.out.println("Kaç sayı gireceksiniz");
		int n = scanner.nextInt();
		  for (int i = 1; i <= n; i++) {
	            System.out.print(i + ". sayı: ");
	            int x = scanner.nextInt();
	            liste.sonaEkle(x);
	        }

	        System.out.println("Orijinal Liste:");
	        liste.yazdırma();

	        // Listeyi ters çevir
	        liste.tersCevir();

	        System.out.println("\nTers Çevrilmiş Liste:");
	        liste.yazdırma();
		
		
	}

}
