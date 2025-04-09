package SonGün;

public class Zylinder {
	public static double berechne( double ml) {
		final double PI = 3.141592653589793;
		
		double r  = Math.pow(ml / PI, 1.0/3.0) ;
		
		return r;
	}
	
	public static void main(String[] args) {
		System.out.println(berechne(0.5));
	}
	
}
