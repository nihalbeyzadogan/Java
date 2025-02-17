package lektion7;

import java.util.Scanner;

public class bspiel {

	public static String spiel(String str) {
		char[] chars = str.toCharArray();
		String result = "";
		for (char ch : chars) {
			result += ch;
			if ("aeiouAEIOU".indexOf(ch) != -1 ) {
				result += "b" + ch;
			}
		}
		return result;
		
	}
	public static void main(String[] args) {
		String input = "spiel mit mir";
		String output= spiel(input);
		System.out.println(output);
	}

}
