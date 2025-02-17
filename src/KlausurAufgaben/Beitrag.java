package KlausurAufgaben;

public class Beitrag {
	private String text;
	private String absender;
	private String empfaenger;
	private Beitrag next;
	
	public Beitrag(String text, String absender, String empfaenger, Beitrag next) {
		this.absender=absender;
		this.empfaenger=empfaenger;
		this.text=text;
		this.next=null;
	}
	
	
	
	public void setAbsender(String absender) {
		this.absender=absender;
	}
	
	public String getAbsender() {
		return absender;
	}
	public void setEmpfaenger(String empfaenger) {
		this.empfaenger=empfaenger;
	}
	
	public String getEmpfaenger() {
		return empfaenger;
	}
	public void setText(String text) {
		this.text=text;
	}
	
	public String getText() {
		return text;
	}
	public void setNext(Beitrag next) {
		this.next=next;
	}
	
	public Beitrag getNext() {
		return next;
	}
}
