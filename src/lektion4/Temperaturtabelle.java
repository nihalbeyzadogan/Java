package lektion4;

public class Temperaturtabelle {

	public static void main(String[] args) {
		System.out.println("Fahrenheit\tCelsius");
		for (int f = 0; f <= 300; f++) {
			double c = 5.0 / 9 * ( f - 32);
			System.out.printf("%d\t\t%.2f%n", f, c);
		}
	}
}
