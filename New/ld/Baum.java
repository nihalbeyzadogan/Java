package SonGün;

public class Baum {
	private Knoten1 wurzel;
	
	public Baum(Mannschaft mannschaft) {
		this.wurzel= new Knoten1(mannschaft);
	}
	
	 public Mannschaft maxTore() {
	        if (wurzel == null) {
	            return null; // Eğer ağaç boşsa null döndür
	        }

	        return maxToreRekursiv(wurzel, wurzel.mannschaft);
	    }

	    private Mannschaft maxToreRekursiv(Knoten1 knoten, Mannschaft maxTeam) {
	        if (knoten == null) {
	            return maxTeam;
	        }

	        if (knoten.mannschaft.getTore() > maxTeam.getTore()) {
	            maxTeam = knoten.mannschaft;
	        }

	        Mannschaft maxLinks = maxToreRekursiv(knoten.left, maxTeam);
	        Mannschaft maxRechts = maxToreRekursiv(knoten.right, maxTeam);

	        return (maxLinks.getTore() > maxRechts.getTore()) ? maxLinks : maxRechts;
	    }

	    public void printInOrder() {
	        inOrderTraversal(wurzel);
	    }

	    private void inOrderTraversal(Knoten1 knoten) {
	        if (knoten != null) {
	            inOrderTraversal(knoten.left);
	            System.out.println(knoten.mannschaft);
	            inOrderTraversal(knoten.right);
	        }
	    }
	    
	    public static void main(String[] args) {
	        Mannschaft m1 = new Mannschaft("Deutschland");
	        Mannschaft m2 = new Mannschaft("Frankreich");
	        Mannschaft m3 = new Mannschaft("Spanien");
	        Mannschaft m4 = new Mannschaft("England");

	        m1.setTore(10);
	        m2.setTore(12);
	        m3.setTore(9);
	        m4.setTore(15); // En çok gol atan takım

	        Baum baum = new Baum(m1);
	        baum.printInOrder();
	        baum.printInOrder();
	        baum.printInOrder();
	        baum.printInOrder();

	        System.out.println("\nTeam mit den meisten Toren: " + baum.maxTore());
	    }
}
