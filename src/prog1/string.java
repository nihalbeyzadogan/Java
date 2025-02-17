package prog1;

public class string {
	public static void main (String[]args)
	{
	String s = "Hallo";
	System.out.println(s.length());// gibt 5 aus d.h. die Länge des Strings
	System.out.println(s.charAt(0));// gibt den ersten Buchstaben des Strings aus
	System.out.println(s.substring(1, 4));// gibt all aus. 1 und letzte Buchstabe fehlen
	System.out.println(s.toCharArray());//wandelt String in char um.
	s=s.replace("l", "?");// tauscht das l mit einem ?
	System.out.println(s);
	String t = "25";
	System.out.println(Integer.valueOf(t)+5);// wandelt String in Int Wert um
	String h = "Hallo Welt";
	String b = "hAlLo";
	System.out.println(b.equalsIgnoreCase(s));// Vergleicht Strings auf Gleichheit ABC egal, liefert true oder false
	System.out.println(b.toLowerCase());// gibt nur Kleinbuchstaben aus
	System.out.println(h.toUpperCase());// gibt nur Großbuchstaben aus
	}

}
