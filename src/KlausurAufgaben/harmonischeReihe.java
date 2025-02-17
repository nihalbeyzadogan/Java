package KlausurAufgaben;

public class harmonischeReihe {

	public static void main(String[] args) {
	
		for(int k = 1; k <= 2000; k++) {
			double zaehler = Math.pow(-1, k + 1);
			System.out.println(zaehler / k);
		}
	
	}

}
