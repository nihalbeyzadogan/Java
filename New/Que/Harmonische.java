
public class Harmonische {
	public static double berechne(int n) {
		double sum = 0.0;
		
		for(int i = 1; i < n ; i++) {
			if(i % 2 == 0) {
				sum -= 1.0 / i;
			}else {
				sum += 1.0 / i;
			}
		}
		return sum;
	}
	public static void main(String[] args) {
		System.out.println(berechne(10000));
	}
	
}
