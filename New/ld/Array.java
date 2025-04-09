package SonGün;

public class Array {
	public static int[] flatten(int[][] arr) {
		int total = 0;
		for(int i = 0; i < arr.length; i++) {
			total += arr[i].length;
		}
		
		int[] neuarr = new int[total];
		
		int n = 0;
		for(int i = 0; i < arr.length ; i++) {
			for(int j= 0; j < arr[i].length; j++) {
				neuarr[n] = arr[i][j];
				n++;
			}
		}
		return neuarr;
	}
	
	public static void printArray(int[] array) {
		for(int i = 0; i < array.length; i++ ) {
			System.out.print(array[i] +" ");
		}
	}
 	
	public static void main(String[] args) {
		int[][] nam = {{1 , 2 , 3, 4 ,5},{6},{7 , 8},{9,10,11,12}};
		printArray(flatten(nam));
	}

}
