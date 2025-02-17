package KlausurAufgaben;

import java.util.Scanner;

public class A2 {
	public static void main(String[] args) {
	int random = (int) (8 * Math.random());
	Scanner scanner = new Scanner(System.in);
	System.out.println("Spiel gestartet! Steuerung: 'a' (links), 'd' (rechts), 'x' (Beenden)");
		
		
	char[][] Spielfeld= new char[4][8];
	for(int i=0; i<8;i++) {
		for(int j=0; j<4; j++) {
			if(j==0) {
			Spielfeld[j][i]= 'o';
			}else{
				Spielfeld[j][i] = ' ';
			}
				
			}
		}
	
	
	while(true) {
		
		Spielfeld[3][random] = 'v'; 
	for (int i = 0; i < Spielfeld.length; i++) {
	    for (int j = 0; j < Spielfeld[i].length; j++) {
	        System.out.print(Spielfeld[i][j] == 0 ? ' ' : Spielfeld[i][j]);
	    }
	    System.out.println();
	}
	
	System.out.println("Ergebnisse:");
	char er = scanner.next().charAt(0);
	if(er == 'x') {
		System.out.println("beenden.");
		break;
	}
	
	
	if(er == 'd' && random < 7) {
		Spielfeld[3][random] = ' ';
		random++;
	}else if(er == 'a' && random > 0) {
		Spielfeld[3][random] = ' ';
		random--;
	}
	Spielfeld[3][random] = 'v';
		
	}
}
}
