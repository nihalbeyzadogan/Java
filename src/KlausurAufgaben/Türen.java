package KlausurAufgaben;

public class Türen {
	public static void main(String[] args) {
		Facher[] türen = new Facher[80];
		
		for (int i= 0; i < türen.length ; i++) {
			türen[i] = new Facher(i + 1);
		}
		for(int wiederholung = 0; wiederholung < 80; wiederholung++) {
			for(int i = 1; i < 81; i++) {
			if(i % (wiederholung + 1) == 0) {
			türen[i - 1].setOffen(!türen[i - 1].isOffen());
				}
			System.out.print(türen[i - 1].toString());
			}
			System.out.println();
		}
		int anzahl = 0;
		for(int i= 0; i <türen.length; i++) {
			if(türen[i].isOffen()) {
				anzahl++;
			}
		}
		System.out.println("Es sind jetzt " + anzahl+ " Türen geöffnet");
	}
}
