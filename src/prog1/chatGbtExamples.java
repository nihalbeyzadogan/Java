package prog1;

import java.util.Scanner;

//	public class chatGbtExamples {}
//
//


//-------------------------------------------------------------------------
//public class Knoten {
//	String nachname;
//	Knoten left;
//	Knoten right;
//	
//	public Knoten(String nachname) {
//		this.nachname=nachname;
//	}
//	
//	public String getNachName() {
//		return nachname;
//	}
//}

//
//public class Baum {
//	Knoten root;
//	
//	public void einfuegen(Knoten neu) {
//	if(root == null) { 
//		root = neu;
//	} else { 
//		einfuegen(root, neu);
//		}
//	}
//	
//	private void einfuegen(Knoten temp, Knoten neu) {
//		if(neu.getNachName().compareTo(temp.getNachName()) < 0) {
//			if(temp.left == null) {
//				temp.left = neu;
//			} else {
//				einfuegen(temp.left, neu);
//			} 
//		}else {
//			if(temp.right == null) {
//				temp.right=neu;
//			}else {
//				einfuegen(temp.right, neu);
//			}
//		}
//	}
//
//    public void inOrderTraversal(Knoten node) {
//        if (node != null) {
//            inOrderTraversal(node.left);
//            System.out.println(node.getNachName());
//            inOrderTraversal(node.right);
//        }
//    }
//
//    public void printTree() {
//        inOrderTraversal(root);
//    }
//}

//public class Uygulama {
//	public static void main(String[] args) {
//		Baum baum = new Baum();
//		Knoten k;
//		k = new Knoten("Cool");
//		baum.einfuegen(k);
//		k = new Knoten("Zylla");
//		baum.einfuegen(k);
//		k = new Knoten("Aaronson");
//		baum.einfuegen(k);
//		k = new Knoten("Dogan");
//		baum.einfuegen(k);
//	}
//}







public class chatGbtExamples {
	Node head = null;
	Node tail = null;
	
	void basaEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null) {
			eleman.next=null;
			head = eleman;
			tail = eleman;
			System.out.println("liste oluşturuldu");
		}else {
			eleman.next=head;
			head=eleman;
			System.out.println("Yeni eleman basa eklendi");
				}
		
			}
	
	void sonaEkle(int x) {
		Node eleman = new Node();
		eleman.data = x;
		
		if (head == null) {
			eleman.next=null;
			head = eleman;
			tail = eleman;
			System.out.println("liste oluşturuldu");
		}else {
			eleman.next=null;
			tail.next=eleman;
			tail = eleman;
			System.out.println("Yeni eleman sona eklendi");
				}
		
			}
	
	void arayaEkle(int indis, int x) {

		Node eleman =  new Node();
		eleman.data = x;
		
		if(head==null && indis == 0) {
			eleman.next=null;
			head = eleman;
			tail = eleman;
			System.out.println("liste oluşturuldu, yeni eleman eklendi");
		}else if(head != null && indis == 0) {
			eleman.next = head;
			head =eleman;
			System.out.println(indis+ ". indisinci siraya yeni elemean eklendi");
		}else {
			int n= 0;
			Node temp = head;
			Node temp2 = head;
			while(temp.next!= null)
			{
			n++;
			temp2 = temp;
			temp =  temp.next;
			
			}
			if(n == indis) {
				temp2.next=eleman;
				eleman.next=temp;
				System.out.println("eleman eklendi");
				
			}else {
				temp = head;
				temp2 = head;
				int i = 0;
				while(i != indis) {
					temp2 = temp;
					temp = temp.next;
					i++;
				}
				temp2.next=eleman;
				eleman.next=temp;
			
				}
			}
	}
	
	void bastanSilme() {
		
		if(head==null) {
			System.out.println("Liste boş");
		}else if(head.next==null) {
			head = null;
			tail=null;
			System.out.println("listede kalan tek eleman silindi");
		}else {
			head = head.next;
			System.out.println("baştaki eleman silindi");
		}
	}
	
	void sondanSilme() {
		
		if(head==null) {
			System.out.println("Liste boş");
		}else if(head.next==null) {
			head = null;
			tail=null;
			System.out.println("listede kalan tek eleman silindi");
		}else {
			Node temp = head;
			Node temp2 = head;
			while(temp.next!=null) {
				temp2=temp;
				temp = temp.next;
			}
			temp2.next=null;
			tail=temp2;
			System.out.println("sondaki eleman silindi");
		}
	}
	
	void aradanSilme(int indis) {
		
		if (head == null) {
			System.out.println("liste boş, silinecek birşey yok");
		}else if(head.next==null && indis==0){
			head = null;
			tail=null;
			System.out.println("listede kalan son eleman silindi\n");
		}else if(head.next!=null && indis==0) {
			head= head.next;
			System.out.println("baştaki eleman silindi\n");
		}else {
			int i=0;
			Node temp = head;
			Node temp2 = head;
			while(temp!=null) {
				i++;
				temp2=temp;
				temp = temp.next;
			}
			if (i==indis) {
				temp2.next = null;
				tail=temp;
				System.out.println("listedeki son sıradaki eleman silindi\n");
			}else {
				temp =head;
				temp2=head;
				int j=0;
				while(j!=indis) {
					temp2 =temp;
					temp = temp.next;
					j++;
				}
				temp2.next=temp.next;
				System.out.println("aradaki nesne silindi. \n");
				
			}
		}
	}
	
	
	void yazdır() {
		if (head == null) {
			System.out.println("liste bos");
		}else {
			Node temp = head;
			while(temp!=null) {
				
				System.out.println(temp.data);
				temp = temp.next;
			}
			
		}
		
	}
}
//
//public class Uygulama {
//
//	public static void main(String[] args) {
//		
//		TekYonluListe teklist = new TekYonluListe();
//		teklist.basaEkle(10);
//		teklist.basaEkle(5);
//		teklist.basaEkle(3);
//		teklist.sonaEkle(20);
//		System.out.println();
//	
//		teklist.yazdır();
//	}
//
//}


