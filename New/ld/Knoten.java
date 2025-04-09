package SonGün;

public class Knoten {
	private String name;
	private Knoten vorganger;

	public Knoten(String name) {
		this.name=name;
		this.vorganger=null;

	}
	
	public String getName() {
		return name;
	}
	
	public Knoten getVorganger() {
		return vorganger;
	}
	
	public void setVorganger(Knoten vorganger) {
		this.vorganger=vorganger;
	}

	}

