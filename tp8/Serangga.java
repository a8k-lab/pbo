package tp8;

public abstract class Serangga {
  protected String warna;
  protected final Koordinat posisi;

  public Serangga(String warna, Koordinat k) {
    this.warna = warna;
    posisi = k;
  }

  public Koordinat getPosisi() {
    return posisi;
  }
  public String getWarna() {
    return warna;
  }

  public void setWarna(String warna) {
    this.warna = warna;
  }
  public abstract void gerak(Koordinat k);
  public abstract void info();
}
