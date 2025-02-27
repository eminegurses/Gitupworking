package depo_project;

import java.util.HashMap;
import java.util.Map;
public class Depo {
    private Map<Integer, Urun> urunler = new HashMap<>();

    public void urunTanimlama(String isim, String uretici, String birim) {
        Urun yeniUrun = new Urun(isim, uretici, birim);
        urunler.put(yeniUrun.getId(), yeniUrun);
        System.out.println("Ürün başarıyla tanımlandı: " + yeniUrun);
    }

    public void urunListele(int filtre) {
        System.out.println("\nID     İsmi       Üretici    Miktar Birim      Raf   Statü ");
        System.out.println("----------------------------------------------------------");
        for (Urun urun : urunler.values()) {
            if (filtre == 1 && urun.getStatus() == 1 || filtre == 2 && urun.getStatus() == 0 || filtre == 0) {
                System.out.println(urun);
            }
        }
    }

    public void urunGirisi(int id, int miktar) {
        if (urunler.containsKey(id)) {
            Urun urun = urunler.get(id);
            urun.setMiktar(urun.getMiktar() + miktar);
            System.out.println("Ürün girişi yapıldı: " + urun);
        } else {
            System.out.println("Hata: Ürün bulunamadı!");
        }
    }

    public void urunuRafaKoy(int id, String raf, int miktar) {
        if (urunler.containsKey(id)) {
            Urun urun = urunler.get(id);
            if (urun.getMiktar() >= miktar) {
                urun.setRaf(raf);
                System.out.println("Ürün rafa yerleştirildi: " + urun);
            } else {
                System.out.println("Hata: Raf için yeterli stok yok!");
            }
        } else {
            System.out.println("Hata: Ürün bulunamadı!");
        }
    }

    public void urunCikisi(int id, int miktar) {
        if (urunler.containsKey(id)) {
            Urun urun = urunler.get(id);
            if (urun.getMiktar() >= miktar) {
                urun.setMiktar(urun.getMiktar() - miktar);
                System.out.println("Ürün çıkışı yapıldı: " + urun);
            } else {
                System.out.println("Hata: Stok yetersiz!");
            }
        } else {
            System.out.println("Hata: Ürün bulunamadı!");
        }
    }

    public void urunStatusuDegistir(int id, int status) {
        if (urunler.containsKey(id)) {
            Urun urun = urunler.get(id);
            urun.setStatus(status);
            System.out.println("Ürün statüsü güncellendi: " + urun);
        } else {
            System.out.println("Hata: Ürün bulunamadı!");
        }
    }
}


