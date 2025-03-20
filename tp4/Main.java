package tp4;

public class Main {
  public static void main(String[] args) {
    Dokter dt1 = new Dokter("Grisha", "Mata");
    Dokter dt2 = new Dokter("Faye", "Gigi");
    Dokter dt3 = new Dokter("Zeke", "Telinga");

    Pasien ps1 = new Pasien("Historia", 20);
    Pasien ps2 = new Pasien("Sasha", 37);
    Pasien ps3 = new Pasien("Petra", 55);

    Pemesanan[] listPemesanan = new Pemesanan[5];

    listPemesanan[0] = new Pemesanan(dt1, ps1, "Selasa");
    listPemesanan[1] = new Pemesanan(dt2, ps1, "Kamis");
    listPemesanan[2] = new Pemesanan(dt2, ps2, "Selasa");
    listPemesanan[3] = new Pemesanan(dt3, ps2, "Jumat");
    listPemesanan[4] = new Pemesanan(dt1, ps3, "Senin");

    for (int i = 0; i < listPemesanan.length; i++) {
      Pemesanan pemesanan = listPemesanan[i];
      System.out.println("Urutan ke-" + (i + 1));
      System.out.print("Nama Dokter\t: ");
      System.out.println(pemesanan.getDokter().getNama());
      System.out.print("Spesialis\t: ");
      System.out.println(pemesanan.getDokter().getSpesialis());
      System.out.print("Nama Pasien\t: ");
      System.out.println(pemesanan.getPasien().getNama() + " (" + pemesanan.getPasien().getUmur() + ")");
      System.out.print("Hari\t\t: ");
      System.out.println(pemesanan.getHari());
      System.out.println();
    }
  }
}
