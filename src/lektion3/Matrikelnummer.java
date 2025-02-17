package lektion3;
import java.util.Scanner;
public class Matrikelnummer {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bitte ihre Matrikelnummer eingeben:");
		/*String nummer = scanner.nextLine();
		
		if (nummer.length() != 7) {
			System.out.println("Keine Matrikelnummer");
		}
		else if ((nummer.charAt(0) == '5' && nummer.charAt(1) == '0') || (nummer.charAt(0) == '5' && nummer.charAt(1) == '1') || (nummer.charAt(0) == '6' && nummer.charAt(1) == '1'))
		{
		System.out.println("Gültige Matrikelnummer");
		} else {
			System.out.println("Keine Matrikelnummer");
		}*/
		
		long nummer = scanner.nextLong();
		long am = nummer / 100000;
		if (am == 50 || am == 51 || am == 61 ) {
			System.out.println("Eine");
		}else {
			System.out.println("Keine");
		}
		scanner.close();
		
	}

}
