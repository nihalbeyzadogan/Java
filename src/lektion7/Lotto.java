package lektion7;

import java.util.Random;

public class Lotto {
	public static void main(String[] args) {
        Random random = new Random();
        int[] numbers = new int[6];
        int count = 0;

        while(count < 6) {
        	int number = random.nextInt(49) + 1;
        	boolean exits = false;
        	
        	for(int i= 0; i < count; i++) {
        		if(numbers[i] == number) {
        			exits = true;
        			break;
        		}
        	}
        	
        	if (!exits) {
        		numbers[count] = number;
        		count++;
        	}
        	
        }
        
        for(int i = 0; i < numbers.length;i++) {
        	for(int j = i+1; j < numbers.length; j++) {
        		if(numbers[i] > numbers[j]) {
        			int temp = numbers[i];
        			numbers[i] = numbers[j];
        			numbers[j] = temp;
        			
        	
        		}
        	}
        }
        System.out.println("Lotto: ");
        for (int num : numbers) {
        	System.out.print(num + " ");
        }
	}
}