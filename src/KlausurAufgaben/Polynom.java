package KlausurAufgaben;
//ax^4 + bx^3 + cx^2 + dx + e
public class Polynom {
	private double a;
	private double b;
	private double c;
	private double d;
	private double e;
		
	public Polynom(double a, double b, double c, double d, double e) {
		this.a=a;
		this.b=b;
		this.c=c;
		this.d=d;
		this.e=e;
		
	}
	
	public String toString() {
		return a + "x^4 +" + b + "x^3 +" + c + "x^2 +" + d +"x +" + e;
	}
	
	public Polynom ableiten() {
		return new Polynom (0,a * 4, b * 3,c * 2, d);
	}
	public static void main(String[] args) {
		Polynom p = new Polynom(5,3,8,7,5);
		Polynom p2 = new Polynom(0,5,1,9,56);
		
		
		System.out.println(p.ableiten());
		System.out.println(p.toString()); 
		
		
		
		
	}
}
