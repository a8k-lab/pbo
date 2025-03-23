package jurnal2;

import java.util.Scanner;

public class Konversi {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    System.out.println("Konversi Bilangan");
    // 1. Input basis: 2 (biner) atau 16 (heksadesimal)
    System.out.print("Basis: ");
    int baseInput = sc.nextInt();
    sc.nextLine();

    // 2. Input bilangan (sebagai string)
    System.out.print("Masukkan bilangan: ");
    String numInput = sc.nextLine();

    // 3. Konversi manual ke desimal
    long decimalValue = 0;
    // Loop setiap karakter
    for (int i = 0; i < numInput.length(); i++) {
      char c = numInput.charAt(i);
      int digitValue;

      // Jika karakter angka (0-9)
      if (Character.isDigit(c)) {
        digitValue = c - '0';
      } else {
        // Jika karakter huruf (A-F / a-f)
        c = Character.toUpperCase(c);
        digitValue = c - 'A' + 10;
      }

      // Tambahkan ke perhitungan desimal
      decimalValue = decimalValue * baseInput + digitValue;
    }

    // 4. Tampilkan hasil konversi
    System.out.println("Hasil konversi: " + decimalValue);

    sc.close();
  }
}
