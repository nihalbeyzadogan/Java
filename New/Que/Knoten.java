
public class Knoten {
    Mannschaft mannschaft;
    Knoten left;
    Knoten right; // Sol ve sağ çocuk düğümler

    // Constructor: Yeni düğüm oluştur
    public Knoten(Mannschaft mannschaft) {
        this.mannschaft = mannschaft;
        this.left = null;
        this.right = null;
    }
	
}
