package jurnal8;

public class Segitiga extends BangunDatar {
  private int alas, tinggi;

  public Segitiga(String nama, int alas, int tinggi) {
    super(nama);
    this.alas = alas;
    this.tinggi = tinggi;
  }

  public int getAlas() {
    return alas;
  }
  public int getTinggi() {
    return tinggi;
  }

  public void setAlas(int alas) {
    this.alas = alas;
  }
  public void setTinggi(int tinggi) {
    this.tinggi = tinggi;
  }
  @Override
  public double hitungKeliling() {
    return alas * tinggi;
  }
  @Override
  public double hitungLuas() {
    return alas * tinggi * 0.5;
  }
}
