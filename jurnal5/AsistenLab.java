package jurnal5;

public class AsistenLab {
  private String kode;
  private String nama;

  public AsistenLab(String kode, String nama) {
    this.kode = kode;
    this.nama = nama;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setNama(String nama) {
    this.nama = nama;
  }

  public String getKode() {
    return kode;
  }
  public String getNama() {
    return nama;
  }
}
