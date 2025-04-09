
public class ZahleViel {
	public static int viel(int[] arr) {
		int count= 0;
		
		for(int i = 0; i< arr.length; i++) {
			if(arr[i] % 3 == 0) {
				count++;
			}
		}
		return count;
	}
	
	public static void main(String[] args) {
		int[] neu= { 1, 2 , 3 ,6 , 9 , 45 , 7 , 8 };
		
		System.out.println(viel(neu));
	}
}
