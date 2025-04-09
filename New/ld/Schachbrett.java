package SonGün;

import java.util.Scanner;

public class Schachbrett {
	char[][] arr ;
	int zeile ;
	int sutun ;
	
	
	public Schachbrett()
	{
		this.zeile= 0;
		this.sutun=0;
		
		this.arr = new char[8][8];
		
		for(int i = 0; i < 8; i++) {
			for(int j = 0; j < 8; j++) {
				this.arr[i][j] = '_';
			}
		}
	}
	public void fuegeHinzu(char a ) {
		if(istVoll()) {
			System.out.println("ist voll");
			return;
		}

        arr[zeile][sutun] = a;
        sutun++;

        // Eğer satır dolduysa, yeni satıra geç
        if (sutun == 8) {
            sutun = 0;
            zeile++;
        }
	}
	
	public boolean istVoll() {
		if(zeile == 8) {
			System.out.println("ist voll");
			return true;
		}else {
			return false;
		}
	}
	
	public String toString() {
		String temp = "";
	
		for(int i = 0; i < 8; i++) {
			for(int j = 0; i < 8; j++) {
				temp += arr[i][j];
			}
		}
		return temp;
	}
	
	public static void zweiteberechnet(String c) {
		char zweite = c.charAt(0);
		if(zweite == 'A' || zweite == 'a') {
			System.out.println(0);
		}
		if(zweite == 'B'  ) {
			System.out.println(1);
		}
		if(zweite == 'C') {
			System.out.println(2);
		}
		if(zweite == 'D') {
			System.out.println(3);
		}
		if(zweite == 'E') {
			System.out.println(4);
		}
		if(zweite == 'F') {
			System.out.println(5);
		}
		if(zweite == 'G') {
			System.out.println(6);
		}
		if(zweite == 'H') {
			System.out.println(7);
		}
			
	}
	
	public static void ersteberechnet(String c) {
		int erste = (int ) (c.charAt(1));
		
		int a=  8 - erste;
		
		System.out.println(a);
	}
	
	public static void main(String[] args) {
		Schachbrett a = new Schachbrett();
		Scanner scanner = new Scanner(System.in);
//		while(!a.istVoll()) {
//			System.out.println("gir");
//			char b= scanner.next().charAt(0);
//			a.fuegeHinzu(b);
//			
//		}
//		System.out.println(a.toString());
		
		ersteberechnet("D7");
	}
}
