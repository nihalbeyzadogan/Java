package KlausurAufgaben;

import java.util.Scanner;

public class A1 {
	
	public static String ersetze(String str) {
		char[] arr= str.toCharArray();
			for( int i = 0; i< arr.length -4; i++ ) {
				if(arr[i] == '.')  arr[i] = '_';
		}
		return new String(arr);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie Ihre text:");
		
		String str= scanner.nextLine();
	
		System.out.println(ersetze(str));
			
	}
	
}
