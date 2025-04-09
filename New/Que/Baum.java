
public class Baum {
	 private Knoten wurzel;

	    public Baum(Mannschaft mannschaft) {
	        this.wurzel = new Knoten(mannschaft);
	    }

	    // Yeni takım ekleme metodu (Binary Search Tree mantığı ile)
	    public void einfuegen(Mannschaft mannschaft) {
	        wurzel = einfuegenRekursiv(wurzel, mannschaft);
	    }

	    private Knoten einfuegenRekursiv(Knoten knoten, Mannschaft mannschaft) {
	        if (knoten == null) {
	            return new Knoten(mannschaft);
	        }

	        if (mannschaft.getName().compareTo(knoten.mannschaft.getName()) < 0) {
	            knoten.left = einfuegenRekursiv(knoten.left, mannschaft);
	        } else if (mannschaft.getName().compareTo(knoten.mannschaft.getName()) > 0) {
	            knoten.right = einfuegenRekursiv(knoten.right, mannschaft);
	        }

	        return knoten;
	    }

	    // d) maxTore() - En çok gol atan takımı bulma
	    public Mannschaft maxTore() {
	        return maxToreRekursiv(wurzel, wurzel.mannschaft);
	    }

	    private Mannschaft maxToreRekursiv(Knoten knoten, Mannschaft maxMannschaft) {
	        if (knoten == null) {
	            return maxMannschaft;
	        }

	        if (knoten.mannschaft.getTore() > maxMannschaft.getTore()) {
	            maxMannschaft = knoten.mannschaft;
	        }

	        maxMannschaft = maxToreRekursiv(knoten.left, maxMannschaft);
	        return maxToreRekursiv(knoten.right, maxMannschaft);
	    }

	    // Ağaçtaki tüm takımları yazdırma (in-order traversal)
	    public void inorder(Knoten knoten) {
	        if (knoten != null) {
	            inorder(knoten.left);
	            System.out.println(knoten.mannschaft);
	            inorder(knoten.right);
	        }
	    }

	    public void printTree() {
	        inorder(wurzel);
	    }

	    public static void main(String[] args) {
	        // Takımları oluştur
	        Mannschaft team1 = new Mannschaft("Deutschland");
	        Mannschaft team2 = new Mannschaft("Spanien");
	        Mannschaft team3 = new Mannschaft("Frankreich");

	        // Goller atayan setter metotları
	        team1.setTore(8);
	        team2.setTore(100);
	        team3.setTore(7);

	        // Ağacı oluştur
	        Baum baum = new Baum(team1);

	        // Diğer takımları ağaca ekle (ÖNEMLİ DÜZELTME BURADA!)
	        baum.einfuegen(team2);
	        baum.einfuegen(team3);

	        // Ağacı yazdır
	        baum.printTree();

	        // En çok gol atan takımı bul
	        System.out.println("Team mit meisten Toren: " + baum.maxTore());
	    }
}

