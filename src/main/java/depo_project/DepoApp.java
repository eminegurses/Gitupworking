package depo_project;
import java.util.Scanner;

public class DepoApp {
    public static void main(String[] args) {
        Depo depo = new Depo();
        Scanner input = new Scanner(System.in);
        int secim;

        do {
            System.out.println("\n--- DEPO YÖNETİM SİSTEMİ ---");
            System.out.println("1- Ürün Tanımla");
            System.out.println("2- Ürün Listele (1: Tüm, 2: Aktif, 3: Pasif)");
            System.out.println("3- Ürün Girişi");
            System.out.println("4- Ürünü Rafa Koy");
            System.out.println("5- Ürün Çıkışı");
            System.out.println("6- Ürün Statü Değiştir");
            System.out.println("0- Çıkış");
            System.out.print("Seçiminiz: ");
            secim = input.nextInt();

            switch (secim) {
                case 1:
                    input.nextLine();
                    System.out.print("Ürün İsmi: ");
                    String isim = input.nextLine();
                    System.out.print("Üretici: ");
                    String uretici = input.nextLine();
                    System.out.print("Birim: ");
                    String birim = input.nextLine();
                    depo.urunTanimlama(isim, uretici, birim);
                    break;
                case 2:
                    System.out.print("Filtre (0: Tüm, 1: Aktif, 2: Pasif): ");
                    int filtre = input.nextInt();
                    depo.urunListele(filtre);
                    break;
                case 3:
                    System.out.print("Ürün ID: ");
                    int idGiris = input.nextInt();
                    System.out.print("Giriş Miktarı: ");
                    int miktarGiris = input.nextInt();
                    depo.urunGirisi(idGiris, miktarGiris);
                    break;
                case 4:
                    System.out.print("Ürün ID: ");
                    int idRaf = input.nextInt();
          input.nextLine();
                    System.out.print("Raf Numarası: ");
                    String raf = input.nextLine();
                    System.out.print("Miktar: ");
                    int miktar = input.nextInt();
                    depo.urunuRafaKoy(idRaf, raf, miktar);
                    break;
                case 5:
                    System.out.print("Ürün ID: ");
                    int idCikis = input.nextInt();
                    System.out.print("Çıkış Miktarı: ");
                    int miktarCikis = input.nextInt();
                    depo.urunCikisi(idCikis, miktarCikis);
                    break;
                case 6:
                    System.out.print("Ürün ID: ");
                    int idStat = input.nextInt();
                    System.out.print("Yeni Statü (1: Aktif, 0: Pasif): ");
                    int status = input.nextInt();
                    depo.urunStatusuDegistir(idStat, status);
                    break;
            }
        } while (secim!=0);
    }

}
