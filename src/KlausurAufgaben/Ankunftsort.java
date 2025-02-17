package KlausurAufgaben;

public class Ankunftsort {
	private String name;
	private int km;
	private Ankunftsort next;
	
	public Ankunftsort(String name, int km,Ankunftsort next) {
		this.km=km;
		this.name=name;
		this.next=next;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name=name;
	}
	
	public int getKm() {
		return km;
	}
	
	public void setKm(int km) {
		this.km=km;
	}
	
	public Ankunftsort getNext() {
		return next;
	}
	
	public void setNext(Ankunftsort next) {
		this.next=next;
	}
	
	public String toString() {
		return "Ort: " + name + "Entfernung: " + km + " km";
	}
	
	
}
