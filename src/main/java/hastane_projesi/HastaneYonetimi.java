package hastane_projesi;
import java.util.ArrayList;
import java.util.Scanner;


public class HastaneYonetimi {
    private ArrayList<Hasta> hastalar = new ArrayList<>();
    private ArrayList<Doktor> doktorlar = new ArrayList<>();
    private ArrayList<Randevu> randevular = new ArrayList<>();
    private int hastaId = 1, doktorId = 1, randevuId = 1;
    private Scanner scanner = new Scanner(System.in);

    public void hastaEkle() {
        System.out.print("Hasta Adı: ");
        String ad = scanner.next();
        System.out.print("Hasta Soyadı: ");
        String soyad = scanner.next();
        System.out.print("Hasta TC No: ");
        String tcNo = scanner.next();

        Hasta yeniHasta = new Hasta(hastaId++, ad, soyad, tcNo);
        hastalar.add(yeniHasta);
        System.out.println("Hasta eklendi!");
    }

    public void doktorEkle() {
        System.out.print("Doktor Adı: ");
        String ad = scanner.next();
        System.out.print("Uzmanlık Alanı: ");
        String uzmanlik = scanner.next();

        Doktor yeniDoktor = new Doktor(doktorId++, ad, uzmanlik);
        doktorlar.add(yeniDoktor);
        System.out.println("Doktor eklendi!");
    }

    public void randevuOlustur() {
        System.out.println("Mevcut Hastalar:");
        for (Hasta h : hastalar) {
            System.out.println(h.getId() + ". " + h.getAd());
        }
        System.out.print("Hasta ID seç: ");
        int hastaId = scanner.nextInt();

        System.out.println("Mevcut Doktorlar:");
        for (Doktor d : doktorlar) {
            System.out.println(d.getId() + ". " + d.getAd());
        }
        System.out.print("Doktor ID seç: ");
        int doktorId = scanner.nextInt();

        System.out.print("Randevu Tarihi (GG-AA-YYYY): ");
        String tarih = scanner.next();

        Hasta secilenHasta = hastalar.get(hastaId - 1);
        Doktor secilenDoktor = doktorlar.get(doktorId - 1);
        Randevu yeniRandevu = new Randevu(randevuId++, secilenHasta, secilenDoktor, tarih);
        randevular.add(yeniRandevu);

        System.out.println("Randevu oluşturuldu!");
    }

    public void listele() {
        System.out.println("\n** Hastalar **");
        for (Hasta h : hastalar) System.out.println(h);

        System.out.println("\n** Doktorlar **");
        for (Doktor d : doktorlar) System.out.println(d);

        System.out.println("\n** Randevular **");
        for (Randevu r : randevular) System.out.println(r);
    }

    public void baslat() {
        while (true) {
            System.out.println("\n1. Hasta Ekle");
            System.out.println("2. Doktor Ekle");
            System.out.println("3. Randevu Oluştur");
            System.out.println("4. Listele");
            System.out.println("5. Çıkış");
            System.out.print("Seçim: ");

            int secim = scanner.nextInt();
            switch (secim) {
                case 1: hastaEkle(); break;
                case 2: doktorEkle(); break;
                case 3: randevuOlustur(); break;
                case 4: listele(); break;
                case 5: return;
                default: System.out.println("Geçersiz seçim!");
            }
        }
    }
}
