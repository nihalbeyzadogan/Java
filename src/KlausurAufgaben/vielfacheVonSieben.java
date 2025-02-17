package KlausurAufgaben;

public class vielfacheVonSieben {
	
	public static int vonSieben(int[] arr) {
		int anzahl = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 7 == 0 && arr[i] != 0) {
				anzahl++;
			}
		}
		return anzahl;
	}
	public static void main(String[] args) {
		int[] zahlen = {7 , 14 , 23 , 5 , 6 , 9 , 81 , 49 , 3 , -7, -49 , 0};
		System.out.println(vonSieben(zahlen));
	}

}
