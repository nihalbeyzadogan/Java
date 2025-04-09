
public class Kunde {
	private String name;
    private Bestellung[] bestellungen;
    private int bestellCount; // Kaç sipariş var

    // Constructor
    public Kunde(String name) {
        this.name = name;
        this.bestellungen = new Bestellung[50]; // Maksimum 50 sipariş
        this.bestellCount = 0;
    }

    // Yeni sipariş ekleme metodu
    public boolean fuegeBestellungHinzu(Bestellung bestellung) {
        if (bestellCount < 50) {
            bestellungen[bestellCount] = bestellung;
            bestellCount++;
            return true;
        }
        return false;
    }

    // Belirli bir ürünü içeren ilk siparişi bulma
    public Bestellung findeBestellungMitArtikel(String artikelname) {
        for (int i = 0; i < bestellCount; i++) {
            Bestellung bestellung = bestellungen[i];
            Artikel[] artikelListe = bestellung.getArtikelListe();
            for (int j = 0; j < 50; j++) {
                if (artikelListe[j] != null && artikelListe[j].getArtikelName().equalsIgnoreCase(artikelname)) {
                    return bestellung;
                }
            }
        }
        return null;
    }
}
