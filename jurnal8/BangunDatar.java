package jurnal8;

public abstract class BangunDatar {
  private String nama;

  public BangunDatar(String nama) {
    this.nama = nama;
  }

  public String getNama() {
    return nama;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  public abstract double hitungKeliling();
  public abstract double hitungLuas();
}
