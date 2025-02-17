package lektion4;

import java.util.Scanner;

public class Freierfall {

	public static void main(String[] args) throws InterruptedException {

		Scanner scanner = new Scanner(System.in);
		
		
		final double G = 9.80665;
		System.out.println("Max Falldauer");
		int tMax = scanner.nextInt();
		
		for (int t=1 ; t<=tMax ;t++) {
			double s = 0.5 * G * t * t;
			System.out.printf("%ds: %.6fm%n", t, s);
			Thread.sleep(1000);
		}
		
		scanner.close();

}
}