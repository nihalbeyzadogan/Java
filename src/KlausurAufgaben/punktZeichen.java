package KlausurAufgaben;

public class punktZeichen {
	public static String replace(String eingabe) {
		char[] arr= eingabe.toCharArray();
		for( int i = 0; i< arr.length -4; i++ ) {
			if(arr[i] == '.') { 
				arr[i] = '_';
			}
	}
	return new String(arr);
	
	}
	
	public static void main(String[] args) {
		System.out.println(replace("database.asdasd.asfsda.fbg"));
	}
}
