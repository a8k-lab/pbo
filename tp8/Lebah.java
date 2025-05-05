package tp8;

public class Lebah extends Serangga {
  public Lebah(String warna, Koordinat3D k) {
    super(warna, k);
  }

  @Override
  public void gerak(Koordinat k) {
    if (k instanceof Koordinat3D) {
      super.getPosisi().setX(k.getX());
      super.getPosisi().setY(k.getY());
      Koordinat3D posisi = (Koordinat3D) k;
      posisi.setZ(((Koordinat3D) k).getZ());
    }
  }

  @Override
  public void info() {
    Koordinat3D posisiLebah = (Koordinat3D) super.getPosisi();
    System.out.println("Posisi lebah: X = " + posisiLebah.getX());
    System.out.println("              Y = " + posisiLebah.getY());
    System.out.println("              Z = " + posisiLebah.getZ());
  }
}
