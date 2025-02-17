package KlausurAufgaben;

public class BercehneProzent {
	private int zahl;
	private int prozent;
	
	
	public static double berechneprozent(int zahl, int prozent) {
		if(zahl > 0 && prozent > 0) {
		return (zahl * prozent)/ 100.0;
		}else {
			return -1;
		}
		
		}
	
	public static void main(String[] args) {
		System.out.println(berechneprozent(1090,1));
		
	}
}
