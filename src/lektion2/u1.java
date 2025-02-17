package lektion2;

public class u1 {

	public static void main(String[] args) {
		int radius = 5;
		double kreisflache = Math.PI * radius * radius;
		double kreisumfang = 2 * Math.PI * radius;
		double volume = (4.0 / 3.0) * Math.PI * radius * radius *radius;
		
		System.out.println("Die Fläche des Kreises beträgt:" + kreisflache);
		System.out.println("Der Umfang des Kreises beträgt:" + kreisumfang);
		System.out.println("Das Volumen der Kugel bträgt:" + volume);
		
		

	}

}
