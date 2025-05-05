package jurnal8;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    // Buat satu objek array of BangunDatar dengan panjang elemen sesuai input, minimal 3 elemen!
    Scanner sc = new Scanner(System.in);
    System.out.print("Masukkan jumlah bangun datar: ");
    int jumlah = sc.nextInt();
    while (jumlah < 3) {
      System.out.println("Jumlah bangun datar minimal 3 elemen!");
      System.out.print("Masukkan jumlah bangun datar: ");
      jumlah = sc.nextInt();
    }

    BangunDatar[] bangunDatar = new BangunDatar[jumlah];
    System.out.println("1. Lingkaran");
    System.out.println("2. Persegi Panjang");
    System.out.println("3. Segitiga");

    for (int i = 0; i < jumlah; i++) {
      System.out.print("Pilih tipe bangun datar ke-" + (i + 1) + ": ");
      int pilihan = sc.nextInt();
      sc.nextLine();
      System.out.print("Masukkan nama bangun datar: ");
      String nama = sc.nextLine();

      switch (pilihan) {
        case 1:
          System.out.print("Masukkan jari jari: ");
          int jariJari = sc.nextInt();
          bangunDatar[i] = new Lingkaran(nama, jariJari);
          break;
        case 2:
          System.out.print("Masukkan panjang: ");
          int panjangPersegiPanjang = sc.nextInt();
          System.out.print("Masukkan lebar: ");
          int lebar = sc.nextInt();
          bangunDatar[i] = new PersegiPanjang(nama, panjangPersegiPanjang, lebar);
          break;
        case 3:
          System.out.print("Masukkan panjang: ");
          int panjangSegitiga = sc.nextInt();
          System.out.print("Masukkan tinggi: ");
          int tinggi = sc.nextInt();
          bangunDatar[i] = new Segitiga(nama, panjangSegitiga, tinggi);
          break;
        default:
          System.out.println("Pilihan tidak valid");
      }
    }
    sc.close();

    for (int i = 0; i < jumlah; i++) {
      BangunDatar bangun = bangunDatar[i];
      System.out.println("\nNama bangun datar : " + bangun.getNama());
      if (bangun instanceof Lingkaran) {
        Lingkaran lingkaran = (Lingkaran) bangun;
        System.out.println("Jari jari         : " + lingkaran.getJariJari());
        System.out.println("Luas              : " + lingkaran.hitungLuas());
        System.out.println("Keliling          : " + lingkaran.hitungKeliling());
      } else if (bangun instanceof PersegiPanjang) {
        PersegiPanjang persegiPanjang = (PersegiPanjang) bangun;
        System.out.println("Panjang           : " + persegiPanjang.getPanjang());
        System.out.println("Lebar             : " + persegiPanjang.getLebar());
        System.out.println("Luas              : " + persegiPanjang.hitungLuas());
        System.out.println("Keliling          : " + persegiPanjang.hitungKeliling());
      } else if (bangun instanceof Segitiga) {
        Segitiga segitiga = (Segitiga) bangun;
        System.out.println("Panjang           : " + segitiga.getAlas());
        System.out.println("Tinggi            : " + segitiga.getTinggi());
        System.out.println("Luas              : " + segitiga.hitungLuas());
        System.out.println("Keliling          : " + segitiga.hitungKeliling());
      }
    }
  }
}
