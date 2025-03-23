/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package jurnal4;

import java.util.Scanner;

/**
 *
 * @author a8k
 */
public class Main {

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    MataKuliah pbo = new MataKuliah("CII3B4", "Pemrograman Berorientasi Objek", 4);
    MataKuliah kalkulus = new MataKuliah("CII2A3", "Kalkulus", 3);
    MataKuliah dka = new MataKuliah("CIIF4", "Dasar Kecerdasan Artifisial", 4);
    MataKuliah kwu = new MataKuliah("UKI12A2", "Kewirausahaan", 2);

    Mahasiswa mhs1 = new Mahasiswa("103012330004", "Historia", 1);
    Mahasiswa mhs2 = new Mahasiswa("103012310024", "Sasha", 12);
    Mahasiswa mhs3 = new Mahasiswa("103012320012", "Falco", 5);

    mhs1.tambahMK(new AmbilMK(pbo, "A", "21/22"));
    mhs1.tambahMK(new AmbilMK(kalkulus, "A", "09/10"));
    mhs1.tambahMK(new AmbilMK(dka, "A", "09/10"));
    mhs1.tambahMK(new AmbilMK(kwu, "A", "21/22"));
    mhs2.tambahMK(new AmbilMK(pbo, "B", "21/22"));
    mhs2.tambahMK(new AmbilMK(kalkulus, "A", "19/20"));
    mhs2.tambahMK(new AmbilMK(dka, "BC", "19/20"));
    mhs2.tambahMK(new AmbilMK(kwu, "AB", "21/22"));
    mhs3.tambahMK(new AmbilMK(pbo, "AB", "22/23"));
    mhs3.tambahMK(new AmbilMK(kalkulus, "D", "21/22"));
    mhs3.tambahMK(new AmbilMK(dka, "B", "21/22"));
    mhs3.tambahMK(new AmbilMK(kwu, "C", "22/23"));

    Mahasiswa[] listMahasiswa = new Mahasiswa[3];
    listMahasiswa[0] = mhs1;
    listMahasiswa[1] = mhs2;
    listMahasiswa[2] = mhs3;

    boolean ulang = true;
    while (ulang) {
      System.out.print("\nMasukkan Tahun Ajaran (ketik q untuk exit program): ");
      String tahunAjaran = sc.nextLine();
      if (tahunAjaran.equals("q")) {
        ulang = false;
      } else {
        int totalHistori = 0;
        for (int i = 0; i < listMahasiswa.length; i++) {
          Mahasiswa mhs = listMahasiswa[i];
          boolean adaMataKuliah = false;

          for (int j = 0; j < mhs.ambilMK.length; j++) {
            AmbilMK mk = mhs.ambilMK[j];
            if (mk.getTahunAjaran().equals(tahunAjaran)) {
              adaMataKuliah = true;
              break;
            }
          }

          if (adaMataKuliah) {
            System.out.format("IPK %s (%s): %.2f\n", mhs.getNama(), mhs.getKelas(), mhs.hitungIPK(tahunAjaran));
            totalHistori++;
          }
        }
        if (totalHistori == 0) {
          System.out.println("Tidak ada histori nilai pada Tahun Ajaran ini");
        }
      }
    }
    sc.close();
  }
}
