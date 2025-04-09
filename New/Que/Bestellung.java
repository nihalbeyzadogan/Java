
public class Bestellung {
	private int bestellungnummer;
	private Artikel[] artikel;
	private int artikelCount;
	
	public Bestellung(int bestellungnummer) {
		this.bestellungnummer=bestellungnummer;
		this.artikel= new Artikel[50];
		this.artikelCount = 0;
	}
	
    public int getBestellnummer() { 
    	return bestellungnummer; 
    }
   
    public void setBestellnummer(int bestellungnummer) { 
    	this.bestellungnummer = bestellungnummer; 
    	}

    public Artikel[] getArtikelListe() { 
    	return artikel; 
    }
    
    public boolean einfuegen(Artikel neuartikel) {
        if (artikelCount < 50) {
            artikel[artikelCount] = neuartikel;
            artikelCount++;
            return true;
        }
        return false;
    }
    
    
    public void print() {
    	for(int i = 0; i< artikelCount; i++) {
    		System.out.println(artikel[i]);
    		}
    	}
    }

