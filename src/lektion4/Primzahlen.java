package lektion4;

import java.util.Scanner;

public class Primzahlen {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bitte zu untersuchende Zahl eingeben:");
		int num = scanner.nextInt();
		boolean prime = true;
		 /*
        // Bei 2 starten, weil man sonst durch 0 teilt, und alle ganze Zahlen durch 1 teilbar sind
        for (int i = 2; i < num; i++) {
            if (num % i == 0) {
                prime = false;
                break;
            }
        }

        if (prime) {
            System.out.println(num + " ist eine Primzahl");
        } else {
            System.out.println(num + " ist keine Primzahl");
        }
        */
		 
		for (int newNum = 2; newNum <= num; newNum++) {
            // Bei 2 starten, weil man sonst durch 0 teilt, und alle ganze Zahlen durch 1 teilbar sind
            for (int i = 2; i < newNum; i++) {
                if (newNum % i == 0) {
                    prime = false;
                    break;
                }
            }
            if (prime) {
                System.out.println(newNum + " ist eine Primzahl");
            } else {
                System.out.println(newNum + " ist keine Primzahl");
            }
            prime = true;
        }
	}

}
