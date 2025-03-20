package tp4;

public class Pasien {
  private String nama;
  private int umur;

  public Pasien(String nama, int umur) {
    this.nama = nama;
    this.umur = umur;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setUmur(int umur) {
    this.umur = umur;
  }

  public String getNama() {
    return nama;
  }
  public int getUmur() {
    return umur;
  }
}
