package lektion7;

import java.util.Random;

public class eurostück {

		public static void main(String[] args) {
			
		int deneme = 10000;
		int ucuncuCekmece = 0;
		
		Random random = new Random();
		
			for ( int i = 0; i < deneme; i++) {
				boolean masa = random.nextBoolean();
				
				if(masa) {
					int cekmece = random.nextInt(3);
					
					if(cekmece == 2) {
						ucuncuCekmece++;
					}
				}
			}
			double olasilik = (double) ucuncuCekmece / deneme;
	        System.out.printf("Euro'nun üçüncü çekmecede bulunma olasılığı: %.2f%%\n", olasilik * 100);
		}
}
