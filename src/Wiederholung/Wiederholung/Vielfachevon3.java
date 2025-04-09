package Wiederholung;

public class Vielfachevon3 {

	
	public static int is3(int[] arr) {
		int anzahl = 0;
		for(int i = 0; i < arr.length ; i++ ) {
			if(arr[i] % 3 == 0) {
				anzahl++;
			}
		}
		return anzahl;
	}
	public static void main(String[] args) {
		int[] array = {2 , 3, 6 ,5 ,-3, -1 ,0};
		System.out.println(is3(array));
		
		
	}

}
