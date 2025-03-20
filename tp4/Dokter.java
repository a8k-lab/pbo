package tp4;

public class Dokter {
  private String nama;
  private String spesialis;

  public Dokter(String nama, String spesialis) {
    this.nama = nama;
    this.spesialis = spesialis;
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setSpesialis(String spesialis) {
    this.spesialis = spesialis;
  }

  public String getNama() {
    return this.nama;
  }
  public String getSpesialis() {
    return this.spesialis;
  }
}
