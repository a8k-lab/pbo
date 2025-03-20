class Prodi {
  String nama;

  void setNama(String nama) {
    this.nama = nama;
  }
  String getNama() {
    return nama;
  }
}

class Mahasiswa {
  String nama;
  Prodi prodi;

  void setNama(String nama) {
    this.nama = nama;
  }
  void setProdi(Prodi prodi) {
    this.prodi = prodi;
  }
  void displayMahasiswa() {
    System.out.println("==========");
    System.out.println("Data Mahasiswa");
    System.out.print("Nama\t: ");
    System.out.println(this.getNama());
    
    System.out.print("Prodi\t: ");
    System.out.println(this.getProdi());
    System.out.println("==========");
  }

  String getNama() {
    return this.nama;
  }
  String getProdi() {
    return this.prodi.getNama();
  }
}

public class MahasiswaProdi {
  public static void main(String[] args) {
    Prodi pr1 = new Prodi();
    Prodi pr2 = new Prodi();

    pr1.setNama("Informatika");
    pr2.setNama("Data Science");

    Mahasiswa mhs1 = new Mahasiswa();
    Mahasiswa mhs2 = new Mahasiswa();

    mhs1.setNama("Bruce Wayne");
    mhs1.setProdi(pr1);
    mhs2.setNama("Tony Stark");
    mhs2.setProdi(pr2);

    mhs1.displayMahasiswa();
    mhs2.displayMahasiswa();
  }
}
