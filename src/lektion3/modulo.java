package lektion3;

import java.util.Scanner;

public class modulo {

	public static void main(String[] args) {
			System.out.println("bir sayı giriniz:");
			Scanner input = new Scanner(System.in);
			int a = input.nextInt();
			if (a % 7 == 0) {
				System.out.println("7 ye bölünebilir");
			}else {
				System.out.println("7 ye bölünemez");
			}
		}
	}


