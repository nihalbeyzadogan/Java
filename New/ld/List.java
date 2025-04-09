package SonGün;

public class List {
	 private Knoten ende;
	
	 public List() {
	        this.ende = null; // Başlangıçta liste boş
	    }
	 
	    public void einfuegen(String name) {
	        Knoten neuerKnoten = new Knoten(name);

	        if (ende == null) {  
	            ende = neuerKnoten;  // İlk düğümü ekle
	        } else {  
	            neuerKnoten.setVorganger(ende);  // Önceki düğümü bağla
	            ende = neuerKnoten;  // Yeni düğümü sona ata
	        }
	    }


@Override
public String toString() {
    String sum = ""; // Sonuç stringini başlat

    Knoten temp = ende;

    while (temp != null) {  
        if (sum.equals("")) {
            sum = temp.getName(); // İlk elemanı direkt ekle
        } else {
            sum = temp.getName() + " " + sum; // Baştan ekleme yap
        }
        temp = temp.getVorganger(); // Bir önceki düğüme git
    }

    return sum; // Sonucu döndür
}

public static void main(String[] args) {
	List liste = new List();

    liste.einfuegen("Cool");
    liste.einfuegen("Zylla");
    liste.einfuegen("Aaronson");

    System.out.println(liste); // Beklenen çıktı: "Cool Zylla Aaronson"
}
}