package jurnal5;

public class AsistenPraktikum {
  private String kode;
  private String nama;
  private Praktikum[] praktikum;

  public AsistenPraktikum(String kode, String nama, String alamat) {
    this.kode = kode;
    this.nama = nama;
    this.praktikum = new Praktikum[0];
  }

  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void tambahPraktikum(Praktikum praktikum) {
    Praktikum[] temp = new Praktikum[this.praktikum.length + 1];

    for (int i = 0; i < this.praktikum.length; i++) {
      temp[i] = this.praktikum[i];
    }
    temp[this.praktikum.length] = praktikum;
    this.praktikum = temp;
  }

  public String getKode() {
    return kode;
  }
  public String getNama() {
    return nama;
  }
  public Praktikum[] getPraktikum() {
    return praktikum;
  }
}