/*
	------------------------------------
public class Pozitif{
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Pozitif bir tam sayı giriniz: ");
		int sayı = scanner.nextInt();
		if(sayı > 0) {
			System.out.println("sayınız pozitif :" + sayı);
		}else {
			throw new IllegalArgumentException("sayı negatif");
			
			
		}
	}
}

/*
-----------------------------------
public class SayiTersCevirme {

    public int tersCevir(int sayi) {
        int ters = 0;
        while (sayi != 0) {
            ters = ters * 10 + sayi % 10;
            sayi /= 10;
        }
        return ters;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SayiTersCevirme tersCevirme = new SayiTersCevirme();

        System.out.print("Bir sayı girin: ");
        int sayi = scanner.nextInt();

        System.out.println("Ters: " + tersCevirme.tersCevir(sayi));

        scanner.close();
    }
}




/*
------------------------------------------
public class MetotAsiriYukleme {

    // İki int sayıyı çarpan metot
    public int islem(int a, int b) {
        return a * b;
    }

    // İki String'i birleştiren metot
    public String islem(String a, String b) {
        return a + b;
    }

    public static void main(String[] args) {
        MetotAsiriYukleme islem = new MetotAsiriYukleme();

        System.out.println("Çarpım: " + islem.islem(5, 10));
        System.out.println("Birleştirme: " + islem.islem("Merhaba, ", "Dünya!"));
    }
}
/*
-------------------------------------
public class Varargs{
	
	public int topla(int... sayılar) {
	int top = 0;
	for (int sayı : sayılar) {
		top += sayı;
	}
		return top;
	}
	
	
	public static void main(String[] args) {
		Varargs top = new Varargs();
		
		System.out.println("Toplam: " + top.topla(1,2,3,4));
		System.out.println("Toplam: " + top.topla(1,8));
	}
}

/*
-------------------------------------
public class Toplama {

    // İki int sayıyı toplar
    public int topla(int a, int b) {
        return a + b;
    }

    // İki double sayıyı toplar
    public double topla(double a, double b) {
        return a + b;
    }

    // Üç int sayıyı toplar
    public int topla(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Toplama toplama = new Toplama();

        System.out.println("İki int toplam: " + toplama.topla(5, 10));
        System.out.println("İki double toplam: " + toplama.topla(5.5, 10.5));
        System.out.println("Üç int toplam: " + toplama.topla(5, 10, 15));
    }
}

/*
---------------------------------------
//Dosya: src/universite/muhendislik/ElektrikElektronik.java
package universite.muhendislik;

public class ElektrikElektronik {
 public void mesajYaz() {
     System.out.println("Elektrik-Elektronik Mühendisliği Bölümü");
 }
}

//Dosya: src/universite/muhendislik/Bilgisayar.java
package universite.muhendislik;

public class Bilgisayar {
 public void mesajYaz() {
     System.out.println("Bilgisayar Mühendisliği Bölümü");
 }
}

//Dosya: src/universite/iktisadi/Bilgisayar.java
package universite.iktisadi;

public class Bilgisayar {
 public void mesajYaz() {
     System.out.println("İktisadi ve İdari Bilimler Fakültesi");
 }
}

//Dosya: src/ana/Main.java
package ana;

import universite.muhendislik.ElektrikElektronik;
import universite.muhendislik.Bilgisayar as MuhBilgisayar;
import universite.iktisadi.Bilgisayar as IktBilgisayar;

public class Main {
 public static void main(String[] args) {
     ElektrikElektronik ee = new ElektrikElektronik();
     MuhBilgisayar muhBil = new MuhBilgisayar();
     IktBilgisayar iktBil = new IktBilgisayar();

     ee.mesajYaz();
     muhBil.mesajYaz();
     iktBil.mesajYaz();
 }
}

/*
 -----------------------------------------------
 // Dosya: src/a/PaketSınıfı.java
package a;

public class PaketSınıfı {
    public void mesajYaz() {
        System.out.println("Bu sınıf paket a içinde.");
    }
}

// Dosya: src/b/PaketSınıfı.java
package b;

public class PaketSınıfı {
    public void mesajYaz() {
        System.out.println("Bu sınıf paket b içinde.");
    }
}

// Dosya: src/ana/Main.java
package ana;

public class Main {
    public static void main(String[] args) {
        a.PaketSınıfı sinifA = new a.PaketSınıfı();
        b.PaketSınıfı sinifB = new b.PaketSınıfı();

        sinifA.mesajYaz();
        sinifB.mesajYaz();
    }
}

/*
------------------------------------
//Dosya: src/universite/bolum/Ogrenci.java
package universite.bolum;

public class Ogrenci {
 public String isim;

 public Ogrenci(String isim) {
     this.isim = isim;
 }

 public void bilgiYaz() {
     System.out.println("Üniversite Öğrencisi: " + isim);
 }
}

//Dosya: src/ana/Main.java
package ana;

import universite.bolum.Ogrenci;

public class Main {
 public static void main(String[] args) {
     Ogrenci ogrenci = new Ogrenci("Fatma");
     ogrenci.bilgiYaz();
 }
}

/*
-------------------------------------------
package okul;

public class Ogrenci {
    public String isim;

    public Ogrenci(String isim) {
        this.isim = isim;
    }

    public void bilgiYaz() {
        System.out.println("Öğrenci: " + isim);
    }
}

// Dosya: src/okul/Ogretmen.java
package okul;

public class Ogretmen {
    public String isim;

    public Ogretmen(String isim) {
        this.isim = isim;
    }

    public void bilgiYaz() {
        System.out.println("Öğretmen: " + isim);
    }
}

// Dosya: src/okul/Ders.java
package okul;

public class Ders {
    public String isim;

    public Ders(String isim) {
        this.isim = isim;
    }

    public void bilgiYaz() {
        System.out.println("Ders: " + isim);
    }
}

// Dosya: src/ana/Main.java
package ana;

import okul.*;

public class Main {
    public static void main(String[] args) {
        Ogrenci ogrenci = new Ogrenci("Ahmet");
        Ogretmen ogretmen = new Ogretmen("Ali Hoca");
        Ders ders = new Ders("Matematik");

        ogrenci.bilgiYaz();
        ogretmen.bilgiYaz();
        ders.bilgiYaz();
    }
}

/*
-------------------------------------------------------
import selam.Merhaba;

	public class Not{
		public static void main(String[] args) {
			Merhaba merhaba = new Merhaba();
			merhaba.mesaj();
		}
	}


-----------------------------------------------------------
*/
//	public class Pozitif{
//		String ad;
//		String soyad;
//		int[] puan;
//		
//		public Pozitif(String ad, String soyad, int[] puan){
//			this.ad= ad;
//			this.soyad=soyad;
//			this.puan= puan;	
//		}
//		
//		public String getAd() {
//			return ad;
//		}
//		
//		public String getSoyad() {
//			return soyad;
//		}
//		
//		public int[] getPuan() {
//			return puan;
//		}
//		
//		public int notOrt() {
//			int ort = 0;
//			for (int i = 0; i < puan.length; i++) {
//				ort += puan[i];
//			}
//			return ort / puan.length;
//		}
//		
//		public void yazdır() {
//			System.out.println("Adınız:" + ad);
//			System.out.println("Soyad:" + soyad);
//			System.out.println("Ort:" + notOrt());
//			
//		}
//		
//		public static void main(String[] args) {
//			Scanner scanner = new Scanner(System.in);
//			System.out.println("Adınızı giriniz: ");
//			String ad = scanner.nextLine();
//			System.out.println("Soyadınızı giriniz:");
//			String soyad = scanner.nextLine();
//			System.out.println("Kaç tane not gireceksiniz: ");
//			int sayı = scanner.nextInt();
//			int[] notlar = new int[sayı];
//			for(int i = 0; i<sayı;i++) {
//				System.out.println((i + 1) + ". not:");
//				notlar[i] = scanner.nextInt();
//			}
//			Not ogrenci = new Not(ad,soyad,notlar);
//			ogrenci.yazdır();
//			
//			scanner.close();
//			
//			
//			
//			
//			
//			
//		}
//	}
//
//



