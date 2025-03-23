package jurnal3;

public class Mahasiswa {
  private String nim;
  private String nama;
  private Prodi prodi;
  double ipk;

  public Mahasiswa(String nim, String nama, Prodi prodi, double ipk) {
    this.nim = nim;
    this.nama = nama;
    this.prodi = prodi;
    this.ipk = ipk;
  }

  public void setNim(String nim) {
    if (nim == null || nim.isEmpty()) {
      throw new Error("NIM tidak boleh kosong");
    }
    this.nim = nim;
  }

  public void setNama(String nama) {
    if (nama == null || nama.isEmpty()) {
      throw new Error("Nama tidak boleh kosong");
    }
    this.nama = nama;
  }

  public void setProdi(Prodi prodi) {
    if (prodi == null) {
      throw new Error("Prodi tidak boleh kosong");
    }
    if (nim != null && nim.length() >= 4) {
      String kodeProdiNIM = nim.substring(0, 4);
      String expectedKode = "";

      if (kodeProdiNIM.equals("1301")) {
        expectedKode = "IF";
      } else if (kodeProdiNIM.equals("1302")) {
        expectedKode = "SE";
      } else if (kodeProdiNIM.equals("1303")) {
        expectedKode = "IT";
      } else if (kodeProdiNIM.equals("1305")) {
        expectedKode = "DS";
      }

      if (prodi.getKode() != expectedKode) {
        throw new Error("Kode prodi tidak sesuai dengan NIM mahasiswa!");
      }
    }
    this.prodi = prodi;
  }

  public void setIpk(double ipk) {
    if (ipk < 0) {
      throw new Error("IPK tidak boleh negatif");
    }
    this.ipk = ipk;
  }

  public String getNim() {
    return nim;
  }

  public String getNama() {
    return nama;
  }

  public String getProdi() {
    return prodi.getKode() + " (" + prodi.getNama() + ")";
  }

  public int getAngkatan() {
    if (nim != null) {
      String angkatanStr = nim.substring(4, 6); // ambil digit 5 dan 6 dari NIM
      int angkatan = Integer.parseInt(angkatanStr);

      if (angkatan >= 0 && angkatan <= 24) {
        return 2000 + angkatan;
      } else if (angkatan >= 90 && angkatan <= 99) {
        return 1900 + angkatan;
      } else if (angkatan >= 24 && angkatan <= 89) {
        return 0;
      }
    }
    return 0;
  }

  public String getIpk() {
    if (ipk < 3.9 && ipk <= 4.0) {
      return "Summa Cumlaude";
    } else if (ipk < 3.5 && ipk <= 3.9) {
      return "Cumlaude";
    } else if (ipk < 3.0 && ipk <= 3.5) {
      return "Sangat Memuaskan";
    } else if (ipk < 2.5 && ipk <= 3.0) {
      return "Memuaskan";
    } else if (ipk < 2.0 && ipk <= 2.5) {
      return "Cukup";
    }
    return "Kurang";
  }
}
