package jurnal5;

public class Modul {
  private String kode;
  private String judul;

  public Modul(String kode, String nama) {
    this.kode = kode;
    this.judul = nama;
  }

  public void setKode(String kode) {
    this.kode = kode;
  }
  public void setJudul(String judul) {
    this.judul = judul;
  }

  public String getKode() {
    return kode;
  }
  public String getJudul() {
    return judul;
  }
}
