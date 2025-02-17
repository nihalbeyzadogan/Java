package KlausurAufgaben;

public class Facher {
	private int türnummer;
	private boolean offen;
	
	public Facher(int türnummer) {
		this.türnummer=türnummer;
		this.offen=false;
	}
	
	public int getTür() {
		return türnummer;
		
	}
	
	public  void setTür(int türnummer) {
		this.türnummer=türnummer;
	}
	
	public void setOffen(boolean offen) {
		this.offen = offen;
	}
	
	public boolean isOffen() {
		return offen;
	}
	
	public String toString() {
		if(offen) {
			return "o";
		}else {
			return "z";
		}
	}
	
}
