package Wiederholung;

public class HarmonischeReihe {

	public static void main(String[] args) {
		
		for(int k = 1; k <= 1000; k++) {
			double zaehler = Math.pow(-1, k + 1);
			System.out.println(zaehler / k);
		
		}
	}
}
