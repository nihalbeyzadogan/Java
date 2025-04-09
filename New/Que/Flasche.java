
public class Flasche {
	private String name;
	private String text;
	private int ml;
	private int fuellml;
	
	public Flasche(String name, String text, int ml) {
		this.name=name;
		this.text=text;
		if(ml >= 0) {
			this.ml=ml;
		}else {
			throw new RuntimeException("ml muss positiv sein");
		}
		this.fuellml=ml;
	}
	
    public int reduziereFuellstand(int menge) {
        if (fuellml == 0) {
            return 0; // Şişe boşsa sıvı alınamaz
        }
        int entnommen = Math.min(menge, fuellml); // Mevcut doluluğa göre al
        fuellml -= entnommen; // Doluluk seviyesini azalt
        return entnommen; // Gerçekten alınan miktarı döndür
    }
    
    public boolean isLeer() {
    	return fuellml == 0;
    }
    
    public static void main(String[] args) {
    	Flasche flasche = new Flasche("Name" , "text", 750);
    	
    	while(!flasche.isLeer()) {
    		int entnommen = flasche.reduziereFuellstand(150);
    		System.out.println(entnommen + " ml entnommen");
    	}
    }
}
