package KlausurAufgaben;

public class bruttoPreis {
	
	
	public static double berechneNetto(double brutto, double mwst) {

		return brutto / (1 + mwst);
	}
	
	public static void main(String[] args) {
		System.out.println(berechneNetto(5.35, 0.07));
	}
}
