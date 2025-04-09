
public class NatLog {
	
	public static double log(double x) {
		if(x < 0 || x > 2) {
			throw new RuntimeException("Input out of range: 0 < x < 2 required");
		}
		
		double sum = 0.0;
		double term;
		double tol = 1e-16;
		double base = x -1;
		int n = 1;
		
		do {
			term = (power(-1 , n +1) * power(base, n)) / n;
			sum += term;
			n++;
		}while(absolute(term) > tol);
		return sum;
	}
	
	public static int power(int base, int exp) {
		int res= 1;
		for(int i = 0; i < exp; i++) {
			res *= base;
		}
		return res;
	}
	
	public static double power(double base, int exp) {
		int res= 1;
		for(int i = 0; i < exp;i++) {
			res *= base;
		}
		return res;
		
	}
	
	public static double absolute(double value) {
		if(value < 0) {
			return -value;
		}else {
			return value;
		}
	}
	
	public static void main(String[] args) {
		try {
		 	System.out.println("ln(1.5) = " + log(1.5));
            System.out.println("ln(0.5) = " + log(0.5));
            System.out.println("ln(2.5) = " + log(2.5)); 
	}catch(RuntimeException e) {
		System.out.println(e.getMessage());
	}
	}

}
