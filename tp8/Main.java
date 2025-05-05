package tp8;

public class Main {
  public static void main(String[] args) {
    Semut semut = new Semut("merah", new Koordinat(70, 90));
    Lebah lebah = new Lebah("oranye", new Koordinat3D(30, 40, 50));

    System.out.println("Warna semut : " + semut.getWarna());
    semut.info();
    semut.gerak(new Koordinat(80, 100));
    semut.info();

    System.out.println("\nWarna lebah : " + lebah.getWarna());
    lebah.info();
    lebah.gerak(new Koordinat3D(45, 55, 65));
    lebah.info();
  }
}
