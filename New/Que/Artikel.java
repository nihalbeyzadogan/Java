
public class Artikel {
	private int artikelnummer;
	private String artikelname;
	
	public Artikel(int artikelnummer, String name) {
		this.artikelname=artikelname;
		this.artikelnummer= artikelnummer;
		
	}
	
	public int getArtikelNummer() {
		return artikelnummer;
	}
	
	public String getArtikelName() {
		return artikelname;
	}
	
	public void setArtikelNummer(int artikelnummer) {
		this.artikelnummer=artikelnummer;
	}
	
	public void setArtikelName(String name) {
		this.artikelname= artikelname;
	}
}
