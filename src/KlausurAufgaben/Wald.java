package KlausurAufgaben;

import java.util.Scanner;

public class Wald {
	 private int aeste;
	 private final String typ;
	 
	 public Wald(int aeste, String typ) {
		 this.aeste=aeste;
		 if(typ.equals("Eiche") || typ.equals("Buche")) {
			 this.typ=typ; 
		 }else {
			 this.typ="Anderer";
		 }
		
	 }
	
	 public int getAeste() {
		 return aeste;
	 }
	 
	 public String getTyp() {
		 return typ;
	 }
	 
	 public void setAeste(int aeste) {
		 this.aeste=aeste;
	 }
	 
	 public String toString() {
		 return typ + " mit "+ aeste +" Hauptasten";
	 }
	
	 public static void main(String[] args) {
		 Scanner scanner = new Scanner(System.in);
		 System.out.println("Wie viele Bäume möchten Sie eingeben?");
		 int n = scanner.nextInt();
		 Wald[] wald = new Wald[n];
		 
		
		 for(int i=1; i< wald.length;i++) {
			 
			 System.out.println("Gib Hauptastanzahl von Baum " + i + " ein:" );
			 int aeste = scanner.nextInt();
			 scanner = new Scanner(System.in);
			 System.out.println("Gib Typ von Baum " + i + " ein:" );
			 String typ = scanner.nextLine(); 
			 wald[i] = new Wald(aeste,typ);
		 }
		 
		 for (int i = 0; i< wald.length; i++) {
			 System.out.println(wald[i]);
		 }
	 }
	
}
