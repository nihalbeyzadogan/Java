package KlausurAufgaben;

public class Produktpreise {
	public static int convertToCents(String eingabe) {
		char[] result =null;
		
		eingabe = eingabe.replace(",", "");
		result = eingabe.toCharArray();
		int zahl = 0;
		char[] temp = null;
		for(int i = 0; i < result.length; i++) {
			if(result[i] == '0') {
				continue;
			}else {
				zahl = Integer.valueOf(eingabe);
				zahl *= 10;
			}
			
		}
		return zahl / 10;
	}
	
	public static void main(String[] args) {
		System.out.println(convertToCents("3,409"));
		System.out.println(convertToCents("0,49"));
		System.out.println(convertToCents("0,40"));
		System.out.println(convertToCents("1,09"));
	}
	
}
