import java.util.Scanner;

public class Quadrat {
	
	public static  char[][] quadrat(int n) {
		char[][] arr = new char[n][n];
		
		for(int i = 0; i < n; i++) {
			arr[0][i]= 'O';
		}
		
		for(int i = 1; i < n; i++) {
			for (int j = 0; j< n; j++) {
				if(j == 0 || j == n-1) {
					arr[i][j] = 'O';	
				}else {
					arr[i][j] = ' ';
				}	
			}
		}
		
		for(int i = 0; i < n; i++) {
			arr[n-1][i] = 'O';
		}
		
		return arr;
	}
	public static void printQuadrat(char[][] arr) {
		for(int i= 0; i< arr.length;i++) {
			for(int j= 0; j < arr[i].length; j++) {
				System.out.print(arr[i][j]);
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Geben Sie ein Zahl: ");
		int n = scanner.nextInt();
		
		printQuadrat(quadrat(n));
		
	}
}
