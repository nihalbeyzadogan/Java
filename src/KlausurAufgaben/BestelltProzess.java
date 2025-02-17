package KlausurAufgaben;

public class BestelltProzess {
	private int bestellnummer;
	private Artikel[] artikel;
	private int indexNeuerArtikel;
	
	public BestelltProzess(int bestellnummer) {
		this.bestellnummer=bestellnummer;
		this.artikel= new Artikel[50];
		indexNeuerArtikel = 0;
	}
	
	public void setArtikel(Artikel[] artikel) {
		if(artikel.length <= 50) {
		this.artikel=artikel;
		}else {
		System.out.println("Das übergebene Array enthalt zu viele Artikel!");
		}
	}
	public Artikel[] getArtikel() {
		return artikel;
	}
	
	public void einfuegen(Artikel a) {
		if(indexNeuerArtikel< 50) {
			artikel[indexNeuerArtikel] = a;
			indexNeuerArtikel++;
		}else {
			System.out.println("Es sind bereits 50 Artikel enthalten.");
		}
	}
	
	public void loeschen (int artikelnummer) {
		
	}
	
	public static void main(String[] args) {
		
	}
}


//Vorteile Arrays:
//Leichtes Anlegen von mehreren ELementen
//Leichtes Speichern und Auslesen von Werten

//Nachteile Arrays:
//Umstandliches erweitern um zusatzliche Elemente
//Umstandliches herauslöschen  und einfügen zwischen Elemente

//Vorteile Listen:
//Leichtes erweitern des Array um zusatzliche Elemente
//Leichtes herauslöschen  und einfügen zwischen Elemente

//Nachteile Listen:
//Umstandliches Anlegen von mehreren ELementen
//Umstandliches Speichern und Auslesen von Werten
		