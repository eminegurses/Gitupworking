package hastane_projesi;

public class Randevu {
    private int id;
    private Hasta hasta;
    private Doktor doktor;
    private String tarih;

    public Randevu(int id, Hasta hasta, Doktor doktor, String tarih) {
        this.id = id;
        this.hasta = hasta;
        this.doktor = doktor;
        this.tarih = tarih;
    }

    @Override
    public String toString() {
        return "Randevu ID: " + id + ", Hasta: " + hasta.getAd() +
                ", Doktor: " + doktor.getAd() + ", Tarih: " + tarih;
    }

}
