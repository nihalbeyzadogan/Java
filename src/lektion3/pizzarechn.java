package lektion3;


import java.util.Scanner;

public class pizzarechn {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		//ilk pizza için
		
		System.out.println("1. pizza boyutu:");
		
		int d1 = input.nextInt();
		System.out.println("1. pizza fiyatı:");
		
		int f1 = input.nextInt();
		
		//ikinci pizza için
		System.out.println("2. pizzanın boyutu:");
		
		int d2 = input.nextInt();
		System.out.println("2. pizzanın fiyatı:");
		
		int f2 = input.nextInt();
		
		
		double p1 = Math.PI * d1 * 0.25  * d1 ;
		double p2 = Math.PI * d2 * d2 * 0.25 ;
		
		double k1 = p1 / f1;
		double k2 = p2 / f2;
		
		if (k1 == k2) {
			System.out.println("iki pizza da mantıklı");
		}else if (k1 > k2) {
			System.out.println("1. pizza daha mantıklı");
		}else {
			System.out.println("2. pizza daha mantıklı");	
		}
		

	}

}
