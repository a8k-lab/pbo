/*
* Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
*/

package jurnal3;

/**
 *
 * @author a8k
 */
public class Main {

  public static void main(String[] args) {
    try {
      Prodi pr1 = new Prodi("IF", "Informatika");
      Prodi pr2 = new Prodi("", "Rekayasa Perangkat Lunak");
      Prodi pr3 = new Prodi("IT", null);

      Mahasiswa[] listMahasiswa = new Mahasiswa[4];
      listMahasiswa[0] = new Mahasiswa("1301212587", "Bruce Wayne", pr1, 3.1);
      listMahasiswa[1] = new Mahasiswa("1302192313", "Erwin Smith", pr2, 4.0);
      listMahasiswa[2] = new Mahasiswa("1305912154", "Tony Stark", pr3, 2.9);
      listMahasiswa[3] = new Mahasiswa("1301981234", "Hans Capon", pr1, 1.8);

      for (int i = 0; i < 4; i++) {
        Mahasiswa mhs = listMahasiswa[i];
        System.out.println("Data Mahasiswa " + (i + 1));
        System.out.print("NIM\t\t: ");
        System.out.println(mhs.getNim());
        System.out.print("Nama\t\t: ");
        System.out.println(mhs.getNama());
        System.out.print("Prodi\t\t: ");
        System.out.println(mhs.getProdi());
        System.out.print("Angkatan\t: ");
        System.out.println(mhs.getAngkatan());
        System.out.print("IPK\t\t: ");
        System.out.println(mhs.ipk + " (" + mhs.getIpk() + ")");
        System.out.println();
      }
    } catch (Error e) {
      System.out.println(e.getMessage());
    }
  }
}
