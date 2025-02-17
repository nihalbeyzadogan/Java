package KlausurAufgaben;

import java.util.Scanner;

public class Kenntwort {
    private String dasKenntwort;

    public Kenntwort(String dasKenntwort) {
        if (isGeeignet(dasKenntwort)) {
            this.dasKenntwort = dasKenntwort;
        } else {
            this.dasKenntwort = null;
        }
    }

    public boolean isGeeignet(String eingabe) {
        if (eingabe == null || eingabe.length() < 9) {
            return false;
        }

        boolean hasUpper = false;
        boolean hasLower = false;
        boolean hasDigit = false;

        for (char ch : eingabe.toCharArray()) {
            if (Character.isUpperCase(ch)) { 
                hasUpper = true;
            } else if (Character.isLowerCase(ch)) {
                hasLower = true;
            } else if (Character.isDigit(ch)) {
                hasDigit = true;
            }
        }
        //for(int i = 0; i< eingabe.length(); i++){
//        	char c = eingabe.charAt(i);
//        	if(c >= 'A' && c<= 'Z') {
//        		hasUpper = true;
//        	}
//        	if(c >= 'a' && c<= 'z') {
//        		hasUpper = true;
//        	}
//        	if(c >= '0' && c<= '9') {
//        		hasUpper = true;
//        	}
        	

        return hasUpper && hasLower && hasDigit;
    }

    @Override
    public String toString() {
        if (dasKenntwort == null) {
            return "Kein gültiges Kenntwort";
        }
        return "*".repeat(dasKenntwort.length());
    }

    public boolean pwAandern(String neu) {
        if (neu == null || !isGeeignet(neu)) {
            return false;
        }

        if (dasKenntwort == null || 
            (neu.charAt(0) != dasKenntwort.charAt(0) && 
             neu.charAt(neu.length() - 1) != dasKenntwort.charAt(dasKenntwort.length() - 1))) {
            dasKenntwort = neu;
            return true;
        }

        return false;
    }

    public static void main(String[] args) {
        Kenntwort k = new Kenntwort("HalloJo123");
        System.out.println(k); 

        
        System.out.println(k.pwAandern("DalloJo124"));  
        System.out.println(k);  

        System.out.println(k.pwAandern("HalloJo125"));  
        System.out.println(k);  

       
        /*
        Scanner scanner = new Scanner(System.in);
        System.out.print("Geben Sie Ihr Kenntwort ein: ");
        String userInput = scanner.nextLine();
        Kenntwort userPw = new Kenntwort(userInput);
        System.out.println(userPw);
        */
    }
}
