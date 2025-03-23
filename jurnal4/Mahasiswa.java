package jurnal4;

public class Mahasiswa {
  private String nim;
  private String nama;
  private String kelas;
  private String prodi;
  public AmbilMK[] ambilMK;

  public Mahasiswa(String nim, String nama, int noKelas) {
    this.nama = nama;
    this.setNim(nim);
    this.setKelas(noKelas);
    this.ambilMK = new AmbilMK[0];
  }

  public void setNim(String nim) {
    this.nim = nim;
    String kodeProdi = nim.substring(0, 5);
    if (kodeProdi.equals("10301")) {
      this.prodi = "IF";
    } else if (kodeProdi.equals("10302")) {
      this.prodi = "SE";
    } else if (kodeProdi.equals("10303")) {
      this.prodi = "IT";
    } else if (kodeProdi.equals("10305")) {
      this.prodi = "DS";
    }
  }

  public void setNama(String nama) {
    this.nama = nama;
  }

  public void setKelas(int kelas) {
    this.kelas = this.prodi + "-" + "47" + "-" + kelas;
  }

  public void tambahMK(AmbilMK ambilMK) {
    AmbilMK[] temp = new AmbilMK[this.ambilMK.length + 1];

    for (int i = 0; i < this.ambilMK.length; i++) {
      temp[i] = this.ambilMK[i];
    }
    temp[this.ambilMK.length] = ambilMK;
    this.ambilMK = temp;
  }

  public String getNim() {
    return this.nim;
  }

  public String getNama() {
    return this.nama;
  }

  public String getKelas() {
    return this.kelas;
  }

  public String getProdi() {
    return this.prodi;
  }

  public double hitungIPK(String tahunAjaran) {
    double nilaiIndeks = 0;
    for (int i = 0; i < this.ambilMK.length; i++) {
      int sks = this.ambilMK[i].getMataKuliah().getSks();
      String nilai = this.ambilMK[i].getNilai();
      if (this.ambilMK[i].getTahunAjaran().equals(tahunAjaran)) {
        if (nilai.equals("A")) {
          nilaiIndeks = 4;
        } else if (nilai.equals("AB")) {
          nilaiIndeks = 3.5;
        } else if (nilai.equals("B")) {
          nilaiIndeks = 3;
        } else if (nilai.equals("BC")) {
          nilaiIndeks = 2.5;
        } else if (nilai.equals("C")) {
          nilaiIndeks = 2;
        } else if (nilai.equals("D")) {
          nilaiIndeks = 1;
        }
        double ipkMk = sks * nilaiIndeks;

        return Math.round((ipkMk / sks) * 100.00) / 100.00;
      }
    }
    return 0;
  }
}
