package KlausurAufgaben;

public class A5 {
	public static char[] wandle(String cent ) {
		String  preis = cent.replace(",", "");
		
		char[] arr= preis.toCharArray();
		
		int index = 0;
		
		while(index < arr.length  && arr[index] == '0') {
			index++;
		}
		 
		char[] result = new char[arr.length - index];
		for(int i=0; i<result.length;i++) {
			result[i] = arr[index + i];
			
			
		}
		System.out.println(result);
		return result;
		
	}
	
	public static void main(String[] args) {
		
		   wandle("1,99"); 
		   wandle("0,99"); 
		   wandle("0,90"); 
		   wandle("0,09"); 
		   
		
		
	}
}
