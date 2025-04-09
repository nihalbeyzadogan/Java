
public class Mannschaft {
    private final String name; // Değiştirilemez takım adı
    private int tore; // Atılan goller
    private int gegentore; // Yenen goller
    
    public Mannschaft(String name) {
    	this.name=name;
    	this.tore=0;
    	this.gegentore=0;
    }
    
    public String getName() {
    	return name;
    }
    public int getTore() {
    	return tore;
    }
    
    public int getGegentore() {
    	return gegentore;
    }
    public void setTore(int tore) {
    	this.tore=tore;
    }
    
    public void setGegentore(int gegentore) {
    	this.gegentore=gegentore;
    }
    
    @Override
    public String toString() {
    	return name + " - Tore: " + tore + "- Gegentore: " + gegentore;
    }
}
