package SonGün;

public class Sitzplatzreservierung {
	private char[][] saal;
	public void erstelleSaal(int anzahlreihen){
		 saal = new char[anzahlreihen][];

		
		for(int i = 0; i < anzahlreihen; i++) {
			saal[i] = new char[3 + i];
		}
		
		
		
	}
	
	public void fuelleSitze() {
		for(int i= 0; i<saal.length; i++) {
			for(int j = 0; j<saal[i].length; j++) {
				saal[i][j]= (Math.random() < 0.5) ? 'x' : 'o';
			}
		}
	}
	
	public void bucheSitz(int reihe, int sitz) {
		if(saal[reihe][sitz] == 'x') {
			System.out.println("Platz nicht frei");
		}else {
			saal[reihe][sitz] = 'x';
		}
	}
	
	public void print() {
	    
	    for (int i = saal.length - 1; i >= 0; i--) { // Saal'ı yukarıdan aşağıya yazdırmak için ters döngü
	        for (int j = 0; j < saal[i].length; j++) {
	            System.out.print(saal[i][j]);  // Doğrudan karakteri yazdır
	           
	        }
	        System.out.println(); // Satır sonu
	    }
	    System.out.println(); // Boş satır ekleyerek okunabilirliği artır
	   
	}

	
	public static void main(String[] args) {
		Sitzplatzreservierung m = new Sitzplatzreservierung();
		
		m.erstelleSaal(5);
		m.fuelleSitze();
		m.print();
		m.bucheSitz(1, 2);
		m.print();
		
		
		
	}
}
