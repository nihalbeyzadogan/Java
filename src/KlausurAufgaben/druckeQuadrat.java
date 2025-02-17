package KlausurAufgaben;

public class druckeQuadrat {
	
	
    public static void druckeQuadrat(int zeilen) {
        // Überprüfung, ob die Anzahl der Zeilen mindestens 2 beträgt
        if (zeilen < 2) {
            System.out.println("Die Anzahl der Zeilen muss mindestens 2 sein.");
            return;
        }

        // Erste Zeile drucken
        for (int i = 0; i < zeilen; i++) {
            System.out.print("o");
        }
        System.out.println();

        // Mittlere Zeilen drucken
        for (int i = 0; i < zeilen - 2; i++) {
            System.out.print("o");  // Erste Spalte
            for (int j = 0; j < zeilen - 2; j++) {
                System.out.print(" ");  // Leerzeichen in der Mitte
            }
            System.out.println("o");  // Letzte Spalte
        }

        // Letzte Zeile drucken
        for (int i = 0; i < zeilen; i++) {
            System.out.print("o");
        }
        System.out.println();
    }
		
	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int zeilen = 5;
		druckeQuadrat(zeilen);
		System.out.println();
	}

}
