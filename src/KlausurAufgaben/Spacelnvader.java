package KlausurAufgaben;

import java.util.Scanner;

public class Spacelnvader {
	private char[][] feld;
	private int random;
		
		public Spacelnvader() {
			feld = new char[5][8];
			
			for(int i = 0; i < 8; i++) {
				feld[0][i] = 'o';
			}
			
			for(int j = 0; j < 3; j++) {
				for(int i = 0; i < 8; i++) {
					feld[j+1][i] = ' ';
				}
			}
			
			this.random = (int)(Math.random() * 8);
			
			feld[4][this.random] = 'U';
			
		}
		
		public void move(char c) {
			
			if(c == 'J') {
				feld[4][this.random] = ' ';
				random--;
				random = (random + 8) % 8;
				feld[4][this.random] = 'U';

			}
			if(c == 'L') {
				feld[4][this.random] = ' ';
				random++;
				random = (random + 8) % 8;
				feld[4][this.random] = 'U';

			}
		}
		public String toString(){
			String result = "";

			for(int i = 0; i < feld.length; i++){
				for(int j = 0; j < feld[0].length; j++){
					result += feld[i][j];
				}
				result += "\n";
			}

			return result;
		}
	
		public static void main(String[] args){
			Spacelnvader si = new Spacelnvader();
			Scanner scan = new Scanner(System.in);

			while(true){
				char eingegeben = scan.next().charAt(0);

				si.move(eingegeben);

				System.out.println(si);

				if(eingegeben == 'y'){
					break;
				}
			}

			System.out.println("Ende");
		}
	}


