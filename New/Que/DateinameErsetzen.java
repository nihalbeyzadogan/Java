
public class DateinameErsetzen {

	public static String ersetze(String text) {
		char[] c = text.toCharArray();
		
		for(int i = 0; i< text.length() - 4 ; i++) {
			if(c[i] == '.') {
				c[i] = '_';
			}
			
			
		}
		return new String(c);
	}
	
	public static void main(String[] args) {
		String text= "akskd.asdasd.asdas.asd";
		System.out.println(ersetze(text));
	}
}
