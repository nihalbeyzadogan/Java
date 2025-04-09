package SonGün;

public class Mannschaft {
	private String name;
	private int tore;
	private int gegentore;
	
	public Mannschaft(String name) {
		this.name=name;
		this.tore= 0;
		this.gegentore= 0;
	}
	
	public void setTore(int tore) {
		this.tore=tore;
	}
	
	public void setGegentore(int gegentore) {
		this.gegentore=gegentore;
	}
	public String getNamen() {
		return name;
	}
	public int getGegentore() {
		return gegentore;
	}
	public int getTore() {
		return tore;
	}
	
	  @Override
	    public String toString() {
	        return "Mannschaft: " + name + ", Tore: " + tore + ", Gegentore: " + gegentore;
	    }
	
}
