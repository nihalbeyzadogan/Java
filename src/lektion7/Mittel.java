package lektion7;

import java.util.Scanner;

public class Mittel {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Kaç tane sayı giriceksiniz? ");
		int n= scanner.nextInt();
		int x = 1;
        double max = Double.MIN_VALUE; // İlk başta mümkün olan en küçük değer
        double min = Double.MAX_VALUE; // İlk başta mümkün olan en büyük değer
        double sum = 0;
		
		while(n >= x) {
			System.out.print( x + ". sayın: ");
			double num =  scanner.nextDouble();
			x++;
			sum += num;
			if(max < num) {
				max = num;
			}
			if (min > num) {
				min = num;
			}
			
		}
		System.out.println("küçük: " + min);
		System.out.println("büyük: " +  max);
		System.out.println("toplam: " + sum);
		System.out.println("ort: " + (sum / n));
		
		
	}

}
