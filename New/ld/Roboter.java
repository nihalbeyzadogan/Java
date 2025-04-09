package SonGün;

public class Roboter {
	private String name;
	private int höhe;
	 Roboter next;
	
	public Roboter(String name, int höhe) {
		this.höhe=höhe;
		this.name=name;
		this.next= null;
		
		
	}
	
	public String getName() {
		return name;
	}
	
	public int getHöhe() {
		return höhe;
	}
	
	public Roboter getNext() {
		return next;
	}
	
	public void setNext(Roboter next) {
		this.next=next;
	}
	
	public String toString() {
		return "Hallo ich bin " + name + "ich bin " + höhe + " cm";
	}
}