/*
----------------------------------------------------------
public class Hesap{
	int no;
	
	
	public Hesap(int no) {
		this.no=no;
		
	}
	
	public int getNo() {
		return no;
	}
	
	public void carp(int miktar) {
		this.no = no * miktar;
		System.out.println(no);
	}
	
	public void cıkarma(int miktar) {
		this.no = no - miktar;
		System.out.println(no);
	}
	
	public void toplama(int miktar) {
		this.no = no + miktar;
		System.out.println(no);
	}
	
	public void bolme(int miktar) {
		this.no = no / miktar;
		System.out.println(no);
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("1. sayı:");
		int num1 = scanner.nextInt();
		scanner.nextLine();
		Hesap h1 = new Hesap(num1);
		System.out.println("Hangi işlemi yapmak istersiniz. + - / *");
		char islem = scanner.nextLine().charAt(0);
		System.out.println("2.sayı:");
		int miktar = scanner.nextInt();
		
		switch(islem) {
		case '+':
			h1.toplama(miktar);
			break;
		case '-':
			h1.cıkarma(miktar);
			break;
		case '/' :
			h1.bolme(miktar);
			break;
		case '*' : 
			h1.carp(miktar);
			break;
		}
		
	}
}

















/*
-------------------------------------------------
	public class Hesap{
		String ad;
		int no;
		int para;
		
		
		public Hesap(String ad , int no, int para) {
			this.ad = ad;
			this.no = no;
			if (para > 0) {
				this.para = para;
				
			}else {
				throw new IllegalArgumentException("Negatif olamaz.");
			}
			
		}
		
		public String getAD() {
			return ad;
		}
		public int getNo() {
			return no;
		}
		
		public int getPara() {
			return para;
		}
		
		public void setYatır(int mik) {
			this.para = para + mik;
			System.out.println("Şuan paran:  " + para + "\nYatırdığın miktar bilmiyorsan: " + mik);
		}
		
		public void setCek(int miktar) {
			
			if(para > miktar) {
				this.para =para - miktar;
				System.out.println("Kalan paran:  " + para + "\nÇektiğin miktar bilmiyorsan: " + miktar);
			}else {
				System.out.println("Canım paran: " + para);
				throw new IllegalArgumentException("Bakiye negatif olamaz");

			}
		}
		
		public static void main(String[] args) {
			Scanner scanner = new Scanner(System.in);
			Hesap Person = new Hesap("Beyza" , 2345678 , 3456);
			System.out.println("MERHABA " + Person.getAD() + " bankamıza hoşgelsiniz. ");
			
			System.out.println("Para çekmek için 1, yatırmak için 3 e basın");
			int tus = scanner.nextInt();
			System.out.println("Ne kadar istersin?");
			int mik = scanner.nextInt();
			switch(tus) {
			case 1: 
				Person.setCek(mik);
				break;
			case 3 : 
				Person.setYatır(mik);
				break;
			default: 
				System.out.println("1 mi 3 mü dedim salak!");
				break;
			}
			
		}
		
		
		
	}
	
	






/*
------------------------------------------
public class Calisan{
	String ad;
	private int maas;
	
	public Calisan(String ad, int maas){
		this.ad= ad;
		if(maas > 0) {
		this.maas= maas;
		}else {
			throw new IllegalArgumentException("Maaş negatif olamaz.");
		}
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void maasArttırma(int miktar) {
		this.maas = maas + miktar;
		System.out.println(maas);	
	}	
	
	public void maasAzaltma(int azmiktar) {
		if(maas > azmiktar) {
		this.maas = maas - azmiktar;
		System.out.println(maas);
	}else {
		throw new IllegalArgumentException("Maaş negatif olamaz.");
		}	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İsim:");
		String ad1 = scanner.nextLine();
		System.out.println("maas:");
		int maas1 = scanner.nextInt();
		scanner.nextLine(); //ÖNEMLİ
		Calisan Person = new Calisan(ad1, maas1);
	
		System.out.println("Azaltacaksan - arrtıracaksan + gir ");
		char control = scanner.nextLine().charAt(0);
		
		switch(control){
		case '+' :
			System.out.println("miktarı gir:");
			int res = scanner.nextInt();
			Person.maasArttırma(res);
			break;
		case '-' : 
			System.out.println("miktarı gir: ");
			int rwes = scanner.nextInt();
			Person.maasAzaltma(rwes);
			break;
		}
	}
}









/*
---------------------------------------------------
public class Calisan{
	String ad;
	private int maas;
	
	public Calisan(String ad, int maas){
		this.ad= ad;
		if(maas > 0) {
		this.maas= maas;
		}else {
			throw new IllegalArgumentException("Maaş negatif olamaz.");
		}
	}
	
	public String getAd() {
		return ad;
	}
	
	public void setAd(String ad) {
		this.ad = ad;
	}
	
	public int getMaas() {
		return maas;
	}
	
	public void maasArttırma(int miktar) {
		this.maas = maas + miktar;
		System.out.println(maas);	
	}	
	
	public void maasAzaltma(int azmiktar) {
		if(maas > (-1 *azmiktar)) {
		this.maas = maas + azmiktar;
		System.out.println(maas);
	}else {
		throw new IllegalArgumentException("Maaş negatif olamaz.");
		}	
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("İsim:");
		String ad1 = scanner.nextLine();
		System.out.println("maas:");
		int maas1 = scanner.nextInt();
		
		Calisan Person = new Calisan(ad1, maas1);
	
		System.out.println("Azaltacaksan negatif arrtıracaksan pozitif gir ");
		int res = scanner.nextInt();
		if(res > 0) {
			Person.maasArttırma(res);
		}else {
			Person.maasAzaltma(res);
		}	
	}
}


/*
----------------------------------------------
class Kullanıcı{
	private String ad;
	private int yas;
	
	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}
	 public int getYas() {
		 return yas;
	 }
	 
	 public void setYas(int yas) {
		 if(yas < 0) {
			 throw new IllegalArgumentException("Negatif olamaz");
		 }
		 this.yas = yas;
	 }
}

public class chatGbtExamples {
	 public static void main(String[] args) {
		 Kullanıcı kullanıcı = new Kullanıcı();
		 kullanıcı.setAd("Beyza");
		 kullanıcı.setYas(22);
		 
		 System.out.println(kullanıcı.getAd());
		 System.out.println(kullanıcı.getYas());

	 }
}

/*
----------------------------------------------
 class Car{
	int hız;
	String marka;
	String model;
	
	public Car(int hız, String marka, String model) {
		this.hız = hız;
		this.marka = marka;
		this.model = model;
	}
	
	public void bilgi() {
		System.out.println("marka:" + marka );
		System.out.println("Model: " + model);
		System.out.println("hız:" + hız);
	}
	}
	

public class chatGbtExamples {
	public static void main(String[] args) {
		
		Car araba = new Car(180, "Toyota", "Corolla");
		Car araba1 = new Car(280, "asdasd", "6454564");
		araba.bilgi();
		araba1.bilgi();
	}
	

}
	/*
	-------------------------------------------------
	public static int ortalama(int[] dizi) {
		int top = 0;
		int length = dizi.length;
		
		if(length == 0) {
			throw new IllegalArgumentException("Dizi boş olamaz!");
		}
		
		for (int i = 0; i <length; i++ ) {
			top += dizi[i];
		}
		
		
		return top / length;
	}
	public static void main(String[] args) {
		
	int [] dizi = {1,2,6};

	System.out.println(ortalama(dizi));	
	

}
}
	/*
	 -----------------------------------------------
	public static int[] check(int[] dizi) {
		
		int length = dizi.length;

		
		if (length == 0) {
			  throw new IllegalArgumentException("Dizi boş olamaz!");
		}
		int min = dizi[0];
		int max = dizi[0];
			
		for (int i = 1; i < length ; i++) {
			if (dizi[i] > max) {
				max = dizi[i];
			}else if(dizi[i] < min){
				min = dizi[i];
			}
		}
		return new int[] {min, max};
}
	
	
	public static void main(String[] args) {
	
	try {	
		int[] dizi= {};
	
		int[] res= check(dizi);
		System.out.println("min:" +res[0]);
		System.out.println("max:" +res[1]);
	} catch (IllegalArgumentException e) {
		System.out.println("hata:" + e.getMessage());
		}
 	}
}
	/*
	-------------------------------------------------------------
	public static int sorgu(String str) {
		int count = 0;
		for (int i = str.length()-1; i >= 0 ;i--) {
			if(str.charAt(i) == 'e' || str.charAt(i) == 'a' ||str.charAt(i) == 'i' ||str.charAt(i) == 'ı' ||str.charAt(i) == 'ü' ||str.charAt(i) == 'u' ||str.charAt(i) == 'o' ||str.charAt(i) == 'ö' )
			{
				count++;
			}else {
				continue;
			}
		}
		return count;
	}
	
	
	
	public static void main(String[] args) {
	Scanner scanner= new Scanner(System.in);
	System.out.println("Bir metin giriniz: ");
	String str =  scanner.nextLine();
	
	int kacTaneSesli = sorgu(str);
	System.out.println(kacTaneSesli + " tane sesli harf var.");
	
	
 	}
}	
	/*
	-----------------------------------------------
	public static String reverse(String str) {
		
		String ters = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			ters += str.charAt(i);
		}
		
		return ters;
		
	}
 	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir kelime giriniz: ");
		String str = scanner.nextLine();
		String tersC = reverse(str);
		
		if(str.equals(tersC)) {
			System.out.println("Palindrom");
			
		}else {
			System.out.println("Palindrom değil");
		}
		
		
	}
}
		/*
		------------------------------------------
		Scanner scanner = new Scanner(System.in);

        System.out.println("Bir metin giriniz: ");
        String metin = scanner.nextLine();

        System.out.println("Karakterlerin ASCII değerleri:");
        for (int i = 0; i < metin.length(); i++) {
            char karakter = metin.charAt(i);
            int asciiDegeri = (int) karakter; // Karakterin ASCII kodunu al
            System.out.println("'" + karakter + "' → " + asciiDegeri);
        }

        scanner.close(); 
		
	}
}
	/*
	-----------------------------------------------
	public static String reverse(String str) {
		String ters = "";
		for (int i = str.length() - 1 ; i >= 0; i--) {
			ters += str.charAt(i);
		}
		return ters;
	}
	
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Bir metin giriniz: ");
		String str = scanner.nextLine();
		
		String tersMetin = reverse(str);
		System.out.println("Reversed text: " + tersMetin);
		
		scanner.close();
		
	}		
}	
		
		/*
		-----------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int n = scanner.nextInt();
        int a = 0; // F(0)
        int b = 1; // F(1)
        
        System.out.println("Fibonacci serisi:");
        
        for (int i = 0; i < n; i++) {
            System.out.print(a + " "); 

            
            int next = a + b;
            a = b;
            b = next;
        }

        scanner.close();
		}
	}
		
		/*
		--------------------------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir metin giriniz: ");
		String str = scanner.nextLine();
		
		System.out.println(str.length());
		
		
		
		
	}
}
	
	/*
	---------------------------------------------------------------
	
	public static int faktoriyel(int num) { 
		
		if (num == 0 || num == 1 ) return 1;
		return num * faktoriyel(num - 1);
		
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num =  scanner.nextInt();
		
		
		System.out.println(faktoriyel(num));
		
		
	}
}
		/*-------------------------------------------
		Scanner scanner =  new Scanner(System.in);
		Random random = new Random();
		
		int randomNumber = random.nextInt(51);
		
		System.out.println("0 - 50 arasında bi sayı tahmin et:");
		
		int tahmin = scanner.nextInt();
		
		if(tahmin < randomNumber) {
			System.out.println("daha büyük bir sayı");
		}else if (tahmin > randomNumber) {
			System.out.println("daha küçük bir sayı");
		}else {
			System.out.println("DOĞRU");
		}
		
		scanner.close();
	}
}
		/*
		---------------------------------------
		for (int i = 0; i < 10 ; i++) {
			System.out.println("Java");
			}
		}
	}
	
		/*
		----------------------------------------
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = scanner.nextInt();
		int res = 0;
		for (int i = 1; i <= num; i++ ) {
			
			res += i;
		}
		System.out.println(res);
	}
}
		
		
		
		
		/*
		------------------------------------------
		int num = 100;
		for(int i= 1; i<=num; i++) {
			if(i % 2 == 0) {
			System.out.println(i);
		} else {
			continue;
		}
		
		
		}
	}
}
	/*-----------------------------------------------
	Scanner scanner = new Scanner(System.in);
	System.out.println("Bir harf giriniz: ");
	String giris = scanner.nextLine();
	
	if(giris.length() == 1 &&  Character.isLetter(giris.charAt(0))) {
	
		char harf = Character.toLowerCase(giris.charAt(0));
		
		if(harf == 'a' || harf == 'e' || harf == 'ı' || harf == 'i' || harf == 'o' || harf == 'ö' || harf == 'u' || harf == 'ü' ) {
			System.out.println("Sesli harf");
			}else {
			System.out.println("Sessiz harf");
			}
			
		}else {
			System.out.println("Geçersiz");
		}
	}
}
		
		
		
		
		/*---------------------------------------
	Scanner scanner =  new Scanner(System.in);
	System.out.println("Bir sayı giriniz: ");
	int num = scanner.nextInt();
	
	switch(num) {
	case 1: System.out.println("o");	break;
	case 2: System.out.println("ş");	break;
	case 3: System.out.println("m");	break;
	case 4: System.out.println("n");	break;
	case 5: System.out.println("m");	break;
	case 6: System.out.println("h");	break;
	case 7: System.out.println("t");	break;
	case 8: System.out.println("a");	break;
	case 9: System.out.println("e");	break;
	case 10: System.out.println("e");	break;
	case 11: System.out.println("k");	break;
	case 12: System.out.println("a");	break;
	default: System.out.println("Geçersiz"); break;
	}
	scanner.close();
	
	
	}
}
	/*-------------------------------------------------------
	 * public static boolean evenOdd (int num) {
	 
		
		if (num % 2 == 0) {
			return true;
		}else {
			return false;
		}
		
	}
	
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = scanner.nextInt();
		
		
		if(evenOdd(num)) {
			System.out.println("Sayı çifttir");
		}else {
			System.out.println("Sayı tektir.");
		}
		
		
		
	}
}
	
	
	
	
	
	
	/*-------------------------
	 * public static boolean check(int num) {
	 
		
		return num > 0;
	
	}
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Bir sayı giriniz: ");
		int num = scanner.nextInt();
		boolean a = check(num);
		
		if(a) {
			System.out.println("Pozitif");
		}else {
			System.out.println("Negatif");
		}
		
		scanner.close();
		
		}
	}		
		
		
		
		
		/*-----------------------	
		byte a = Byte.MAX_VALUE;
		byte b = Byte.MIN_VALUE;
		System.out.println(a + " " + b);
		
		
		
	}
}
	
	/*
 * -------------------------------------------------------------
 * 	public static void bolum(double num1, double num2) {
		double result;
		if (num2 == 0) {
			System.out.println("Tanımsız");
		}else {
			result = num1 / num2;
			System.out.println(result);
		}
		
	}
	
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("ilk sayıyı giriniz:");
		double num1 = scanner.nextDouble();
		System.out.println("İkinci sayıyı giriniz: ");
		double num2 = scanner.nextDouble();
		
		bolum(num1, num2);
	
	}}

	 * 
	 * 
	 * 
	 * -------------------------------------
	public static int kare(int num) {
		return num * num;
		
	}
	
	public static void main(String[] args) {
		Scanner scanner =  new Scanner(System.in);
		System.out.println("bir sayı giriniz: ");
		int num = scanner.nextInt();
		
		System.out.println(kare(num));
		
		
	}}
	
	
		
		 * ---------------------------
		 * int min = Integer.MIN_VALUE;
		int max = Integer.MAX_VALUE;
		
		System.out.println("en küçük " + min);
		System.out.println("en büyük " + max);
	}
}*/
