package tp4;

public class Pemesanan {
  private Dokter dokter;
  private Pasien pasien;
  private String hari;

  public Pemesanan(Dokter dokter, Pasien pasien, String hari) {
    this.dokter = dokter;
    this.pasien = pasien;
    this.hari = hari;
  }

  public void setDokter(Dokter dokter) {
    this.dokter = dokter;
  }
  public void setPasien(Pasien pasien) {
    this.pasien = pasien;
  }
  public void setHari(String hari) {
    this.hari = hari;
  }

  public Dokter getDokter() {
    return dokter;
  }
  public Pasien getPasien() {
    return pasien;
  }
  public String getHari() {
    return hari;
  }
}
