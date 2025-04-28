package jurnal5;

public class Mahasiswa {
  private String nim;
  private String nama;
  private Praktikum[] praktikum;

  public Mahasiswa(String nim, String nama) {
    this.nim = nim;
    this.nama = nama;
    this.praktikum = new Praktikum[0];
  }

  public void setNim(String nim) {
    this.nim = nim;
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

  public String getNim() {
    return nim;
  }
  public String getNama() {
    return nama;
  }
  public Praktikum[] getPraktikum() {
    return praktikum;
  }
}
