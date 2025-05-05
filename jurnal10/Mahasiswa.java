package jurnal10;

import java.sql.Date;

public class Mahasiswa {
  private String nim, nama;
  private Date tanggalLahir;
  private double ipk;

  public void setNim(String nim) throws Exception {
    if (nim == null || nim.length() == 0) {
      throw new Exception("NIM tidak boleh kosong");
    }
    if (nim.length() != 12) {
      throw new Exception("NIM harus 12 digit");
    }
    for (int i = 0; i < nim.length(); i++) {
      if (!Character.isDigit(nim.charAt(i))) {
        throw new Exception("NIM harus semua angka");
      }
    }
    System.out.println("NIM valid");
    this.nim = nim;
  }
  public void setNama(String nama) throws Exception {
    if (nama == null || nama.length() == 0) {
      throw new Exception("Nama tidak boleh kosong");
    }
    if (nama.length() < 8) {
      throw new Exception("Nama minimal 8 karakter");
    }
    System.out.println("Nama valid");
    this.nama = nama;
  }
  public void setTanggalLahir(String tanggalLahir) throws Exception {
    if (!tanggalLahir.matches("\\d{4}-\\d{2}-\\d{2}")) {
      throw new Exception("Format tanggal lahir harus yyyy-MM-dd");
    }
    
    try {
      this.tanggalLahir = Date.valueOf(tanggalLahir);
      System.out.println("Tanggal lahir valid");
    } catch (IllegalArgumentException e) {
      throw new Exception("Format tanggal harus yyyy-MM-dd");
    }
  }
  public void setIpk(double ipk) throws Exception {
    if (ipk < 0.00 || ipk > 4.00) {
      throw new Exception("IPK antara 0.00-4.00");
    }
    System.out.println("IPK valid");
    this.ipk = ipk;
  }

  public String getNim() {
    return nim;
  }
  public String getNama() {
    return nama;
  }
  public Date getTanggalLahir() {
    return tanggalLahir;
  }
  public double getIpk() {
    return ipk;
  }
}
