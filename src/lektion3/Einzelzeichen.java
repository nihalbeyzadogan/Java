package lektion3;
import java.util.Scanner;
public class Einzelzeichen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("karakteri giriniz:");
		char a = scanner.nextLine().charAt(0);
		
		if (a >= 'A' && a <= 'Z') {
			System.out.println("Grossbuchstabe");
		}
		if ((a >= '0' && a <= '9') || (a >= 'a' && a <= 'f') || (a >= 'A' && a <= 'F')) {
			System.out.println("Hexadezimale Ziffer");
		}
		if (a == '0' || a == '1') {
			System.out.println("binare Ziffer");
		}
		if (a >= '0' && a <= '7') {
			System.out.println("oktale Ziffer");
		} if (!((a >= 'A' && a <= 'Z') || (a >= 'a' && a <= 'f') || ((a >= '0' && a <= '9')))) {
			System.out.println("Unbekannt");
		}
		
	}

}
