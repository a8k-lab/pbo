package tp8;

public class Semut extends Serangga {
  public Semut(String warna, Koordinat k) {
    super(warna, k);
  }

  @Override
  public void gerak(Koordinat k) {
    getPosisi().setX(k.getX());
    getPosisi().setY(k.getY());
  }

  @Override
  public void info() {
    System.out.println("Posisi semut: X = " + super.getPosisi().getX());
    System.out.println("              Y = " + super.getPosisi().getY());
  }
}
