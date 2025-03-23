package jurnal4;

public class MataKuliah {
  private String kode;
  private String nama;
  private int sks;

  public MataKuliah(String kode, String nama, int sks) {
    this.kode = kode;
    this.nama = nama;
    this.sks = sks;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setSks(int sks) {
    this.sks = sks;
  }

  public String getKode() {
    return this.kode;
  }
  public String getNama() {
    return this.nama;
  }
  public int getSks() {
    return this.sks;
  }
}
