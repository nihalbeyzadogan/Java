package SonGün;

public class NatLog {
	public static double berechneNat(double x) {
		if(x <= 0 || x >= 2) {
			throw new RuntimeException("x muss grosser 0 kleine 2 sein");
		}
		
		double e= 1e-16; 
		int n = 1;
		double m = x - 1;
		double sum = 0.0;
		double term;
		
		
		do {
			
			term = (power(-1, n+1) / n) * power(m,n);
			sum += term;
			n++;
		}while(absolute(term) > e);
		
		return sum;
	}
	

	public static double power(double base, double üs) {
        if (üs < 0) {
            throw new IllegalArgumentException("Exponent kann nicht negativ sein!");
        }

        double ergebnis = 1.0;
        for (int i = 0; i < üs; i++) {
            ergebnis *= base;
        }
        return ergebnis;
	}
	
	public static double absolute(double value) {
		if(value < 0) {
			return -value;
		}else {
			return value;
		}
	}
    public static void main(String[] args) {
        System.out.println("ln(1.5) = " + berechneNat(1.5)); // Doğru sonuç: ~0.4055
        System.out.println("ln(0.8) = " + berechneNat(0.8)); // Doğru sonuç: ~-0.2231
    }
	
}
