package KlausurAufgaben;


public class A3Zielort {
	private String name;
	private int distance;
	private A3Zielort next;
	
	public A3Zielort(String name, int distance) {
		this.name=name;
		this.distance = distance;
		this.next=null;
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getDistance() {
		return distance;
	}
	
	public A3Zielort getNext() {
		return next;
	}
	
	public void setNext(A3Zielort next) {
		this.next=next;
	}


	public String toString() {
        return "Ortsname: " + name + " Distanz: " + distance + " km";
	}
	
	
}