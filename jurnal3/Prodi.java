package jurnal3;

public class Prodi {
  private String kode;
  private String nama;

  public Prodi(String kode, String nama) { 
    this.kode = kode;
    this.nama = nama;
  }

  public void setKode(String kode) {
    if (kode == null || kode.length() != 2) {
      throw new Error("Kode tidak boleh kosong");
    } else {
      this.kode = kode;
    }
  }
  public void setNama(String nama) {
    if (nama == null || nama.isEmpty()) {
      throw new Error("Nama prodi tidak boleh kosong");
    }
    this.nama = nama;
  }

  public String getKode() {
    return kode;
  }
  public String getNama() {
    return nama;
  }
}
