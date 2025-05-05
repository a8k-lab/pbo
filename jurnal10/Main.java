package jurnal10;

import java.util.Scanner;

public class Main {
  public static void main(String[] args) {
    System.out.println("Validator Mahasiswa");
    Mahasiswa mhs = new Mahasiswa();
    Scanner sc = new Scanner(System.in);

    boolean nimValid = false;
    while (!nimValid) {
      try {
        System.out.print("NIM: ");
        mhs.setNim(sc.nextLine());
        nimValid = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    boolean namaValid = false;
    while (!namaValid) {
      try {
        System.out.print("\nNama: ");
        mhs.setNama(sc.nextLine());
        namaValid = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    boolean tanggalValid = false;
    while (!tanggalValid) {
      try {
        System.out.print("\nTanggal lahir: ");
        mhs.setTanggalLahir(sc.nextLine());
        tanggalValid = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
      }
    }

    boolean ipkValid = false;
    while (!ipkValid) {
      try {
        System.out.print("\nIPK: ");
        mhs.setIpk(sc.nextDouble());
        ipkValid = true;
      } catch (Exception e) {
        System.out.println(e.getMessage());
        sc.nextLine();
      }
    }

    sc.close();
  }
}
