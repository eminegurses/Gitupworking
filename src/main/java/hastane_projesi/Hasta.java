package hastane_projesi;

public class Hasta {
    private int id;
    private String ad;
    private String soyad;
    private String tcNo;

    public Hasta(int id, String ad, String soyad, String tcNo) {
        this.id = id;
        this.ad = ad;
        this.soyad = soyad;
        this.tcNo = tcNo;
    }

    public int getId() { return id; }
    public String getAd() { return ad; }
    public String getSoyad() { return soyad; }
    public String getTcNo() { return tcNo; }

    @Override
    public String toString() {
        return "Hasta ID: " + id + ", Ad: " + ad + " " + soyad + ", TC: " + tcNo;
    }

}
