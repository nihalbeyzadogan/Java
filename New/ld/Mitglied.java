package SonGün;  // Paket adı (Dosyanın bulunduğu paket)

public class Mitglied {  
    private String name;  // Üyenin adı
    private int mitgliedsnummer;  // Üyenin benzersiz numarası (ID)
    private boolean isRegistered;  // Üyenin bir kursa kayıtlı olup olmadığını takip eden değişken

    // Üye sınıfı için kurucu (constructor) metod
    public Mitglied(String name, int mitgliedsnummer) {
        this.name = name;
        this.mitgliedsnummer = mitgliedsnummer;
        this.isRegistered = false; // Başlangıçta hiçbir kursa kayıtlı değil
    }

    public String getName() {  
        return name;  // Üyenin ismini döndür
    }

    public int getMitgliedsnummer() {
        return mitgliedsnummer;  // Üyenin ID'sini döndür
    }

    public boolean isRegistered() {  
        return isRegistered;  // Üyenin kayıtlı olup olmadığını döndür
    }

    public void setRegistered(boolean registered) {
        isRegistered = registered;  // Üyenin kayıt durumunu güncelle
    }

    @Override
    public String toString() {
        return "Mitglied: " + name + ", Mitgliedsnummer: " + mitgliedsnummer;  // Üyenin bilgilerini string olarak döndür
    }
}
