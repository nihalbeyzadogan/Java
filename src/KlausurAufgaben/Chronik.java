package KlausurAufgaben;

public class Chronik {
	private Beitrag juengste;
	
	public void fuegeBeitragEin(Beitrag neu) {
		neu.setNext(juengste);
		juengste = neu;
	}
	
	public void ausgeben() {
		
		Beitrag current = juengste;
		while(current != null) {
			System.out.println(current.getAbsender() + " -> " + current.getEmpfaenger());
			System.out.println(current.getText());
			System.out.println();
			current = current.getNext();
		}
		
	}
	
	
	public static void main(String[] args) {
		Chronik c = new Chronik();
		c.fuegeBeitragEin(new Beitrag("Viele Grüsse" , "Jonas" , "Michael", null));
		c.fuegeBeitragEin(new Beitrag("Jonas lustig" , "Michael" , "Hans", null));
		c.fuegeBeitragEin(new Beitrag("ıch habe gehört" , "Hans" , "Jonas", null));
		c.ausgeben();
	}

}
