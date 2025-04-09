package SonGün;

import java.util.Scanner;

public class Kurs {
    private String kursart;  // Kurs türü (Karate, Judo vb.)
    private int kursdauer;  // Kurs süresi (30, 60, 90 dakika)
    private Mitglied[] mitglieder;  // Kursa kayıtlı üyeleri saklayan dizi
    private int maxMitglieder;  // Kursun maksimum kapasitesi
    private int aktuelleMitglieder;  // Şu anki kurs üye sayısı

    // Kurs sınıfı için constructor (kurucu metod)
    public Kurs(String kursart, int kursdauer, int maxMitglieder) {
        this.kursart = kursart;
        this.kursdauer = kursdauer;
        this.maxMitglieder = maxMitglieder;
        this.aktuelleMitglieder = 0;  // Başlangıçta kursta kimse yok
        this.mitglieder = new Mitglied[maxMitglieder];  // Üye dizisini oluştur
    }

    public String getKursart() {
        return kursart;  // Kurs türünü döndür
    }

    public int getKursdauer() {
        return kursdauer;  // Kurs süresini döndür
    }

    // Kursa yeni bir üye ekleme metodu
    public boolean anmeldungKurs(Mitglied mitglied) {
        if (aktuelleMitglieder >= maxMitglieder) {  // Eğer kurs doluysa
            System.out.println("Kurs ist voll! Anmeldung nicht möglich.");  // Kullanıcıya kursun dolu olduğunu söyle
            return false;
        }

        if (mitglied.isRegistered()) {  // Eğer üye zaten bir kursa kayıtlıysa
            System.out.println("Mitglied ist bereits in einem Kurs angemeldet!");  // Üyenin başka bir kursa kayıtlı olduğunu söyle
            return false;
        }

        mitglieder[aktuelleMitglieder++] = mitglied;  // Üyeyi kurs listesine ekle
        mitglied.setRegistered(true);  // Üyenin kayıtlı olduğunu işaretle
        System.out.println(mitglied.getName() + " wurde erfolgreich in den Kurs " + kursart + " aufgenommen.");  // Başarı mesajı göster
        return true;
    }

    // Kurstan bir üyeyi çıkarma metodu
    public boolean abmeldungKurs(Mitglied mitglied) {
        for (int i = 0; i < aktuelleMitglieder; i++) {
            if (mitglieder[i].getMitgliedsnummer() == mitglied.getMitgliedsnummer()) {  // Eğer üye bulunursa
                System.out.println(mitglied.getName() + " hat den Kurs " + kursart + " verlassen.");  // Üyenin ayrıldığını söyle
                mitglied.setRegistered(false);  // Üyenin artık kayıtlı olmadığını işaretle
                
                mitglieder[i] = mitglieder[aktuelleMitglieder - 1]; // Son üyeyi boşalan yere kaydır
                mitglieder[aktuelleMitglieder - 1] = null;  // Son üyenin olduğu yeri boşalt
                aktuelleMitglieder--;  // Üye sayısını azalt
                return true;
            }
        }

        System.out.println("Mitglied nicht im Kurs gefunden.");  // Eğer üye bulunmazsa hata mesajı ver
        return false;
    }

    // Kurs üyelerini listeleme metodu
    public void zeigeMitglieder() {
        System.out.println("Kurs: " + kursart + " | Dauer: " + kursdauer + "min | Maximale Teilnehmer: " + maxMitglieder);
        for (int i = 0; i < aktuelleMitglieder; i++) {
            System.out.println(mitglieder[i]);  // Her üyeyi yazdır
        }
        System.out.println();
    }
    
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Kullanıcıdan kurs süresi alırken geçerli olup olmadığını kontrol et
        int[] erlaubteDauern = {30, 60, 90};  // Geçerli kurs süreleri
        System.out.print("Kursdauer eingeben (30, 60 oder 90 Minuten): ");
        int kursdauer = scanner.nextInt();  // Kullanıcıdan giriş al

        boolean gültig = false;
        for (int d : erlaubteDauern) {
            if (kursdauer == d) {
                gültig = true;
                break;
            }
        }

        if (!gültig) {  // Eğer geçersiz kurs süresi girildiyse hata fırlat
            throw new RuntimeException("Dieser Kurs wird nicht angeboten!");
        }

        // Üç farklı kurs oluştur
        Kurs karate = new Kurs("Karate", kursdauer, 5);
        Kurs judo = new Kurs("Judo", kursdauer, 4);
        Kurs boxen = new Kurs("Boxen", kursdauer, 3);

        // Üyeler oluştur
        Mitglied m1 = new Mitglied("Ali", 101);
        Mitglied m2 = new Mitglied("Merve", 102);
        Mitglied m3 = new Mitglied("Kenan", 103);

        // Üyeleri kurslara kaydet
        karate.anmeldungKurs(m1);
        judo.anmeldungKurs(m2);
        boxen.anmeldungKurs(m3);

        // Kurs bilgilerini yazdır
        karate.zeigeMitglieder();
        judo.zeigeMitglieder();
        boxen.zeigeMitglieder();

        // Üyeleri kurstan çıkar
        karate.abmeldungKurs(m1);

        // Güncellenmiş kursları yazdır
        karate.zeigeMitglieder();

        scanner.close();
    }
}
