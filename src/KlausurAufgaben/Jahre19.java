package KlausurAufgaben;



public class Jahre19 {
	private int alt;
	
	public Jahre19( int alt) {
		this.alt= alt;
	}
	
	public int getAlt() {
		return alt;
	}
	
	public void setAlt(int alt) {
		this.alt=alt;
	}
	
	public String toString() {
		return "Student mit " + alt + " Jahren";
	}
	
	public static Jahre19[] mind19(Jahre19[] arr){
	    int anzahl = 0;
	    for (int i = 0; i < arr.length; i++) {
	        if (arr[i].getAlt() >= 19) {
	            anzahl++;
	        }
	    }

	    Jahre19[] ergebnis = new Jahre19[anzahl];

	    for (int i = 0, j = 0; i < arr.length; i++) {
	        if (arr[i].getAlt() >= 19) {
	            ergebnis[j++] = arr[i];
	        }
	    }

	    return ergebnis;
	}
	
	public static void main(String[] args) {
		Jahre19[] arr= new Jahre19[10];
		
		System.out.println("----------------------");
		for(int i= 0; i < arr.length; i++) {
			int alt = (int) (Math.random() * 14) + 16;
			arr[i] = new Jahre19(alt);
			System.out.println(arr[i]);
		}
		System.out.println("------------------------");
		
		Jahre19[] result = mind19(arr);
		for(int i = 0; i < result.length; i++) {
			System.out.println(result[i]);
		}
	}
}
