package prog1;

public class Uygulama {

	public static void main(String[] args) {
		
		chatGbtExamples teklist = new chatGbtExamples();
		teklist.basaEkle(10);
		teklist.basaEkle(5);
		
		teklist.sonaEkle(20);
		teklist.yazdır();
		
		teklist.arayaEkle(1,25);
		System.out.println("\n");
		teklist.yazdır();
		System.out.println("\n");
		
		teklist.bastanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.bastanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.bastanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.bastanSilme();
		teklist.yazdır();
		
		//sondan silmeyi test etmek için:
		teklist.basaEkle(10);
		teklist.basaEkle(5);
		
		teklist.sonaEkle(20);
		
		teklist.yazdır();
		teklist.arayaEkle(1,25);
		System.out.println("\n");
		teklist.yazdır();
		System.out.println("\n");
		teklist.sondanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.sondanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.sondanSilme();
		teklist.yazdır();
		System.out.println("\n");
		teklist.sondanSilme();
		teklist.yazdır();
		
		//aradan silme:
		teklist.basaEkle(10);
		teklist.basaEkle(5);
		
		teklist.sonaEkle(20);
		
		teklist.yazdır();
		teklist.arayaEkle(1,25);
		System.out.println("\n");
		teklist.yazdır();
		System.out.println("\n");
		teklist.aradanSilme(2);
		teklist.aradanSilme(1);
		
		
		teklist.yazdır();
	}

}
//
//	public class Uygulama {
//		public static void main(String[] args) {
//			Baum baum = new Baum();
//			Knoten k;
//			k = new Knoten("Cool");
//			baum.einfuegen(k);
//			k = new Knoten("Zylla");
//			baum.einfuegen(k);
//			k = new Knoten("Aaronson");
//			baum.einfuegen(k);
//			k = new Knoten("Dogan");
//			baum.einfuegen(k);
//			
//			System.out.println("Ağaç Elemanları (In-Order Traversal):");
//	        baum.printTree();
//		}
//	}