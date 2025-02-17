package lektion2;

public class u2 {

	public static void main(String[] args) {
		float p = 1f;
		float q = 1f;
		float wurzel = (p / 2f) * (p / 2f) - q;
		
		if (wurzel < 0) {
			System.out.println("Keine Lösung!");
		} else {
			double x1 = - ( p / 2f ) + Math.sqrt(wurzel);
			double x2 = - ( p / 2f ) - Math.sqrt(wurzel);
			System.out.println("x1 :" + x1);
			System.out.println("x2 :" + x2);
		}

	}

}
