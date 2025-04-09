
public class Passwort {
		private String passwort;

		
		

	public static boolean alsPWgeeignet(String pass) {
		 boolean isGross = false;
		 boolean isKlein = false;
		 boolean hatZiffern= false ;
		 int grosscount = 0;
		 int kleincount = 0;
		
		char[] arr = pass.toCharArray();
		
		if(arr.length < 8) {
			return false;
		}
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] >= 'a' && arr[i] <= 'z') {
				kleincount++;
				if(kleincount == 2) {
					isKlein = true;
					}	
				}
			if(arr[i] >= 'A' && arr[i] <= 'Z') {
				grosscount++;
				if(grosscount == 2) {
					isGross = true;
				}
			}
			if(arr[i] >= '0' && arr[i] <= '9') {
				hatZiffern = true;
			}
		}
		
		return isKlein && isGross && hatZiffern;
		
		
	}
	
	public Passwort(String passwort) {
		if(alsPWgeeignet(passwort)) {
		this.passwort=passwort;
		}else {
			this.passwort=null;
		}
		
	}
	@Override
	public String toString() {
        return (passwort != null) ? "*".repeat(passwort.length()) : "Kein gueltiges Passwort!";

	}
	
	public boolean pwAendern(String neuesPasswort) {
		if(passwort == null || !alsPWgeeignet(neuesPasswort)) {
			return false;
		}
		
		if(neuesPasswort.charAt(0) == passwort.charAt(0) || neuesPasswort.charAt(neuesPasswort.length() -1) == passwort.charAt(passwort.length() -1)) {
			return false;
		}
		
		passwort = neuesPasswort;
		return true;
	
	}
	
	public static void main(String[] args ) {
		Passwort pass = new Passwort("AaBb12xy");
		System.out.println(pass);
		
        Passwort pwFalsch = new Passwort("12345"); // Geçersiz şifre
        System.out.println(pwFalsch); // Kein gueltiges Passwort!
        
        System.out.println("Ändere Passwort: " + pass.pwAendern("XxYy34zw")); // true
        System.out.println(pass); // ********
	}
}
