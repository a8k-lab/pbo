package jurnal2;

import java.util.Scanner;

public class CariInputArray {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);

    // 1. Input nilai A, B, C, D
    System.out.print("Nilai A: ");
    int A = sc.nextInt(); // banyak elemen baris 1
    System.out.print("Nilai B: ");
    int B = sc.nextInt(); // banyak elemen baris 2
    System.out.print("Nilai C: ");
    int C = sc.nextInt(); // banyak elemen baris 3
    System.out.print("Nilai D: ");
    int D = sc.nextInt(); // banyak elemen baris 4

    // 2. Bentuk array 2 dimensi (4 baris, kolom menyesuaikan)
    int[][] arr = new int[4][];
    arr[0] = new int[A]; // baris 1
    arr[1] = new int[B]; // baris 2
    arr[2] = new int[C]; // baris 3
    arr[3] = new int[D]; // baris 4

    // 3. Isi baris 1: A bilangan kelipatan 5, mulai dari 5
    int val = 5;
    for (int i = 0; i < A; i++) {
      arr[0][i] = val;
      val += 5;
    }

    // 4. Isi baris 2: B bilangan pangkat 3, mulai dari 3^1
    for (int i = 0; i < B; i++) {
      // pangkat 3^(i+1)
      int pangkat = 1;
      for (int j = 0; j < (i + 1); j++) {
        pangkat *= 3;
      }
      arr[1][i] = pangkat;
    }

    // 5. Isi baris 3: C bilangan kuadrat dari bilangan asli mulai dari 2
    int start = 2;
    for (int i = 0; i < C; i++) {
      arr[2][i] = start * start;
      start++;
    }

    // 6. Isi baris 4: D bilangan asli berurutan mulai dari 4
    int num = 4;
    for (int i = 0; i < D; i++) {
      arr[3][i] = num;
      num++;
    }

    // 7. Tampilkan isi array 2D
    System.out.println("\nIsi Array:");
    for (int i = 0; i < 4; i++) {
      for (int j = 0; j < arr[i].length; j++) {
        System.out.print(arr[i][j] + " ");
      }
      System.out.println();
    }

    // 8. Proses pencarian (loop sampai input pencarian = 0)
    while (true) {
      System.out.print("\nBilangan yang dicari (masukkan 0 untuk exit): ");
      int cari = sc.nextInt();
      if (cari == 0) {
        System.out.println("Program selesai.");
        break;
      }

      // Cari di seluruh baris & kolom
      boolean ditemukan = false;
      StringBuilder posisi = new StringBuilder();
      for (int i = 0; i < 4; i++) {
        for (int j = 0; j < arr[i].length; j++) {
          if (arr[i][j] == cari) {
            // i+1 dan j+1 karena ingin menampilkan baris & kolom 1-based
            posisi.append(String.format("- baris %d kolom %d\n", (i + 1), (j + 1)));
            ditemukan = true;
          }
        }
      }

      if (ditemukan) {
        System.out.println(cari + " berada di:");
        System.out.print(posisi);
      } else {
        System.out.println(cari + " tidak ada dalam array");
      }
    }

    sc.close();
  }
}
