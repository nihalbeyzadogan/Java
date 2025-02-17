package KlausurAufgaben;

public class Route {
	private Ankunftsort start;
	
	
	public Route() {
		this.start=start;
	}
	
	public void hinzuefegen(Ankunftsort neu) {
		
		Ankunftsort current = start;
		if(start == null) {
			start = neu;
			return;
		}
		while(current.getNext()!= null) {
			current = current.getNext();
		}
		
		current.setNext(neu);
	}
	
	public int gesamtStrecke() {
		int result = 0;
		
		Ankunftsort current = start;
		while(current != null) {
			result += current.getKm();
			current = current.getNext();
		}
		
		return result;
	}
	
	public static void main(String[] args) {
		Route r = new Route();
		r.hinzuefegen(new Ankunftsort("Berlin", 0 ,null));
		r.hinzuefegen(new Ankunftsort("Potsdam", 35 ,null));
		r.hinzuefegen(new Ankunftsort("Magdeburg", 126,null));
		r.hinzuefegen(new Ankunftsort("Hannover", 149 ,null));
		
		System.out.println("Die Gesamtstrecke : " + r.gesamtStrecke()+ " km");
	}

}
