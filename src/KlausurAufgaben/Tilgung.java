package KlausurAufgaben;

public class Tilgung {
	
	
	public static int tilgung(int kreditsumme, int schuldzins, int tilgungsrate ) {
		double zinsProJahr;
		int ergebnis = 0;
		
		while(kreditsumme > 0) {
		zinsProJahr= schuldzins / 100.0 * kreditsumme;
		kreditsumme += zinsProJahr - tilgungsrate;
		ergebnis++;
	}
	 return ergebnis;
	}
	
	
	public static void main(String[] args) {
		
		System.out.println(tilgung(10000, 5 , 1000));
		
	}
}