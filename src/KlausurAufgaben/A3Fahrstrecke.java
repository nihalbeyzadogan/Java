package KlausurAufgaben;

public class A3Fahrstrecke {
	private A3Zielort start;
	
	public A3Fahrstrecke() {
		this.start = null;
	}
	
	public void einfuegen(A3Zielort neuerOrt) {
		if (start == null) {
			start = neuerOrt;
		}else {
			A3Zielort current = start;
			while(current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(neuerOrt);
		}
	}
	
	public int gesamtStrecke() {
		int sum = 0;
		A3Zielort current = start;
		while (current != null) {
			sum += current.getDistance();
			current = current.getNext();
		}
		return sum;
	}
	
	public static void main(String[] args) {
		A3Fahrstrecke strecke = new A3Fahrstrecke();
		
	    strecke.einfuegen(new A3Zielort("Würzburg", 0));
	    strecke.einfuegen(new A3Zielort("Kitzingen", 19));
	    strecke.einfuegen(new A3Zielort("Neustadt", 42));
	    strecke.einfuegen(new A3Zielort("Nürnberg", 49));
		
		int totalDistance = strecke.gesamtStrecke();
		
		A3Zielort current = strecke.start;
		while(current != null) {
			System.out.print(current + "-> ");
			current= current.getNext();
		}
		System.out.println(); 
		 System.out.println("Gesamte Strecke: " + totalDistance + " km");
	}	
	
}

