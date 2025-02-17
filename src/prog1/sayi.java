package prog1;


public class sayi {

	public static void main(String[] args) {
		//Ödev 1
		String stringSayi = "150";
		int degisken = Integer.parseInt(stringSayi); //stringte yazan sayiyi integer olarak degistirmek
		int degisken1 = Integer.valueOf(stringSayi); //stringte yazan sayiyi integer olarak degistirmek
		
		System.out.println("int degiskeni: " + degisken);
		System.out.println("int degiskeni: " + degisken1);
		System.out.println("strring degiskeni: " + stringSayi);
		
		stringSayi = String.valueOf(degisken1); //yukarida kullanilanin tam tersi
		//Ödev 2
		int sayi1 = 5 / 3;
		float sayi2 = 5f / 3f;
		double sayi3 = 5d / 3d;
		System.out.println(sayi1);
		System.out.println(sayi2);
		System.out.println(sayi3);
		
		//Ödev3
		System.out.println(1.0 - 0.1 - 0.1 - 0.1 - 0.1 - 0.1);
		System.out.println(1.0 - 0.9 );
		
		//Ödev4
		int number1 = 1;
		int number2 = 2;
		double average = (number1 + number2) / 2;
		System.out.println(average);
	
		int number3 = 1;
		int number4 = 2;
		double a = (number3 + number4) / 2.0 ;
		System.out.println(a);
		
		
		
		
	}

}
