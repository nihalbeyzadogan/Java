package Wiederholung;

public class Passwort {
	private String zeichenkette;
	
	
	public Passwort(String zeichenkette) {
		if(alsPWgeeignet(zeichenkette)) {
			this.zeichenkette = zeichenkette;
		}else {
			this.zeichenkette = null;
		}
	}
	
	public static boolean alsPWgeeignet(String zeichenkette) {
		if (zeichenkette.length() < 8) {
	        return false;
	    }
		
		int count1 = 0;
		int count2 = 0;
		int count3 = 0;
		for(int i = 0; i < zeichenkette.length() ; i++) {
			char c = zeichenkette.charAt(i);
			if(c >= 'a' && c <= 'z') {
				count1++;
				}else if(c >= 'A' && c <= 'Z') {
				count2++;
				}else if(c >= '0' && c <= '9') {
				count3++;
				}
	
		}
		
		if (count1 >= 2 && count2 >= 2 && count3 >= 2) {
		    return true;
		} else {
		    return false;
		}

	}

	public String toString() {
	    if (zeichenkette == null || zeichenkette.isEmpty()) {
	        return "Kein gueltiges Passwort!";
	    }
	    return "*".repeat(zeichenkette.length());
	}

	
	public boolean pwAendern(String neuesPasswort) {
	    if (this.zeichenkette == null || !alsPWgeeignet(neuesPasswort)) { 
	        return false;  // Eğer geçerli şifre yoksa veya yeni şifre geçerli değilse
	    }
	    if (this.zeichenkette.charAt(0) == neuesPasswort.charAt(0) || this.zeichenkette.charAt(this.zeichenkette.length() - 1) == neuesPasswort.charAt(neuesPasswort.length() - 1)) {
	            return false;  // Eğer ilk veya son karakter aynıysa değiştirilemez
	        }
	    this.zeichenkette = neuesPasswort;  // Şifreyi güncelle
	    return true;
	}
	public static void main(String[] args) {
		Passwort pw1 = new Passwort("Abc12def");
		System.out.println(pw1.toString());  // ********

		Passwort pw2 = new Passwort("Ab1");
		System.out.println(pw2.toString());  // Kein gueltiges Passwort!

		System.out.println(pw1.pwAendern("Xbc34def"));  // true
		System.out.println(pw1.pwAendern("Abc12xyz"));  // false (ilk harf aynı)

	}





}


