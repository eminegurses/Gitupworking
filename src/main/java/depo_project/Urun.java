package depo_project;

public class Urun {
    private static int idCounter = 1000; // Otomatik ID üretimi
    private int id;
    private String urunIsmi;
    private String uretici;
    private int miktar;
    private String birim;
    private String raf;
    private int status; // 0: Pasif, 1: Aktif

    public Urun(String urunIsmi, String uretici, String birim) {
        this.id = idCounter++;
        this.urunIsmi = urunIsmi;
        this.uretici = uretici;
        this.miktar = 0;
        this.birim = birim;
        this.raf = "-";
        this.status = 1;
    }

    public int getId() { return id; }
    public String getUrunIsmi() { return urunIsmi; }
    public String getUretici() { return uretici; }
    public int getMiktar() { return miktar; }
    public String getBirim() { return birim; }
    public String getRaf() { return raf; }
    public int getStatus() { return status; }

    public void setMiktar(int miktar) { this.miktar = miktar; }
    public void setRaf(String raf) { this.raf = raf; }
    public void setStatus(int status) { this.status = status; }

    public String toString() {
        return "ID: " + id +
                "| Ürün İsmi: " + urunIsmi +
                "| Üretici: " + uretici +
                "| Miktar: " + miktar +
                "| Birim: " + birim +
                "| Raf: "+raf;

    }
}







