package jurnal5;

public class Praktikum {
  private String nama;
  private String jadwal;
  private AsistenPraktikum[] asistenPraktikum;
  private Dosen dosen;

  public Praktikum(String nama, String jadwal, Dosen dosen) {
    this.nama = nama;
    this.jadwal = jadwal;
    this.dosen = dosen;
    this.asistenPraktikum = new AsistenPraktikum[0];
  }

  public void setNama(String nama) {
    this.nama = nama;
  }
  public void setJadwal(String jadwal) {
    this.jadwal = jadwal;
  }
  public void setDosen(Dosen dosen) {
    this.dosen = dosen;
  }
  public void tambahAsistenPraktikum(AsistenPraktikum asistenPraktikum) {
    AsistenPraktikum[] temp = new AsistenPraktikum[this.asistenPraktikum.length + 1];

    for (int i = 0; i < this.asistenPraktikum.length; i++) {
      temp[i] = this.asistenPraktikum[i];
    }
    temp[this.asistenPraktikum.length] = asistenPraktikum;
    this.asistenPraktikum = temp;
  }

  public String getNama() {
    return nama;
  }
  public String getJadwal() {
    return jadwal;
  }
  public Dosen getDosen() {
    return dosen;
  }
  public AsistenPraktikum[] getAsistenPraktikum() {
    return asistenPraktikum;
  }
}
