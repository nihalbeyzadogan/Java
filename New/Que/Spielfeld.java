import java.util.Scanner;

public class Spielfeld {
	private char[][] arr;
	private int gemi;
	
	public Spielfeld() {
		arr = new char[5][8];
		gemi= (int) (Math.random() * 8);
		for(int i = 0; i < 8; i++) {
			arr[0][i] = 'o';
		}
		
		for(int i = 1; i < 5; i++) {
			for(int j = 0; j < 8; j++) {
			arr[i][j] = ' ';
			}
		}
		
		arr[4][gemi] = 'v';
		
		
	}
	
	public void bewege(char c) {
        if (c == 'a' && gemi > 0) {  // Sola hareket
            arr[4][gemi] = ' '; // Eski yeri temizle
            gemi--; // Konumu sola kaydır
            arr[4][gemi] = 'V'; // Yeni konuma yerleştir
        } else if (c == 'd' && gemi < 7) {  // Sağa hareket
            arr[4][gemi] = ' '; // Eski yeri temizle
            gemi++; // Konumu sağa kaydır
            arr[4][gemi] = 'V'; // Yeni konuma yerleştir
        }
	}
	
	public  String toString() {
		String sum = "";
		for( int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr[i].length; j++) {
				sum += arr[i][j];
			}
			sum += "\n";
		}
		return sum;
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Spielfeld spiel = new Spielfeld();
		
		
		System.out.println("Steuerung: a = links, d = rechts, x = beenden\n");
		System.out.println(spiel);
		
		while(true) {
			System.out.println("Bewgung: ");
			char c =  scanner.next().charAt(0);
			
			if(c == 'b') {
				break;
			}
			
			spiel.bewege(c);
			System.out.println(spiel);
			
		}
		scanner.close();
	}
}
