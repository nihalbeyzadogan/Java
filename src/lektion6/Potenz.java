package lektion6;

import java.util.Scanner;

public class Potenz {

	public static int üsalma(int num, int n) {
		if(n == 0) {
			return 1;
		}else {
				return num * üsalma(num, (n - 1));
	}
		}
	public static void main(String[] args) {
		System.out.println("sayı: ");
		Scanner scanner = new Scanner(System.in);
		int num= scanner.nextInt();
		System.out.println("ün: ");
		int n= scanner.nextInt();
		
		System.out.println("Sonuç : " + üsalma(num, n));
		
	}

}
